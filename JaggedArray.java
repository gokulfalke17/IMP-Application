/*
Jagged Array Using java
-----------------------
*/
import java.util.*;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[][] = new int[3][]; //increase  when we add row
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        //arr[3] = new int[3];

        System.out.println("Enter Array Elements in Matrix :: ");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        //display jagged array elements 
        System.out.println("Jagged Array :: ");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}