import java.util.Scanner;
class Reverse {
	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		int arr[] = new int[]{5, 8, 3, 7, 9, 1};
		System.out.println("Array Elements are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		//sort array logic
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting Array Elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int start = 0;
		int end = arr.length-1;
		int mid = arr.length/2;

		for(start=0;start<mid;start++) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
		}
		System.out.println("After Reverse Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}