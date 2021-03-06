package oops;

public class ChildClass extends Person {
	
	String Profession;
	
	public void print() {
		System.out.println("Inside Child");
	}
	//same method in both Parent and Child - same method name,return type,arguments
	//method overriding
	public void display() {
		
		//super.display(); //calling Parent method here
		System.out.println("Inside Child");
	}
	
	public ChildClass() {
		//child class default constructor calls Parent class default constructor by Java by default 
		System.out.println("Inside Child default constructor");
	}
	
	public ChildClass(String Name, int Age, String Profession) {
		//anything inside Parent can be accessed using 'SUPER' keyword
		super(Name, Age);//calling the parent class constructor as it is
		this.Profession = Profession;
		System.out.println(Name + Age + Profession);
		
	}
}
