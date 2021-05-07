import javax.swing.*;
import java.awt.*;

/**
 * Created 2021-04-27
 *
 * @author
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tegel Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        JButton Button = new JButton("Click");
        Button.setBounds(50,100,95,30);
    }

}