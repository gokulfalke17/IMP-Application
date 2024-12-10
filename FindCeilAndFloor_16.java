/*
16). Write a program in java to find the Floor and Ceil of the number 0 to 10 from a sroted array. 
*/

import java.util.Scanner;
public class FindCeilAndFloor_16 {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0,n;
        System.out.println("enter the value that celling is find");
        n=sc.nextInt();
        System.out.println("enter the value of array");
        int a[]=new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for (int i = 0; i < a.length-1; i++) {
            if (a[0]>n) {
                c=a[0];
            }
            if (n>a[4]) {
                c=-1;
            }
            if (n==a[i]) {
                c=n;
            }
            if (a[i]<n && a[i+1]>n) {
                c=a[i+1];
            }

        }
        System.out.println("celling of the number is "+c);
        sc.close();
		
	}
}