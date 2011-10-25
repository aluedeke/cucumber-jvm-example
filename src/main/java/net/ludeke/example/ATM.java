package net.ludeke.example;

public class ATM {

	private int money;

	public ATM(int money) {
		this.money = money;
	}

	public int requestMoney(CreditCard creditCard, int amount) {
		if (!creditCard.isValid() || amount > money) {
			return 0;
		}
		
		amount = creditCard.getAccount().getMoney(amount);
		
		money = money - amount;

		return amount;
	}

}
