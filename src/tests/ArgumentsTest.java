package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		sum(); // 4+5
		sum(10,20);
		sum(20,20);
		sum(10,20,30);
		sum(100,1000,2000);
	}

	public static void sum() {
		int a = 4 + 5;
		System.out.println(a);
	}
	public static void sum(int b,int c) {
		int a = b+c;
		System.out.println(a);
	}
	public static void sum(int b,int c,int d) {
		int a = b+c+d;
		System.out.println(a);
	}
}
