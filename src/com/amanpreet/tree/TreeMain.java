package com.amanpreet.tree;

import java.util.Scanner;

public class TreeMain {
	
	public static void main(String args[]) {
		Tree tree = new Tree();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of nodes in tree:");
		int totalNode = sc.nextInt();
		for(int i = 0; i<totalNode; i++) {
			tree.insert(sc.nextInt());
		}
		
		System.out.print("Enter target : ");
		int target  = sc.nextInt();
		boolean isPairExist = tree.pairSum(target);
		if(!isPairExist)
			System.out.print("nodes are not found ");
	}

}
