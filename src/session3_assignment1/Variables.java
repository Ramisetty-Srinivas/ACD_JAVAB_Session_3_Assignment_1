package session3_assignment1; //Package Declaration

public class Variables {
	
	int a; //Instance variable
	int b;  //Instance variable
	static int c;  //Class variable
	static int d;  //Class variable
	
	
	/*
	 * Instance variables are the variables which are declared inside the class and outside the Main method.
	 * Instance methods are accessed directly inside the instance methods.
	 * In order to access Instance variables in static methods, we need to make use of objects.
	 * The scope the instance variable is inside the class, methods, constructors, blocks.
	 * 
	 * Class variables are the variables which are declared inside the class and outside of the main method with 'Static' keyword.
	 * In order to access 'Class or static variables', we need to make use of the Class-name.
	 * The scope of the static variables is inside the class.
	 * 3-ways to access class variables.
	 * 		a) Using class-name.
	 * 		b) If the vraibles are in the same package, we can access directly.
	 * 		c) Using object.
	 * But, using 1st approach is the best way i.e, by using class-name. 
	 */

	void instanceMethod(){ //Instance method
		
		a = 50; //Instance variable
		b = 60; //Instance variable
		Variables.c = 70; //we can use directly also i.e., c = 70
		Variables.d = 80; 
		
		//Printing the variables
		
		System.out.println("The value of Instance Variable 'a' = " +a);
		System.out.println("The value of Instance Variable 'b' = " +b);
		System.out.println("The value of Class Variable 'c' = " +Variables.c);
		System.out.println("The value of Class Variable 'd' = " +Variables.d);
		
	}
	
	//main method starts
	
	public static void main(String[] args) {
		
		Variables instance = new Variables(); //Object Creation
		
		instance.a = 10; //Instance Variable declaration
		instance.b = 20;  //Instance Variable declaration
		Variables.c = 30;  //Class variable declaration
		Variables.d = 40;  //Class variable declaration
		
		//Printing the variables
		
		System.out.println("The value of Instance Variable 'a' = " +instance.a);
		System.out.println("The value of Instance Variable 'b' = " +instance.b);
		System.out.println("The value of Class Variable 'c' = " +Variables.c);
		System.out.println("The value of Class Variable 'd' = " +Variables.d);
		
		instance.instanceMethod(); //Calling instance method

	}

}
