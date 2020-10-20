package class01_03_������;

public class BankDriver {
    public static void main(String[] args) {
        Person p1 = new Person("�����", 28, 30000);

        BankAccount a1 = new BankAccount(100000, p1);

        Person p2 = new Person("������", 25, 100000);

        BankAccount a2 = new BankAccount(500000, p2);

        p1.setAccount(a1); //p1�� ���´� a1�̴�.
        a1.setOwner(p1); //a1������ ������ p1�̴�. //���� ����

        p2.setAccount(a2); // ���� ����
        a2.setOwner(p2);
        
        // ���� ��ü �׽�Ʈ
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}