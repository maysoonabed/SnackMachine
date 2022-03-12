package snacks;
 

public class SnakSlot {
	private String name;
	private String number;
	private double price;
	private int amount;
	
	 
	public static class Builder {
		private String name;
		private String number;
		private double price;
		private int amount;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setNumber(String number) {
			this.number = number;
			return this;
		}

		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}

		public Builder setAmount(int amount) {
			this.amount = amount;
			return this;
		}
		
	 
		public SnakSlot build() {
			SnakSlot snackItem = new SnakSlot();
			snackItem.name = this.name;
			snackItem.number = this.number;
			snackItem.price = this.price;
			snackItem.amount = this.amount;
			
			return snackItem;

		}
	}
 
	public SnakSlot() {
		
	}
	 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public double getPrice() {
		return price;
	}
	 
	public void setPrice(double price) {
		this.price = price;
	}
 
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public boolean isAvailable() {
		return this.amount > 0;
	}
	
	public void addToAmount(int number) {
		this.amount += number;
	}
	
	public void reduceAmount (int number) {
		this.amount -= number;
	}
	

}
