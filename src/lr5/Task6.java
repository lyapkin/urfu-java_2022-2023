package lr5;

public class Task6 {
    public static void main(String[] args) {
        class Class {
            private int min;
            private int max;

            Class(int a) {
                min = max = a;
            }

            Class(int a, int b) {
                min = Math.min(a, b);
                max = Math.max(a, b);
            }

            public void setValues(int a) {
                min = Math.min(Math.min(a, min), max);
                max = Math.max(Math.max(a, min), max);
            }

            public void setValues(int a, int b) {
                setValues(a);
                setValues(b);
            }

            public void showValues() {
                System.out.printf("Max is %s; Min is %s;\n", max, min);
            }
        }

//        Демонстрация работы
        Class obj = new Class(2, 13);
        obj.setValues(2);
        obj.setValues(12);
        obj.showValues();
        obj.setValues(14, 1);
        obj.showValues();
    }
}
