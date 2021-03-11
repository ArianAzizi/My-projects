/*
* Name: Arian Azizi
* Student Number: 041004842
* Course: CST8132
* Semester: F20
* Lab 8
* File Name: StoreManagementSystem3
* Professor Name: Mr.Abul Qasim
*/
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.io.File;
public class Lab7 {
   
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean continueLoop = true;
		int num = 0;
		
		System.out.println("Enter name of the store: ");
		String name = scan.nextLine();
		
		do {
			try {
		
		System.out.println("How many employees do you have?: ");
	    num = scan.nextInt();
		if(num > 0) {
			continueLoop = false;
		}
		
			}catch (InputMismatchException ime) {
				System.err.flush();
				System.err.println("*****Input Mismatch Exception while reading number of employees*****");
				System.err.flush();
				scan.nextLine();
			}
			
		}while(continueLoop == true);
		
		 Store s = new Store(num);
		boolean isValid = false;
		int counter = 0;
		while(counter <= num) {
		    try {
		    	
		    	System.out.println("1. Read Employee Details From User");
		    	System.out.println("2. Read Details From The File ");
		    	System.out.println("3. Print Employee Details ");
		    	System.out.println("4. Quit ");
		    	System.out.println("Enter your option: ");
		    	int op = scan.nextInt();
		    	if(op == 1 || op == 2 || op == 3 || op == 4) {
		    		isValid = true;
		    		
		    	}else {
		    		
		    		System.out.println("Invalid option.... please try again...");
		    	}
		    	if(isValid == true) {
		    		
		    		if(op == 1) {
		    			if(counter == num ) {
		    				System.err.flush();
		    				System.err.println("Sorry we are full!");
		    				System.err.flush();
		    			}else {
		    			s.readEmployeeDetails(scan, counter);
		    		    counter++;
		    			}
		    		}else if (op == 2) {
		    			
		    			try {
		    				File file = new File("C:\\Users\\acer\\Downloads\\employees.txt");
		    				Scanner emps = new Scanner(file);
		    				while(emps.hasNextLine()) {
		    					if(counter == num) {
		    						System.err.flush();
		    						System.err.println("Sorry we are full!");
		    						System.err.flush();
		    						break;
		    					}
		    					String emp = emps.nextLine();
		    					s.readdetailsfromFile(emp, counter);
		    					counter++;
		    					
		    				}
		    				
		    			}catch(FileNotFoundException nfe) {
		    				System.err.println("File does not exist!");
				    	}
		    			
		    			
		    			
		    		}
		    		else if (op == 3) {
		    			if (s.isEmpty() == true) {
		    				System.err.flush();
		    				System.err.println("No elements in the array");
		    				System.err.flush();
		    			}else {
		    			s.printLine();
			    		s.printTitle(name);
			    		s.printEmployeeDetails();
		    			}
		    		}else if(op == 4){
		    			counter = num;
		    			System.out.println("Goodbye... Have a nice day!");
		    		    break;
		    		}
		    	}
		    	
		    	
		    	}catch (InputMismatchException ime) {
		    		System.err.flush();
		    		System.err.println("*****Input Mismatch Exception while reading selection of process*****");
		    		System.err.flush();
					scan.nextLine();
		    	}
		  
		    }
		
		  scan.close();
		
		
	}

}

