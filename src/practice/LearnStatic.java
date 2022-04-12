package practice;

public class LearnStatic {
	
	// static is a key word
	
	// if we use static keyword then you can call variable, method by its class name
	
	
	
	static String name = "Deeba";
	String address = "Alexandria,VA";
	public static void main(String[] args) {
		
		
		System.out.println("student name is"  +LearnStatic.name );
		
		// create object
		
		
		LearnStatic learn = new LearnStatic();
		System.out.println(learn.address);
		
		LearnStatic.display();// call by class name because of static
	}
	
	
	public static void display () {
		
		System.out.println("This is a display method");
	}
	
public  void tvDisplay () {
		
		System.out.println("This is TV  display method");
}
}
