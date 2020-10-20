package class03_09_BlackJack;

public class BlackjackCard extends Card{
	public BlackjackCard(int suitNumber, int rankNumber) { //������
		super(suitNumber, rankNumber); //super������ ȣ��
	}
	
	public int getValue() {
		String value = super.getRank();
		switch(value) {
		case "Ace":
			return 11;
		case "Jack":
		case "Queen":
		case "King":
			return 10;
		default:
			return Integer.valueOf(value);
		}
	}
	
	public boolean isAce() {
		if(super.getRank().equals("Ace")) {
			return true;
		}else {
			return false;
		}
	}
}
