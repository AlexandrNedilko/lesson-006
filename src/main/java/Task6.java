/*"6. Write a program that will enter numbers from the keyboard.
        The code for reading numbers from the keyboard must be in the readData method.
        The code inside the readData is wrapped in a try..catch.
        If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
        Numbers output from a new line preserving the order of input."*/


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        List <Integer> list = new LinkedList <Integer> ();
         readData(list);

        for (int b:list) {
            System.out.print(b);
            System.out.print(" ");
        }
    }

    private static void readData(List list) {
        Scanner sc = new Scanner(System.in);
        try {
            int tmp= 0;
            boolean b = true;

            System.out.println("Введите число  : ");
            while (b) {
                    tmp++;
                    String line = sc.nextLine();
                    int value = Integer.valueOf(line);
                    list.add(value);
                    System.out.println("  Еще раз...");
                    if(tmp==5) b=false;
                }
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {  //Закрыть Scanner!!!
            sc.close();
        }
    }
}
