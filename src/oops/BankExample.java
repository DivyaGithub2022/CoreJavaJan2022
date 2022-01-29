package oops;

//Abstraction
//can create object of an Abstract class using child class only

public abstract class BankExample {
	
	public abstract void checkBalance();
	
	public abstract void depositMoney();
	
	public abstract void withdrawMoney();
	
	public void Welcome() {
		System.out.println("Welcome to Bank");
	}
	

}
