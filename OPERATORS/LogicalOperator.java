
public class LogicalOperator {

    public static void main(String[] args) {
        int p = 15;
        int q = 10;
        int r = 5;

        System.out.println((p > q) && (p > r));  //T
        System.out.println((p > q) && (p < r));  //F   

        System.out.println((r < q) || (p < q));  //T
        System.out.println((p > q) || (q > r));  //T
        System.out.println((p < q) || (q < r));  //F

        System.out.println(!(p == q));  //T
        System.out.println(!(p > q));  //F

    }
}
