package ma223zf_assign3;

import java.util.Scanner;

public class SweIDMain {

	public static void main(String[] args) {
		

			Scanner scan = new Scanner(System.in);
			System.out.print("Write your SweID in format YYMMDD-NNNN: ");
			String id = scan.nextLine();
			scan.close();
			if (SweID.isCorrect(id)) {
				System.out.println("The ID Number is correct");
				System.out.println("FirstPart: " + SweID.getFirstPart(id));
				System.out.println("SecondPart: " + SweID.getSecondPart(id));
				if (SweID.isFemale(id))
					System.out.println("Female");
				if (SweID.isMale(id))
					System.out.println("Male");
				String secondId = "860707-0556";
				System.out.println("The second ID: "+secondId);
				if (SweID.areEqual(id, secondId)) {
					System.out.println("The two ID numbers are coresponded");
				} else {
					System.out.println("The two ID numbers are not coresponded");
				}
			} else {
				System.out.println("The ID Number is not correct");
			}
		}
	}


