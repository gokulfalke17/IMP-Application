import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int size = scn.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Array Values ");
        for(int i=0;i<size;i++) {
            arr[i] = scn.nextInt();
        }

        //display array values 
        System.out.println("Array Values are ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter Index :: ");
        int index = scn.nextInt();

        int j;
        for(int i=0;i<index;i++) {
            int temp = arr[0];
            for(j=0;j<size-1;j++) {
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }
        //Rotating array values 
        System.out.println("Rotating Values are ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
		System.out.println();
    }
}
