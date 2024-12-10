import java.util.Scanner;
class ArrayOccCount {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		//sort array elements
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting Array");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int count=1;
		for(int i=0;i<size;i++) {
			if(i<size-1 && arr[i] == arr[i+1]) {
				count++;
			}else {
				System.out.print(arr[i]+"--->"+count+" times");
				count=1;
			}
			System.out.println();
		}
	}
}