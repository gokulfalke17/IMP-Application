/*second largest elements*/
import java.util.Scanner;
class SecondLargest{
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		int largest = 0;
		int second = 0;
		for(int i=0;i<size;i++) {
			if(largest<arr[i]) {
				second = largest;
				largest = arr[i];
			}else if(largest>arr[i] && second<arr[i]) {
				second = arr[i];
			}
		}
		System.out.print("Largest Elements : "+largest);
		System.out.println();
		System.out.print("Second Largest Elements : "+second);
		System.out.println();
	}
}