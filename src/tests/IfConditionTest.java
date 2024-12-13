package tests;

public class IfConditionTest {

	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		if (a == b) {
			System.out.println("a and b are euqals.");
		} else {
			System.out.println("a and b are not equals.");
		}
		String expected = "selenium";
		String actual = "Selenium";

		/*
		 * when we're dealing with strings it is good to use "Equals" instead of "==".
		 */
		if (expected.equals(actual)) {
			System.out.println("equal");
		} else {
			System.out.println("not eqal");
		}
	}

}
