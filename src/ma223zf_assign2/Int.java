package ma223zf_assign2;

public class Int {
	private final int val;
	
	public Int(int n) {val = n;}
	
	/* Diagnostics */
	public String toString() {
		return "Int("+val+")";
	}
	
	/* Accessor */
	public int getValue() { return val; }
	
	/* Arithmetics */
	public Int plus(Int n) {
		return new Int(val + n.val); 
	}

	public Int minus(Int n) {
		return new Int(val - n.val); 
	}
	
	public Int mult(Int n) {
		return new Int(val * n.val); 
	}

	public Int div(Int n) {
		return new Int(val / n.val); 
	}
	
	
	/* Comparison */
	public boolean isLessThan(Int n) {
		return val < n.val;
	}
	
	public boolean isEqualTo(Int n) {
		return val == n.val;
	}
}
