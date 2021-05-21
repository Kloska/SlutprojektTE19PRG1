import java.awt.*;
import java.awt.event.*;

public class AL extends Frame implements WindowListener,ActionListener {
    Button b;
    private int numClicks = 0;
    static AL Fonster = new AL("Clicker");

    public static void main(String[] args) {
        Fonster.setSize(700,500);
        Fonster.setVisible(true);
    }

    public AL(String title) {
        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        b = new Button("Klicka här");
        b.setPreferredSize( new Dimension(700,500));
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        numClicks++;
        b.setLabel("Klicks: " + numClicks);
        b.setSize(Fonster.getWidth(), Fonster.getHeight());
    }

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}