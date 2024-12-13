package Practice;

import java.util.ArrayList;

public class ArrayListPrac {
	public static void main(String[] args) {
		ArrayList<String> selTools = new ArrayList<String>();
		selTools.add("Selenium");
		selTools.add("JUnit");
		selTools.add("TestNG");
		selTools.add("Agile");

		System.out.println(selTools.size());
		System.out.println(selTools.get(3));

		selTools.add("Git");
		System.out.println(selTools.get(4));
		System.out.println(selTools.size());

		selTools.remove("JUnit");
		System.out.println(selTools.size());

		selTools.remove(2);
		System.out.println(selTools.size());
		System.out.println(selTools.get(1));

	}
}
