package practice;

import java.util.Scanner;

public class LearnScanner {
	
	// Scanner : scan the document and eturn as image or pdf file
	
	//Scanner : Taking input from user and return output in console
	
	// Scanner in Java is Class
	
	public static void main(String[] args) {
		
		// create an object of Scanner class
		
		// Scanner class is coming from JDK
		
		// Argument need to pass
		
		Scanner input = new Scanner( System.in );
		System.out.println("Enter your name");
		
	
		//this line we request you to enter a value during runtime
		
		String name = input.nextLine();
		System.out.println("My Name is :"     +name);
		
		System.out.println("Enter your First Name");
		String fname = input.nextLine();
		System.out.println("My Name is :"     +fname);
		
		System.out.println("Enter your Last Name");
		String lname = input.nextLine();
		System.out.println("My Name is :"     +lname);
		
		
		System.out.println("Enter your Age");
		int age = input.nextInt();
		System.out.println("My Age is :"     +age);
		
		
		System.out.println("Did you got Job");
		boolean checkjobStatus = input.nextBoolean();
		System.out.println(" Job Status :"     +checkjobStatus);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
