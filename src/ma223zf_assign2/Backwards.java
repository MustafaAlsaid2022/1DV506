package ma223zf_assign2;

import java.util.Scanner;

public class Backwards {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner object//
		System.out.println("insert text"); // user instruction//
		String text = scan.nextLine();
		int st = text.length();
		for (int i = 1; i <= st; i++) {
			char ch = text.charAt(st - i);
			System.out.print(ch);
		}
		scan.close();
	}

}