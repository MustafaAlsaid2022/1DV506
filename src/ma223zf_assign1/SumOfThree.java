package ma223zf_assign1;

import java.util.Scanner;

public class SumOfThree {
	public static void main(String[] args){
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number consist of three digits: ");//user instruction//
	int number=scan.nextInt();
	int numberMod=number%100;
	int sum=(number/100)+ (numberMod/10) +(number%10); //calculate sum of three digits//
	System.out.println("The sum of three digits: "+sum);//print sum
	scan.close();
	
	}
}
