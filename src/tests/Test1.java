package tests;

import selenium.Test4;

public class Test1 {
	static Test1 t1 = new Test1();

	// this object is for class Test2
	static Test2 t2 = new Test2();

	// this object is for class Test3
	static Test3 t3 = new Test3();

	// this object is for class Test4 which is in different Package.
	static Test4 t4 = new Test4();

	public static void main(String[] args) {

		System.out.println("I'm in main method");

		// calling other static methods for output.
		printMe();
		scanMe();

		// this blue method is static but created in different class.
		// Syntax for that is : className.methodName();
		Test2.blue();

		// calling non static method.
		// Syntax for non-static : objectName.methodName();
		t1.paintMe();
		t1.testMe();

		// this red method is non static and created in different class.
		// Syntax for that is : objectName.methodName();
		t2.red();

		// Step 5 : call square method from class Test3
		Test3.square();

		// Step 6 : call circle method from class Test3
		t3.circle();

		// These abc() and xyz() methods are in different package. Hence we need to
		// import selenium.Test4.
		Test4.abc();
		t4.xyz();

		// These sum Methods are in the same package but in different class ArgumentsTest.
		ArgumentsTest.sum();
		ArgumentsTest.sum(500, 1200);
		ArgumentsTest.sum(20, 100, 5000);
	}

	public static void scanMe() {
		System.out.println("Scan me.");
	}

	public static void printMe() {
		System.out.println("Ater print me.");

	}

	public void paintMe() {
		System.out.println("paint me.");
	}

	public void testMe() {
		System.out.println("test me");
	}
	
	
}
