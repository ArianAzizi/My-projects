
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
 * This class represents a person with all properties.
 */
public abstract class Person {
	/** Instance variables that explains an employee's personality 
	 * First name: person's first name 
	 * Last name: person's last name
	 * email: person's email
	 * phone number: person's phone number
	 */
	
	protected String firstName;
    protected String lastName;
    protected String email;
    protected long phoneNumber;
    
    
    
    public Person(){}
    	
    /**
     * : parameterized constructor that gets values to set all properties of a person.
     * @param firstName    represents employee first name
     * @param lastName     represents employee last name
     * @param email        represents employee email
     * @param phoneNumber  represents employee phone number
     */
    
	public Person(String firstName,String lastName,String email,long phoneNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * @return will return the employee first and last name.
	 */
	 // getter to return name.
	public String getName() {
		
		return firstName+" "+lastName;
	}
	
	/**
	 * 
	 * @param scan passing the scanner object as a parameter.
	 */
	// Abstract methods
	public abstract void readEmployee(Scanner scan);
	
    public abstract void printEmployee();
	
	


}