package money;

public enum Coins implements Money{
	TENCENTS(0.10),
	TWENTYCENTS(0.20),
	FIFTYCENTS(0.50),
	DOLLAR(1);
	
	private double value;

	private Coins(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
	
}
