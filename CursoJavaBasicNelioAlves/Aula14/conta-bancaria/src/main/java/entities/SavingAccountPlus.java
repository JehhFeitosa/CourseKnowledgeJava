package entities;

public class SavingAccountPlus extends SavingAccount{
	
	
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}

}
