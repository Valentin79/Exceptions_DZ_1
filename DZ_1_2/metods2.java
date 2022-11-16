package DZ_1_2;

public class metods2 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    // каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static int[] calculate(int[] array1, int[] array2) {
        int len = array1.length;
        if (len != array2.length) {
            //throw new RuntimeException("Массивы не равнозначны"); // так код выдаст ошибку и прекратит работу
            System.out.println("Массивы не равнозначны");
            return new int[0]; // а так - вернет пустой массив, и делайте с ним что хотите.
        } else {
            int[] arrayResult = new int[len];
            for (int i = 0; i < len; i++) {
                if (array1[i] < array2[i]) {
                    int temp = array1[i];
                    array1[i] = array2[i];
                    array2[i] = temp;
                }
                arrayResult[i] = (array1[i] - array2[i]);
            }
            return arrayResult;
        }
    }

    //    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    //    и возвращающий новый массив, каждый элемент которого равен частному элементов
    //    двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
    //    оповестить пользователя. Важно: При выполнении метода единственное исключение,
    //    которое пользователь может увидеть -RuntimeException, т.е. ваше
    public static int[] divide(int[]array1, int[]array2) {
        int len = array1.length;
        int[] arrayResult = new int[len];
        if (len != array2.length) {
            try {  // тут мы искусственно обращаемся к несуществующему элементу массива, что бы вызвать ошибку.
                if (len > array2.length) {
                    int x = array2[len];
                } else {
                    int x = array1[array2.length];
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Массивы не равнозначны");
            }
        }
        else {
            for (int i = 0; i < len; i++) {
                try { // ловим ошибку деления на 0
                    arrayResult[i] = array1[i] / array2[i];
                } catch(ArithmeticException ex){
                    System.out.println("Деление на 0 невозможно " + (i+1) + "й элемент второго массива = 0 " + ex);
                }
            }
        }
        return arrayResult;
    }
}
