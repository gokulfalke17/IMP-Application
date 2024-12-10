import java.util.Scanner;
class MovePositiveValLast {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Before Move Positive Values in Last ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Move Positive Values in Last ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}