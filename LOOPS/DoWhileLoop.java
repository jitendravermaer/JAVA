
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num1 = 1;
        do {
            System.out.println(num1);
            num1++;
        } while (num1 <= n);
    }
}
