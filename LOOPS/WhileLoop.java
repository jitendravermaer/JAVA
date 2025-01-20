
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num1 = 1;

        while (num1 <= n) {
            System.out.println(+num1);
            num1++;
        }

        int num2 = 1;
        int sum = 0;
        while (num2 <= n) {
            sum += num2;
            num2++;
        }
        System.out.println("Sum of " + n + " is " + sum);
    }
}
