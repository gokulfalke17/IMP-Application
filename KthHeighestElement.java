import java.util.Scanner;
class KthHeighestElement {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = {10, 10, 10, 30, 30, 20, 20, 30, 20};

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array Values :: ");
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		System.out.println("Enter Kth Value :: ");
		int Kth = scn.nextInt();
		int count = 0;
		System.out.println("Kth Smallest Element is :: ");
		for(int i=arr.length-1; i>0; i--) {
			if(i==arr.length-1 || arr[i]!=arr[i+1]) {
				count++;
				if(count == Kth) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}