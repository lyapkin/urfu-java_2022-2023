package timus2.task_1563;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        in.nextLine();

        String brand;
        HashSet<String> brands = new HashSet<>();
        for (int i = 0; i < num; i++) {
            brand = in.nextLine();
            if (!brands.contains(brand)) {
                brands.add(brand);
            }
        }

        System.out.println(num - brands.size());

    }
}
