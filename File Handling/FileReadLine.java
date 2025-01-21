import java.io.*;

public class FileReadLine {
    public static void main(String[] args) throws IOException {

        BufferedReader bR = new BufferedReader(new FileReader("./myfile.txt"));
        String s1;

        while ((s1 = bR.readLine()) != null) {
            System.out.println(s1);
        }

        bR.close();
    }
}
