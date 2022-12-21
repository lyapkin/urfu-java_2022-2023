package lr5;

public class Task4 {
    public static void main(String[] args) {
        class Class {
            char c;
            int i;

            Class (int i, char c) {
                this.c = c;
                this.i = i;
            }

            Class (double d) {
                c = (char) d;
                i = (int) ((d - (int) d) * 100);
            }
        }

//        Демонстрация работы
        Class obj = new Class(65.12545);
        System.out.println(obj.i);
        System.out.println(obj.c);
    }
}
