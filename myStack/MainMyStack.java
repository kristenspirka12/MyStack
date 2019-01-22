package myStack;

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
		
		System.out.println(stack2.pop()); // 5
	}

}
