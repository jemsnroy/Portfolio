package Practice;

import Practice_1.A1;

public class A {
	static A o1 = new A();
	static B o2 = new B();
	static A1 o3 = new A1();

	public static void main(String[] args) {
		
		A1();
		o1.A2();
		B.A3();
		o2.A4();
		A1.A5();
		o3.A6();
		
		A1(10,20);
		o1.A2(10,20);
		
		B.A3(50,10);
		o2.A4(50,10);
		
		A1.A5(50,80);
		o3.A6(50,80);

	}

	public static void A1() {
		System.out.println("This is A1 method.");
	}

	public void A2() {
		System.out.println("This is A2 method.");
	}
	
	public static void A1(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void A2(int a,int b) {
		int c = a*b;
		System.out.println(c);
	}
}
class B {
	public static void A3() {
		System.out.println("This is A3 method.");
	}
	
	public void A4() {
		System.out.println("This is A4 method.");
	}

	public static void A3(int a,int b) {
		int c = a-b;
		System.out.println(c);
	}
	public void A4(int a,int b) {
		int c = a/b;
		System.out.println(c);
	}
}