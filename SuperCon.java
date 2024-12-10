class A {

	A(int x) {
		System.out.println("I'm Parent Class Constructor "+x);
	}
}

class B extends A {

	B(int y) {
		super(100);
		System.out.println("I'm Child Class Constructor "+y);
	}
}

public class SuperCon {
	
	public static void main(String[] args) {
		
		B b = new B(5);
	}
}