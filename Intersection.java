/*
Intersection Array Using java
*/
import java.util.Scanner;
public class Intersection {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Array Size ");
		int size1 = scn.nextInt();
		int a[] = new int[size1];

		System.out.println("Enter First Array Elements ");
		for(int i=0;i<size1;i++) {
			a[i] = scn.nextInt();
		}

		System.out.println("Enter Second Array Size ");
		int size2 = scn.nextInt();
		int b[] = new int[size2];

		System.out.println("Enter Second Array Elements ");
		for(int i=0;i<size2;i++) {
			b[i] = scn.nextInt();
		}

		//intersection array logic
		int k= 0;
		boolean flag;

		//third array size
		int size3 = size1 + size2;
		int c[] = new int[size3];

		for(int i=0;i<size1;i++) {
			flag = false;
			for(int j=0;j<k;j++) {
				if(c[j]!=a[i]) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				c[k] = a[i];
				k++;
			}
		}
		for(int i=0;i<size2;i++) {
			flag = false;
			for(int j=0;j<k;j++) {
				if(c[j]!=b[i]) {
					flag = true;
					break;
				}
			}
			if(flag==true) {
				c[k] = b[i];
				k++;
			}
		}
		System.out.println("Intersection Array :: ");
		for(int i=0;i<k;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
}