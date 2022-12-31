package lr8;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите путь к файлу с данными " +
                "или к месту где вы хотите создать файл с двумя строками utf8 и пятью числами double\n" +
                "или оставьте пустой ввод чтобы создать файл по умолчанию (d:/fromTask2.txt):");
        String inputFilePath = in.nextLine();
        inputFilePath = inputFilePath.isBlank() ? "d:/fromTask2.txt" : inputFilePath;

        System.out.println("Введите путь к файлу куда вы хотите записать данные\n" +
                "или оставьте пустой ввод чтобы выбрать файл по умолчанию (d:/toTask2.txt):");
        String outputFilePath = in.nextLine();
        outputFilePath = outputFilePath.isBlank() ? "d:/toTask2.txt" : outputFilePath;


        File f1 = new File(inputFilePath);
        if (!f1.exists()) {
            generateSourceFile(f1);
        }

        if (f1.exists()) {
            readSecondLinePositive(f1, outputFilePath);
        }

        in.close();
    }

    public static void readSecondLinePositive(File f, String outputFile) throws IOException {
        DataInputStream rd = null;
        BufferedWriter wr = null;

        try {
            wr = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outputFile)
                    )
            );
            rd = new DataInputStream(
                    new FileInputStream(f)
            );

            rd.readUTF();

            wr.write(rd.readUTF());
            wr.newLine();
            try {
                while (true) {
                    double d = rd.readDouble();
                    if (d >= 0) {
                        wr.write(String.valueOf(d));
                        wr.newLine();
                    }
                }
            } catch (EOFException e) {}

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            wr.flush();
            wr.close();
            rd.close();
        }
    }

    public static void generateSourceFile(File f1) throws IOException {
        try{
            f1.createNewFile();
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return;
        }


        DataOutputStream wr = null;

        if (f1.exists()) {
            try {
                wr = new DataOutputStream(new FileOutputStream(f1));

                wr.writeUTF("Hello world");
                wr.writeUTF("Hi there");
                Random rndm = new Random();
                for (int i = 0; i < 5; i++) {
                    wr.writeDouble((rndm.nextDouble()-0.5d)*2d);
                }
                rndm.nextDouble();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            } finally {
                wr.flush();
                wr.close();
            }
        }
    }
}
