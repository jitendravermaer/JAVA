import java.util.*;

class LinkedList {
    public static <E> void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("Jitendra");
        list.addLast("Verma");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }

}
