package lr7;

public class Task1 {
    public static void main(String[] args) {
        SuperClass obj = new SuperClass("super");
        SubClass subObj = new SubClass("sub");
        SubClass subObj2 = new SubClass("sub1", "sub2");

        System.out.println(obj);
        System.out.println(subObj);
        System.out.println(subObj2);
    }

    static class SuperClass {
        private String s;

        SuperClass() {}

        SuperClass(String s) {
            this.s = s;
        }

        public String getS() {
            return this.s;
        }

        public void setS(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "Class name from super: " + this.getClass().getSimpleName() + "\n" +
                    "Field s(" + s + ")";
        }
    }

    static class SubClass extends SuperClass {
        private String subS1;
        private String subS2;

        SubClass(String s) {
            super(s);
        }

        SubClass(String s1, String s2) {
            this.subS1 = s1;
            this.subS2 = s2;
        }

        @Override
        public String toString() {
            return "Class name from sub: " + this.getClass().getSimpleName() + "\n" +
                    "Field superS(" + this.getS() + ")" + " " +
                          "subS1(" + this.getSubS1() + ")" + " " + "subS2(" + this.getSubS2() + ")";
        }

        public String getSubS1() {
            return this.subS1;
        }

        public void setSubS1(String s) {
            this.subS1 = s;
        }

        public String getSubS2() {
            return this.subS2;
        }

        public void setSubS2(String s) {
            this.subS2 = s;
        }
    }
}
