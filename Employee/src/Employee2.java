import java.util.*;
class Employee2{
static int count=0;
	
	public static void main(String[] args){
	int i;
	int j;

        Scanner sc=new Scanner(System.in);
	
	
	      for (i=1;i<2;i++)
                {
		 
	count++;
	System.out.println("-------------------------------------");	

	System.out.println("Enter your firstname  :");
        String firstName=sc.next();
	
	System.out.println("Enter your lastname   :");
        String lastName=sc.next();

        System.out.println("Enter your salary     :");
        int salary=sc.nextInt();

	     System.out.println("Enter your grade      :");
        char grade=sc.next().charAt(0);
        if(grade == 'a' || grade == 'b' || grade == 'c'|| grade == 'd'){
        }
        else{
        	System.out.println("Grade should be a or b or c or d");
        }
        
    
        System.out.println("enter date");
      int dd = sc.nextInt();
      if(dd > 31){
    	  System.out.println("You have entered date is invalid, please enter the correct date");  
      }
      System.out.println("enter month");
      int mm = sc.nextInt();
      if(mm > 12){
    	  System.out.println("You have entered invalid month, please enter correct month");  
      }
      
      System.out.println("enter year");
      int yyyy = sc.nextInt();
      
	 Employee e = null; 
	 
         e = new Employee(firstName, lastName, salary, grade, dd , mm, yyyy);
      
       e.displayDetails();
       e.getInvoices();
       
                }	
	}
}


