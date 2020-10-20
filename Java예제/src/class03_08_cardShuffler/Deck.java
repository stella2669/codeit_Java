package class03_08_cardShuffler;

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
			// 0~51������ ������ ������ �������.
			Card temp = cards.get(i); //�����ε����� i�ε����� �ڸ��ٲ�
			cards.set(i, cards.get(randIndex));
			cards.set(randIndex, temp);
		}
	}
	
	public Deck deal(int count) {
		Deck hand = new Deck();
		for(int i = 0; i < count ; i++) {
			hand.addCard(cards.remove(0)); //remove(i)�� �ϰ� �Ǹ� ������ ������ cards�� ���̰� �޶���
		}
		return hand;
	}
}
