package lr8.Task1;

import java.io.*;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try {
            File f1 = new File("D:\\Folder1\\numIsh.txt");
            f1.createNewFile();

            Scanner in = new Scanner(System.in);

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Amount of real numbers to write into the file:");
            int count = in.nextInt();

            System.out.println("Input numbers:");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(in.nextFloat());
            }

            wr.flush();
            wr.close();

            File f2 = new File("D:\\Folder1\\numRez.txt");
            f2.createNewFile();

            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Number " + number);
                }
            } catch (EOFException e) {}

            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}
