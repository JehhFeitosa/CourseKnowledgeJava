package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
		super(number, holder, balance);
		this.loanLimit = loanLimite;
	}

	public Double getLoanLimite() {
		return loanLimit;
	}

	public void setLoanLimite(Double loanLimite) {
		this.loanLimit = loanLimite;
	}

	public void loan(double amount) {
		if(amount <= loanLimit ) {
		balance += amount - 10.0;
		
		}
	}

}
