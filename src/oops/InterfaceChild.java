package oops;

public class InterfaceChild implements InterfaceExample,InterfaceExample1{
/*
 * can have multiple implementation for Interface unlike Inheritance
 * 
 * if both interfaces have methods of same name but different parameters then need to implement separately in the child class
 */
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		
	}
	
	public void anotherMethod() {
		
	}

	@Override
	public void show(String Name) {
		// TODO Auto-generated method stub
		
	}

}
