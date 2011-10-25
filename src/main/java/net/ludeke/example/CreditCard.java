package net.ludeke.example;

public class CreditCard {

	private boolean valid = true;
	private boolean inUse = false;
	
	private final Account account;

	public CreditCard(Account account) {
		this.account = account;
	}

	public boolean isValid() {
		return valid;
	}

	public Account getAccount() {
		return account;
	}
	
	public void insertCard(){
		inUse = true;
	}
	
	public void returnCard(){
		inUse = false;
	}

	public boolean isInUse() {
		return inUse;
	}

}
