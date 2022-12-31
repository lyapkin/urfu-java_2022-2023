package lr8.Task1;

import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a file name:");
        String fileName = in.nextLine();

        try {
            File f1 = new File("d:/" + fileName);
            f1.createNewFile();
            System.out.println("Full path to the file:" + f1.getAbsolutePath());

            System.out.println("Input an amount of lines to write into the file:");
            int count = in.nextInt();
            in.nextLine();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            for(int i = 0; i < count; i++) {
                System.out.println("Input a line to write into the file:");
                String s = in.nextLine();
                dOut.writeUTF(s);
            }

            dOut.flush();
            dOut.close();

            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dIn.readUTF());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
