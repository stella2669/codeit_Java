package class03_09_BlackJack;

public class Card {
	public final int suitNumber;
	public final int rankNumber;
	
	public Card(int suitNumber, int rankNumber) {
		this.suitNumber = suitNumber;
		this.rankNumber = rankNumber;
	}
	
	public String getSuit() {
		switch(this.suitNumber) {
		case 1:
			return "Clubs";
		case 2:
			return "Hearts";
		case 3:
			return "Diamonds";
		case 4:
			return "Spades";
		default:
			return "";
		}
	}
	
	public String getRank() {
		switch(this.rankNumber) {
		case 1:
			return "Ace";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		default:
			return String.valueOf(this.rankNumber);
		}
	}
	
	public String toString() {
		return getRank() + " of " + getSuit();
	}
	
}
