package lr5;

public class Task3 {
    public static void main(String[] args) {
        class Class {
            private int i;
            private int j;

            Class() {
                i = j = 0;
            };

            Class(int i) {
                this.i = j = i;
            }

            Class(int i, int j) {
                this.i = i;
                this.j = j;
            }

        }
    }
}
