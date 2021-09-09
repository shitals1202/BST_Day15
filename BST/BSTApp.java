package Day15.BST;

public class BSTApp
{
	public static void main(String[] args)
	{
		PostOrder post=new PostOrder();
		PreOrder po=new PreOrder();
		BST a = new BST();
		Node root = null;
		root=a.insert(root , 56);
		root=a.insert(root , 30);
		root=a.insert(root , 70);
		root=a.insert(root , 22);
		root=a.insert(root , 11);
		root=a.insert(root , 3);
		root=a.insert(root ,16);
		root=a.insert(root , 40);
		root=a.insert(root , 70);
		root=a.insert(root , 60);
		root=a.insert(root , 65);
		root=a.insert(root , 63);
		root=a.insert(root , 67);
		root=a.insert(root , 95);
		a.inorder(root);
		System.out.println(a.ifNodePresent(root , 1));
		po.preorder(root);
		System.out.println("postorder = ");
		post.postOrder(root);
	}

}