package lr4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int row = 11;
        System.out.println("Triangle of arrays");

        int[][] arr = new int[row][];

        for (int i = 0; i < row; i++) {
            arr[i] = new int[i+1];
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
