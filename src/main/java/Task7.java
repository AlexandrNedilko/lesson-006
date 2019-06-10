import java.util.HashSet;
import java.util.Set;

/*
7. In the Solution class, correct a couple of equals / hashCode methods in accordance with the rules for implementing these methods (check details with your favorite search engine).
        Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.
        1) The result should be true;
        2) Do not change the main method;
*/
public class Task7 {
    private final String first, last;

    public Task7(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public String toString() {
        return "Task7{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null ||o.getClass() != this.getClass()) {
            return false;
        }
        Task7 obj = (Task7) o;



        return ;
    }

    @Override
    public int hashCode() {

        return 23*first.length() + last.length();
    }

    public static void main(String[] args) {
        Set<Task7> s = new HashSet<>();
        s.add(new Task7("Donald", "Duck"));
        System.out.println(s.contains(new Task7("Donald", "Duck")));
        System.out.println(s.size());
        System.out.println(s.toString());
    }
}
