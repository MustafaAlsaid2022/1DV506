package ma223zf_assign2;

import java.util.Scanner;
import java.util.ArrayList;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner object//
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("insert positive integers." +
		"End by giving a negative integer."); //user instruction//
																								 
		int posInt=1; //initial arbitrary value//
		int i = 0;
		while (posInt > 0) {
			System.out.print("integer " + (i + 1) + ":"); // print on screen//
			i++;
			posInt = scan.nextInt();
			list.add(posInt); // store posInt value in list//
		}
		System.out.println(); // empty new line//
		System.out.println("Number of posiggtive integers: " + (i - 1));
		System.out.print("In reverse order:");
		for (int j = list.size() - 2; j >= 0; j--) {
			int number = list.get(j); // positive integer//
			System.out.print(" " + number);
		}
		if (posInt < 0) {
			System.out.println();
			System.out.println("program stopped");
			System.exit(-1);
		}
		scan.close();
	}
}