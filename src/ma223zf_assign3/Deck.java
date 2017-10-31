package ma223zf_assign3;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>();

	/* Collections of cards */

	/* Remaining number of cards in the deck */
	private int currentCard;

	public Deck() {
		currentCard = 0;
		for (int i = 0; i < Card.Suit.values().length; i++) {
			for (int j = 0; j < Card.Rank.values().length; j++) {
				Card deck = new Card(Card.Suit.values()[i], Card.Rank.values()[j]);
				cards.add(deck);
				
			}
		}

	}

	/*
	 * This is to shuffle the cards in the deck with the remaining cards.
	 */

	public void shuffle() {
		Collections.shuffle((cards));
	}
	/*deal the cards*/
	public Card dealCard() { 
		if(currentCard==cards.size()-1){
			currentCard=0;
		}
		while (currentCard <= cards.size()-1) {
			return cards.get(currentCard++);
		} 
		
		
			return null;
		}
	

	public int remainCard() { /*remaining card in the deck*/

		int remainCard = cards.size() - currentCard;
		return remainCard;
	}

}