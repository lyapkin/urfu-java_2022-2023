package lr6;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 8, 2, 1};
        Class.findMax(arr);
        Class.findMin(2, 5, 4, 8, 2, 1);
        Class.findMean(2, 5, 4, 8, 2, 1);
    }

    class Class {
        static void findMax(int ... arr) {
            if (arr.length == 0) {
                return;
            }

            Arrays.sort(arr);

            System.out.println("Max: " + arr[arr.length-1]);
        }

        static void findMin(int ... arr) {
            if (arr.length == 0) {
                return;
            }

            Arrays.sort(arr);

            System.out.println("Min: " + arr[0]);
        }

        static void findMean(int ... arr) {
            if (arr.length == 0) {
                return;
            }

            int sum = 0;
            for (int i : arr) {
                sum += i;
            }

            System.out.println("Mean: " + (sum/arr.length));
        }
    }
}
