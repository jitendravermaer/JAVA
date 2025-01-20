
class ArrayExample {

    void SumOfArray() {

        int[] arr = {9, 8, 7, 6, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of Array : " + sum);

    }
}

public class SumOfArray {

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.SumOfArray();
    }
}
