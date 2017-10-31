package ma223zf_assign1;

import java.lang.Math; 
import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance {
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in); //create an object of scanner//
	System.out.println("insert value of x1,y1: "); //user instruction// 
    double x1=scan.nextDouble();
    double y1=scan.nextDouble();
    System.out.println("insert value of x2,y2: "); //user instruction// 
    double x2=scan.nextDouble();
    double y2=scan.nextDouble();
    double distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)); //calculate distance//
    DecimalFormat decimal=new DecimalFormat("0.###"); //three decimals
    String decimalDistance=decimal.format(distance); //apply formatting on distance//
    System.out.println("the distance: "+decimalDistance); //print decimalDistance//
    scan.close();
    
    
	}

}
