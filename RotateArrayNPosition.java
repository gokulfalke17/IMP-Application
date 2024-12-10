//s2-3
import java.util.Scanner;
class RotateArrayNPosition {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//array Values are
		int arr[] = new int[11];//0 3 6 9 12 14 18 20 22 25 27

		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		//display array
		System.out.println("Array Elements Are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//any index present in array
		System.out.println("Enter Index ");
		int index = scn.nextInt();//4
		
		//after index elements
		System.out.println("From "+index+"th Position Value of Array are ");
		for(int i=index;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		//before index elements
		System.out.println("Before "+index+"th Position Value of Array Elements are ");
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int j;
		for(int i=0;i<index;i++) {
			int temp = arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];				
			}
			arr[j] = temp;
		}

		System.out.println("After Rotating From "+index+"th Position Array Elements are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}