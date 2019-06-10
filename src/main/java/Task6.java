/*"6. Write a program that will enter numbers from the keyboard.
        The code for reading numbers from the keyboard must be in the readData method.
        The code inside the readData is wrapped in a try..catch.
        If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
        Numbers output from a new line preserving the order of input."*/


import java.util.Scanner;

public class Task6 {

        private static final int FROM = 1;
        private static final int TO = 5;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число от 1 до 5: ");
            while (true) {
                String line = sc.nextLine();
                if (isNumber(line)) {
                    int value = Integer.valueOf(line);
                    if (isInRange(value, FROM, TO)) {
                        System.out.println("Правильный ввод. Делаем что-то очень важное.");
                        break;
                    } else {
                        System.out.printf("Я же просил ввести число от %d до %d. Еще раз...%n", FROM, TO);
                    }
                } else {
                    System.out.println("Я же просил ввести число. Еще раз...");
                }
            }
        }

        private static boolean isInRange(int value, int from, int to) {
            return value >= from && value <= to;
        }

        private static boolean isNumber(String str) {
            return str.matches("-?\\d+");
        }
    }