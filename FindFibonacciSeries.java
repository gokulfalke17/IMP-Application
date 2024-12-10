//s1-3
import java.util.Scanner;
class FiboSeries {
	void fibo(int limit) {
		
		int f1 = 1;
		int f2 = 0;
		int fib = 0;
		
		//
		for(int i=1;i<limit;i++) {
			System.out.print(fib+" ");
			fib = f1+f2;
			f1 =f2;
			f2 = fib;
		}
		System.out.println();
	}
	
}

public class FindFibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Fibo. Serice Limit :");
		int limit = scn.nextInt();
		System.out.println("Fibonacci Series is");
		
		//fiboSeries object creation
		FiboSeries fibo = new FiboSeries();
		//calling point in method
		fibo.fibo(limit);
	}
}