package DZ_1_1;

import java.util.Arrays;

import static DZ_1_1.metods.calculate;
import static DZ_1_1.metods.inputNumber;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {2, 4, 7};
        int b = inputNumber();
        System.out.println(Arrays.toString(calculate(array, b)));
    }
}
