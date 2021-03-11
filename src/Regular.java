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
 * This class represents regular employee and extends Employee class.
 */
public class Regular extends Employee {

	     /**
	      * represent salary for regular contractor.
	      */
	     protected double salary;
	     
	/**
	 * This method calculates salary for regular employee.
	 */
	
	     // Make a call to the readEmployee() method of the parent class.
	     @Override
	     public void readEmployee(Scanner scan) {
	    	 
	    	 super.readEmployee(scan);
	    	 System.out.println("Enter annual salary: ");
			    salary = scan.nextDouble();
			    salary/= 12;
	     }
	/**
	 * This method prints salary for regular employee.
	 */
	 
	     //Make a call to the printEmployee() of the parent class.
	     @Override
	     public void printEmployee(){
	    	 
	    	 super.printEmployee();
	    	 System.out.printf("%.2f|     ",salary);
	    	 System.out.println();
	     }
	
	
	
	
	
}