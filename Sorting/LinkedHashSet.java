
import java.util.*;

public class LinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("One");
        h.add("Two");
        h.add("Three");
        h.add("Four");
        System.out.println(h);
    }

    public void add(String str) {
        java.util.LinkedHashSet<String> h = new java.util.LinkedHashSet<String>();
        h.add("One");
        h.add("Two");
        h.add("Three");
        h.add("Four");
        System.out.println(h);
    }

}
