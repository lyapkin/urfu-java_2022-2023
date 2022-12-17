package lr4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.println("Введите ключ: ");
        short key = in.nextShort();

        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] += key;
        }
        System.out.println("Текст после преобразования: " + new String(charArray));

        String answer;
        do {
            System.out.print("Выполнить обратное преобразование? (y/n): ");
            answer = in.next();
            if (answer.equals("n")) {
                System.out.println("Досвидания!");
                in.close();
                return;
            }
        } while (!answer.equals("y"));

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] -= key;
        }

        System.out.println(new String(charArray));

        in.close();
    }
}
