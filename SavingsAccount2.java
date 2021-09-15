package inheritance;

public class SavingsAccount2 extends AbstractAccount{

	int withdraws;
	double fee;

	SavingsAccount2(int withdraws, double fee){
		this.withdraws = withdraws;
		this.fee = fee;
	}


	@Override
	void internalWithdraw(double withdraw) {
		withdraws -= 1;
		if (withdraws < 0) {
			super.account = super.account - withdraw - fee;
			if (super.account < 0) {
				super.account = super.account + withdraw + fee;
				throw new IllegalStateException("Kan ikke ha negativ saldo");
			}
		}
		else {
			super.account -= withdraw;
			if (super.account < 0) {
				super.account += withdraw;
				throw new IllegalStateException("Kan ikke ha negativ saldo");
			}
		}
	}
	
	public static void main(String[] args) {
		SavingsAccount2 s1 = new SavingsAccount2(1,50.0);
		s1.deposit(20000);
		s1.internalWithdraw(5000);
		s1.getBalance();
	}
}
