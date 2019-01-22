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
}


