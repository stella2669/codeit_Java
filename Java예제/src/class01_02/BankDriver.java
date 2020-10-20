package class01_02;

public class BankDriver {

	public static void main(String[] args) {
		// 사람 선언
		Person p2 = new Person(); //객체 생성
		p2.name = "김신의";
		p2.age = 28;
		p2.cashAmount= 100000;
		
		// 은행 계좌 생성
		BankAccount a2 = new BankAccount();
		a2.balance = 500000;
		
		// 두 객체의 관계 설정
		p2.account = a2;
		a2.owner = p2;
		
		a2.deposit(30000);
		
		a2.withdraw(170000);
		
		a2.deposit(620000);
		
		a2.withdraw(890000);
		
		

	}

}
