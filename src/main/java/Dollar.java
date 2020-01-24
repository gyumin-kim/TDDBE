public class Dollar extends Money {
	public Dollar(final int amount) {
		this.amount = amount;
	}

	public Dollar times(final int multiplier) {
		return new Dollar(amount * multiplier);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount;
	}
}
