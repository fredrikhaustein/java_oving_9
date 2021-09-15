package inheritance;

public abstract class AbstractAccount {

	double account = 0;
	abstract  void internalWithdraw(double withdraw);
	
	void deposit(double deposit) {
		if (deposit < 0 ) {
			throw new IllegalArgumentException("Kan ikke ta negativ bel�p");
		}
		account += deposit;
	}
	
	void withdraw(double withdraw) {
		if (withdraw < 0 ) {
			throw new IllegalArgumentException("Kan ikke ta negativ bel�p");
		}
		internalWithdraw(withdraw);
	}
	
	double getBalance() {
		return account;
	}
}
