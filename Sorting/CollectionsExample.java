import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(20);
        v.add(50);
        v.add(10);
        v.add(30);

        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);
        Collections.reverse(v);
        System.out.println(v);
        Collections.shuffle(v);
        System.out.println(v);
        Collections.swap(v, 1, 3);
        System.out.println(v);
        int x = Collections.binarySearch(v, 30);
        System.out.println(x);
        int y = (int) Collections.min(v);
        System.out.println(y);
        int z = (int) Collections.max(v);
        System.out.println(z);

    }
}
