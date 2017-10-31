package ma223zf_assign4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		try {
			/* read from file */
			File number = new File("C:\\java_courses\\1DV506\\src\\ma223zf_assign4\\HistoryOfProgramming.txt");
			Scanner scan = new Scanner(number);
			String text;
			int upperCase = 0; // initial value for uppercase//
			int lowerCase = 0; // initial value for lowerase//
			int whiteSpace = 0; // initial value for whitespace//
			int size = 0; //// initial value for all characters in the file//
			while (scan.hasNext()) {
				text = scan.nextLine();
				for (int i = 0; i < text.length(); i++) {
					if (Character.isUpperCase(text.charAt(i)))
						upperCase++;
				}
				for (int i = 0; i < text.length(); i++) {
					if (Character.isLowerCase(text.charAt(i)))
						lowerCase++;
				}
				for (int i = 0; i < text
						.length(); i++) { /*
											 * number of whitespace is 700 I try
											 * to download the again and still
											 * gives me 700 and I asked but you
											 * did not give an answer
											 */
					if (Character.isWhitespace(text.charAt(i)))
						whiteSpace++;
				}
				for (int i = 0; i < text.length(); i++) {

					size++;
				}
			}

			System.out.println("Number of upper case letters: " + upperCase);
			System.out.println("Number of lower case letters: " + lowerCase);
			System.out.println("Number of " + "\"" + "whitespaces" + "\"" + ":" + whiteSpace);
			System.out.println("Number of others: " + (size - upperCase - lowerCase - whiteSpace));

			scan.close();

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
