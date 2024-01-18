
public class BankTest {

	public static void main(String[] args) {
		//Class	  refToObj allocator   Ctor
		//  |		  |		 |			 |
		/*	BankAccount baAcc1 = new BankAccount(101,"Prakhar",50000);
			BankAccount baAcc2 = new BankAccount(102,"Chahat",55000);
			BankAccount baAcc3 = new BankAccount(103,"Harsh",65000);
			BankAccount baAcc4 = new BankAccount(104,"Shikha",75000);
			BankAccount baAcc5 = new BankAccount(105,"Pranjali",85000);
			BankAccount baAcc6 = new BankAccount(106,"Vishhal",95000);

			baAcc1.showBankAccount();
			baAcc2.showBankAccount();
			baAcc3.showBankAccount();
			baAcc4.showBankAccount();
			baAcc5.showBankAccount();
			baAcc6.showBankAccount();
			
			baAcc1.withdraw(5000);
			baAcc2.withdraw(3000);
			baAcc3.deposit(15000);
			baAcc4.withdraw(7000);
			baAcc5.deposit(8000);
			baAcc6.withdraw(9000);
			
			baAcc1.showBankAccount();
			baAcc2.showBankAccount();
			baAcc3.showBankAccount();
			baAcc4.showBankAccount();
			baAcc5.showBankAccount();
			baAcc6.showBankAccount();
			*/
		
		SavingsAccount savAccObj = new SavingsAccount(555,"Jack",60000,7.5f);
		savAccObj.showBankAccount();
		savAccObj.calculateSimpleInterest();
	}

}
class BankAccount { //extends Object 
	//DATA MEMBERS / fields
	
	int accountNumber;
	String accountHolder;
	double accountBalance;
	
	//MEMBER FUNCTION / methods
	
	//there is inbuilt ctor/implicit ctor/default ctor
	//IT DOES NOTHING
	BankAccount(int x, String y, double z) { //explicit no-arg ctor
		System.out.println("BankAccount ctor...");
		accountNumber=x;
		accountHolder=y;
		accountBalance=z;
	}
	
	//either implicit or explicit but not both
	void withdraw(float amt) {
		System.out.println(accountHolder+" is withdrawing..."+amt);
		accountBalance -= amt;
	}
	void deposit(float amt) {
		System.out.println(accountHolder+" is depositing..."+amt);
		accountBalance += amt;
	}
	void showBankAccount() {
		System.out.println("------object hashcode---"+toString());
		System.out.println("ACNO   : "+accountNumber);
		System.out.println("ACNAME : "+accountHolder);
		System.out.println("ACBAL  : "+accountBalance);
		System.out.println("-------------------");
	}
	//BankAccount() { }
}
//Implicit super constructor BankAccount() 
//is undefined for default constructor. 
//Must define an explicit constructor
class SavingsAccount extends BankAccount {
	
	float rateOfInterest;
	
	SavingsAccount(int a, String b, double c, float d) {
		super(a,b,c); //for the ctor
		rateOfInterest=d;
		System.out.println("SavingsAccount ctor...");

	}
	void calculateSimpleInterest() {
		//pnr/100
		double si = (accountBalance * 1 * rateOfInterest)/100;
		System.out.println("SI : "+si);
	}
	void showBankAccount() {
		super.showBankAccount(); //for method
		System.out.println("RATE : "+rateOfInterest);
	}
}
/*class FixedDepositAccount extends SavingsAccount {
	
}*/

