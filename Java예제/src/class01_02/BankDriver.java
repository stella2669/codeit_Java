package class01_02;

public class BankDriver {

	public static void main(String[] args) {
		// ��� ����
		Person p2 = new Person(); //��ü ����
		p2.name = "�����";
		p2.age = 28;
		p2.cashAmount= 100000;
		
		// ���� ���� ����
		BankAccount a2 = new BankAccount();
		a2.balance = 500000;
		
		// �� ��ü�� ���� ����
		p2.account = a2;
		a2.owner = p2;
		
		a2.deposit(30000);
		
		a2.withdraw(170000);
		
		a2.deposit(620000);
		
		a2.withdraw(890000);
		
		

	}

}
