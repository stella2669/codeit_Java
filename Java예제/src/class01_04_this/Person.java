package class01_04_this;

public class Person {
	private String name;
	private int age;
	private int cashAmount;
	private BankAccount account;  //BankAccountŸ���� ���� account
	
	public Person(String pName, int pAge){
        name = pName;
        if(pAge < 0){
            age = 12;
        }else{
            age = pAge;
        }
        cashAmount = 0;
    }
    
    public Person(String pName, int pAge, int pCashAmount){
        name = pName;
        if(pAge < 0){
            age = 12;
        }else{
            age = pAge;
        }
        if(pCashAmount < 0){
            cashAmount = 0;
        }else{
            cashAmount = pCashAmount;
        }
    }

	
	
	public void setName(String newName){ //����
	    name = newName;
	}
	
	public String getName(){ //���
	    return name;
	}
	
		public void setAge(int newAge){
	    age = newAge;
	}
	
	public int getAge(){
	    return age;
	}
	
		public void setCashAmount(int newCashAmount){
	    cashAmount = newCashAmount;
	}
	
	public int getCashAmount(){
	    return cashAmount;
	}
	
	public void setAccount (BankAccount newAccount){
	    account = newAccount;
	}
	
	public BankAccount getAccount(){
	    return account; //BankAccount Ŭ������ account
	}
	
	 public boolean transfer(Person to, int amount) {
	        return account.transfer(to.getAccount(), amount); 
	        //�޴»�� to�� �Է��ϸ� to�� ����,amount�� �Էµ� transfer �޼ҵ�� ���ϵ�
	    }

	    // ù ��° �Ķ����: �޴� ����� ���� (BankAccount)
	    // �� ��° �Ķ����: ��ü�� �ݾ� (����)
	    // ���� : �������� (�Ҹ�)
	    public boolean transfer(BankAccount to, int amount) {
	    	return account.transfer(to, amount);
	    }
}