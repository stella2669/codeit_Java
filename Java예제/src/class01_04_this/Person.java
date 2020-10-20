package class01_04_this;

public class Person {
	private String name;
	private int age;
	private int cashAmount;
	private BankAccount account;  //BankAccount타입의 변수 account
	
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

	
	
	public void setName(String newName){ //저장
	    name = newName;
	}
	
	public String getName(){ //출력
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
	    return account; //BankAccount 클래스의 account
	}
	
	 public boolean transfer(Person to, int amount) {
	        return account.transfer(to.getAccount(), amount); 
	        //받는사람 to를 입력하면 to의 계좌,amount가 입력된 transfer 메소드로 리턴됨
	    }

	    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
	    // 두 번째 파라미터: 이체할 금액 (정수)
	    // 리턴 : 성공여부 (불린)
	    public boolean transfer(BankAccount to, int amount) {
	    	return account.transfer(to, amount);
	    }
}