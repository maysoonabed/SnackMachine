package snacks;

import money.Coins;
import money.Notes;
 
public enum TheSnaks {
	//ROW A
	A1(new SnakSlot.Builder("chips1")
			.setName("chips1")
			.setNumber("1")
			.setPrice(Coins.FIFTYCENTS.getValue() + 2 * Coins.DOLLAR.getValue())
			.setAmount(5)
			.build()),
	
	A2(new SnakSlot.Builder("chips2")
			.setName("chips2")
			.setNumber("2")
			.setPrice(Coins.TENCENTS.getValue() +  Coins.DOLLAR.getValue())
			.setAmount(5)
			.build()),
	
	A3(new SnakSlot.Builder("chips3")
			.setName("chips3")
			.setNumber("3")
			.setPrice(Coins.TWENTYCENTS.getValue() + 3 * Coins.DOLLAR.getValue())
			.setAmount(5)
			.build()),
	A4(new SnakSlot.Builder("chips4")
			.setName("chips14")
			.setNumber("4")
			.setPrice(Coins.TWENTYCENTS.getValue() + 3 * Coins.DOLLAR.getValue())
			.setAmount(5)
			.build()),
	A5(new SnakSlot.Builder("chips5")
			.setName("chips15")
			.setNumber("5")
			.setPrice(Coins.TWENTYCENTS.getValue() + 3 * Coins.DOLLAR.getValue())
			.setAmount(5)
			.build()),
	// ROW B
	B1(new SnakSlot.Builder("Coke1")
			.setName("Coke1")
			.setNumber("6")
			.setPrice(4 * Coins.TWENTYCENTS.getValue() + Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	B2(new SnakSlot.Builder("Coke2")
			.setName("Coke2")
			.setNumber("7")
			.setPrice(4 * Coins.TWENTYCENTS.getValue() + Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	B3(new SnakSlot.Builder("Coke3")
			.setName("Coke3")
			.setNumber("8")
			.setPrice(4 * Coins.TWENTYCENTS.getValue() + Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	B4(new SnakSlot.Builder("Coke4")
			.setName("Coke4")
			.setNumber("9")
			.setPrice(4 * Coins.TWENTYCENTS.getValue() + Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	B5(new SnakSlot.Builder("Coke5")
			.setName("Coke5")
			.setNumber("10")
			.setPrice(4 * Coins.TWENTYCENTS.getValue() + Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	
	// ROW C
	C1(new SnakSlot.Builder("Choco1")
			.setName("Choco1")
			.setNumber("11")
			.setPrice(Coins.DOLLAR.getValue() + 2 * Coins.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	
	C2(new SnakSlot.Builder("Choco2")
			.setName("Choco2")
			.setNumber("12")
			.setPrice(Coins.DOLLAR.getValue() + 2 * Coins.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	C3(new SnakSlot.Builder("Choco3")
			.setName("Choco3")
			.setNumber("13")
			.setPrice(Coins.DOLLAR.getValue() + 2 * Coins.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	C4(new SnakSlot.Builder("Choco4")
			.setName("Choco4")
			.setNumber("14")
			.setPrice(Coins.DOLLAR.getValue() + 2 * Coins.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	C5(new SnakSlot.Builder("Choco5")
			.setName("Choco5")
			.setNumber("15")
			.setPrice(Coins.DOLLAR.getValue() + 2 * Coins.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	
	// ROW D
	D1(new SnakSlot.Builder("gum1")
			.setName("gum1")
			.setNumber("16")
			.setPrice(Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	D2(new SnakSlot.Builder("gum1")
			.setName("gum1")
			.setNumber("17")
			.setPrice(Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	D3(new SnakSlot.Builder("gum3")
			.setName("gum3")
			.setNumber("18")
			.setPrice(Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	D4(new SnakSlot.Builder("gum4")
			.setName("gum4")
			.setNumber("19")
			.setPrice( Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	D5(new SnakSlot.Builder("gum5")
			.setName("gum5")
			.setNumber("20")
			.setPrice(Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	E1(new SnakSlot.Builder("cookies1")
			.setName("cookies1")
			.setNumber("21")
			.setPrice(3 * Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	E2(new SnakSlot.Builder("cookies2")
			.setName("cookies2")
			.setNumber("22")
			.setPrice(3 * Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	E3(new SnakSlot.Builder("cookies3")
			.setName("cookies3")
			.setNumber("23")
			.setPrice(3 * Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	E4(new SnakSlot.Builder("cookies4")
			.setName("cookies4")
			.setNumber("24")
			.setPrice(3 * Coins.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	E5(new SnakSlot.Builder("cookies5")
			.setName("cookies5")
			.setNumber("25")
			.setPrice(3 * Coins.TENCENTS.getValue())
			.setAmount(5)
			.build())
	;
	
	private SnakSlot snack;

	
	private TheSnaks(SnakSlot snack) {
		this.snack = snack;
	}


	public SnakSlot getSnack() {
		return snack;
	}
 

	public void setSnack(SnakSlot snack) {
		this.snack = snack;
	}

}
