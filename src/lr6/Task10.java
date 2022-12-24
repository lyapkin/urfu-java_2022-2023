package lr6;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 4, 2, 8, 34};
        System.out.println(Arrays.toString(getMinAndMax(arr)));
    }

    static int[] getMinAndMax(int ... arr) {
        Arrays.sort(arr);
        int[] result = {arr[0], arr[arr.length-1]};
        return result;
    }
}
