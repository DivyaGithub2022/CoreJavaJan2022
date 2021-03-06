package oops;

//no need for a main method here
public class Employee {
	
	String Name; //private String Name; private can be accessed within this class only.
	int EmployeeId; //protected int EmpId; protected is accessed by this class and another classes inside the same package
	//int Salary;//public int sal; public can be accessed by all classes (world)
	public static int Salary = 1000; //static will be assigned memory once for the class - irrespective 
	public static String Company = "Infosys";
	
	//default constructor
	public Employee() {
		
	}
	
	//name of the Constructor should be same as your class name
	//constructor never return any value (dont put void or int etc)
	//Constructor can be private as well but need to have the object created within the class itself
	//CONSTRUCTOR
	public Employee(String Name,int EmployeeId,int Salary) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;
		
	}
	
	//also can be done this way as well
	//there can be multiple constructors in a class but with different parameters
	public Employee(String p1,int p2) {
		
		this.Name = p1;
		this.EmployeeId = p2;
		//this.Salary = p3;
		
	}

	//if you want to access something which belongs to your class then use 'this.'
	
	public void PrintName() {
		
		System.out.println("Name of the employee "+Name);
	}
	public void PrintSalary() {
		
		System.out.println("Salary of the employee "+Name+" is "+ Employee.Salary); //Static is declared with help of Class itself.
	}
	public static void ChangeCompanyName() {
		
		//Employee.Company = "Infosys Technologies";
		System.out.println("Salary of the employee "+Employee.Company);
	}

}
