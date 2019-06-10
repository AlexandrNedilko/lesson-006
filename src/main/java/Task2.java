/*"2. Fix the method with try-catch to get the correct result of division:
public class Main {

    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a / b;
    }
}"*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        try {
            int a = 5;
            int b = 0;
            return a / b;

        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
            System.out.println("Cannot divide by zero...");
        }
       return 0;
    }
}
