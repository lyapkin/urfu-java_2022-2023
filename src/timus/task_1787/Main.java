package timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int carsPerMin = in.nextInt();
        int min = in.nextInt();
        int cars = 0, stuck = 0;
        for (int i = 0; i < min; i++) {
            cars = in.nextInt();
            if (cars > carsPerMin) {
                stuck = stuck + (cars - carsPerMin);
            } else {
                stuck = (stuck - (carsPerMin - cars)) > 0 ? (stuck - (carsPerMin - cars)) : 0;
            }
        }

        System.out.println(stuck);

        in.close();
    }
}
