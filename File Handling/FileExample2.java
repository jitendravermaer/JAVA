import java.io.*;

class FileExample2 {
    public static void main(String[] args) throws IOException {
        int i;
        try (FileOutputStream fout = new FileOutputStream("./myfile.txt", true)) {
            String s = "TATA";

            char ch[] = s.toCharArray();
            for (i = 0; i < s.length(); i++)
                fout.write(ch[i]);
            fout.close();
        }
    }
}