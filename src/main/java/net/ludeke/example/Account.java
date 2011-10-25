package net.ludeke.example;

public class Account {

	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public int getMoney(int amount) {
		if (balance < amount)
			return 0;

		balance = balance - amount;

		return amount;

	}
}
