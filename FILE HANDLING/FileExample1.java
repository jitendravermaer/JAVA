import java.io.File;

class FileExample1 {
    public static void main(String[] args) {
        // File f1 = new File("C:\\Users\\Administrator\\Documents\\Typing.txt");
        // File f1 = new File("C:\\Users\\Administrator\\Documents\\Earth.html");
        // File f1 = new
        // File("C:\\Users\\Administrator\\Documents\\Chetna_MarkSheet.pdf");
        File f1 = new File("C:\\Users\\Administrator\\Documents\\linux file.pdf");
        System.out.println("Can file Read : " + f1.canWrite());
        System.out.println("Is file exist : " + f1.exists());
        System.out.println("File name : " + f1.getName());
        System.out.println("Length of file : " + f1.length());
    }
}