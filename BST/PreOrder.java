package Day15.BST;

public class PreOrder
{
	public void preorder(Node node)
	{
		if(node==null)
		return ;
		
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}
}