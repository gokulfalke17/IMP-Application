/*
Union Iteration using java
--------------------------
*/
import java.util.Scanner;
public class UnionIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        // Input the elements of the first array
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        // Input the elements of the second array
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Finding union
        int[] tempUnion = new int[size1 + size2];
        int unionIndex = 0;

        // Add all elements of the first array to the union array
        for (int i = 0; i < size1; i++) {
            tempUnion[unionIndex++] = array1[i];
        }

        // Add elements of the second array to the union array if they are not already present
        for (int i = 0; i < size2; i++) {
            boolean found = false;
            for (int j = 0; j < size1; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempUnion[unionIndex++] = array2[i];
            }
        }

        System.out.println("Union of the two arrays: ");
        for (int i = 0; i < unionIndex; i++) {
            System.out.print(tempUnion[i] + " ");
        }
        System.out.println();

        // Finding intersection
        int[] tempIntersection = new int[size1 + size2];  // Maximum possible size
        int intersectionIndex = 0;

        // Find common elements in both arrays
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    // Check if element is already in the intersection array
                    boolean found = false;
                    for (int k = 0; k < intersectionIndex; k++) {
                        if (tempIntersection[k] == array1[i]) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        tempIntersection[intersectionIndex++] = array1[i];
                    }
                }
            }
        }

        System.out.println("Intersection of the two arrays: ");
        for (int i = 0; i < intersectionIndex; i++) {
            System.out.print(tempIntersection[i] + " ");
        }
        System.out.println();
    }
}
