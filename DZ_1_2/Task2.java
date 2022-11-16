package DZ_1_2;

import java.util.Arrays;

import static DZ_1_2.metods2.calculate;
import static DZ_1_2.metods2.divide;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {4,5,3,7,5};
        int[] array2 = {2,8,1,0,2};
        System.out.println(Arrays.toString(calculate(array1, array2)));
        System.out.println(Arrays.toString(divide(array1, array2)));
    }
}
