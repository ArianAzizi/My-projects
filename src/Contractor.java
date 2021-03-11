
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
 * This class represents contractor employees and extends Employee class.
 */
public class Contractor extends Employee{

	       /**
	        * represents hourly rate and hours worked for contractor employee.
	        */
	       protected double hourlyRate;
	       protected double numHours;
	       
	     /**
	      *  This method reads contractor's hourly rate and hours worked from user.
	      */
	   	 
	   	 //Make a call to the readEmployee() method of the parent class.
	       @Override
	       public void readEmployee(Scanner scan) {
		    	 
		    	 super.readEmployee(scan);
		    	 System.out.println("Enter hourly rate: ");
				 hourlyRate = scan.nextDouble();
				 System.out.println("Enter number of hours worked: ");
				 numHours = scan.nextDouble();
				   
		     }
	     /**
	      * This method prints contractor's details and calculate salary for contractor employee.
	      */
	       
	   // Make a call to the printEmployee() of the parent class.
	       @Override
		     public void printEmployee(){
		    	 
		    	 super.printEmployee();
		    	 double salary =  hourlyRate * numHours;
		    	 System.out.printf("%.2f|     ",salary);
		    	 System.out.println();
		     }
		

	
}
