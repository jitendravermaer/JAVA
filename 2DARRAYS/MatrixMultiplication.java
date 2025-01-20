
import java.util.Scanner;

public class MatrixMultiplication {

    static void printArray(int[][] arr) {
        // System.out.println(arr[i]); 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplicationMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        int[][] multiply = new int[r1][c2];
        if (r2 == c1) {

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        multiply[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
        } else {
            System.out.println("Wrong Input - Addition not possible....");
        }

        printArray(multiply);

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

        multiplicationMatrix(arr1, r1, c1, arr2, r2, c2);
    }
}
