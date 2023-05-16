package timus2.task_1638;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int volumeThickness = in.nextInt();
        int coverThickness = in.nextInt() * 2;
        int startVolume = in.nextInt();
        int endVolume = in.nextInt();

        int volumes = (endVolume - 1) - startVolume;
        int result = (volumes * volumeThickness) + (volumes * (coverThickness)) + (coverThickness);

        if (startVolume == 0) {
            result -= (coverThickness/2);
        }

        System.out.println(Math.abs(result));

    }
}
