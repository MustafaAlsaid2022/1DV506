package ma223zf_assign4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		String[] Array = new String[10];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = "";
		}
       /*read from file*/
		try {
			File number = new File("C:\\java_courses\\1DV506\\src\\ma223zf_assign4\\numbers.txt");
			Scanner scan = new Scanner(number);

			while (scan.hasNext()) {
				list.add(scan.nextInt()); //store numbers in array list list//
			}
			/*count how many numbers from 1 to 100*/
			int count=0;
			for(int i=0;i<list.size()-1;i++){
				if(list.get(i)>=1 && list.get(i)<=100){
					count++;
				}
			}
			int outrange=list.size()-count; // numbers out of 1-100//
			System.out.println("total number between 1-100: "+count);
			System.out.println("other numbers: "+outrange);
			System.out.println("Histogram");
			System.out.println();
			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 0; j <= 9; j++) { //print * for number from 1-10 11-20 to 91-100
					if (list.get(i) >= (j * 10 + 1) && list.get(i) <= (j * 10 + 10)) {
						Array[j] += "*";
					}
				}
			}
			for (int i = 0; i <= 9; ++i) { //print number groups 1-10| to 91-100|
				System.out.println((i * 10 + 1) + "-" + (i * 10 + 10) + "|" + "\t" + Array[i]);
			}

		

			scan.close();

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
