package ma223zf_assign3;

public class Card {

	/*
	 * An enumeration type for the card suites. An enumeration type for the
	 * rank.
	 */

	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
	}

	public enum Rank {
		Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
	}

	public Rank rank; 
	public Suit suit;
	
	public Rank getRank() { 
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) { //update value of suit//
		this.suit = suit;
	}

	public void setRank(Rank rank) { //update value of rank//
		this.rank = rank;
	}


	public Card(Suit suit, Rank rank) { //constructor takes parameters// 
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() { //how to display the cards in string form//
		return rank + ":" + suit;
	}

}
