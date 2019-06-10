/*1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0
 throw your own exception*/
// For Task1
public class MyException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public MyException(String message, int num) {

        super(message);
        number = num;
    }

}