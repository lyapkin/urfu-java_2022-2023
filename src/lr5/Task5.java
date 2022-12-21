package lr5;

public class Task5 {
    public static void main(String[] args) {
        class Class {
            private int i;

            Class(int i) {
                setI(i);
            }

            Class() {
                setI();
            }

            public void setI(int i) {
                if (i < 100) {
                    this.i = i;
                } else {
                    this.i = 100;
                }
            }

            public void setI() {
                i = 0;
            }

            public int getI() {
                return i;
            }
        }

//        Демонстрация работы
        Class obj = new Class(101);
//        Class obj = new Class(15);
//        Class obj = new Class();
//        obj.setI();
//        obj.setI(13);
//        obj.setI(101);
        System.out.println(obj.getI());
    }
}
