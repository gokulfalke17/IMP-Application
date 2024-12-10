/*seperate even and odd elements*/
import java.util.Scanner;
class SeperateEvenOdd{	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Even Numbers");
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd Numbers");
		for(int i=0;i<size;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}