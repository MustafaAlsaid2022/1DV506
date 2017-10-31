package ma223zf_assign1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class WindChill {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); // create an object of scanner//
		System.out.println("insert the temprature in celsius: "); //user instruction//
		double temprature=scan.nextDouble();
		System.out.println("insert wind speed(m/s): "); //user instruction//
		double windSpeed=scan.nextDouble();
		double windChill=33+(temprature-33)*(0.474 + 0.454*Math.sqrt(windSpeed)-0.0454*windSpeed); ////calculate wind chill//
		DecimalFormat decimal=new DecimalFormat("0.#"); //one decimal//
		String decimalWindchill=decimal.format(windChill); //apply formatting on windChill//
		System.out.println("wind chill temprature: "+decimalWindchill); 
		scan.close();
		
	}

}
