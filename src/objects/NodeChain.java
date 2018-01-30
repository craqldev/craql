package objects;

import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import algorithm.Search;
import algorithm.TreeSearchAlgorithm;

import query.QueryHandler;
import query.QueryLanguageLexer;
import query.QueryLanguageParser;

public class NodeChain {
	
	public static class VarResult
	{
		public int intResult;
		public boolean intResultFound;
		public String stringResult;
		public boolean stringResultFound;
		public ASTNodeOrNodeList ASTNodeResult;
		public boolean ASTNodeResultFound;
		
		public VarResult()
		{
			stringResult = null;
			stringResultFound = false;
			intResult = 0;
			intResultFound = false;
			ASTNodeResult = null;
			ASTNodeResultFound = false;
		}
		
		public String toString()
		{
			if (intResultFound) return "" + intResult;
			else if (stringResultFound) return stringResult;
			else return "[no value]";					
		}

		public void empty() {
			stringResult = null;
			stringResultFound = false;
			intResult = 0;
			intResultFound = false;
			ASTNodeResult = null;
			ASTNodeResultFound = false;
		}
		
		public boolean resultFound()
		{
			return (stringResultFound || intResultFound || ASTNodeResultFound);
		}
	}

	public LinkedList <SelectorNode> nodeList;
	public String name;
	public ResultTree resultTree;
	public VarResult localVarValue;
	
	public SelectorNode contains;
	public int containsType;
	public boolean directlyContains; // only valid when containsType == CONTAINS
	
	public static final int CONTAINS = 0;
	public static final int ISPARENT = 1;	
	public static final int ISNODETYPE = 2;
	public static final int LINENUMBER = 3;
	
	public NodeChain(NodeChain source)
	{
		nodeList = source.nodeList;
		name = source.name;
		resultTree = source.resultTree;
		localVarValue = source.localVarValue;
	}
	
	public NodeChain()
	{
		nodeList = new LinkedList <SelectorNode> ();
		localVarValue = null;
	}

	public boolean isEmpty() {
		return nodeList.isEmpty();
	}

	public SelectorNode remove() {		
		return nodeList.remove();
	}

	public void add(SelectorNode selectorNode) {
		nodeList.add(selectorNode);		
	}

	public void setBinding(ResultTree r) {
		resultTree = r;		
	}

	static VarResult applyOperation(VarResult l, VarResult r, String operation)
	{
		VarResult vr = new VarResult();
		vr.intResultFound = true;
		
		if ((l.intResultFound && r.ASTNodeResultFound) ||
			(r.intResultFound && l.ASTNodeResultFound))
		{
			if (l.intResultFound)
			{				
				vr = applyIntOperation(l.intResult, r.ASTNodeResult == null ? 0 : r.ASTNodeResult.toInt(), operation);
			}
			else
			{
				vr = applyIntOperation(l.ASTNodeResult == null ? 0 : l.ASTNodeResult.toInt(), r.intResult, operation);
			}
		}
		else if ((l.intResultFound && r.intResultFound) ||
			(l.intResultFound && !r.stringResultFound) ||
			(r.intResultFound && !l.stringResultFound))
		{
			vr = applyIntOperation(l.intResult, r.intResult, operation);
		}
		else if (l.stringResultFound && r.stringResultFound)
		{
			vr = applyStringOperation(l.stringResult, r.stringResult, operation);
		}
		else if (l.ASTNodeResultFound && r.ASTNodeResultFound)
		{
			vr = applyASTNodeOperation(l.ASTNodeResult, r.ASTNodeResult, operation);
		}
		else if ((l.ASTNodeResultFound && r.stringResultFound) ||
				 (l.stringResultFound && r.ASTNodeResultFound))
		{
			String ls, rs;
			if (l.ASTNodeResultFound && r.stringResultFound)
			{
				ls = l.ASTNodeResult.toString();
				rs = r.stringResult;
			}
			else
			{
				ls = l.stringResult;
				rs = r.ASTNodeResult.toString();
			}
			vr = applyStringOperation(ls, rs, operation);
		}
		else if ((r.stringResultFound && (!l.stringResultFound && !l.intResultFound && !l.ASTNodeResultFound)) ||
				 (l.stringResultFound && (!r.stringResultFound && !r.intResultFound && !r.ASTNodeResultFound)))
		{
			String ls, rs;
			if (!r.stringResultFound)
			{
				rs = new String();
				ls = l.stringResult;
			}
			else
			{
				ls = new String();
				rs = r.stringResult;
			}
			vr = applyStringOperation(ls, rs, operation);
		}
		else
		{
			System.out.println("Missing variable result or type mismatch, will return 0");
		}
		return vr;
	}

