// Given 2 numbers a and b. Find a raise to the power b.

import java.util.Scanner;

public class RaisePower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int raisePower = 1;

        for (int i = 1; i <= b; i++) {
            raisePower *= a;
        }
        System.out.println("A raise to the power b is " + raisePower);
    }
}
