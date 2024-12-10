import java.util.Scanner;
class JaggedArrayMaxMin {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int arr[][] = new int[3][];
		arr[0] = new int[]{4,7,1};
		arr[1] = new int[]{3,6,2,5};
		arr[2] = new int[]{9,8};

		System.out.println("Jagged Array Elements Are ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		int max = 0;
		int min = arr[0][0];

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
				}
				if(min>arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}
}
