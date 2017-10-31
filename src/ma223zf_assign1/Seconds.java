package ma223zf_assign1;

import java.util.Scanner;

public class Seconds {
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);/*create an object of scanner 
		connected to keyboard*/
		System.out.println("insert hours field" );//  user instruction
		int hour_Input = scan.nextInt();
		System.out.println("instert minutes field");// user instruction//
		int minute_Input = scan.nextInt();
		System.out.println("instert seconds field");// user instruction//
		int second_Input = scan.nextInt();
		int timeInsecond= 60*60*hour_Input +60*minute_Input +second_Input; // calculate time in seconds// 
		System.out.println(" Time in seconds is:"+timeInsecond);// print the result//
		scan.close();
	}
}
