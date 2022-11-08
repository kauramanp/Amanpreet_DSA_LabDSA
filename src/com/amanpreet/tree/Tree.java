package com.amanpreet.tree;

public class Tree {
	
	private TNode insert(TNode root, int data) {
		if(root == null) {
			return new TNode(data);
		}
		
		if(data <= root.getData()) {
			root.setLeft(insert(root.getLeft(), data));
		}else {
			root.setRight(insert(root.getLeft(), data));

		}
		
		return root;
	}
	
	public boolean pairSum(TNode root, int target, Set<Integer> dataSet) {
		if(root == null) return false;
		int setVal = target - root.getData();
		if(dataSet.contains(setVal)) {
			System.out.print("Pair is : "+ root.getData()+" , "+ setVal);
			return true;
		}
	}

}
