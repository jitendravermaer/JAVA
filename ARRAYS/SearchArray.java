
class ArrayExample {

    void searchArray() {
        int[] arr = {5, 6, 7, 3, 4, 9, 2};
        int ele = 4;
        int ansIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                ansIndex = i;
                break;

            }
        }
        System.out.println("Element is find at index : " + ansIndex);
    }
}

public class SearchArray {

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.searchArray();
    }

}
