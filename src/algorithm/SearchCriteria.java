package algorithm;

import objects.Query;

import org.eclipse.core.runtime.Assert;


// The SearchCriteria class is intended to abstract away the decision about which result trees match and
// which don't. The current implementation is a stub which can only support either a single node type or
// two node types connected with the ... or * operators.
public class SearchCriteria {

	public Class searchClass;
	String op;
	Class operandClass;
	
	public SearchCriteria(Query query)
	{
		try
		{
			searchClass = Class.forName("org.eclipse.jdt.core.dom." + query.searchNodeType);
				
			if (!(Class.forName("org.eclipse.jdt.core.dom.ASTNode").isAssignableFrom(searchClass)))
			{
				System.out.println(query.searchNodeType + " is not an ASTNode.");
				Assert.isTrue(false);
			}
			// System.out.println(nodetype);
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("Class " + query.searchNodeType + " not found.");
			Assert.isTrue(false);			
		}

		if (query.searchNodeOperand != null)
		{
			try
			{
				operandClass = Class.forName("org.eclipse.jdt.core.dom." + query.searchNodeOperand);
					
				if (!(Class.forName("org.eclipse.jdt.core.dom.ASTNode").isAssignableFrom(operandClass)))
				{
					System.out.println(query.searchNodeOperand + " is not an ASTNode.");
					Assert.isTrue(false);
				}
				// System.out.println(nodetype);
			}
			catch (ClassNotFoundException c)
			{				
				// This is not actually an error (because there might not be a search op)
				// System.out.println("Class " + query.searchNodeOperand + " not found.");
				//Assert.isTrue(false);			
			}
		}
		
		op = query.searchNodeOp;
	}
	
}
