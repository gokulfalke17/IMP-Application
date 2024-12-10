/*
program3
*/
import java.util.Scanner;
class ArrayOp2 {
	int arr[];
	ArrayOp2(int arr[]) {
		this.arr = arr;
	}

	void FindRev () {

		for(int i=0;i<arr.length;i++) {
			for(int i=0;i<arr.length;i++)
		}	
	}
}

public class ArrayOperation2 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Array Size ");
		int size = scn.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			
			arr[i] = scn.nextInt();
		}

		ArrayOp2 op = new ArrayOp2(arr);
		op.FindRev();
	}
}