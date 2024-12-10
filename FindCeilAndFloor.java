/*
program 4
*/
import java.util.Scanner;
class Parent {
	int arr[];
	void setValue(int arr[]) {
		this.arr = arr;
	}
}

class Child extends Parent {
	
	void find(int arr[]) {
		
		int ceil = 0;
		int floor = 0;

		for(int i=0;i<arr.length;i++) {
			if(ceil>arr[i]+1) {
				ceil = arr[i];
			}

			if(floor<arr[i]) {
				floor = arr[i];
			}
		}
		System.out.println("Ceil : "+ceil);
		System.out.println("Floor : "+floor);

	}
}

public class FindCeilAndFloor {
		
		public static void main(String[] args) {
			
			Scanner scn = new Scanner(System.in);
			
			//array size
			System.out.println("Enter Array Size");
			int size = scn.nextInt();
			//array creation
			int arr[] = new int[size];
			

			//set array values
			System.out.println("Enter Array Values ");
			for(int i=0;i<size;i++) {
				arr[i] = scn.nextInt();
			}
			
			//object creation of child class
			Child ch = new Child();
			//call method of child class
			ch.find(arr);

		}
}