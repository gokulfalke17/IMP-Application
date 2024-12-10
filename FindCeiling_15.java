/*
15) Write a program in java to find the ceiling in a sorted array? 
*/

import java.util.Scanner;
public class FindCeiling_15 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int arr[] ={2,4,7,1,9,14,17,12,16,19};
		System.out.println("Sorted Array Elements ");
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();

		int num;
		System.out.println("Enter Any Number to Find Ceiling of Array ");
		num = scn.nextInt();
		int ceiling=0;
		int mid = arr.length/2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>num) {
				ceiling = arr[0];
				break;
			}else if(arr[mid]<num){
				ceiling = arr[arr.length-1];
				break;
			}else if(arr[i]==num) {
				ceiling = num;
				break;
			}else if (arr[i]<num && arr[i+1]>num) {
				ceiling = arr[i+1];
				break;
			}
		}
		System.out.println("Ceiling "+ceiling);
	}
}