package lr3;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        int bound = 100;
        int min = bound+2, minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100) + 1;
        }

        Arrays.sort(arr);

        int left = 0, right = arr.length-1;
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
