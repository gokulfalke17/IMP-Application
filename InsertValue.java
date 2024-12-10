/*insert value in specific position*/
import java.util.Scanner;

class InsertValue {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Enter Index Where You Want to Store Value ");
		int index = scn.nextInt();

		System.out.println("Enter That Value  You Want to Store in Index ");
		int value = scn.nextInt();

		for(int i=size-1;i<index;i--) {
			arr[index] = arr[i];
		}
		arr[index] = value;

		System.out.println("After Modifing Array Elements ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}