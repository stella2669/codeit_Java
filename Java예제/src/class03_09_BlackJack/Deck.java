package class03_09_BlackJack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getCards(){
		return cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void print() {
		for(Card card : cards) {
			System.out.println(card);
		}
	}
	
	public void shuffle() {
		Random random = new Random();
		
		for(int i = 0; i < cards.size(); i++) {
			int randIndex = random.nextInt(cards.size());
			// 0~51사이의 랜덤한 정수가 만들어짐.
			Card temp = cards.get(i); //랜덤인덱스와 i인덱스의 자리바꿈
			cards.set(i, cards.get(randIndex));
			cards.set(randIndex, temp);
		}
	}
	
	public Deck deal(int count) {
		Deck hand = new Deck();
		for(int i = 0; i < count ; i++) {
			hand.addCard(cards.remove(0)); //remove(i)를 하게 되면 삭제할 떄마다 cards의 길이가 달라짐
		}
		return hand;
	}
}
