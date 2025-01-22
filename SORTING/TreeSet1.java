import java.util.*;

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return (title);
    }

    public double getPrice() {
        return (price);
    }
}

class MyComparator implements Comparator {
    public int campare(Object o1, Object o2) {
        Book book1 = (Book) o1;
        Book book2 = (Book) o2;
        if (book1.getPrice() < book2.getPrice()) {
            return (-1);
        } else {
            return (1);
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }
}

public class TreeSet1 {
    public static void main(String[] args) {
        // TreeSet t = new TreeSet();
        // t.add(20);
        // t.add(10);
        // t.add(10);
        // t.add(15);

        Book b1, b2, b3, b;
        b1 = new Book("PHP", 300);
        b2 = new Book("Java", 600);
        b3 = new Book("C++", 400);
        TreeSet t = new TreeSet(new MyComparator());
        t.add(b1);
        t.add(b2);
        t.add(b3);

        Iterator it = t.iterator();
        while (it.hasNext()) {
            b = (Book) it.next();
            System.out.println(b.getTitle() + "  " + b.getPrice());
        }
    }

}
