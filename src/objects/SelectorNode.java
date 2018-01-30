package objects;

public class SelectorNode
{
	public final static int NODE = 0;
	public final static int ATTR = 1;
	public final static int PROP = 2;
	public final static int AST_CHILD = 3;
	
	public int nodeType;
	public String nodeText;
	
	public SelectorNode(String text, int type)
	{
		nodeType = type;
		nodeText = text;
	}
}