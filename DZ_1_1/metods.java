package DZ_1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class metods {
    // метод делит числа в массиве на введеное число. 4ка в цикле специально для появления ошибки.
    public static Object[] calculate(int[] array, int b) {
        Object[] res = new Object[array.length];
        try {
            for (int i = 0; i <= 4; i++) {
                Object result = divide(array[i], b);
                System.out.println(array[i] + " / " + b + " = " + result);
                res[i] = result;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива " + ex);
        }
        return res;
    }
    // делениа числа а на число б. Ловим ошибку деления на 0
    public static Object divide(int a, int b) {
        int res;
        try {
            res = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0 невозможно " + ex);
            return "";
        }
        return res;
    }
    // ввод числа. Проверка на то, что введено число.
    public static int inputNumber() {
        System.out.println("Введите делитель");
        Scanner sc = new Scanner(System.in);
        try {
            int b = sc.nextInt();
            return b;
        } catch (InputMismatchException ex) {
            System.out.println("error" + ex + "\nПопробуйте еще раз");
        }
        return inputNumber();
    }
}
