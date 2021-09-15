package inheritance;

public class BSU extends SavingsAccount{

	public double innsettingPer≈r;
	public double innsetting;
	private double bsuAccount;
	
	public BSU(double rente, double innsettingPer≈r) {
		super(rente);
		this.innsetting = innsettingPer≈r;
		this.innsettingPer≈r = innsettingPer≈r;
	}
	
	@Override
	public void endYearUpdate() {
		this.bsuAccount += super.account*(1+rente);
		super.account = 0;
		this.innsettingPer≈r = innsetting;
	}
	
	public double getTaxDeduction() {
		double tax = super.account*0.2;
		super.account -= (super.account*0.2);
		return tax;	
	}
	
	@Override
	public void deposit(double amount) {
		System.out.println("hehie"+innsettingPer≈r);
		if (amount < 0) {
			throw new IllegalArgumentException("Kan ikke ta inn negativt bel¯p");
		}
		super.account += amount;
		if (innsettingPer≈r < super.account) {
			super.account -= amount;
			throw new IllegalStateException("Du kan ikke sette inn mer penger");
		}
		System.out.println("1 "+account);
	}
	@Override
	public double getBalance() {
		return super.account+this.bsuAccount;
	}
	public static void main(String[] args) {
		BSU bsu = new BSU(0.05,25000);
		bsu.deposit(20000);
		System.out.println(bsu.getBalance());
		System.out.println(bsu.getTaxDeduction());
		bsu.endYearUpdate();
		bsu.deposit(10000);
//		bsu.withdraw(5000);
//		System.out.println(bsu.getBalance());
//		bsu.endYearUpdate();
//		System.out.println(bsu.getBalance());
//		bsu.withdraw(10000);
//		System.out.println(bsu.getBalance());
	}
}
