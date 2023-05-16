package timus2.task_1545;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        in.nextLine();

        String[] keys = new String[num];
        for (int i = 0; i < num; i++) {
            keys[i] = in.nextLine();
        }

        String enteredKey = in.nextLine();
        for (int i = 0; i < num; i++) {
            if (keys[i].startsWith(enteredKey)) {
                System.out.println(keys[i]);
            }
        }
    }
}
