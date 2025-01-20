import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            int original_n = n;

            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }

            System.out.println("Sum of digits in " + original_n + " = " + sum);
        }
    }
}
