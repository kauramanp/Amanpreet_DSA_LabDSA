package com.amanpreet;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBacketComparison {
	
	public static boolean compareBrackets(String bracket, int n) {

		if(n == 0) 
			return false;
		if(n % 2 != 0) {
			return false;
		}
		
		Deque<Character> myStack = new ArrayDeque<>();
		
		for(int i =0; i < n; i++) {
			char  ch = bracket.charAt(i);
			if(ch == '(' || ch  == '{' || ch == '[') {
				myStack.push(ch);
			}else {
				if(myStack.isEmpty() || (ch == ')' && myStack.peek() != '(' ) ||  (ch == '}' && myStack.peek() != '{' )
						 ||  (ch == ']' && myStack.peek() != '[' )) {
					return false;
				}
				
				myStack.pop();
			}
		}
		return myStack.isEmpty();
		
	}

}
