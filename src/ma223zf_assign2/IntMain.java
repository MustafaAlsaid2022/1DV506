package ma223zf_assign2;


public class IntMain {


	public static void main(String[] args) {
		Int i1 = new Int(1);
		System.out.println(i1.toString());
		
		Int i2 = new Int(2);
		Int i3 = new Int(3);
		
		/* Arithmetics */
		Int sum = i1.plus(i2);    // ==> 3
		System.out.println(sum.toString());		
		Int prod = sum.mult(i3);  // ==> 3*3 = 9
		System.out.println(prod.toString());
		
		/* Comparison */
		if (i1.isLessThan(i2))   // true
			System.out.println("Less than (1)");
		if (i3.isLessThan(i2))   // false
			System.out.println("Less than (2)");
		if (i3.isEqualTo(sum)) // true
			System.out.println("Equal to (1)");
		if (i3.isEqualTo(i2)) // false
			System.out.println("Equal to (2)");
		

	}

}
