import java.io.*;

public class FileBuffered {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter("./myfile.txt", true));
        bf.write("Computer");
        bf.close();
    }
}
