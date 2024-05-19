package executable.javacourse;

public class LocalAndGlobalVariables {
	
	static int globalAge = 45; //this var works for all methods
	
	public static void main(String[] args) {
		// a local variable is when I declare it within a method
		int age = 18;
		System.out.println("your age is: " + age);
		System.out.println("using a global variable: " + globalAge);
	}
	
	public static void method2() {
		//this variable only works here
		int anotherAge = 34;
		System.out.println("your age is: " + anotherAge);
	}

}
