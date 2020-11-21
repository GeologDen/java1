package lesson1;

public class Main {
    public static void main(String[] args) {


        //Задание 3
        System.out.println(testCalculation(2, 3, 4, 5));

        //Задание 4
        System.out.println(testSum(10, 5));

        //Задание 5
        testPosNeg(10);

        //Задание 6
        System.out.println(testNegNumb(-10));

        //Задание 7
        tetsHelloNme("Тимофей");

        //Задание 8
        testLeapYear(2020);

    }

    private static double testCalculation(int a, int b, int c, int d) {
        return a * (b + (1.0 * c / d));
    }

    private static boolean testSum(int a, int b) {
        return (a + b) >= 10 && 20 >= (a + b);
    }

    private static void testPosNeg(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean testNegNumb(int a) {
        return a < 0;
    }

    private static void tetsHelloNme(String a) {
        System.out.println("Привет, " + a + "!");
    }

    private static void testLeapYear(int a) {
        if (((a % 400 == 0) || (a % 4 == 0)) && (a % 100 != 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год нормальный");
        }
    }
}
