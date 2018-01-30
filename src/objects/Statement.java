package objects;

import java.util.LinkedList;

import objects.NodeChain.VarResult;

import org.antlr.runtime.tree.CommonTree;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.NumberLiteral;

import query.QueryHandler;

public class Statement {
	public boolean isQueryStatement;
	CommonTree statementTree;
	public Query query;
	
	void initialize(CommonTree ct)
	{
		query = null;
		
		if (ct.getText().toString().equals("QUERY"))
		{
			this.isQueryStatement = true;
			query = QueryHandler.queries.getLast();
		}
		else
		{
			this.isQueryStatement = false;
		}
		
		statementTree = ct;
	}
	
	Statement(CommonTree ct)
	{
		initialize(ct);
	}

	public void evaluate(ResultTree result, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals, Query currentQuery)
	{
		evaluate(statementTree, result, bindings, locals, currentQuery);
	}	
	
	public static void evaluate(CommonTree ct, ResultTree result, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals, Query currentQuery)
	{
		// Only kind of statement currently supported: VAR = EXPR, VAR and IF
		
		if (ct.getChild(0).getText().equals("IF_STATEMENT") ||
			ct.getChild(0).getText().equals("WHILE_STATEMENT"))
		{
			CommonTree ifStatement = (CommonTree)ct.getChild(0);
			CommonTree boolExp = (CommonTree)ifStatement.getChild(0); 
			CommonTree statements = (CommonTree)ifStatement.getChild(1);
			
			boolean expResult = BooleanStatement.evaluate(boolExp, result, bindings, locals, true, currentQuery);
			
			boolean loop;
			boolean considerElse = false;
			
			if (ct.getChild(0).getText().equals("IF_STATEMENT"))
			{
				loop = false;
				if (ifStatement.getChildCount() > 2 &&
					!((CommonTree)ifStatement.getChild(2)).getText().equals("EPSILON"))						
				{
					considerElse = true;
					if (expResult == false)
					{
						statements = (CommonTree)ifStatement.getChild(2);
					}
				}
			}
			else
			{
				loop = true;
			}
			
			if (expResult == true || (expResult == false && considerElse == true))
			{
				// Create a dummy query to hold the statements
				Query dummyQuery = new Query();
				
				dummyQuery.nodeChains = new LinkedList <NodeChain> ();
				
				for (NodeChain nc : bindings)
				{
					dummyQuery.nodeChains.add(new NodeChain(nc));
				}

				dummyQuery.addStatements(statements);

				do
				{	
					QueryHandler.applyStatements(dummyQuery, result, false);
					
					if (loop == true)
					{
						expResult = BooleanStatement.evaluate(boolExp, result, bindings, locals, true, currentQuery);
						if (expResult != true) loop = false;
					}
				} while (loop == true);
			}
		}
		else if (ct.getChild(0).getText().equals("VAR") && ct.getChild(1).getText().equals("VAR_ASSIGN"))
		{
			boolean newVar = false;
			CommonTree varCt = (CommonTree)ct.getChild(0);
			CommonTree varAsnCt = (CommonTree)ct.getChild(1);
			
			NodeChain lvalue = 	QueryHandler.GetSearchNode(varCt, 0);
			
			NodeChain boundNC = NodeChain.findNodeChain(locals, lvalue.name);
			
			if (boundNC == null)
			{
				boundNC = new NodeChain();
				boundNC.name = lvalue.name;
				boundNC.nodeList = new LinkedList<SelectorNode>();
				newVar = true;
			}
			
			// now evaluate the right side of the assignment
			CommonTree varStmt = (CommonTree)varAsnCt.getChild(0);
			CommonTree varVar = (CommonTree)varStmt.getChild(0);
			CommonTree varBinOp = (CommonTree)varStmt.getChild(1);
			
			VarResult v = NodeChain.evaluateVar((CommonTree)varVar.getChild(0), bindings, locals, true, currentQuery, result);
			
			if (v.intResultFound == false && v.stringResultFound == false && v.ASTNodeResultFound == false)
			{
				v = NodeChain.evaluateVar((CommonTree)varVar.getChild(0), locals, new LinkedList <NodeChain> (), false, currentQuery, result);
			}
			
			if (!((CommonTree)varBinOp.getChild(0)).getText().equals("EPSILON"))
			{
				String operation = varBinOp.getChild(0).getText();
				CommonTree varRVar = (CommonTree)varBinOp.getChild(1); 
				
				VarResult vr = NodeChain.evaluateVar((CommonTree)varRVar.getChild(0), bindings, new LinkedList <NodeChain> (), false, currentQuery, result);
				
				if (vr.intResultFound == false && vr.stringResultFound == false)
				{
					vr = NodeChain.evaluateVar((CommonTree)varRVar.getChild(0), locals, new LinkedList <NodeChain> (), false, currentQuery, result);
				}
				v = NodeChain.applyOperation(v, vr, operation);
				
				if (vr.intResultFound && !v.intResultFound)
				{
					v.intResultFound = true;
					v.intResult = 0;
				}

				if (vr.stringResultFound && !v.stringResultFound)
				{
					v.stringResultFound = true;
					v.stringResult = "";
				}
			}
			
			boundNC.localVarValue = v;
			if (newVar)
			{
				locals.add(boundNC);
			}
			//System.out.println("Assigning value " + v.toString() + " to variable " + boundNC.name);
		}
		else if (ct.getChild(0).getText().equals("VAR")) // just a bare rvalue
		{
			CommonTree varCt = (CommonTree)ct.getChild(0);
			//CommonTree varVar = (CommonTree)varCt.getChild(0);			
			
			VarResult v = NodeChain.evaluateVar((CommonTree)varCt.getChild(0), bindings, locals, true, currentQuery, result);
			
			if (v.intResultFound == false && v.stringResultFound == false && v.ASTNodeResultFound == false)
			{
				v = NodeChain.evaluateVar((CommonTree)varCt.getChild(0), locals, new LinkedList <NodeChain> (), false, currentQuery, result);
			}
			
			// we throw away the result, so hopefully the function had some side effects
		}
		else
		{
			System.out.println("Couldn't evaluate Statement : " + ct.getChild(0).getText());
			Assert.isTrue(false);
		}	
	}
}
