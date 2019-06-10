import java.util.HashSet;
import java.util.Set;

/*
"7. In the Solution class, correct a couple of equals / hashCode methods in accordance with the rules for implementing these methods (check details with your favorite search engine).
        Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.
*/
public class Task7 {
    private final String first, last;

    public Task7(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static void main(String[] args) {
        Set<Task7> s = new HashSet<>();
        s.add(new Task7("Donald", "Duck"));
        System.out.println(s.contains(new Task7("Donald", "Duck")));
    }
}

/*
"
        "1) The result should be true;
        2) Do not change the main method;"
*/


 /* import java.util.HashSet;
  import java.util.Set;

public class Task7 {
    private final String first, last;

    public Task7 (String first, String last) {
        this.first = first;
        this.last = last;
    }

   *//* public boolean equals(Task7 n)
    {
        if (n.first == null) return false;
        if (n.last == null) return false;
        if (n == null) return false;
        if (n.getClass() != this.getClass()) return false;
        return n.first.equals(first) && n.last.equals(last);
    }*//*

    *//*public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }*//*

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Task7)) return false;

        Task7 solution = (Task7) o;

        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
        if (last != null ? !last.equals(solution.last) : solution.last != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Task7> s = new HashSet<Task7>();
        s.add(new Task7("Donald", "Duck"));
        System.out.println(s.contains(new Task7("Donald", "Duck")));
    }
}*/