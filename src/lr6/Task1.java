package lr6;

public class Task1 {
    public static void main(String[] args) {
        Class obj = new Class();

        System.out.println("Set String");
        obj.setValue("Hello");
        System.out.println("String field: " + obj.s);
        System.out.println("Char field: " + obj.c);

        System.out.println("Set char");
        obj.setValue('g');
        System.out.println("String field: " + obj.s);
        System.out.println("Char field: " + obj.c);

        char[] arrChar = {'a'};
        System.out.println("Set char[1]");
        obj.setValue(arrChar);
        System.out.println("String field: " + obj.s);
        System.out.println("Char field: " + obj.c);

        char[] arrWord = {'w', 'o', 'r', 'l', 'd'};
        System.out.println("Set char[5]");
        obj.setValue(arrWord);
        System.out.println("String field: " + obj.s);
        System.out.println("Char field: " + obj.c);
    }

    static class Class {
        char c;
        String s;

        void setValue(String s) {
            this.s = s;
        }

        void setValue(char c) {
            this.c = c;
        }

        void setValue(char[] arr) {
            if (arr.length == 1) {
                c = arr[0];
            } else if (arr.length > 1) {
                s = new String(arr);
            }
        }
    }
}
