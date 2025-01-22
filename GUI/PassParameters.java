import java.applet.*;
import java.awt.*;

// <applet code="PassParameters" width="300" height="220"><param name="site" value="www.jsblog.com"></param></applet>

public class PassParameters extends Applet {

    private String defaultMessage = "Hello";

    public void paint(Graphics g) {
        String s1 = this.getParameter("Message");
        if (s1 == null) {
            s1 = defaultMessage;
        }
        g.drawString(s1, 50, 25);
    }
}
