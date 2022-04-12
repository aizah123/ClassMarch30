package practice;

public class LearnAccessModifier {
	
	
	// Access Modifier :  before variable and before method & before class
	// in local variable you can not say public
	
	
	// Public : No restrictions : have the access from any package
	
	// Private Full restricted : Have the access from same class only
	
	// Protected: Have the access in same package only
	// Default : Same behavior like protected
	
	public String name = "Mohammed";
	
	
	String address ="Queens, NEW YORK";// if you do not declair any variable, class then it is default
	
	private String bankAccountNumber = "12345678";
	protected static int price = 45;

	
	
	
	// living room is your public place where you allow stranger
	// bedroom is private no one is allowed to enter
	
	
	
	
	public static void main(String[]args) {
		
		
	//public	int number = 34;
		//object
		LearnAccessModifier lam = new LearnAccessModifier();
		System.out.println(lam.name);
		
		
		
		//private variable is called within same class
	System.out.println(lam.bankAccountNumber);
		
		//lam.display();
		
		
			
		}
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


