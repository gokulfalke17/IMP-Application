/*
Program 1. Create a class name as ArrOp in with a parameterized constructor and a functions ArrOp(int[]) - to accept string from user void FindSecSmall(int k) - to find the kth smallest number 
Ex: given array : 23 56 11 45 67 K=2 
Output : 23 is 2nd smallest number
*/
import java.util.Scanner;

class ArrayOp {
	int arr[];
	//constructor array parameterized
	public ArrayOp(int arr[]) {
		this.arr = arr;
	
	}
	//paramert methods
	public int ArrOp(int k) {

		System.out.println("Before Sorting Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("After Sorting Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		if(k>0 && k<=arr.length) {
			System.out.println(arr[k-1]+"-->"+k+" Smallest Number ");
		}
		return 0;
	}

}

public class ArrayOperation {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		//size taken by user
		System.out.println("Enter Array Size :");
		int size = scn.nextInt();
		
		//array
		int arr[] = new int[size];
		//array elements
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter K Value");
		int k = scn.nextInt();
		
		//object creation
		ArrayOp op = new ArrayOp(arr);
		op.ArrOp(k);
	}
}