	static VarResult applyBoolOperation(VarResult l, VarResult r, String operation)
	{
		VarResult vr = applyOperation(l, r, operation);
		
		if (vr.stringResultFound)
		{
			if (vr.stringResult == null || vr.stringResult.equals(""))
			{
				vr.stringResultFound = false;
				vr.stringResult = null;
				vr.intResultFound = true;
				vr.intResult = 0;
			}
			else
			{
				vr.stringResultFound = false;
				vr.stringResult = null;
				vr.intResultFound = true;
				vr.intResult = 1;			
			}
		}
		return vr;
	}

	static VarResult applyStringOperation(String l, String r, String operation)
	{
		VarResult out = new VarResult();
		
		if (operation.matches("=="))			
		{
			out.intResult = (l.equals(r) == false) ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("||"))			
		{
			out.intResult = ((l == null ? false : true) || (r == null ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("&&"))			
		{
			out.intResult = ((l == null ? false : true) && (r == null ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("!="))			
		{
			out.intResult = !(l.equals(r)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.equals("+"))
		{
			out.stringResult = l.concat(r);
			out.stringResultFound = true;
		}
		else if (operation.equals("-"))
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.equals("*"))
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.equals("/"))
		{
			System.out.println("Invalid string operation, will return 0."); 
		}		
		else if (operation.matches(">"))			
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.matches(">="))			
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.matches("<"))			
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.matches("<="))		
		{
			System.out.println("Invalid string operation, will return 0."); 
		}				
		return out;		
	}
	
