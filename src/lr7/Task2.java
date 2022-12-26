package lr7;

public class Task2 {
    public static void main(String[] args) {
        SuperClass superObj1 = new SuperClass("super");
        SubClass subObj1 = new SubClass("sub", 3);
        superObj1.showValue();
        subObj1.showValues();
    }

    static class SuperClass {
        private String s;

        SuperClass(String s) {
            this.s = s;
        }

        public int getLength() {
            return s.length();
        }

        public void setValue() {

        }

        public void setValue(String s) {
            this.s = s;
        }

        public void showValue() {
            System.out.println(this.getClass().getSimpleName() + ": " + this.s);
        }
    }

    static class SubClass extends SuperClass {
        public int i;

        SubClass (String s, int i) {
            super(s);
            this.i = i;
        }

        @Override
        public void setValue() {}

        @Override
        public void setValue(String s) {
            super.setValue(s);
        }

        public void setValue(int i) {
            this.i = i;
        }

        public void setValues(String s, int i) {
            super.setValue(s);
            this.i = i;
        }

        public void showValues() {
            System.out.println(this.getClass().getSimpleName() + ": " + super.s + " and " + this.i);
        }
    }
}
