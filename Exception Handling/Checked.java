import java.io.IOException;

public class Checked {
    public static void main(String[] args) {
        try {
            throw new IOException();
            // System.out.println("After Excetion");
        } catch (IOException e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }
}
