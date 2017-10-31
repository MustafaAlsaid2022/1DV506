package stack;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
		Stack stack = new StackImp(10); // Stack can have 10 element
		try {
			System.out.println("Stack size:" + stack.size());
			stack.push("3"); // push an object element in stack
			stack.push("4");
			System.out. println("the stack elements are ");
			Iterator <Object> it = stack. iterator ();
			while ( it .hasNext()) {
			Object obj = it .next ();
			System.out. println(obj+" ");
		}
			String peekString = (String) stack.peek(); // check out "4"//
			System.out.println("The last element in stack: "+peekString); // print "4"
			stack.pop(); // remove 4//
			System.out.println("The last element in stack: "+stack.peek()); //print "3"//
			stack.pop(); // there is no element in stack after pop//
			System.out.println(stack.peek());
		} catch (Exception e) {
			System.out.println("Exception message:" + e.getMessage());
		}

	}

}
