import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put(1, "Jeetu");
        hm.put(null, null);
        hm.put(2, "Rohan");
        hm.put(3, "Sona");
        hm.put(null, null);

        System.out.println(hm);
        System.out.println(hm.get(3));
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
    }
}
