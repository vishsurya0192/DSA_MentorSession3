package com.Treeimplementation;

import java.util.ArrayList;
import java.util.List;

public class LeastCommonAncestor {
	Node root;
	private List<Integer>path1 = new ArrayList();
	private List<Integer>path2 = new ArrayList();

	public int findLCA(int node1, int node2) {
		path1.clear();
		path2.clear();
		return findLCAInternal(root, node1, node2);
		
		
	}
	
	private int findLCAInternal(Node root, int node1, int node2) {
		if(!findPath(root,node1,path1) || !findPath(root, node2, path2)) {
			System.out.println((path1.size() > 0) ? "node1 is present" : "node1 is missing");
			System.out.println((path2.size() > 0) ? "node2 is present" : "node2 is missing");
			return -1;
		}
		int i;
		for(i = 0; i< path1.size() && i < path2.size(); i++) {
			//System.out.println(path1.get(i) +" "+path2.get(i));
			if(!path1.get(i).equals(path2.get(i)))
				break;
		}
		return path1.get(i-1);
	}
	
	private boolean findPath(Node root, int n, List<Integer>path) {
		//base case
		if(root == null) {
			return false;
		}
		//store this node . the node will be removed if not in path from root to n
		
		path.add(root.data);
		
		if(root.data == n) {
			return true;
		}
		if(root.left != null && findPath(root.left, n, path)) {
			return true;
		}
		if(root.right != null && findPath(root.right, n, path)) {
			return true;
		}
		
		//If not present in subtree rooted with root, remove root from path[] and return false
		path.remove(path.size()-1);
		
		return false;
	}
	

}
