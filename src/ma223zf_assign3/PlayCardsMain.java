  package ma223zf_assign3;


public class PlayCardsMain {
	 
	public static void main(String[] args) {
		Deck myDeck=new Deck();
		myDeck.shuffle();
		System.out.println("The cards have been dealt are:");
		for(int i=0;i<5;i++){
			
			System.out.println(myDeck.dealCard());
			
		}
		int remaincard=myDeck.remainCard();
		System.out.println("The number of cards that remaining: "+remaincard+" cards");
	}
	

}
