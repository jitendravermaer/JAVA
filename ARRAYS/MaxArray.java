
class ArrayExample {

    void maxArray() {
        int[] arr = {5, 6, 7, 3, 4, 9, 2};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Value : " + max);
    }
}

public class MaxArray {

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.maxArray();
    }
}
