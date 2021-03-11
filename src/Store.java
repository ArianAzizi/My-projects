/*
* Name: Arian Azizi
* Student Number: 041004842
* Course: CST8132
* Semester: F20
* Lab 8
* File Name: StoreManagementSystem3
* Professor Name: Mr.Abul Qasim
*/
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Arian Azizi
 * @version 1.0
 * This class represents and stores employees information and call other methods as well.
 */
public class Store {
    /**
     * An arraylist of employee that represent number of employees.
     */
	

	private int num;
	ArrayList<Employee> employees; 
	
     /**
      * 
      * @param num passing the number of employees as a parameter to the constructor. 
      */

	 // parameterized constructor that creates the arraylist of employees.
	 
	public Store (int num) {
	this.num = num;
	this.employees = new ArrayList<Employee>();
	
	
	}
	/**
	 * This method represent the orders for our text file and create objects either from regular or contractor.
	 * @param emp: passing String emp as a parameter in order to use it in our main to invoke our file.
	 * @param counter: passing counter as a parameter in order to use it in our main in while loop.
	 */
   
	public void readdetailsfromFile(String emp, int counter) {
		
		if(emp.startsWith("c")) {
			
			Contractor cmp = new Contractor();
			String[] empinfo = emp.split("\\s+");
			cmp.employeeNumber = Integer.parseInt(empinfo[1]);
			cmp.firstName = empinfo[2];
			cmp.lastName = empinfo[3];
			cmp.email = empinfo[4];
			cmp.phoneNumber = Integer.parseInt(empinfo[5]);
			cmp.hourlyRate = Double.parseDouble(empinfo[6]);
			cmp.numHours = Double.parseDouble(empinfo[7]);
			employees.add(cmp);
			
		}else if(emp.startsWith("r")) {
			
			Regular rmp = new Regular();
			String[] empinfo = emp.split("\\s+");
			rmp.employeeNumber = Integer.parseInt(empinfo[1]);
			rmp.firstName = empinfo[2];
			rmp.lastName = empinfo[3];
			rmp.email = empinfo[4];
			rmp.phoneNumber = Integer.parseInt(empinfo[5]);
			rmp.salary = Double.parseDouble(empinfo[6]);
			employees.add(rmp);
		}
		
		

	}
	
	
	/**
	 * This method combines all the employee's details
	 * @param scan passing the scanner object as a parameter.
	 * @param counter passing counter as a parameter in order to use it in our main in while loop.
	 */
	 /* This method reads details of all
       employees. First, read the type of the employee. 
       Based on the type of the employee,
       corresponding array object needs to be created.
	 */
	public void readEmployeeDetails(Scanner scan, int counter) {
		
		
		int employeeType = 0;
		System.out.println("Enter details of employee "+(counter+1));
		System.out.println("1.. Regular");
		System.out.println("2.. Contract ");
		System.out.println("Enter type of employee: ");
		employeeType = scan.nextInt();
		
		if (employeeType == 1) {
			
			Regular emp = new Regular();
			emp.readEmployee(scan);
			employees.add(emp);
			
		}else if (employeeType == 2) {
			
			Contractor cmp = new Contractor();
			cmp.readEmployee(scan);
			employees.add(cmp);
		}

	}
	
	  /**
	   * This method prints details of all employees and makes sure that employees are not null.
	   */
	  //call printEmployee() to print details of all employees.
	
	public void printEmployeeDetails() {
		
		for(int i = 0; i<employees.size(); i++) {
			  
				employees.get(i).printEmployee();
			   
		}  
		
	}
	/**
	 * This method prints a line between the name of the store and print title.
	 */
	
	public static void printLine() {
		
		System.out.println("================================================================================");
	}
	
	/**
	 * This method prints the header.
	 * @param name passing the first and last name of the each employee.
	 */
	public static void printTitle(String name) {
		
		System.out.println("                      "+name +" Store Managment System");
		System.out.println("================================================================================");
		System.out.printf("Emp# "+"|          "+ "Name " +"|            "+"Email "+"|        "+"Phone "+"|       "+"Salary |"+"\n");
		System.out.println("================================================================================");
	}
	/**
	 * This method makes sure that elements in the array is empty 
	 * @return true or false if either array is empty or not
	 */
	
	public boolean isEmpty() {
	         if(employees.size() == 0) {
	        	 return true;
	         }
	         return false;
	}
	
	
	
}	