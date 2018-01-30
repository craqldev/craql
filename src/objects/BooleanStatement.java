package objects;

import java.util.LinkedList;

import objects.NodeChain.VarResult;

import org.antlr.runtime.tree.CommonTree;
import org.eclipse.core.runtime.Assert;

import query.QueryLanguageLexer;


public class BooleanStatement {

	public CommonTree booleanTree;
	
	String ASTFieldNameClassifier(String nodeType)
	{
		return null;
	}
	
	BooleanStatement(CommonTree ct)
	{
		booleanTree = ct;
	}
	
	public boolean evaluate(ResultTree result, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals, boolean ASTResultOK, Query currentQuery)
	{
		return BooleanStatement.evaluate(booleanTree, result, bindings, locals, ASTResultOK, currentQuery);
	}	
	
	public static boolean evaluate(CommonTree ct, ResultTree result, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals, boolean ASTResultOK, Query currentQuery)
	{
		if (bindings == null) bindings = new LinkedList <NodeChain>();
		
		// The first child of a BOOL_EXP is always a VAR or epsilon (or a unary operator)
		
		CommonTree varTree;
		NodeChain.VarResult varResult = new NodeChain.VarResult();
		int type = ct.getChild(0).getType();
		
		if (ct.getChild(0).getType() == QueryLanguageLexer.NOT)
		{
			return !evaluate((CommonTree)(ct.getChild(0).getChild(0)), result, bindings, locals, ASTResultOK, currentQuery);
		}
		else if (ct.getChild(0).getText().toString() == "EPSILON")
		{
			varResult.intResult = 1;
			varResult.intResultFound = true;
		}
		else
		{
			
			//if (ct.getChild(1).getChild(0).getText() == "EPSILON")
			//{
//				ASTResultOK = false;
			//}

			varTree = (CommonTree)ct.getChild(0);
			varResult = NodeChain.evaluateVar((CommonTree) varTree.getChild(0), bindings, locals, ASTResultOK, currentQuery, result);
		
			// The second child is always a BOOLEAN_OP variable or EPSILON
			if (ct.getChild(1).getText() != "EPSILON")
			{
				CommonTree booleanOp =
					(CommonTree) ct.getChild(1);
				CommonTree innerVarTree = (CommonTree)booleanOp.getChild(0);
				NodeChain.VarResult innerVarResult = NodeChain.evaluateVar(innerVarTree, bindings, locals, ASTResultOK, currentQuery, result);
				
				String operation = booleanOp.getText().toString();
				varResult = NodeChain.applyBoolOperation(varResult, innerVarResult, operation);
			}
	
			// The third child is always a phony BOOL_EXPR containing a LOGICAL_OP BOOL_EXP or EPSILON
			if (ct.getChild(2).getChild(0).getText() != "EPSILON")
			{
				CommonTree phonyBoolExp = (CommonTree)ct.getChild(2);
				String logicalOp = phonyBoolExp.getChild(0).getText().toString();
				CommonTree innerBoolExp = (CommonTree)phonyBoolExp.getChild(1);
				boolean boolExpResult = evaluate(innerBoolExp, result, bindings, locals, false, currentQuery);
				NodeChain.VarResult r = new NodeChain.VarResult();
				r.intResultFound = true;
				r.intResult = boolExpResult == false ? 0 : 1;
				
				varResult = NodeChain.applyBoolOperation(varResult, r, logicalOp);				
			}
			
		}
	
		//System.out.println("BOOL EXP evaluated, returning " + varResult.intResult);
		
		// the output of applyOperation is always boolean(/int)
		return varResult.intResult == 0 ? false : true;		
	}
}