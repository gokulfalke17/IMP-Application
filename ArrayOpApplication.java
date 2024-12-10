//Program 01
import java.util.Scanner;
class ArrayOp {
	int arr[];
	ArrayOp(int arr[]) {
		this.arr = arr;
	}

	public void findArrayOp(int k) {
		
		//sort array 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorted Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		if(k>0 && k<arr.length) {
			System.out.println(arr[k-1]+" Smallest Number");
		}
	}
}

public class ArrayOpApplication {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int arr[] = new int[]{23, 56, 11, 45, 67};

		System.out.println("Enter K Value");
		int k = scn.nextInt();

		ArrayOp op = new ArrayOp(arr);
		op.findArrayOp(k);
	}
}