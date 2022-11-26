package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number");
        int a = in.nextInt();

        System.out.println("Input second number");
        int b = in.nextInt();

        System.out.printf("%s + %s = %s, %s - %s = %s", a, b, (a+b), a, b, (a-b));
        in.close();
    }
}
