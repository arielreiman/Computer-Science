
public class BankAccount {
	
	  private int minBalance;
	  private int balance;
	    
	 public BankAccount(int balance, int minBalance) {
	      this.balance = balance;
	      this.minBalance = minBalance;
	  }

    public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
    
    public boolean transfer (int transfer_amount,BankAccount receives_account) {
  
    	if (balance-transfer_amount>=minBalance) {
    		balance-=transfer_amount;
    		receives_account.balance+=transfer_amount;
    		return true;
    	}return false;
    	
    }
    
    
    public int getBalance() {
    	return balance;
    }
}
