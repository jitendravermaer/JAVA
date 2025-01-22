import java.util.*;

public class SortedSet {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("D");
        t.add("C");
        t.add("B");
        t.add("@");
        t.add("5");
        // number>specialchar>strings
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet("D"));
        System.out.println(t.tailSet("B"));
        System.out.println(t.subSet("B", "D"));
        System.out.println(t.comparator());

    }
}
