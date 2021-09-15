package inheritance;

public class ForeldreSpar extends SavingsAccount {

	private int uttak;
	
	public ForeldreSpar(double rente,int uttak) {
		super(rente);
		this.uttak = uttak;
	}
	
	public int getRemainingWithdrawals() {
//		System.out.println(uttak);
		return this.uttak;
	}
	
	
	@Override
	public void withdraw(double amount) {
		double newSum = account - amount;
		uttak -= 1;
		if (amount < 0) {
			throw new IllegalArgumentException("Kan ikke ta inn negativt beløp");
		}
		if (newSum < 0) {
			throw new IllegalStateException("Kan ikke ha negativ sum på konto");
		}
		if (uttak < 0) {
			account -= amount;
			throw new IllegalStateException("Du har brukt opp alle uttakene dine");
		}
		account -= amount;
		System.out.println(account);
	}
	public static void main(String[] args) {
		ForeldreSpar f1 = new ForeldreSpar(0.2,3);
		f1.deposit(10000);
		f1.withdraw(1000);
		System.out.println(f1.getBalance());
		System.out.println(f1.getRemainingWithdrawals());
		f1.withdraw(9000);
		System.out.println(f1.getBalance());
		System.out.println(f1.getRemainingWithdrawals());
		f1.withdraw(1000);
		System.out.println(f1.getBalance());
		System.out.println(f1.getRemainingWithdrawals());
	}
}
