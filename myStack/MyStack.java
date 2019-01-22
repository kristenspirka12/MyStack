package myStack;

import java.util.Arrays;

public class MyStack {
	// private fields
	private int size;
	private int[] elements;
	
	public MyStack(int maxSize) {
		this.elements = new int[maxSize];
	}
	
	public MyStack() {
		this.elements = new int[100];
	}

	public void push(int element) {
		elements[size] = element;
		size++;
	}
	
	public int size() {
		return size;
	}

	public int pop() {
		size--;
		return elements[size];
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyStack [size=" + size + ", elements=" + Arrays.toString(elements) + "]";
	}

	public int peek() {
		
		return 0;
	}
	
}
