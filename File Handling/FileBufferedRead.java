import java.io.*;

public class FileBufferedRead {
    public static void main(String[] args) throws IOException {
        int ch;
        BufferedReader bR = new BufferedReader(new FileReader("./myfile.txt"));

        while ((ch = bR.read()) != -1) {
            System.out.print((char) ch);
        }
        bR.close();
    }
}
