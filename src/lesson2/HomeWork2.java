package lesson2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {


        // Задание 1. Замена элементов в массиве (0 на 1).
        changeArrayElements(new int[]{0, 0, 0, 1, 1, 1});

        // Задание 2. Заполнить массив значениями {0, 3, 6, 9, 12, 15, 18, 21}
        arrayFillThree(new int[8]);

        // Задание 3. В заданном массиве числа меньше 6 умножить на 2.
        arrayMultiplyTwo(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});

        // Задание 4. Заполнить диагональные элементы единицами.
        arrayFillOne(7);

        // Задание 5. Минимальный и максимальный элементы.
        arrayMinMax(new int[]{4, 1, 99, 4, 0, 6, 11});

        // Задание 6. Вернуть true если в массиве есть место где сумма левой и правой части массива равны.
        System.out.println(checkBalance(new int[]{1, 1, 1, 3, 2, 6, 1, 1}));


        // Задание 7. Смещение элементов массива.
        moveArray(new int[]{1, 2, 3, 4}, 2);


        // Задание 8. Заполнение массива по спирали.
        // Не сделано. Нашел решение в интернете, но до конца не понял.
    }


    private static void changeArrayElements(int[] array) {                  // Задание 1.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.printf(Arrays.toString(array));
    }

    private static void arrayFillThree(int[] array) {                        // Задание 2.
//        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;

        }
        System.out.println(Arrays.toString(array));
    }


    private static void arrayMultiplyTwo(int[] array) {                      // Задание 3.
        int counter = 6;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < counter) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));

    }


    private static void arrayFillOne(int SIZE) {                            // Задание 4.

        int[][] array = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                array[i][j] = (i == j) || ((SIZE - i - 1) == j) ? 1 : 0;

                System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }

    }

    private static void arrayMinMax(int[] array) {                           // Задание 5.
        Arrays.sort(array);
        System.out.println("Min: " + array[0] + "\n" + "Max: " + array[array.length - 1]);
    }


    private static boolean checkBalance(int[] array) {                       // Задание 6.
        System.out.println();
        int leftSum = 0;
        int rightSum = arraySum(array, 0, array.length);
        boolean result = false;

        for (int i = 0; i < array.length; i++) {

            leftSum += array[i];
            rightSum -= array[i];

            if (leftSum == rightSum) {
                result = true;
            }
        }
        return result;

    }

    private static int arraySum(int[] array, int first, int last) {
        int sum = 0;
        for (int i = first; i < last; i++) {
            sum += array[i];
        }
        return sum;
    }


    //  ***********************************

    private static void moveArray(int[] array, int n) {                     // Задание 7

        int moveNumber = n % array.length;
        if (moveNumber < 0) {
            moveLeft(array, moveNumber);

        } else {
            moveRight(array, moveNumber);
        }
        System.out.println("Массив смещен на " + n + "\n" + Arrays.toString(array));
    }

    private static void moveLeft(int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstElement;
        }

    }

    private static void moveRight(int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int lastElement = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastElement;
        }
    }


}

