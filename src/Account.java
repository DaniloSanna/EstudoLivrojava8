//Cap 3

public class Account {

	private String name;
	private double balance;
	
	public Account(String name, double balance){
		this.name = name;
		
		if (balance>0.0) {
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance += depositAmount;
		}
	}
	
	
	public String withdraw(double amount) {
		
		if (amount > balance) {
			return "Withdrawal amount exceeded account balance";
		}else {
			balance-=amount;
			return "Withdrawal amount sucess";
			
		}
	}
	
	public String NomeSaldo() {
		
		return String.format("Saldo da conta de %s, tem a quantia de R$: %.2f", name, balance);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//--------------Metodos Get/Set-------------------
	
	// Name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//balance
	
	public double getBalance() {
		return balance;
	}
		
}