/*"5. Throw a NullPointerException from the method iCanThrowException();
        Handle it in the main method.
public class Main {

    public static void main(String[] args) {
        iCanThrowException();
    }

    public static void iCanThrowException() {

    }

}"*/
public class Task5 {
    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException e) {
        System.out.println(e.toString());
        }
        System.out.println("End of method Main");
    }

    public static void iCanThrowException() {
throw new NullPointerException();
    }
}
