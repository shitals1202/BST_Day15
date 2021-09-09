package Day15.BST;

public class PostOrder
{
	public void postOrder(Node node)
	{
		if(node==null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}
}