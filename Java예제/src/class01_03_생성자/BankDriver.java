package class01_03_생성자;

public class BankDriver {
    public static void main(String[] args) {
        Person p1 = new Person("김신의", 28, 30000);

        BankAccount a1 = new BankAccount(100000, p1);

        Person p2 = new Person("문종모", 25, 100000);

        BankAccount a2 = new BankAccount(500000, p2);

        p1.setAccount(a1); //p1의 계좌는 a1이다.
        a1.setOwner(p1); //a1계좌의 주인은 p1이다. //관계 설정

        p2.setAccount(a2); // 관계 설정
        a2.setOwner(p2);
        
        // 계좌 이체 테스트
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}