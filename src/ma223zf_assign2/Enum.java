/*
 * Enum.java
 * Date: 9 okt 2008
 * Author: Jonas Lundberg
 */
package ma223zf_assign2;

/*
 * A simple program using enumerated types.
 * The enumeration type SweGrade used here is 
 * local ==> can only be accessed from within the 
 * class Enum. Define a public enumeration type to 
 * make it reusable in other classes.
 */

public class Enum {
	
	private enum SweGrade {U,G,VG}
	
	public static void main(String[] args) {
		SweGrade g = SweGrade.G;
		System.out.println("Betyg: " + g);
		
		for (SweGrade b :SweGrade.values()) {
			System.out.print(b+" ==> ");
			if (b == SweGrade.U)
				System.out.println("fail");
			else if (b == SweGrade.G)
				System.out.println("pass");
			else
				System.out.println("pass with distinction");	
		}		
	}
}

