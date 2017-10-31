package ma223zf_assign2;

import java.util.Scanner;

public class BirthdayCandles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner object//
		System.out.print("insert age: "); // user instruction//
		int age = scan.nextInt();
		int sumAge = (age * (age + 1)) / 2; // sum candle needed//
		int candle = 0; // initial value of candle//
		int sumBox = 0;
		for (int years = 0; years < age; years++) {
			int buyBox = 0;
			candle = candle - (years);
			while (candle <= years) { // when buy box//
				candle = candle + 24;
				buyBox++;
			}
			sumBox = sumBox + buyBox;
			if (buyBox > 0) { // print those birthdays where you must buy
								// boxes//
				System.out.println("Before birthday " + (years + 1) + ":buy " + buyBox + " box(es)");
			}
		}
		System.out.println(); // empty new line//
		System.out.println("total number of boxes: " + sumBox);
		System.out.println("Remaining candles: " + (sumBox * 24 - sumAge));
		scan.close();
	}

}
