/**
 * 
 */
package oops;

public class RunnerClass {
//Runnerclass to create object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Access modifier - public, private, static, void etc
		
		/*
		 * Employee emp1 = new Employee();
		 
				
		emp1.EmployeeId = 2314;
		emp1.Name = "Sachin";
		emp1.Salary = 1000;
		
		Employee emp2 = new Employee();
		
		emp2.EmployeeId = 2315;
		emp2.Name = "Mahesh";
		emp2.Salary = 1200;*/
		
		//System.out.println("Name of the emp1 "+emp1.Name);
		//System.out.println("Name of the emp1 "+emp2.Name);
		
		Employee emp1 = new Employee("Sachin",2134,10000);
		Employee emp2 = new Employee("Mahesh",2135);
		
		emp1.PrintName();
		emp2.PrintName();
		//emp2.PrintSalary();
		
		Employee.Salary = 12000; 
		emp2.PrintSalary();
		//we can assign new values for static variable with the help of Class from anywhere
		
		Employee.Company = "Hesta";
		Employee.ChangeCompanyName();
		
		//INHERITANCE
		Person per1 = new Person();
		
		Person per2 = new ChildClass();
		//reference of the Parent class and creating the object of Childclass
		//ChildClass Chil = new Person();//not possible this way
		
		
		ChildClass child1 = new ChildClass();//this was Run before parameterised constructor available in ChildClass.java file
		//always Parent class default constructor will be called first before the child class default constructor
		child1.print();
		child1.display();
		//child1.displayPrivate(); //calling Private method not possible
		child1.displayProtected();
		
		ChildClass child2 = new ChildClass("Rahul",32,"Dentist");
		child1.display();//child class object gives preference for child class methods and parent class object prefer parent class methods	
		
		per2.display(); //child class object
		
		//Method Overloading - compiler decides which method to be called based on the parameters provided
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.sum(4,5);
		obj.sum(4,5,11);
		
		//cannot create Object for Abstract class
		//BankExample Bank = new BankExample();
		
		//can create object of an Abstract class using child class only
		HDFBank Bank = new HDFBank();
		Bank.Welcome();
		Bank.creditCard();
		
		EncapsulationExample Encap = new EncapsulationExample();
		
		Encap.setName("Divya");
		System.out.println("Name: " + Encap.getName());
		
		Encap.setCompany("Hesta");
		System.out.println("Company: " + Encap.getCompany());
	}

}
/*
 * 1) Its is special member of the method to initiolize data member.
2) Constructer name same as class name
3) Constructer should not have return type
4) Constructer always static
5) Whenever object created constructer will get invoked.
"this" keyword is used to access the current class data members.
*/
//hackerrank website
