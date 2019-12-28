public class Franc {
	private int amount;

	public Franc(final int amount) {
		this.amount = amount;
	}

	public Franc times(final int multiplier) {
		return new Franc(amount * multiplier);
	}

	public boolean equals(Object object) {
		Franc franc = (Franc) object;
		return this.amount == franc.amount;
	}
}
