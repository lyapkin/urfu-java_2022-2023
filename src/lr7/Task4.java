package lr7;

public class Task4 {
    public static void main(String[] args) {
        SubClass obj = new SubClass('c', "hello", 5);
        SubClass obj2 = new SubClass(obj);

        System.out.println(obj.c + " " + obj.s + " " + obj.i);
    }

    static class SuperClass {
        public char c;

        SuperClass(char c) {
            this.c = c;
        }

        SuperClass(SuperClass obj) {
            this.c = obj.c;
        }
    }

    static class SubSuperClass extends SuperClass {
        public String s;

        SubSuperClass(char c, String s) {
            super(c);
            this.s = s;
        }

        SubSuperClass(SubSuperClass obj) {
            super(obj.c);
            this.s = obj.s;
        }
    }

    static class SubClass extends SubSuperClass {
        public int i;

        SubClass(char c, String s, int i) {
            super(c, s);
            this.i = i;
        }

        SubClass(SubClass obj) {
            super(obj.c, obj.s);
            this.i = obj.i;
        }
    }
}
