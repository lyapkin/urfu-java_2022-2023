package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age");
        int age = in.nextInt();

        int birthYear = 2022 - age;

        System.out.println("You were born in " + birthYear + " or " + (birthYear-1));
        in.close();
    }
}
