//Program 03
import java.util.Scanner;
class ArrayOp {
	
	int arr[];
	ArrayOp(int arr[]) {
		this.arr = arr;
	}
	public void findRev() {
		//without reverse array numbers
		System.out.println("Before Reversing Array Numbers");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//reversing array logic

		int revArray[] = new int[arr.length];

		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			int rev = 0;
			while(num!=0) {
				int rem = num%10;
				rev = rev*10+rem;
				num = num/10;
			}
			revArray[i] = rev;
		}

		//reversing array numbers
		System.out.println("After Reversing Array Numbers");
		for(int i=0;i<revArray.length;i++) {
			System.out.print(revArray[i]+" ");
		}
		System.out.println();
	}
}

public class ArrayOpApplication2 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}

		ArrayOp op = new ArrayOp(arr);
		op.findRev();
	}
}