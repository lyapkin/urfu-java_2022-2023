package lr6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 4, 8};
        int[] newArr = getArrFrom(arr, 3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

    static int[] getArrFrom(int[] arr, int n) {
        if (n > arr.length) {
            return Arrays.copyOf(arr, arr.length);
        }

        return Arrays.copyOf(arr, n);
    }
}
