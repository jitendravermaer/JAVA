
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original_n = n;

        int numOfDigits = 0;
        int sumOfDigits = 0;

        while (n > 0) {
            n /= 10;
            numOfDigits++;
        }

        System.out.println("Number of digits in " + original_n + " = " + numOfDigits);

        while (original_n > 0) {
            sumOfDigits += original_n % 10;
            original_n /= 10;
        }

        System.out.println("Sum of digit = " + sumOfDigits);

        int num = 123456789;
        int reverseNum = 0;
        while (num > 0) {
            reverseNum *= 10;
            reverseNum += (num % 10);
            num /= 10;
        }
        System.out.println("Reverse of number : " + reverseNum);
    }
}
