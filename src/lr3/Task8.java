package lr3;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int n = 10;
        char[] arr = new char[n];

        char charCode = 'A';
        for (int i = 0; i < n; ) {
            if (charCode != 'A' && charCode != 'E' &&
                    charCode != 'I' && charCode != 'O' &&
                    charCode != 'U' && charCode != 'Y') {
                arr[i] = charCode;
                i++;
            }

            charCode++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
