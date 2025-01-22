import java.io.File;
import java.io.IOException;

//use any import classes above or brlow,
//we use java.io.* , this is access all import of io.

// import java.io.*;

public class NewFileCreate {
    public static void main(String[] args)
            throws IOException {
        File f1 = new File("C:\\Users\\Administrator\\Documents\\Jitendra.txt");
        f1.createNewFile();
        System.out.println("Is file exist : " + f1.exists());
        f1.delete();
    }
}
