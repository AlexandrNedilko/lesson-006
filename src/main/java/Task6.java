/*"6. Write a program that will enter numbers from the keyboard.
        The code for reading numbers from the keyboard must be in the readData method.
        The code inside the readData is wrapped in a try..catch.
        If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
        Numbers output from a new line preserving the order of input."*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Task6 {
    public static void main(String[] args) {
        //public static void readData () {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<Integer>();
            boolean bool = true;
            while (bool)
                try {
                    int i = Integer.parseInt(reader.readLine());
                    list.add(i);
                } catch (Exception e) {
                    Iterator iterator = list.iterator();
                    while (iterator.hasNext())
                        System.out.println(iterator.next());
                    bool = false;
                }
        }
    }