
import java.util.Scanner;

public class MatrixAdd {

    static void printArray(int[][] arr) {
        // System.out.println(arr[i]); 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong Input - Addition not possible....");
            return;
        }

        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        printArray(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of matrix 1 : ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns of matrix 1 : ");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter matrix values : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows of matrix 2 : ");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns of matrix 2 : ");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter matrix values : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        addMatrix(arr1, r1, c1, arr2, r2, c2);
    }
}
