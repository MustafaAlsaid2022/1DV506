package stack;

import java.util.Iterator;

public class StackImp implements Stack {

	/*declare fields*/
	private Object stack[]; 
	private int size;
	private int current = -1;

	public StackImp(int size) { //constructor//
		this.size = size;
		stack = new Object[size];
	}

	public int size() { //return size of stack//
		return this.size;
	}

	public boolean isEmpty() { //check stack is empty//
		if (current < 0) {
			return true;
		}
		return false;
	}

	public Object peek() throws Exception { //peek method with exception//
		if (current < 0) {
			throw new Exception("array stack is empty");
		}
		return stack[current];
	}

	public void push(Object element) throws Exception { //push method with exception//

		if (current == size) {
			throw new Exception("Array stack is full");
		}
		if (current == size - 1) {
			resize();
		}
		stack[++current] = element;
	}

	public Object pop() throws Exception { //pop method with exception//
		if (current < 0) {
			throw new Exception("array stack is empty");
		}
		return stack[current--] = null;
	}

	private void resize() { //to array larger to add more elements//
		Object[] tmp = new Object[2 * size]; // increase array size
		for (int i = 0; i < size; i++)
			tmp[i] = stack[i]; // copy array content
		
		size = 2 * size; // update size
	}

	public Iterator<Object> iterator() { //iterator method//

		return new StackIterator();
	}
     /*implement iterator*/
	private class StackIterator implements Iterator<Object> {
		private int i = current; 

		public boolean hasNext() {
			return (i > -1);
		}

		public Object next() {
			return stack[i--];
		}

		public void remove() {

		}

	}
}