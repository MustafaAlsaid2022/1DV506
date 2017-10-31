package ma223zf_assign2;

import java.util.Scanner;

public class CountA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner object//
		System.out.println("insert text: "); // user instruction//
		String str = scan.nextLine();
		int count_a = 0; // initial of number of a//
		int count_A = 0; // initial of number of A//
		for (int i = 0; i < str.length(); i++) {
			char ch_a = str.charAt(i);
			char ch_A = str.charAt(i);
			if (ch_a == 'a') {
				count_a++; // increment number of a//
			}
			if (ch_A == 'A') {
				count_A++; // increment number of A//
			}
		}
		System.out.println("number of A: " + count_A);
		System.out.println("number of a: " + count_a);
		scan.close();
	}
}
