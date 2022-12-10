package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input an array size");
        int n = in.nextInt();

        if (n < 1) {
            System.out.println("The number must be greater than 0");
            return;
        }

        int[] arr = new int[n];
        int num = 2;
        for (int i = 0; i < n; i++, num+=5) {
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));

        in.close();
    }
}
