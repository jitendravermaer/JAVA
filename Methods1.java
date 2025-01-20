
import java.util.Scanner;

class Algebra {

    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class Methods1 {

    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = obj.add(a, b);
        System.out.println("Sum of input numbers is " + ans);
    }
}
