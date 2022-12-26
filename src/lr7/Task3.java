package lr7;

public class Task3 {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass(5);
        SubSuperClass subSuperObj = new SubSuperClass(3, 'j');
        SubClass subObj = new SubClass(2, 's', "Hello");
        System.out.println(superObj);
        System.out.println(subSuperObj);
        System.out.println(subObj);
    }

    static class SuperClass {
        public int i;

        SuperClass(int i) {
            this.i = i;
        }

        public void setValue(int i) {
            this.i = i;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + "\n" +
                    "field(s): " + i;
        }
    }

    static class SubSuperClass extends SuperClass {
        public char c;

        SubSuperClass(int i, char c) {
            super(i);
            this.c = c;
        }

        public void setValue(int i, char c) {
            super.setValue(i);
            this.c = c;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + "\n" +
                    "field(s): " + i + ", " + c;
        }
    }

    static class SubClass extends SubSuperClass {
        public String s;

        SubClass(int i, char c, String s) {
            super(i, c);
            this.s = s;
        }

        public void setValue(int i, char c, String s) {
            super.setValue(i, c);
            this.s = s;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + "\n" +
                    "field(s): " + i + ", " + c + ", " + s;
        }
    }
}
