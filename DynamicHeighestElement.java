import java.util.Scanner;
public class DynamicHeighestElement {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = {18,25,95,3,35,64,82,21};
		
		System.out.println("Array Elements Are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		System.out.println("Enter Count Heighest ");
		int count = scn.nextInt();

		int heighest = arr[0];
		int second = 0;

		for(int i=0;i<arr.length;i++) {
			if(arr[i] > heighest)
				heighest = arr[i];
		}

		for(int i=0;i<count-1;i++) {
			second = 0;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] < heighest && arr[j] > second) {
					second = arr[j];
				}
			}
			heighest = second;
		}
		System.out.println("Second Heighest :"+second);
	}
}