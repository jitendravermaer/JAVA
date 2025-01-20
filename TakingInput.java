import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Name :");
        // String name = sc.next();
        String name = sc.nextLine(); 


        // System.out.println("Enter your lucky number :");
        // int num_1 = sc.nextInt();


        System.out.println("Your Name is :"+name);
        // System.out.println("Lucky number is "+num_1);


    }
}