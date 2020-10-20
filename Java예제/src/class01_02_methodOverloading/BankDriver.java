package class01_02_methodOverloading;

public class BankDriver {
    public static void main(String[] args) {
        // ��� 1
        Person p1 = new Person();
        p1.setName("�����");
        p1.setAge(28);
        p1.setCashAmount(30000);

        // ���� ���� 1
        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        // ��� 2
        Person p2 = new Person();
        p2.setName("������");
        p2.setAge(25);
        p2.setCashAmount(100000);

        // ���� ���� 2
        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

        // ���� ��ü �׽�Ʈ
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}