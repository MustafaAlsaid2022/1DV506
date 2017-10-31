package ma223zf_assign1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);/* create an object of scanner 
	connected to keyboard*/
	System.out.println("Enter your length in meters: ");
	float lgth=scan.nextFloat();
	System.out.println("Enter your weight in kg: ");
    float wght=scan.nextFloat();
    float bmi=wght/(lgth*lgth);
    System.out.println("Your BMI is: "+Math.round(bmi));
    scan.close();

	}
	

}

