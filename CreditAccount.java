package inheritance;

public class CreditAccount extends AbstractAccount {

	private double creditLine = 0;



	CreditAccount(double creditline){
		if (creditline < 0) {
			throw new IllegalArgumentException("Kan ikke ha negativ kreditlinje");
		}
		this.creditLine = creditline;
	}

	public void setCreditLine(double creditline) {
		if (creditline < 0) {
			throw new IllegalArgumentException("Kan ikke ha negativ kreditlinje");
		}
		if(super.getBalance() < 0) {
			double testAccount = super.account + creditline;
			System.out.println(testAccount);
			if (testAccount < 0) {
				this.creditLine = -(testAccount +super.account);
				throw new IllegalStateException("Må har høyere kreditlinje");
			}
		}
		this.creditLine = creditline;
	}

	public double getCreditLine() {
		System.out.println(creditLine);
		return creditLine;
	}
	@Override
	void internalWithdraw(double withdraw) {
		double accounttest = super.account - withdraw;
		if (accounttest < 0) {
			creditLine += accounttest;
			if (creditLine < 0) {
				creditLine -= accounttest;
				throw new IllegalStateException("Kreditlinje er overtredet");
			}else {
				//double creditToNull = withdraw + accounttest;
				super.account -= withdraw;
			}
		}else {
		super.account -= withdraw;	
		}

	}
	public static void main(String[] args) {
		CreditAccount a1 = new CreditAccount(10000);
		a1.setCreditLine(5000);
		a1.internalWithdraw(4000);
		System.out.println(a1.getBalance());
		a1.withdraw(3000);
	}

}
