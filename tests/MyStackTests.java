package tests;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import myStack.MyStack;

public class MyStackTests {
	
	@Test
	public void newStackIsEmpty() {
		MyStack stack = new MyStack();
		assertThat(stack.size(), is(0));
	}
	
	@Test
	public void stackSizeIncreasedWhenPush() {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		assertThat(stack.size(), is(2));
	}
	
	@Test
	public void stackSizeDecreasedWhenPop() {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.pop();
		assertThat(stack.size(), is(1));
	}
	
	@Test
	public void pushedElementAddedToStack() {
		MyStack stack = new MyStack();
		stack.push(1);
		assertThat(stack.pop(), is(1));
	}
	
	@Test
	public void peekReturnsLastElement() {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		assertThat(stack.peek(), is(2));
	}
	
	@Test
	public void getElementsReturnItsElements() {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		System.out.println(stack);
		assertThat(stack.getElements(), is(new int[] {1, 2}));
	}
	
	@Test
	public void peekNotChangeSize() {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.peek();
		assertThat(stack.size(), is(2));
	}
	
	@Test
	public void peekNotChangeElements() {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		assertThat(stack.peek(), is(2));
		assertThat(stack.peek(), is(2));
	}
	
	@Test(expected = IllegalStateException.class)
	public void popThrowsExceptionWhenEmptyStack() {
		MyStack stack = new MyStack();
		stack.pop();
	}
	
	@Test(expected = IllegalStateException.class)
	public void peekThrowsExceptionWhenEmtyStack() {
		MyStack stack = new MyStack();
		stack.peek();
	}
	
	@Test
	public void getElementsReturnsEmptyArrayWhenEmptyStack() {
		MyStack stack = new MyStack();
		stack.getElements();
		assertThat(stack.getElements(), is(new int[0]));
	}
}


