import java.util.Scanner;
public class Logic_ceil_and_floor {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9};
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("The given array is: 1 3 5 7 8 9");

        for (int num : numbers) {
            int floor = -1;
            int ceil = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    floor = ceil = arr[i];
                    break;
                } else if (arr[i] < num) {
                    floor = arr[i];
                } else if (arr[i] > num) {
                    ceil = arr[i];
                    break;
                }
            }
            System.out.println("Number: " + num + " ceiling is: " + ceil + " floor is: " + floor);
        }
    }

}