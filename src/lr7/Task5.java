package lr7;

public class Task5 {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass("Super");
        SubClass1 subObj1 = new SubClass1("Sub1", 5);
        SubClass2 subObj2 = new SubClass2("Sub2", 'h');
        SuperClass subObjS = new SubClass1("Sub1 S", 4);

        superObj.displayInfo();
        subObj1.displayInfo();
        subObj2.displayInfo();
        subObjS.displayInfo();
    }

    static class SuperClass {
        protected String s;

        SuperClass(String s) {
            this.s = s;
        }

        public void displayInfo() {
            System.out.println(this.getClass().getSimpleName() + ": " + this.s);
        }
    }

    static class SubClass1 extends SuperClass {
        protected int i;

        SubClass1(String s, int i) {
            super(s);
            this.i = i;
        }

        @Override
        public void displayInfo() {
            System.out.println(this.getClass().getSimpleName() + ": " + this.s + ", " + this.i);
        }
    }

    static class SubClass2 extends SuperClass {
        protected char c;

        SubClass2(String s, char c) {
            super(s);
            this.c = c;
        }

        @Override
        public void displayInfo() {
            System.out.println(this.getClass().getSimpleName() + ": " + this.s + ", " + this.c);
        }
    }
}
