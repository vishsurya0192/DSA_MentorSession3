package com.Treeimplementation;

public class DriverClass {

	public static void main(String[] args) {
		LeastCommonAncestor tree =new LeastCommonAncestor();
		
		//accept elements in tree
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);
		
		System.out.println("Least common ancestor= "+tree.findLCA(40,50));
		

	}

}
