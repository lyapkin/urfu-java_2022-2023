package lr6;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        char[] arr = {'d', 'v', 's', 'l', 'c'};
        System.out.println(Arrays.toString(arr));
        reverseCharArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseCharArr(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int r = arr.length - i-1;

            if (i >= r) {
                break;
            }

            char temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
    }
}
