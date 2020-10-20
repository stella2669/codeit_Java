package class01_03_생성자;

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
			System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\n"
			, getBalance(), owner.getCashAmount());
			System.out.println("false");
			return false;
		}else {
			balance += amount;
			owner.setCashAmount(owner.getCashAmount() - amount);
			System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\n"
			, amount, getBalance(), owner.getCashAmount());
			System.out.println("true");
			return true;
		}	
	}

	boolean withdraw(int amount) {
		if(amount < 0 || amount > getBalance()) {
			System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\n", 
			getBalance(), owner.getCashAmount());
			System.out.println("false");
			return false;
		}else {
			balance -= amount;
			owner.setCashAmount(owner.getCashAmount() + amount);
			System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\n",
			amount, getBalance(), owner.getCashAmount());
			System.out.println("true");
			return true;
		}
	}
	
    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
	 public boolean transfer(Person to, int amount) {
	        return transfer(to.getAccount(), amount); 
	        //받는사람 to를 입력하면 to의 계좌,amount가 입력된 transfer 메소드로 리턴됨
	    }

	    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
	    // 두 번째 파라미터: 이체할 금액 (정수)
	    // 리턴 : 성공여부 (불린)
	    public boolean transfer(BankAccount to, int amount) {
	    	boolean success;
	        
	        if(amount < 0 || amount > balance) {
	        	success = false;
	        }else {
	        	setBalance(balance -= amount); //owner꺼
	        	to.setBalance(to.balance += amount); //Person to꺼
	        	success = true;
	        }
	        
	        System.out.println(success + " - from: "+ owner.getName()
	        +", to: "+ to.getOwner().getName()+", amount: "+amount+", balance: "+ balance);
	        
	        return success;
	    }
	}