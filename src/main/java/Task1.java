/*1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception*/

        import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        try {
            int n = in.nextInt();

            if (n < 0) {
                System.out.println("Number < 0 negative");
            } else if (n > 0) {
                System.out.println("Number > 0 positive");
            } else if (n == 0);
        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
            {
                //System.out.println("Number is zero");
            }
        }
    }
}