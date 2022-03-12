package vendingMachine;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Scanner;

import money.Cards;
import snacks.SnakSlot;
import snacks.TheSnaks;

public class SnackMachineImp implements SnackMachine{
	private static double balance=0.0;
	private static  EnumSet <TheSnaks> allSnacks;

	@SuppressWarnings("resource")
	public void DisplayMessage()
	{
		Scanner select = new Scanner(System.in);
		System.out.println();
		System.out.println("Insert the desired snack's number");
		System.out.println();
 		String selected = select.nextLine();
		SelectSnack(selected);
			  
	}

	public void SelectSnack(String selected){

		allSnacks = createSnacks();
		boolean av=false;
		 for(TheSnaks v : allSnacks){
		        if( v.getSnack().getNumber().equals(selected.toUpperCase())){
		        	av=true;
		        	if(v.getSnack().isAvailable()) {
						System.out.println( "The Price of "+v.getSnack().getName() +" is: "+ v.getSnack().getPrice());
						System.out.println();
						moneyDeposit(v.getSnack());
					}
					else {
						System.out.println("NOT AVAILABLE.");
						System.out.println();
						DisplayMessage();
						break;
					}
		        }
		    }
		 if(!av) {
				System.out.println("Invalid Number");
				System.out.println();
				DisplayMessage();
		 }
	}

	@SuppressWarnings("resource")
	public void moneyDeposit(SnakSlot item) {
		Scanner userPayMethod = new Scanner(System.in);
		Scanner userMoney = new Scanner(System.in);
		Scanner userCardNumber = new Scanner(System.in);
		double inputMoney=0.0;
		System.out.println("Select the desired payment method");
		System.out.println();
		System.out.println("ENTER 1 for COINS");
		System.out.println("ENTER 2 for NOTES");
		System.out.println("ENTER 3 for CARD");
		System.out.println("ENTER 4 TO CANCEL");
		System.out.println();

		int inputPayMethod = userPayMethod.nextInt();

		switch(inputPayMethod) {
		case 1:
			String xx;
			System.out.println("Insert coins (10c|20c|50c|$1)");
			xx = userMoney.nextLine();
			 try {
			        double d = Double.parseDouble(xx);
			    } catch (NumberFormatException nfe) {
			    	System.out.println("Invalid Currency");
			    	moneyDeposit(item);
			    }
			 char []x=xx.toCharArray();
			   inputMoney=Character.getNumericValue(x[0])*0.1 + Character.getNumericValue(x[1])*0.2 + Character.getNumericValue(x[2])*0.5 + Character.getNumericValue(x[3])*1;			
			   if(inputMoney - item.getPrice() >= 0 &&xx.length()==4) {
				if(item.getAmount() >= 1) {
					disposit(  inputMoney,   item);	}
			}
			else {
				System.out.println("Insufficient Money");
		    	moneyDeposit(item);
			}
			break;


		
		case 2:
			System.out.println("Insert the note (20$ or 50$ Only)");
			inputMoney = userMoney.nextDouble();
			if(inputMoney - item.getPrice() >= 0 && (inputMoney == 50 || inputMoney == 20)) {
				if(item.getAmount() >= 1) {
					disposit(  inputMoney,   item);
				}
			}
			else {
				System.out.println("Invalid Currency");
		    	moneyDeposit(item);
			}
			break;
		case 3:
			System.out.println("Insert Card number");
			String inputCardNumber = userCardNumber.nextLine();
			System.out.println("VALIDATING CARD...");
			Cards card = Cards.check(inputCardNumber);
			if(card.equals(Cards.UNKNOWN)) {
				System.out.println("Invalid Card");
				moneyDeposit(item);
			}
			else {
				System.out.println("Valid " + card);
			 
				if(inputMoney - item.getPrice() >= 0) {
					if(item.getAmount() >= 1) {
						disposit(  inputMoney,   item);
					}
				}
				else {
					System.out.println("OOPS... NOT ENOUGH MONEY .. REDIRECTING TO MAIN MENU\n");
				}
				break;
			}

		case 4:
			DisplayMessage();
		default:
			System.out.println("INVALID INPUT");
			moneyDeposit(item);
		}

	}
	public void disposit(double inputMoney, SnakSlot item) {
		System.out.println("Returned change: " + Math.round((inputMoney - item.getPrice())* 100.0)/ 100.0);
		item.reduceAmount(1);
		calculateBalance(item.getPrice());
		System.out.println( "Remaining " + item.getName() +  ": "+ item.getAmount());
		DisplayMessage();
	}

	public void calculateBalance(double price) {
		setBalance(getBalance() + price);
	}
	
	public static EnumSet<TheSnaks> createSnacks() {
		 allSnacks = EnumSet.allOf(TheSnaks.class);
		 return allSnacks;
	}
 

	public static double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

 
 
}
