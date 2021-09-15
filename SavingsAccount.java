package inheritance;


public class SavingsAccount implements Account{

	public double account;
	protected double rente = 0;
	
	public SavingsAccount(double rente) {
		this.rente = rente;
	}
	
	@Override
	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Kan ikke ta inn negativt beløp");
		}
		System.out.println(account);
		account += amount;
	}

	@Override
	public void withdraw(double amount) {
		double newSum = account - amount;
		if (amount < 0) {
			throw new IllegalArgumentException("Kan ikke ta inn negativt beløp");
		}
		if (newSum < 0) {
			throw new IllegalStateException("Kan ikke ha negativ sum på konto");
		}
		account -= amount;
	}

	@Override
	public double getBalance() {
//		System.out.println("getBalance " + this.account);
		return this.account;
	}

	public void endYearUpdate() {
		this.account = this.account*(1+rente);
	}
	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount(0.2);
		s1.deposit(10);
		s1.withdraw(40);
		
	}
}
