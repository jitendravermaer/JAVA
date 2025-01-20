
import java.util.Scanner;

public class MultiDimensionalArray {

    static void printArray(int[][] arr) {
        // System.out.println(arr[i]); 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        // arr[1][2] = 22;

        System.out.println("Enter " + r * c + " elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] arr2 = {{00, 01, 02}, {10, 11, 12}};

        printArray(arr2);
        printArray(arr);
    }
}
