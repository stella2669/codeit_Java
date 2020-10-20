package class01_02;

public class BankAccount {
	int balance;
	Person owner;
	
	// �Ķ���� : �Ա��� �׼� (����)
	// ���� : ��������(�Ҹ�)
	boolean deposit(int amount) {	
		if(amount < 0 || amount > owner.cashAmount) {
			System.out.printf("�Ա� �����Դϴ�. �ܰ�: %d��, ����: %d��\n", balance, owner.cashAmount);
			System.out.println("false");
			return false;
		}else {
			balance += amount;
			owner.cashAmount -= amount;
			System.out.printf("%d�� �Ա��Ͽ����ϴ�. �ܰ�: %d��, ����: %d��\n", amount, balance, owner.cashAmount);
			System.out.println("true");
			return true;
		}	
	}
	
	// �Ķ���� : ����� �׼� (����)
	// ���� : �������� (�Ҹ�)
	boolean withdraw(int amount) {
		if(amount < 0 || amount > balance) {
			System.out.printf("��� �����Դϴ�. �ܰ�: %d��, ����: %d��\n", balance, owner.cashAmount);
			System.out.println("false");
			return false;
		}else {
			balance -= amount;
			owner.cashAmount += amount;
			System.out.printf("%d�� ����Ͽ����ϴ�. �ܰ�: %d��, ����: %d��\n", amount, balance, owner.cashAmount);
			System.out.println("true");
			return true;
		}
	}
	
	// �Ķ���� : �޴� ���(Person), ��ü�� �ݾ�(����)
	// ���� : ��������(�Ҹ�)
	/*boolean transfer(Person to, int amount) {
		
	}*/
}
