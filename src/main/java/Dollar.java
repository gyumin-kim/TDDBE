public class Dollar {
	public int amount;

	public Dollar(final int amount) {
		this.amount = amount;
	}

	public void times(final int multiplier) {
		amount *= multiplier;
	}
}
