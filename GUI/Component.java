import java.awt.*;
import java.applet.*;

public class Component extends Applet {
    Label l1, l2;
    TextField t1, t2;
    Button b1;

    public void init() {
        l1 = new Label("First Number");
        l2 = new Label("Second Number");
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("Add");
        setLayout(null);
        l1.setBounds(30, 50, 100, 20);
        l2.setBounds(30, 100, 100, 20);
        t1.setBounds(150, 50, 100, 20);
        t2.setBounds(150, 100, 100, 20);
        b1.setBounds(100, 150, 80, 20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
    }
    
}
