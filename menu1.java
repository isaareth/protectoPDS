import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel extends JPanel {
    private JButton botonEmocion;
    private JButton botonReconocer;
    private JLabel jcomp3; 
    private JTextField idEmocion;
    private JLabel lbemocion;

    public MyPanel() {
        //construct components
        botonEmocion = new JButton ("Registrar mi emoción");
        botonReconocer = new JButton ("Reconocer mi emoción");
        jcomp3 = new JLabel ("¿Qué deseas hacer el día de hoy?");

        //adjust size and set layout
        setPreferredSize (new Dimension (332, 222));
        setLayout (null);

        //add components
        add (botonEmocion);
        add (botonReconocer);
        add (jcomp3);

        //set component bounds (only needed by Absolute Positioning)
        botonEmocion.setBounds (60, 70, 195, 25);
        botonReconocer.setBounds (60, 115, 195, 25);
        jcomp3.setBounds (65, 25, 225, 30);
        
        botonEmocion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                lbemocion = new JLabel ("Emoción: ");
                idEmocion = new JTextField (5);
                
                setPreferredSize (new Dimension (332, 222));
                setLayout (null);
                
                add(lbemocion);
                add(idEmocion);
                
                lbemocion.setBounds(60, 90, 100, 25);
                idEmocion.setBounds(115, 90, 160, 25);
                
                
                
                // Obtener el texto ingresado por el usuario en las cajas de texto
                String emocion = idEmocion.getText();
                
                //String contraseña = new String(idPasword.getPassword());
                JOptionPane.showMessageDialog(MyPanel.this, "Cómo te sientes hoy?");
            }
        });
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }
}
