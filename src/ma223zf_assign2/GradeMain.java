/*
 * GradeMain.java
 * Date: 9 okt 2008
 * Author: Jonas Lundberg
 */
package ma223zf_assign2;


/*
 * A short program demonstrating how to use
 * the non-trivial enumeration type SwedishGrade. 
 *
 */
public class GradeMain {

	public static void main(String[] args) {
		SwedishGrade grade = SwedishGrade.G;
		System.out.println("Grade: " + grade);

		for (SwedishGrade g : SwedishGrade.values()) {
			System.out.println(g+" ==> "+g.getDescription());
		}	
	}
}
