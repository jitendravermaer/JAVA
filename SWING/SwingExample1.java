import javax.swing.*;

public class SwingExample1 extends JFrame {

    public SwingExample1() {

    }

    public SwingExample1(String s) {
        super(s);
    }

    public static void main(String[] args) {
        // JFrame jf = new JFrame("SwingExample1");
        SwingExample1 jf = new SwingExample1("SwingExample1");

        jf.setSize(300, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
