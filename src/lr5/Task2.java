package lr5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        class Class {
            private static char a = 'a';
            private static char b = 'd';

            public static char[] getSymbolsRange() {
                int size = b - a + 1;
                char[] arr = new char[size];
                char symbol;
                for (int i = 0; i < size; i++) {
                    symbol = (char) (a + i);
                    System.out.println(symbol);
                    arr[i] = symbol;
                }
                return arr;
            }
        }

//        Демонстрация работы
        System.out.println(Arrays.toString(Class.getSymbolsRange()));
    }
}
