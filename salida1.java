import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;

    public MyPanel() {
        //construct components
        jcomp1 = new JLabel ("¡Sigue así!");
        jcomp2 = new JLabel ("La felicidad es una emoción muy agradable");
        jcomp3 = new JLabel ("Sigue frecuentando tu Universidad");

        //adjust size and set layout
        setPreferredSize (new Dimension (306, 180));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (115, 35, 100, 25);
        jcomp2.setBounds (30, 65, 260, 40);
        jcomp3.setBounds (50, 100, 205, 30);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }
}
