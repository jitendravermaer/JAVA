import java.util.*;

public class ArrayExample1 {
    public static <E> void main(String[] args) {
        ArrayList nameList = new ArrayList<E>(4);
        nameList.add("Rahul");
        nameList.add("Romesh");
        nameList.add("Richa");
        nameList.add(1, "Ajay");
        Iterator it = nameList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
