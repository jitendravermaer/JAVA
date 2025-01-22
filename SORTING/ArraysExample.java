import java.util.*;

public class ArraysExample {
    public static void main(String[] args) {
        int array[] = new int[] { 5, 1, 7, 3, 0, 4, 6, 2, 10, 9, 8 };
        // int array[]={0,1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        Arrays.sort(array, 3, 6);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int x = Arrays.binarySearch(array, 6);
        System.out.println(x);

        int y = Arrays.binarySearch(array, 6, 9, 8);
        System.out.println(y);

    }
}
