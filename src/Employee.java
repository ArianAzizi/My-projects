
/*
* Name: Arian Azizi
* Student Number: 041004842
* Course: CST8132
* Semester: F20
* Lab 8
* File Name: StoreManagementSystem3
* Professor Name: Mr.Abul Qasim
*/
import java.util.Scanner;
/**
 * 
 * @author Arian Azizi
 * @version 1.0
 * This class represents properties of employees and extends Person class.
 */
public class Employee extends Person{

	     /**
	      * represents employee's number.
	      */
	     protected int employeeNumber;
	
	   
	     /**
	      * Non parameterized constructor
	      */
	     
	     public Employee() {}
	/**
	 * parameterized constructor that initializes an employee with employee number and all
       personal properties. 
	 * @param employeeNumber represents employee number
	 */
	 
	
	     public Employee(int employeeNumber) {
	    	 super();
	    	 this.employeeNumber = employeeNumber;
	    	 
	     }
	
	/**
	 *  method that gets employee information from user.
	 */
	 
	 
	      @Override
	      public void readEmployee(Scanner scan ) {
	    
					  System.out.println("Enter employee number: ");
				  		employeeNumber = scan.nextInt();
				  		
				  		scan.nextLine();
				  		System.out.println("Enter first name: ");
				  		firstName = scan.nextLine();
				  		
				  		System.out.println("Enter last name: ");
				  		lastName = scan.nextLine();
				  		
				  		System.out.println("Enter email: ");
				  		email = scan.nextLine();
				  		
				  		System.out.println("Enter phone number: ");
				  		phoneNumber = scan.nextLong();
	    	  
	      }
	
	/**
	 * This method prints details of all employees.
	 */
	 
	//This method prints details of an employee using formatted output.
	      @Override
	      public void printEmployee() {
	    	System.out.println();
	    	System.out.printf("%d  |     %s|    %s|     %d|       ",employeeNumber,getName(),email,phoneNumber);
	    	
	      }
	
	
	
	
}
