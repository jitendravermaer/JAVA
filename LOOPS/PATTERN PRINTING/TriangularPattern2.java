
import java.util.Scanner;

public class TriangularPattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int rows = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= (rows + 1 - i); j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
