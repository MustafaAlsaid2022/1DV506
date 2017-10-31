package stack;

import java.util.Iterator;

public interface Stack {

	public int size(); // Current stack size

	public boolean isEmpty(); // true if stack is empty

	public Object peek()
			throws Exception; /*
								 * Return (without removing) top element and
								 * throwing exception if it is empty
								 */

	public void push(Object element)
			throws Exception; /*
								 * Add element at top of stack and throwing
								 * exception if it is empty
								 */

	public Object pop() throws Exception; // Return and remove top element,

	public Iterator<Object> iterator(); // Element iterator
}
