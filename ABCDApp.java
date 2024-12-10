class A {
	static int a = m1();
	int b = 200;
	public static int  m1() {
		System.out.println("A:Static m1() method");
		return 10;
	}
}
class B extends A {
	int a = m2();

	public int m2() {
		System.out.println("B:Non-Static m1() method");
		System.out.println("Local A Variable :"+a);
		return 100;

	}
}	

class C extends B {
	public void m1(int a) {
		System.out.println("C:Local Variable m1 Method");
		System.out.println("Local A Variable :"+a);
		System.out.println("A :"+A.a);
		System.out.println("B :"+b);
	}
}

class D extends C {
	int a = 10;
	static int b = 20;

	static {
		System.out.println("D:I'm Static Block");
		//System.out.println("A :"+a);
		System.out.println("B :"+b);
	}
}

public class ABCDApp {
	
	public static void main(String[] args) {
		
		
		D d = new D();
		System.out.println("A :"+d.a);
		System.out.println("B :"+d.b);

		d.m1(5);
	}
}