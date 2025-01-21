import java.io.*;

public class FileRead {
    public static void main(String[] args) throws IOException {

        BufferedReader bR = new BufferedReader(new FileReader("./myfile.txt"));
        char[] s = new char[20];
        bR.read(s, 2, 15);
        System.out.println(s);

        bR.close();
    }
}
