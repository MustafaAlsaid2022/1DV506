package ma223zf_assign2;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// scanner object//
		System.out.println("insert a postive integers: ");// user instruction//
		int number = scan.nextInt();
		int zero = 0; // initial number for zeros//
		int odd = 0; // initial number for odds//
		int even = 0; // initial number for evens//
		while (number > 0) {
			int digit = number % 10;
			if (digit == 0) {
				zero++; // increment zeros//
			} else if (digit % 2 == 0) {
				even++; // increment evens//
			} else {
				odd++; // increment odds//
			}
			number = number / 10;
		}
		System.out.println("number of zeros: " + zero);
		System.out.println("number of odds: " + odd);
		System.out.println("number of evens: " + even);
		scan.close();
	}
}
