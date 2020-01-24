public class Franc extends Money {
	public Franc(final int amount) {
		this.amount = amount;
	}

	public Franc times(final int multiplier) {
		return new Franc(amount * multiplier);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount;
	}
}
