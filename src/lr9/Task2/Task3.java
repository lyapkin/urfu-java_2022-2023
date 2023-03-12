package lr9.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte num, sum = 0;
        boolean stop = false;

        class CalculationOutOfRange extends Exception {
            CalculationOutOfRange(String str) {
                super(str);
            }
        }

        try {
            System.out.println("Вводите числа типа byte для вычисления их суммы. Введите 0, чтобы остановить ввод.");
            while (!stop) {
                num = in.nextByte();
                int result = sum + num;
                if (num == 0) {
                    stop = true;
                }
                if (result > Byte.MAX_VALUE || result < Byte.MIN_VALUE) {
                    throw new CalculationOutOfRange("Значение суммы за границами диапазона типа byte");
                }
                sum = (byte) result;
            }

            System.out.println("Сумма введенных значений равна " + sum);
        } catch (InputMismatchException e) {
            System.out.println(e + " Введенно значение неверного типа.");
        } catch (CalculationOutOfRange e) {
            System.out.println(e.getMessage());
        } finally {
            in.close();
        }
    }
}
