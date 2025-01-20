
public class PairSum {

    static int pairSum(int[] arr, int targetSum) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 2};

        int targetSum = 7;
        // int count = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] + arr[j] == targetSum) {
        //             count++;
        //         }
        //     }
        // }
        // System.out.println("Pairs of target sum is " + count);
        int ans = pairSum(arr, targetSum);
        // System.out.println(pairSum(arr, targetSum));
        System.out.println("Pairs of target sum is " + ans);
    }
}
