package tests;

public class StringTest {

	public static void main(String[] args) {
		String testing = "automation";
		System.out.println(testing);

		String tool = "selenium";
		System.out.println(tool);

		String space = " ";
		System.out.println(testing + tool);
		System.out.println(testing + " " + tool);
		System.out.println(testing + space + tool);

		int a = 10;
		int b = 20;
		// if your print method starts with string and even int will work as String.
		System.out.println(testing + tool + a + b);
		// if your print method starts with int then int will work as int.
		System.out.println(a + b + testing + tool);
		System.out.println(testing + tool + (a + b));

	}

}
