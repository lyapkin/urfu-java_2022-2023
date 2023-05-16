package timus2.task_1496;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        in.nextLine();

        Set<String> teams = new HashSet<>();
        Set<String> spammer = new HashSet<>();
        for (int i = 0; i < num; i++) {
            String team = in.nextLine();
            if (teams.contains(team)) {
                spammer.add(team);
            } else {
                teams.add(team);
            }
        }

        spammer.forEach(System.out::println);
    }
}
