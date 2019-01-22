package myStack;

public class MyStack {
	// private fields
	private int size;
	private int[] elements;
	
	
	public void push(int element) {
		size++;
		//size += 1;
		//size = size + 1;
	}
	
	public int size() {
		return size;
	}

	public int pop() {
		size--;
		return -1;
	}
}
