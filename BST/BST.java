package Day15.BST;

public class BST
{
	public Node createNewNode(int k)
	{
		Node a=new Node();
		a.data=k;
		a.left=null;
		a.right=null;
		return a;	
	}
	public Node insert(Node node ,int val)
	{
		if(node == null)
		{
		return createNewNode(val);
		}
		if(val<node.data)
		{
				node.left = insert(node.left, val);
		}
		else if(val>node.data)
		{
			node.right = insert(node.right, val);
		}
		return node;
	}
	public void inorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
	}
		
	public boolean ifNodePresent(Node node , int val)
	{
		if(node==null)
		{
			return false;
		}
	
		boolean isPresent=false;
		while(node != null)
		{
			if(val<node.data)
			{
				node=node.left;
			}
			else if(val>node.data)
			{
				node=node.right;
			}
			else
			{
				isPresent=true;
				break;
			}
		}
		return isPresent;
	}
}