/*find missing elements*/
import java.util.Scanner;
class MissingElements {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Array Size ");
		int size = scn.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++){
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting Array Elements ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Array Missing Elements ");
		for(int i=0;i<size-1;i++) {
			for(int k=arr[i]+1;k<arr[i+1];k++) {
				System.out.print(k+" ");
			}
		}
		System.out.println();
	}
}