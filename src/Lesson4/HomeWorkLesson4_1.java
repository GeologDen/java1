package Lesson4;

import java.util.Random;
import java.util.Scanner;


public class HomeWorkLesson4_1 {

    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;   // Лучше не объявлять как final, а поставить в зависимость от SIZE и вынести в
                                        //отдельный метод winCondition()
    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = '0';

    static final String HEADER_FIRST_EMPTY = "⚡";
    static final String EMPTY = " ";

    static char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();

    static int moveCount = 0;

    public static void main(String[] args) {
        turnGame();


    }

    private static void turnGame() {
        initMap();

        printMap();

        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();

        printMapRow();
    }


    private static void printMapHeader() {
        System.out.println();
        System.out.print(HEADER_FIRST_EMPTY + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRow() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {

//            winCondition();

            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);

        }

    }

    private static void winCondition() {
        // if (SIZE < 3) { победа при SIZE клетках }
        // dotsToWin = SIZE;
        // if (SIZE <= 5) { победа при 3 клетках }
        // dotsTOWin = 3;
        // if (SIZE > 5 || SIZE < 10) { победа при 4 клетках }
        // dotsTOWin = 4;
        // if (SIZE >= 10) { победа при 5 клетках }
        // dotsTOWin = 5;

    }


    private static void humanTurn() {
        int rowNumber = 0;
        int columnNumber = 0;

        System.out.println("\nХод человека. Введите номера строки и столбца.");

        do {
            System.out.print("Строка =   ");
            if (in.hasNextInt()) {
                rowNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число от 0 до " + SIZE + "\n");
                continue;
            }

            System.out.print("Столбец =  ");
            if (in.hasNextInt()) {
                columnNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число от 0 до " + SIZE + "\n");
                continue;

            }

        } while (!isCellValid(rowNumber, columnNumber));

        map[rowNumber - 1][columnNumber - 1] = DOT_HUMAN;
        moveCount++;
    }

    private static boolean isCellValid(int rowNumber, int columnNumber) {
        return isCellValid(rowNumber, columnNumber, false);

    }

    private static boolean isCellValid(int rowNumber, int columnNumber, boolean isAI) {

        if (checkValue(rowNumber, columnNumber, isAI)) return false;

        return !checkEmpty(rowNumber, columnNumber, isAI);
    }

    private static boolean checkValue(int rowNumber, int columnNumber, boolean isAI) {
        if (!isAI && (rowNumber < 1 || rowNumber > SIZE || columnNumber < 1 || columnNumber > SIZE)) {
            System.out.println("\nПроверьте значение строки и столбца");
            return true;
        }
        return false;
    }

    private static boolean checkEmpty(int rowNumber, int columnNumber, boolean isAI) {
        if (map[rowNumber - 1][columnNumber - 1] != DOT_EMPTY) {
            if (!isAI) {
                System.out.println("\nЯчейка занята");
            }
            return true;
        }
        return false;
    }

    private static void checkEnd(char symb) {
        boolean isEnd = false;

        if (checkWin(symb)) {
            String winMessage;

            if (symb == DOT_HUMAN) {
                winMessage = "\nПобедил человек!!!";

            } else {
                winMessage = "\nПобедил компуктер!!!!";
            }

            isEnd = true;
            System.out.println(winMessage);

        }


        if (!isEnd && isMapFull()) {
            System.out.println("\nНичья!");
            isEnd = true;
        }

        if (isEnd) {
            System.exit(0);
        }
    }

    //С учётом winCondition() проверка должна делаться разделением игрового поля на квадраты со стороной DOTS_TO_WIN
    //проверкой победы checkWin() в каждом (но вот как?..)

    private static boolean checkWin(char symb) { //Общий метод проверки победы по горизонталям/вертикалям,
                                                 // и диагоналям, проходящим через центр


        int leftDiagonalFiled = 0;
        int rightDiagonalFiled = 0;

        for (int i = 0; i < SIZE; i++) {

            int vertCellsFilled = 0;
            int horisCellsFilled = 0;

            for (int j = 0; j < SIZE; j++) {

                if (map[i][j] == symb) vertCellsFilled++;                           // Вертикаль
                if (map[j][i] == symb) horisCellsFilled++;                          // Горизонталь
                if (map[i][j] == symb && (i == j)) leftDiagonalFiled++;             // Диагональ слева вниз
                if (map[i][j] == symb && (i == SIZE - j - 1)) rightDiagonalFiled++; // Диагональ слева вверх

            }

            if (vertCellsFilled == SIZE /*DOTS_TO_WIN*/ || horisCellsFilled == SIZE /*DOTS_TO_WIN*/) return true;

        }

        return leftDiagonalFiled == SIZE /*DOTS_TO_WIN*/ || rightDiagonalFiled == SIZE /*DOTS_TO_WIN*/;

    }

    private static boolean isMapFull() {
        return moveCount == (SIZE * SIZE);

    }

    private static void aiTurn() {
        int rowNumber = 0;
        int columnNumber = 0;

        System.out.println("\nХод компьютера\n");
        do {
            rowNumber = random.nextInt(SIZE) + 1;
            columnNumber = random.nextInt(SIZE) + 1;


            if (moveCount >= SIZE - 1) {                    // за ход до победы включается возможность помешать игроку

                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {

                        if (map[i][j] == DOT_EMPTY) {       // по хорошему нужно проводить проверку через checkEmpty(),
                                                            // но оно не работает...

                            map[i][j] = DOT_HUMAN;
                            if (checkWin(DOT_HUMAN)) {

                                rowNumber = i + 1;
                                columnNumber = j + 1;

                            }
                            map[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }

        } while (!isCellValid(rowNumber, columnNumber, true));

        map[rowNumber - 1][columnNumber - 1] = DOT_AI;
        moveCount++;
    }

}



