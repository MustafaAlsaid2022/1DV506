package ma223zf_assign1;

import java.util.Scanner;

public class Time {
	
	public static void main(String[] arg){
		Scanner scan=new Scanner(System.in);/*create an object of scanner 
		connected to keyboard*/
		System.out.println("insert seconds field: "); //user instruction//
		int timeInseconds=scan.nextInt();
		int hours=timeInseconds/(60*60); // calculate hours
		int hourMod= timeInseconds%(60*60); /* calculate the remaining 
		seconds after calculating the hours*/
		int minutes=hourMod/60; // calculate minutes
		int seconds=hourMod%60; /* calculate the remaining
		seconds after calculating minutes and hours*/
		System.out.println("number of hours: "+hours); // print number of hour//
		System.out.println("number of minutes: "+minutes); // print number of minutes// 
		System.out.println("number of seconds: "+seconds); // print number of seconds//
        scan.close();
	}
}
/*int price= 2254;
int payment= 2500;
int change= payment-price;
int p1=(change/1000);
int p2=change%1000;
int p3=p2/500;
int p4=p2%500;
int p5=p4/100;
int p6=p4%100;
int p7=p6/50;
int p8=p6%50;
int p9=p8/20;
int p10=p8%20;
int p11= p10/10;
int p12= p10%10;
int p13= p12/5;
int p14= p12%5;



System.out.println("1000kr bills:"+ p1);
System.out.println("500kr bills:"+ p3);
System.out.println("100kr bills:"+ p5); 
System.out.println("50kr bills:"+ p7); 
System.out.println("20kr bills:"+ p9); 
System.out.println("10kr bills:"+ p11); 
System.out.println("5kr bills:"+ p13); 
System.out.println("1kr bills:"+ p14); 
 

	}

}*/
