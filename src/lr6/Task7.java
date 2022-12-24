package lr6;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        char[] arr = {'d', 'v', 's', 'l'};
        System.out.println(Arrays.toString(getCodes(arr)));
    }

    static int[] getCodes(char[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }
}
