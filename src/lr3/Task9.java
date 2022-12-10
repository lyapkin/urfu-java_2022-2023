package lr3;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        int bound = 100;
        int min = bound+2, minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100) + 1;
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(min + " is the min of the array");
        System.out.println("Indexes:");
        for (int i = minIndex; i < arr.length; i++) {
            if (arr[i] == min) {
                System.out.println(i);
            }
        }
    }
}
