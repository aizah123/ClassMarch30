package practice;

public class LearnCasting {
	
	// Casting : converting data type
	
	 static int number = 24;
	 static double salary = 3450.68;
	 
	 
	 // float to double
	 
	 float rent = 2500.500f;
	 double aprilRent = (double) rent;
	 
	 
	 float mayRent = (float)aprilRent; // we are not allowed to convert from double to float
	 
	 
	 
	
	
	public static void main(String args[]) {
		//double type of data except int type of data also
		// double already a int. it is a combination. double can accept int type of data
		
		double num = LearnCasting.number;
		//int num = LearnCasting.number;
		
		int   newSalary  =  (int)  LearnCasting.salary;
		

		
		
		
		System.out.println(LearnCasting.number);
		System.out.println(newSalary);
		System.out.println(num);
		
		
		
		// local level
		
		
		int num1 = 45;
		double num2 = num1;
		
		int num3 =  (int) num2;
		
		
		
		
		LearnCasting lc = new LearnCasting();
		System.out.println(lc.mayRent);
		
		
		
		
		
		
		
		
	}
	
	
	

}
