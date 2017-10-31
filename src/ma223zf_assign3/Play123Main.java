package ma223zf_assign3;

import java.text.DecimalFormat;

public class Play123Main {
	static Deck deck = new Deck(); /* object */

	public static void main(String[] args) {

		deck.shuffle();
		int countWin = 0;
		double probabilityLosing = (4.0 / 52.0) + (4.0 / 51.0) + (4.0 / 50.0);
		DecimalFormat decimal = new DecimalFormat("0.####"); /* four decimals */
		String decimalprobabilityLosing = decimal
				.format(probabilityLosing); /* apply formatting on probability */
		double probabilityWin=1-probabilityLosing;
		String decimalprobabilityWin=decimal.format(probabilityWin);
		for (int i = 0; i < 10000; i++) { /* play the game 10000 times */
			System.out.println();
			
			if (play123()) {
				countWin++;
			}
		}

		System.out.println();
		System.out.println("The percentage of losing the game using a full deck: " + decimalprobabilityLosing);
		System.out.println("The percentage of winning the game using a full deck: " + decimalprobabilityWin);
		System.out.println("you Won " +  (countWin) + " times");
		System.out.println("you lost " + (10000 - countWin) + " times");

	}

	public static boolean play123() { /*check win or lose*/
		for (int j = 0; j < 3; j++) {
			System.out.println(deck.dealCard());
			if (j == 0 && deck.dealCard().rank == Card.Rank.Ace) {
				return false;
			} else if (j == 1 && deck.dealCard().rank == Card.Rank.Two) {
				return false;
			} else if (j == 2 && deck.dealCard().rank == Card.Rank.Three) {
				return false;
			}
			
		}
		return true;
	}
}