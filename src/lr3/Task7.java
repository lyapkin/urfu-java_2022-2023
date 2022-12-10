package lr3;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int n = 10;
        char[] arr = new char[n];

        char charCode = 'а';
        for (int i = 0; i < n; i++) {
            arr[i] = charCode;
            charCode+=2;
        }

        System.out.println(Arrays.toString(arr));

        int left = 0, right = arr.length-1;
        char temp;
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
