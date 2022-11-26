package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the current day of the week");
        String weekday = in.nextLine();

        System.out.println("Input the month");
        String month = in.nextLine();

        System.out.println("Input the day of the month");
        int date = in.nextInt();

        System.out.println(weekday + " " + date + " " + month);
        in.close();
    }
}
