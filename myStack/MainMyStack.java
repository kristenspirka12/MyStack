package myStack;

import java.util.Stack;

public class MainMyStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(8);
		System.out.println(stack.pop());
		System.out.println(stack.size());
		//stack.pop(); // tuleb erind
	}

}
