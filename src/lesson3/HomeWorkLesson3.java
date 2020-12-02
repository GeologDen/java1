package lesson3;

import java.util.Scanner;

public class HomeWorkLesson3 {
    public static void main(String[] args) {

        //Задание 1. Написать программу, которая загадывает случайное число от 0 до 9.
        guessGame();


        //Задание 1. Написать программу, которая загадывает случайное число от 0 до 9.
//        wordGame();
    }


    private static void guessGame() {                                   //Задание 1.
        Scanner scanner = new Scanner(System.in);
        int maxTryCount = 3;
        int userAnsver;
        int userDecisionToPlay;

        do {
            int answer = (int) (Math.random() * 10);
            int tryCount = 0;

            System.out.print("\nУгадайте число от 0 до 9\nВведите ответ: ");

            do {
                userAnsver = scanner.nextInt();
                if (userAnsver < answer) {
                    System.out.println("\nВы ввели слишком маленькое число.");
                    tryCount++;
                } else if (userAnsver > answer) {
                    System.out.println("\nВы ввели слишком большое число.");
                    tryCount++;
                } else {
                    System.out.println("\nПоздравляю, вы угадали!!!\nПравильный ответ: " + answer);
                    break;
                }
                System.out.print("Введите ответ: "); // не сообразил как убрать вывод этой строки в случае проигрыша.

            } while (tryCount < maxTryCount);

            if (tryCount == maxTryCount) {
                System.out.println("\nВы проиграли!\nПравильный ответ: " + answer);
            }

            System.out.println("\nПовторить игру еще раз? 1 – да / 0 – нет");
            userDecisionToPlay = scanner.nextInt();

            if (userDecisionToPlay == 0) {
                System.out.println("Game Over");
                break;
            }
        } while (userDecisionToPlay == 1);

    }

//    private static void wordGame() {                                    //Задание 2.
//
//        Scanner scanner = new Scanner(System.in);
//        String[]words =  {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
//                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
//                "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        int wordIndex = (int)(Math.random() * 25);
//        String randomWord = words[wordIndex];
//        System.out.println(randomWord);
//        String userWord = scanner.nextLine();
//
//    }

}

