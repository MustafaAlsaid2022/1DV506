package ma223zf_assign2;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner object//
		System.out.println("insert 10 integers: ");// user instruction//
		int number = scan.nextInt();
		int max = number;
		int smax = 0; // initial value for second max//
		for (int i = 1; i <= 9; i++) {
			number = scan.nextInt();
			if (i == 1) {
				if (number > max) {
					smax = max;
					max = number;
				} else
					smax = number;
			}
			if (number > max && number > smax) {
				smax = max;
				max = number;
			} else if (number < max && number > smax) {
				smax = number;
			}
		}
		System.out.println("the second largest number: " + smax);
		scan.close();

	}
}
