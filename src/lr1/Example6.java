package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your lastname");
        String lastname = in.nextLine();

        System.out.println("Input your firstname");
        String firstname = in.nextLine();

        System.out.println("Input your father subname");
        String fatherSubname = in.nextLine();

        System.out.println("Hello " + lastname + " " + firstname + " " + fatherSubname);
        in.close();
    }
}
