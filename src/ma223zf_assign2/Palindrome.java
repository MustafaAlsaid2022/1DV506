package ma223zf_assign2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner object//
		System.out.println("insert text: "); // user instruction
		String text = scan.nextLine();
		StringBuilder stb = new StringBuilder(); // string builder object//
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isLetter(ch)) { // take only characters//
				stb.append(ch);
			}
		}
		String charText = stb.toString(); // text contains only characters//
		stb.reverse(); // reverse stb//
		String backward = stb.toString(); // store reverse charText in
											// backward//
		if (backward.equalsIgnoreCase(charText)) // compare charText and
													// backward//
			System.out.println("the text contains a palindrome");
		else
			System.out.println("no palindrome");
		scan.close();
	}
}
