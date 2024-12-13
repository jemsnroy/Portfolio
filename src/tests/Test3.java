package tests;

public class Test3 {
	static Test3 t3 = new Test3();
	static Test1 t1 = new Test1();

	public static void main(String[] args) {

		// Step 3 : call square method from same class.
		square();

		// step 7 : call printMe method from class Test1.
		Test1.printMe();

		// Step 4 : call circle method from same class.
		t3.circle();

		// step 8 : call TestMe method from class Test1.
		t1.testMe();
	}

	//Step 1 : create static square method.
	public static void square() {
		System.out.println("This is a square method.");
	}

	// Step 2 : create non-static circle method.
	public void circle() {
		System.out.println("This is a circle method.");
	}

}
