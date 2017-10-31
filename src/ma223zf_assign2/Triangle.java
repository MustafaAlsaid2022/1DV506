package ma223zf_assign2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner object//
		System.out.println("insert an odd positive number: "); // user
																// instruction//
		int size = scan.nextInt(); // read the triangle size//
		if (size % 2 == 0) { // error message condition//
			System.out.println("you insert an invalid value");
		} else {
			System.out.println("Right-Angled Triangle: ");
			for (int i = size; i >= 1; i--) {
				System.out.println(); // new empty line//
				for (int j = 1; j <= size; j++) { // to draw a right triangle//
					if (j < i) {
						System.out.print(" ");
					} else
						System.out.print("*");
				}
			}

			System.out.println(); // new line//
			System.out.println("Isosceles Triangle: ");
			for (int x = 1; x <= size; x = x + 2) {
				System.out.println(); // new empty line//
				int space = (size - x) / 2; // declare number of spaces//
				while (space > 0) {
					System.out.print(" ");
					space--; // decreasing number of spaces//
				}
				for (int y = 1; y <= x; y++) {
					System.out.print("*");
				}
			}
		}
		scan.close();
	}

}
