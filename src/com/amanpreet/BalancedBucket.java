package com.amanpreet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BalancedBucket {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the bracket string; press any key to exit");
		String brackets = sc.next();
		Boolean isBalanced = BalancedBacketComparison.compareBrackets(brackets.toString(), brackets.length());
		if(isBalanced) {
			System.out.print("The entered string is balanced bracket");
		}else {
			System.out.print("The entered string does not have the balanced bracket");

		}

	}

}
