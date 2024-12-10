class A {
	static int a = 10;
	static {
		System.out.println("Hii");
		System.out.println(a);
	}
}

class B extends A {
	static int b = 20;
	static {
		System.out.println("Hello");
	}
}

class Main {
	public static void main(String[] args) {
		
		System.out.println(A.a);
		System.out.println(B.b);
	}
}