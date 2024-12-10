import java.util.Scanner;
class FiboSeriesRecursion {
	int f1 = 1;
	int f2 = 0;
	int fib = 0;

	public void fibSeries(int limit) { //10
		
		if(limit!=0) {
			System.out.print(fib+" ");
			fib = f1+f2;
			f1 = f2;
			f2 = fib;
			limit--;
			fibSeries(limit);
		}
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Limit :");
		int limit = scn.nextInt(); //10

		FiboSeriesRecursion series = new FiboSeriesRecursion();
		series.fibSeries(limit); //10

		System.out.println();
	}
}