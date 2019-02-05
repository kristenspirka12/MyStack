package myStack;

import java.util.Stack;

public class MainMyStack {

	public static void main(String[] args) {
		/*Stack<Integer> stack = new Stack<Integer>();
		stack.push(8);
		System.out.println(stack.pop());
		System.out.println(stack.size()); */
		//stack.pop(); // tuleb erind
		
		MyStack stack2 = new MyStack(10);
		stack2.push(2);
		stack2.push(1);
		stack2.push(5);
		stack2.pop();
		stack2.push(6);
		System.out.println(stack2); // 5
		
		Stack<Integer> stack3 = new Stack<Integer>();
		stack3.push(2);
		stack3.push(1);
		stack3.push(5);
		stack3.pop();
		stack3.push(6);
		System.out.println(stack3);
		
		MyStack stack4 = new MyStack();
		System.out.println(stack4);
	}
}
