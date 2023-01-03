package timus.task_1880;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = in.nextInt();
        }

        int n3 = in.nextInt();
        int[] nums3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            nums3[i] = in.nextInt();
        }

        int count = 0;
        int[] arr = new int[n1+n2+n3];
        for (int i = 0, j = 0, k = 0; i < arr.length; i++) {
            if (i < n1) {
                arr[i] = nums1[i];
            } else if (j < n2) {
                arr[i] = nums2[j];
                j++;
            } else {
                arr[i] = nums3[k];
                k++;
            }
        }
        Arrays.sort(arr);

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] == arr[i-1] && arr[i] == arr[i+1]) {
                count++;
            }
        }

        System.out.println(count);

        in.close();
    }
}
