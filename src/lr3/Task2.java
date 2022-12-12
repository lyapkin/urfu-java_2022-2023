package lr3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели");
        String weekday = in.next().toLowerCase();

//        Switch вариант
        switch (weekday) {
            case "понедельник":
                System.out.println("Порядковый номер дня - 1");
                break;
            case "вторник":
                System.out.println("Порядковый номер дня - 2");
                break;
            case "среда":
                System.out.println("Порядковый номер дня - 3");
                break;
            case "четверг":
                System.out.println("Порядковый номер дня - 4");
                break;
            case "пятница":
                System.out.println("Порядковый номер дня - 5");
                break;
            case "суббота":
                System.out.println("Порядковый номер дня - 6");
                break;
            case "воскресенье":
                System.out.println("Порядковый номер дня - 7");
                break;
            default:
                System.out.println("Такого дня не существует");
        }

//        if вариант
        if (weekday.equals("понедельник")) {
            System.out.println("Порядковый номер дня - 1");
        } else if (weekday.equals("вторник")) {
            System.out.println("Порядковый номер дня - 2");
        } else if (weekday.equals("среда")) {
            System.out.println("Порядковый номер дня - 3");
        } else if (weekday.equals("четверг")) {
            System.out.println("Порядковый номер дня - 4");
        } else if (weekday.equals("пятница")) {
            System.out.println("Порядковый номер дня - 5");
        } else if (weekday.equals("суббота")) {
            System.out.println("Порядковый номер дня - 6");
        } else if (weekday.equals("воскресенье")) {
            System.out.println("Порядковый номер дня - 7");
        } else {
            System.out.println("Такого дня не существует");
        }

        in.close();
    }
}
