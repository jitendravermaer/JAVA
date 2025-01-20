
public class Swap {

    static void swap(int x, int y) {

        int temp = x;
        x = y;
        y = temp;
        System.out.println("a = " + x);
        System.out.println("b = " + y);

    }

    static void swapAddSub(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("a = " + x);
        System.out.println("b = " + y);

    }

    public static void main(String[] args) {
        int a = 1000;
        int b = 18;

        swap(a, b);
        swapAddSub(a, b);
    }
}
