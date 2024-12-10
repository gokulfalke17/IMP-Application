import java.util.Scanner;
class JaggedArrayEvenOdd {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);

		int arr[][] = new int[3][];
		arr[0] = new int[]{3,5,1};
		arr[1] = new int[]{2,5,6,4};
		arr[2] = new int[]{7,9};
		
		System.out.println("Jagged Array Elements Are ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Even Numbers : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]%2==0) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		System.out.println();

		System.out.println("Odd Numbers : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==1) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		System.out.println();
	}
}