
public class Main {
	
	public  void transfering(int Transferamount ,BankAccount transfer_account, BankAccount receives_account ) {

		
	 }
    public static void main(String[] args) {
    	
        BankAccount bob_acct = new BankAccount(1000, -1000);
        BankAccount lisa_acct = new BankAccount(1000, -1000);

        System.out.println("Balances In The Account :");
        System.out.println("BOB ACCOUNT | balance = " + bob_acct.getBalance());
        System.out.println("LISA ACCOUNT | balance = " + lisa_acct.getBalance());
        System.out.println("");
        System.out.println("-------------------------------------");

        
        boolean transfer_mode = bob_acct.transfer(500,lisa_acct);
        if(transfer_mode) {
            System.out.println("!TRANSACTION DONE!");
            System.out.println("-------------------");
            System.out.println("Balances In The Account after the transaction :");
            System.out.println("BOB ACCOUNT | balance = " + bob_acct.getBalance());
            System.out.println("LISA ACCOUNT | balance = " + lisa_acct.getBalance());

        }else {
        	System.out.println("ERROR: TRANSFER IS NOT POSSIBLE");
        }
        
        
        transfer_mode = bob_acct.transfer(1600,lisa_acct);
        
        if(transfer_mode) {
            System.out.println("!TRANSACTION DONE!");
            System.out.println("-------------------");
            System.out.println("Balances In The Account after the transaction :");
            System.out.println("BOB ACCOUNT | balance = " + bob_acct.getBalance());
            System.out.println("LISA ACCOUNT | balance = " + lisa_acct.getBalance());

        }else {
        	System.out.println("ERROR: TRANSFER IS NOT POSSIBLE : overdraft ");
        }
      }

    }


