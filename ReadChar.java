
import java.util.Scanner;

public class ReadChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character ");
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        System.out.println("Character is " + ch1 + " and " + ch2);
    }
}
