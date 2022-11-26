package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a month number");
        int monthNumber = in.nextInt();

        if (monthNumber == 1) {
            System.out.println("There are 31 days in January");
        } else if (monthNumber == 2) {
            System.out.println("There may be 28 or 29 days in February");
        } else if (monthNumber == 3) {
            System.out.println("There are 31 days in March");
        } else if (monthNumber == 4) {
            System.out.println("There are 30 days in April");
        } else if (monthNumber == 5) {
            System.out.println("There are 31 days in May");
        } else if (monthNumber == 6) {
            System.out.println("There are 30 days in June");
        } else if (monthNumber == 7) {
            System.out.println("There are 31 days in July");
        } else if (monthNumber == 8) {
            System.out.println("There are 31 days in August");
        } else if (monthNumber == 9) {
            System.out.println("There are 30 days in September");
        } else if (monthNumber == 10) {
            System.out.println("There are 31 days in October");
        } else if (monthNumber == 11) {
            System.out.println("There are 30 days in November");
        } else if (monthNumber == 12) {
            System.out.println("There are 31 days in December");
        } else {
            System.out.println("The number is out of the month range");
        }
        in.close();
    }
}
