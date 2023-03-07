import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 - This code creates a main frame window using the Java Swing library. 
 - The window is titled "Hello", is 600 pixels wide and 400 pixels high, 
   and has an exit button that will close the window when clicked. 
 - The window is also set to be visible when it is created.
 */

public class MainFrame extends JFrame {
    public void init() {
        setTitle("Hello");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        }
}
