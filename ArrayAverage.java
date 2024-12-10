/*Average of array*/
import java.util.Scanner;
class ArrayAverage{
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size = scn.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		int sum = 0;
		int avg=0;
		for(int i=0;i<size;i++) {
			sum = sum+arr[i];
			avg = sum/size;
		}
		System.out.print("Average of Given Array : "+avg);
		System.out.println();
	}
}