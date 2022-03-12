package money;

public enum Notes implements Money{
	TWENTYDOLLARS(20),
	FIFTYDOLLARS(50);
	
	private double value;
	
	private Notes(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

}
