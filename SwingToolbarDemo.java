import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class SwingToolbarDemo extends JFrame{
    SwingToolbarDemo(){
        JToolBar bar = new JToolBar("Color");
        JButton blueButton = new JButton();
        JLabel l = new JLabel("Test");
        l.setBounds(10,2,80,10);
        blueButton.setBackground(Color.BLUE);
        blueButton.setToolTipText("Blue Button");
        bar.add(l);
        bar.add(blueButton);
        add(bar, BorderLayout.NORTH);

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingToolbarDemo();
    }
}