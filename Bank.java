
public class Bank {

	public static int balance=1000;
	
	void debitAmt(int Amount){
		balance = balance - Amount; 
	}
	
	void creditAmt(int Amount){
		balance = balance + Amount;
	}
	void printBalance(){
		System.out.println("Current Balance : "+balance);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.debitAmt(200);//800
		bank.creditAmt(500);//1300
		bank.creditAmt(1000);//2300
		bank.debitAmt(300);//2000
		bank.creditAmt(4000);//6000
		bank.printBalance();

	}

}
