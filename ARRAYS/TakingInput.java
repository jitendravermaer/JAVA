
import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter index " + i + " element : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Element of Index " + i + " is " + arr[i]);
        }

        for (int i = 0; i < size; i++) {
            System.out.print("" + arr[i] + " ");
        }
    }
}
