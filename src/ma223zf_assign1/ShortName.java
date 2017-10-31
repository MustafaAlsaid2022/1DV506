package ma223zf_assign1;

import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("insert first name: ");
		String firstName=scan.nextLine();
		System.out.println("insert last name: ");
		String lastName=scan.nextLine();
		char first=firstName.charAt(0);
		if (lastName.length()<4){      /*if statement to print last name if it consists of 
		less than three characters*/
			System.out.println(first+". "+lastName);
		}
		else{
			System.out.println(first+". "+lastName.substring(0,4) );
		
		}
        scan.close();
	}

}
