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
		if (size < 1) {
			throw new IllegalStateException("T�hjast pinust ei saa elemente v�lja k�sida.");
		}
		size--;
		return elements[size];
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return elements != null ? Arrays.toString(getElements()) : "";
	}

	public int peek() {
		if (size < 1) {
			throw new IllegalStateException("T�hjast pinust ei saa elemente v�lja k�sida.");
		}
		return elements[size-1];
	}
	
	public int[] getElements() {
		/*int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = elements[i];
		}
		return result; */
		return Arrays.copyOfRange(elements, 0, size);
	}
	
}
