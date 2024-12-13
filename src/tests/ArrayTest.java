package tests;

public class ArrayTest {

	public static void main(String[] args) {
		String tool = "Selenium";
		System.out.println(tool);
		System.out.println(tool.length());

		String tools[] = { "Selenium", "Java", "Junit", "TestNG", "Maven" };
		System.out.println(tools.length);

		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);

		System.out.println("---------------------------");

		for (int i = 0; i < tools.length; i++) {
			System.out.println(i);
		}

	}

}
