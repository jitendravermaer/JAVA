
import java.util.Scanner;

public class RectangularPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Column : ");
        int rows = sc.nextInt();
        int column = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
