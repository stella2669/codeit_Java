package class01_03_������;

public class BankAccount {
	public BankAccount(int pBalance){
        if(pBalance < 0){
            balance = 0;
        }else{
        balance = pBalance;    
        }
    }
    
    public BankAccount(Person pOwner){
        owner = pOwner;
        balance = 0;
    }
    
    public BankAccount(int pBalance, Person pOwner){
        if(pBalance < 0){
            balance = 0;
        }else{
        balance = pBalance;    
        }
        owner = pOwner;
    }
	
	private int balance;
    private	Person owner;
	
	public void setBalance(int newBalance){
	    balance = newBalance;
	}
	
	public int getBalance(){
	    return balance;
	}
	
	public void setOwner(Person newOwner){
	    owner = newOwner;
	}
	
	public Person getOwner(){
	    return owner;
	}

	boolean deposit(int amount) {	
		if(amount < 0 || amount > owner.getCashAmount()) {
			System.out.printf("�Ա� �����Դϴ�. �ܰ�: %d��, ����: %d��\n"
			, getBalance(), owner.getCashAmount());
			System.out.println("false");
			return false;
		}else {
			balance += amount;
			owner.setCashAmount(owner.getCashAmount() - amount);
			System.out.printf("%d�� �Ա��Ͽ����ϴ�. �ܰ�: %d��, ����: %d��\n"
			, amount, getBalance(), owner.getCashAmount());
			System.out.println("true");
			return true;
		}	
	}

	boolean withdraw(int amount) {
		if(amount < 0 || amount > getBalance()) {
			System.out.printf("��� �����Դϴ�. �ܰ�: %d��, ����: %d��\n", 
			getBalance(), owner.getCashAmount());
			System.out.println("false");
			return false;
		}else {
			balance -= amount;
			owner.setCashAmount(owner.getCashAmount() + amount);
			System.out.printf("%d�� ����Ͽ����ϴ�. �ܰ�: %d��, ����: %d��\n",
			amount, getBalance(), owner.getCashAmount());
			System.out.println("true");
			return true;
		}
	}
	
    // ù ��° �Ķ����: �޴� ��� (Person)
    // �� ��° �Ķ����: ��ü�� �ݾ� (����)
    // ���� : �������� (�Ҹ�)
	 public boolean transfer(Person to, int amount) {
	        return transfer(to.getAccount(), amount); 
	        //�޴»�� to�� �Է��ϸ� to�� ����,amount�� �Էµ� transfer �޼ҵ�� ���ϵ�
	    }

	    // ù ��° �Ķ����: �޴� ����� ���� (BankAccount)
	    // �� ��° �Ķ����: ��ü�� �ݾ� (����)
	    // ���� : �������� (�Ҹ�)
	    public boolean transfer(BankAccount to, int amount) {
	    	boolean success;
	        
	        if(amount < 0 || amount > balance) {
	        	success = false;
	        }else {
	        	setBalance(balance -= amount); //owner��
	        	to.setBalance(to.balance += amount); //Person to��
	        	success = true;
	        }
	        
	        System.out.println(success + " - from: "+ owner.getName()
	        +", to: "+ to.getOwner().getName()+", amount: "+amount+", balance: "+ balance);
	        
	        return success;
	    }
	}