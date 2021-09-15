package inheritance;

public class DebitAccount extends AbstractAccount {

	@Override
	void internalWithdraw(double withdraw) {
		double accounttest = super.account - withdraw;
		if (accounttest <= 0) { 
			throw new IllegalStateException("Kan ikke fjerne så mye fra konto");
		}
		else {
			super.account -= withdraw;
			System.out.println(super.getBalance());
		}
	}	
}
