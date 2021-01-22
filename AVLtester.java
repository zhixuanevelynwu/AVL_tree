package project6;

public class AVLtester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//Integer[] i1 = {30,20,40,10,25,5};
		Integer[] i1 = {1,2,3,4,5,6};
		AVL<Integer> tree1 = new AVL<Integer>(i1);
		//tree1.remove(5);
		//tree1.remove(30);
		//tree1.remove(40);
		//tree1.remove(10);
		tree1.remove(3);
		tree1.remove(1);
		//tree1.remove(4);
		System.out.println(tree1);
		System.out.println(tree1.toStringTreeFormat());
		System.out.println(tree1.balanceFactor(tree1.root()));
	}

}
