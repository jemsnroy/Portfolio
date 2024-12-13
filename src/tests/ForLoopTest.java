package tests;

public class ForLoopTest {

	public static void main(String[] args) {
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);*/

		/*
		 * in for loop we have 3 section: 
		 * initialization, condition, increment
		 */
		for (int i = 1; i <= 10; i++) {
			if (i==5) {
				break;
			}
			System.out.print(i +",");
		}
	}

}
