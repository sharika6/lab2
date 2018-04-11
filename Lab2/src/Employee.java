
public class Employee {
        int empid;
	 String firstName;
	 String lastName;
    	static int id = 0; 
	int salary;
	char grade;


	

public Employee(){
        
	firstName= "";
	lastName= "";
	salary= 0;
	grade= ' ';
	 

}
public Employee(String fn,String ln,int sal, char grd){
	this.firstName=fn;
	this.lastName=ln;
	this.salary=sal;
	this.grade=grd;
	++id;
	
        

}

public void displayDetails(){
	
	System.out.println("empid      : "+id);
	System.out.println("Firstname  : "+firstName);
	System.out.println("lastName   : "+lastName);
	System.out.println("salary     : "+salary);
	System.out.println("grade      : "+grade);

	
}

public Invoice[] getInvoices(){
	return null;
}
class Invoice{
}
}	

