package lr8;

import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите путь к файлу с текстом:");
        String inputFilePath = in.nextLine();
        if (inputFilePath.isBlank()) {
            System.out.println("Путь к файлу с текстом остутсвует");
            return;
        }

        System.out.println("Введите путь к файлу куда вы хотите записать данные\n" +
                "или оставьте пустой ввод чтобы выбрать файл по умолчанию (d:/toTask3.txt):");
        String outputFilePath = in.nextLine();
        inputFilePath = inputFilePath.isBlank() ? "d:/fromTask3.txt" : inputFilePath;


        try {
            rewriteCapLetterWords(inputFilePath, outputFilePath);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void rewriteCapLetterWords(String inputName, String outputName) throws IOException {
        BufferedReader rd = null;
        BufferedWriter wr = null;

        try {
            rd = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(inputName),
                            "utf8"
                    )
            );
            wr = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outputName),
                            "utf8"
                    )
            );

            int lineCount = 0;
            String s;
            while ((s = rd.readLine()) != null) {
                if (s.isBlank()) continue;

                lineCount++;
                wr.write(lineCount + ": ");

                String[] arr = s.split(" ");
                int wordCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    String word = toCleanWord(arr[i]);
                    if (!word.isBlank() && word.charAt(0) >= 1040 && word.charAt(0) <= 1071) {
                        wordCount++;
                        if (wordCount == 1) {
                            wr.write(word);
                        } else {
                            wr.write(", " + word);
                        }
                    }
                }

                wr.newLine();
                wr.write("Total number of chosen words in line " + lineCount + ": " + wordCount + "\n\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            rd.close();
            wr.flush();
            wr.close();
        }
    }

    public static String toCleanWord(String s) {
        String newS = s;
        boolean leftIsLetter = false, rightIsLetter = false;
        while (!(leftIsLetter && rightIsLetter)) {
            if (newS.charAt(0) < 1040 || newS.charAt(0) > 1103) {
                newS = newS.substring(1, s.length());
            } else {
                leftIsLetter = true;
            }
            if (newS.isEmpty()) return newS;
            if (newS.charAt(newS.length()-1) < 1040 || newS.charAt(newS.length()-1) > 1103) {
                newS = newS.substring(0, newS.length()-1);
            } else {
                rightIsLetter = true;
            }
        }

        return newS;
    }
}