	static VarResult applyASTNodeOperation(ASTNodeOrNodeList l, ASTNodeOrNodeList r, String operation)
	{
		VarResult out = new VarResult();
		
		if (operation.matches("=="))			
		{
			out.intResult = (l.equals(r) == false) ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("||"))			
		{
			out.intResult = ((l == null ? false : true) || (r == null ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("&&"))			
		{
			out.intResult = ((l == null ? false : true) && (r == null ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("!="))			
		{
			out.intResult = !(l.equals(r)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.equals("+"))
		{
			System.out.println("Invalid ASTNode operation, will return 0.");			
		}		
		else if (operation.equals("-"))
		{
			System.out.println("Invalid ASTNode operation, will return 0."); 
		}
		else if (operation.equals("*"))
		{
			System.out.println("Invalid ASTNode operation, will return 0."); 
		}
		else if (operation.equals("/"))
		{
			System.out.println("Invalid ASTNode operation, will return 0."); 
		}		
		else if (operation.matches(">"))			
		{
			System.out.println("Invalid ASTNode operation, will return 0."); 
		}
		else if (operation.matches(">="))			
		{
			System.out.println("Invalid ASTNode operation, will return 0."); 
		}
		else if (operation.matches("<"))			
		{
			System.out.println("Invalid ASTNode operation, will return 0."); 
		}
		else if (operation.matches("<="))		
		{
			System.out.println("Invalid ASTNode operation, will return 0."); 
		}				
		return out;		
	}

	static VarResult applyIntOperation(int l, int r, String operation)
	{
		VarResult out = new VarResult();
		
		if (operation.matches("=="))			
		{
			out.intResult = (l == r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.equals("||"))			
		{
			out.intResult = ((l == 0 ? false : true) || (r == 0 ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("&&"))			
		{
			out.intResult = ((l == 0 ? false : true) && (r == 0 ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("!="))			
		{
			out.intResult = (l != r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches(">"))			
		{
			out.intResult = (l > r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches(">="))			
		{
			out.intResult = (l >= r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("<"))			
		{
			out.intResult = (l < r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("<="))		
		{
			out.intResult = (l <= r) == false ? 0 : 1;
			out.intResultFound = true;
		}				
		else if (operation.equals("+"))		
		{
			out.intResult = l + r;
			out.intResultFound = true;
		}				
		else if (operation.equals("-"))		
		{
			out.intResult = l - r;
			out.intResultFound = true;
		}				
		else if (operation.equals("*"))		
		{
			out.intResult = l * r;
			out.intResultFound = true;
		}				
		else if (operation.equals("/"))		
		{
			if (r == 0)
			{
				//Assert.isTrue(false);
				out.intResult = Integer.MAX_VALUE;
				out.intResultFound = true;

			}
			else
			{
				out.intResult = l / r;
				out.intResultFound = true;			
			}
		}				
		return out; 
	}
	
	static VarResult evaluateFunction(CommonTree ct, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals, Query currentQuery, ResultTree result)
	{
		VarResult varResult = new VarResult();

		CommonTree functionNode = (CommonTree)ct;
		String functionName = functionNode.getText().toString();
		
		if (functionName.equals("depth") || functionName.equals("methodbinding") || functionName.equals("nodetype"))
		{
			CommonTree arg_node_chain_ct = (CommonTree)functionNode.getChild(0);
			NodeChain argNodeChain = QueryHandler.GetSearchNode(arg_node_chain_ct, 0);
			NodeChain nc = findNodeChain(bindings, argNodeChain.name);
			
			if (nc == null)
			{
				nc = findNodeChain(locals, argNodeChain.name);			
			}
			
			ASTNodeOrNodeList currentResult = descendNodeChain(argNodeChain, nc.resultTree.root, null);
			
			if (functionName.equals("depth"))
			{
				varResult.intResultFound = true;
				varResult.intResult =  ResultTree.depth(currentResult);
			}
			else if (functionName.equals("methodbinding") || functionName.equals("nodetype"))
			{
				varResult.stringResultFound = true;
				varResult.stringResult = "";
				
				if (!currentResult.isASTNode)
				{
					Assert.isTrue(false, functionName + " only functions on an ASTNode (not an AST Node List).");
				}

				if (functionName.equals("nodetype"))
				{
					varResult.stringResult = currentResult.node.getClass().getName();
				}
				else if (functionName.equals("methodbinding"))
				{
					if (currentResult.node instanceof MethodDeclaration)
					{
						varResult.stringResult = ((MethodDeclaration)currentResult.node).resolveBinding().getKey();
					}
					else if (currentResult.node instanceof MethodInvocation)
					{
						varResult.stringResult = ((MethodInvocation)currentResult.node).resolveMethodBinding().getKey();
					}
				}
			}
		}
		else if (functionName.equals("max") || functionName.equals("min"))
		{
			VarResult vr1 = evaluateVar((CommonTree)functionNode.getChild(0), bindings, new LinkedList <NodeChain> (), false, currentQuery, result);
			VarResult vr2 = evaluateVar((CommonTree)functionNode.getChild(1), bindings, new LinkedList <NodeChain> (), false, currentQuery, result);
			
			if (vr1.intResultFound == false)
			{
				vr1 = evaluateVar((CommonTree)functionNode.getChild(0), locals, new LinkedList <NodeChain> (), false, currentQuery, result); 
			}

			if (vr2.intResultFound == false)
			{
				vr2 = evaluateVar((CommonTree)functionNode.getChild(1), locals, new LinkedList <NodeChain> (), false, currentQuery, result); 
			}

			varResult.intResultFound = true;
			
			if (functionName.equals("max"))
			{
				varResult.intResult = Math.max(vr1.intResult, vr2.intResult);
			}
			else
			{
				varResult.intResult = Math.min(vr1.intResult, vr2.intResult);
			}
		}
		else if (functionName.equals("print"))
		{
			VarResult vr1 = evaluateVar((CommonTree)functionNode.getChild(0), bindings, locals, true, currentQuery, result);
			
		    String outString = "Print " + ((CommonTree)functionNode.getChild(0)).getText() + ": ";
		    
		    if (vr1.ASTNodeResultFound)
		    {
		    	outString += vr1.ASTNodeResult.toString();
		    }
		    if (vr1.intResultFound)
		    {
		    	outString += vr1.intResult;
		    }
		    if (vr1.stringResultFound)
		    {
		    	outString += vr1.stringResult;
		    }
		    if (!vr1.ASTNodeResultFound && !vr1.intResultFound && !vr1.stringResultFound)
		    {
		    	outString += "(not found)";
		    }
		    System.out.println(outString);
		    
		    varResult = vr1;
		}
		else if (functionName.equals("callquery"))
		{
			CommonTree arg_ct = (CommonTree)functionNode.getChild(0);
			boolean has_in_clause = false;
			if (functionNode.getChildCount() > 1)
			{
				has_in_clause = true;
			}
			
			String arg = arg_ct.getText().toString();			
			Query foundQuery = null;
			
			for (Query q : QueryHandler.queries)
			{
				if (q.queryName != null && q.queryName.equals(arg))
				{
					foundQuery = q;
				}			
			}
			
			if (foundQuery == null)
			{
				Assert.isTrue(false, "Couldn't find query " + arg);
			}
			else
			{
				CommonTree in_clause = (CommonTree)functionNode.getChild(1);
				LinkedList <ResultTree> rts = new LinkedList <> ();
				
				if (has_in_clause)
				{
					boolean directly = false;
					if (in_clause.getChild(0).getType() != QueryLanguageLexer.EPSILON ||
							in_clause.getChildCount() > 1)						
						{						
							if (in_clause.getChild(0).getType() == QueryLanguageLexer.DIRECTLY)	
							{						
								directly = true;
							}
							else
							{
								directly = false;								
							}
		
							if (in_clause.getChild(1).getType() != QueryLanguageLexer.EPSILON)					
							{						
								in_clause = (CommonTree)in_clause.getChild(1);
							}
							else
							{
								if (directly == true)
								{
									Assert.isTrue(false, "You can't specify directly without in");
								}
							}
						}
					rts = QueryHandler.evaluateInClause(foundQuery, in_clause, bindings, locals, directly);
				}
				else
				{
					rts = null;
					//rts.add(result);					
				}
				if (rts != null)
				{
					QueryHandler.executeQuery(foundQuery, currentQuery, rts, null, false);
				}
				varResult.intResult = 1;
				varResult.intResultFound = true;
			}
		}
		else
		{		
		
		}
		
		return varResult;
	}

	/**
	 * @param ct
	 * @param bindings
	 * @param locals
	 * @param ASTResultOK
	 * @return
	 */
	public static VarResult evaluateVar(CommonTree ct, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals, boolean ASTResultOK, Query currentQuery, ResultTree thisResult)
		{
	//		variable	
	//		:	ID COLON attr				-> ^(VAR_NAME ID attr)
	//		|	node_chain 				-> ^(NODE_CHAIN node_chain)
	//		|	INTEGER 				-> INTEGER
	//		|	RESERVED_TYPES				-> RESERVED_TYPES	
	//		;
			VarResult varResult = new VarResult();
			
			if (ct.getType() == QueryLanguageParser.INTEGER)
			{
				Integer intVal = new Integer(ct.getText());
	
				varResult.intResult = intVal.intValue();
				varResult.intResultFound = true;			
			}
			else if (ct.getType() == QueryLanguageParser.COUNT)
			{
				varResult.intResult = currentQuery.resultTreeCount;
				varResult.intResultFound = true;
			}			
			else if (ct.getType() == QueryLanguageParser.STRING)
			{
				String strVal = new String(ct.getText());
				
				varResult.stringResult = strVal.substring(1, strVal.length()-1);
				varResult.stringResultFound = true;
			}
			else if (ct.getText().equals("FUNCTION"))
			{
				varResult = evaluateFunction((CommonTree)ct.getChild(0), bindings, locals, currentQuery, thisResult);
			}
			else if (ct.getText().equals("NODE_CHAIN"))
			{
				CommonTree node_chain_ct = (CommonTree)ct;
				NodeChain nodeChain = QueryHandler.GetSearchNode(node_chain_ct, 0);
				// find a matching variable in the bindings
				
				NodeChain nc = findNodeChain(locals, nodeChain.name); 
				
				if (nc == null)
				{
					nc = findNodeChain(bindings, nodeChain.name);
				}
				
				if (nc != null)
				{
					if (nc.localVarValue != null && nc.localVarValue.ASTNodeResultFound == false)
					{
						return nc.localVarValue;
					}
					else // the value of this variable is an AST tree or a simple structural property
					{
						ASTNodeOrNodeList currentResult = null;
						
						if (nc.localVarValue == null || nc.localVarValue.ASTNodeResultFound == false)
							currentResult = descendNodeChain(nodeChain, nc.resultTree.root, varResult);
						else
							currentResult = descendNodeChain(nodeChain, nc.localVarValue.ASTNodeResult, varResult);
						
						if (currentResult == null)
						{
							if (varResult.resultFound())
							{
								return varResult;
							}
						}
						
						if (currentResult == null) // if currentResult came back null, then set a null varResult
						{
							//Assert.isTrue(false, "A weird thing happened.");
							varResult.intResultFound = true;
							varResult.intResult = 0;
						}
						
						// for lists, set the int result, but not intresultfound so that the list count can be compared to ints
						if (currentResult != null &&
							currentResult.isNodeList)
						{							
							//System.out.println("Currenresult: " + currentResult.getParent().toString());
							varResult.intResult = currentResult.list.size();
						}
						
						if (nodeChain.contains != null || nodeChain.containsType == LINENUMBER)
						{
							// if currentresult is null, then we must return the value int 0
							if (currentResult == null || (currentResult.isASTNode && currentResult.node == null))
							{
								varResult.intResultFound = true;
								varResult.intResult = 0;
							}
							else if (nodeChain.containsType == LINENUMBER)
							{
								ASTNode root = currentResult.getRoot().node;
								if (root instanceof CompilationUnit)
								{
									CompilationUnit cu = (CompilationUnit)root;
									varResult.intResultFound = true;
									varResult.intResult = cu.getLineNumber(currentResult.getStartPosition());
								}
								else
								{
									varResult.intResultFound = true;
									varResult.intResult = 0;									
								}									
							}
							else
							{
								switch (nodeChain.contains.nodeType)
								{
									case SelectorNode.AST_CHILD : {
										Class searchClass = Search.getClassFromSearchNodeType(nodeChain.contains.nodeText);									
										
										if (nodeChain.containsType == ISNODETYPE)
										{							
											//if (searchClass.getName().contains("ParameterizedType"))												
												//System.out.println("IsNodeType: " + searchClass.getName() + " == " + currentResult.node.getClass());
											if (currentResult != null)
											{
												if (searchClass.isInstance(currentResult.node))
												{
													varResult.intResultFound = true;
													varResult.intResult = 1;											
												}
												else
												{											
													varResult.intResultFound = true;
													varResult.intResult = 0;
												}
											}
											else
											{
												varResult.intResultFound = true;
												varResult.intResult = 0;
											}
										}
										else if (nodeChain.containsType == CONTAINS)
										{	
											LinkedList <ResultTree> containsResults = new LinkedList <ResultTree> ();
											if (TreeSearchAlgorithm.HasSubTree(currentResult, searchClass, containsResults))
											{
												varResult.intResultFound = true;
												varResult.intResult = 1;
												
												if (nodeChain.directlyContains)
												{
													// "directly_contains" was specified, eliminate any trees where there is a node of the parent type 
													// "between" the parent and the child.
													// Here is how to do this:
													// (1) In the parent node, find all children of the same (parent) type
													// (2) for each child, see if it contains any of the result trees we found. If it does, throw out that result.				
													
													LinkedList <ResultTree> parentTypeTrees = algorithm.Search.SearchTree(new ResultTree(currentResult.node), currentResult.node.getClass());
													
													for (ResultTree parentTypeChild : parentTypeTrees)
													{
														for (int i = 0; i < containsResults.size(); i++)															
														{
															ResultTree foundChild = containsResults.get(i);
															if (!parentTypeChild.root.equals(foundChild.root))
															{
																if (ResultTree.contains(parentTypeChild.root, foundChild.root))
																{
																	containsResults.remove(i);
																	i--;
																	//containsResults.remove(foundChild);
																}
															}
														}
													}
													
													if (containsResults.isEmpty()) // none of the found subtrees were directly contained :(
													{
														varResult.intResult = 0;
													}
												}
											}
											else
											{
												varResult.intResultFound = true;
												varResult.intResult = 0;								
											}
				
										}
										else // ISPARENT has no meaning for an AST_CHILD
										{
											Assert.isTrue(false, "Inappropriate contains type with AST_CHILD");
										}
									} break;
									case SelectorNode.PROP : {
										NodeChain containsNC = findNodeChain(bindings, nodeChain.contains.nodeText);
										
										if (nodeChain.containsType == CONTAINS ||
											nodeChain.containsType == ISPARENT)
										{
											if (containsNC == null)
											{
												containsNC = findNodeChain(locals, nodeChain.contains.nodeText);
											}
											
											if (containsNC == null)
											{
												Assert.isTrue(false, "Can't find variable within contains");										
											}
											
											ASTNodeOrNodeList NCResult = containsNC.resultTree.getRoot();
											
											varResult.stringResultFound = false;
											varResult.stringResult = null;
											varResult.intResultFound = true;
											varResult.intResult = 0;
											
											while (NCResult != null)
											{
												NCResult = NCResult.getParent();
												if (NCResult != null && NCResult.equals(currentResult))
												{
													varResult.intResult = 1;
													break;
												}
												if (nodeChain.containsType == ISPARENT)
												{
													// if this operation is ISPARENT rather than CONTAINS, we
													// should only check the first level up
													break;
												}
											}
											
											if (varResult.intResult == 1 &&
												nodeChain.containsType == CONTAINS && 
												nodeChain.directlyContains)
											{
												// "directly_contains" was specified, eliminate any trees where there is a node of the parent type 
												// "between" the parent and the child.
												// Here is how to do this:
												// (1) In the parent node, find all children of the same (parent) type
												// (2) for each child, see if it contains the node specified. If it does, throw out the result.	
												
												LinkedList <ResultTree> parentTypeTrees = algorithm.Search.SearchTree(new ResultTree(currentResult.node), currentResult.node.getClass());
												
												for (ResultTree parentTypeChild : parentTypeTrees)
												{													
													if (ResultTree.contains(parentTypeChild.root, containsNC.resultTree.root))
													{
														varResult.intResult = 0;
													}
												}
											}
											
										}
										else if (nodeChain.containsType == ISNODETYPE)
										{
											Class searchClass = Search.getClassFromSearchNodeType(nodeChain.contains.nodeText);
	
											if (searchClass.isInstance(currentResult))
											{
												varResult.intResultFound = true;
												varResult.intResult = 1;											
											}
											else
											{											
												varResult.intResultFound = true;
												varResult.intResult = 0;
											}
										}
									} break;
								}
							}
							return varResult;
						}
						//else if (currentResult.isASTNode && currentResult.node instanceof VariableDeclarationFragment)
						//{
//							varResult.stringResultFound = true;
							//varResult.stringResult = ((VariableDeclarationFragment)currentResult.node).getName().getIdentifier();
							//return varResult;
						//}
						else if (currentResult != null && currentResult.isASTNode && currentResult.node instanceof NumberLiteral)
						{
							varResult.intResultFound = true;
							try
							{
								varResult.intResult = (new Integer(((NumberLiteral)currentResult.node).getToken())).intValue();							
							}
							catch (NumberFormatException nfe)
							{
								System.out.println("Couldn't resolve variable " + nodeChain.name + " to boolean/integer, will return 0");							
							}
							return varResult;
						}
						else if (currentResult != null && currentResult.isASTNode && currentResult.node instanceof SimpleName)
						{
							varResult.stringResultFound = true;
							varResult.stringResult = ((SimpleName)currentResult.node).getIdentifier();
							return varResult;
						}
						else if (ASTResultOK)
						{
							varResult.ASTNodeResultFound = true;
							varResult.ASTNodeResult = currentResult;
							return varResult;
						}
						else
						{
							varResult.stringResultFound = true;
							varResult.stringResult = currentResult.toString();
							return varResult;						
						}
					}
					// still here, haven't found anything usable
					//System.out.println("Couldn't resolve variable " + nodeChain.name + " to boolean/integer, will return 0");
				}
				// we failed to find a matching variable, report error
				//System.out.println("Couldn't match variable " + nodeChain.name + ", will return 0");
				
			}
			
			return varResult;
		}

	public static NodeChain findNodeChain(LinkedList <NodeChain> bindings, String name)
	{
		for (int i = bindings.size()-1; i >= 0; i--)
		{
			NodeChain nc = bindings.get(i);
			if (nc.name != null && nc.name.equals(name))
			{
				return nc;
			}
		}
		return null;
	}

	public static ASTNodeOrNodeList descendNodeChain(NodeChain nodeChain, ASTNodeOrNodeList currentResult, VarResult varResult)
	{
		if (varResult == null) varResult = new VarResult();
		varResult.empty();
		
		// now dive through the chain as necessary
		for (int i = 0; i < nodeChain.nodeList.size() & currentResult != null; i++)
		{
			SelectorNode currentNode = nodeChain.nodeList.get(i);

			if (currentNode.nodeType == SelectorNode.AST_CHILD)
			{
				if (currentNode.nodeText.equals(new String("parent")))
				{
					currentResult = currentResult.getParent();
				}
				else if (currentNode.nodeText.equals(new String("root")))
				{
					currentResult = currentResult.getRoot();
				}
				else
				{
					if (!currentResult.isASTNode)
					{					
						Assert.isTrue(false, "Can't get a structural property for a node list");
					}
					// try to find the matching child name in the result
					List <StructuralPropertyDescriptor> structuralProperties = currentResult.node.structuralPropertiesForType();
					
					for (StructuralPropertyDescriptor spd : structuralProperties)
					{
						String id = spd.getId().toLowerCase();
						
						if (currentNode.nodeText.toLowerCase().equals(id))									
						{
							Object sObj = currentResult.node.getStructuralProperty(spd);
							
							if (sObj == null)
							{
								//Assert.isTrue(false, "The structural property  " + id + " is null.");
								currentResult = null;
							}
							else if (sObj instanceof List)
							{
								currentResult = new ASTNodeOrNodeList((List)sObj, currentResult);
							}
							else if (sObj instanceof ASTNode)
							{
								currentResult = new ASTNodeOrNodeList((ASTNode)sObj);
							}
							else if (sObj instanceof Boolean)
							{
								currentResult = null;
								varResult.intResultFound = true;

								if (((Boolean)sObj).booleanValue() == true)
								{
									varResult.intResult = 1;
								}
								else
								{
									varResult.intResult = 0;
								}
							}
							else
							{								
								Assert.isTrue(false, "The structural property type " + sObj.getClass().toString() + " is not yet supported in NodeChain.java.");								
							}
							break;
						}
					}
				}
			}
		}		
		return currentResult;
	}
	
	
}
