package lr5;

public class Task1 {
    public static void main(String[] args) {
        class Class {
            private static char symbol;

            public static void setSymbol(char smbl) {
                symbol = smbl;
            }

            public static int getSymbolCode() {
                return (int) symbol;
            }

            public static void showSymbol() {
                System.out.print(symbol);
                System.out.print("=");
                System.out.print((int) symbol);
            }
        }

//        Демонстрация работы
        Class.setSymbol('r');
        int i = Class.getSymbolCode();
        System.out.println(i);
        Class.showSymbol();
    }
}
