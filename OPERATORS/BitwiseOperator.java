
public class BitwiseOperator {

    public static void main(String[] args) {
        int p = 9;
        int q = 10;

        System.out.println(p | q); // OR
        System.out.println(p & q); // AND
        System.out.println(p ^ q); // XOR

        System.out.println(p << 1); // LEFT SHIFT
        System.out.println(p << 2);

        System.out.println(q >> 1); // RIGHT SHIFT
        System.out.println(q >> 2);

        System.out.println(~q); // COMPLEMENT
    }
}
