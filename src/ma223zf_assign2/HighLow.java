package ma223zf_assign2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// scanner object//
		Random rand = new Random(); // random object//
		int number = 1 + rand.nextInt(100); // random number from 1 to 100//
		System.out.print("Guess number from 1-100: ");
		int guess = scan.nextInt(); // read int value from user//
		for (int attempts = 1; attempts <= 10; attempts++) {
			if (guess < number) {
				System.out.println("clue: higher");
				System.out.print("you tried " + (attempts) + " attempts ");
				guess = scan.nextInt(); // read another value from user//
			} else if (guess > number) {
				System.out.println("clue: lower");
				System.out.print("you tried " + (attempts) + " attempts ");
				guess = scan.nextInt();
			} else if (guess == number && attempts <= 3) {
				System.out.println("excelent");
				attempts = 0;
				number = 1 + rand.nextInt(100);
				guess = scan.nextInt();
			} else if (guess == number && attempts > 3) {
				System.out.println("not bad. You guessed after more than 3 attempt");
				guess = scan.nextInt();
			}
		}
		System.out.println("game over");
		scan.close();
	}
}
