//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel extends JPanel {
    private JLabel jcomp1;
    private JLabel emocion;
    private JLabel entorno;
    private JButton botonGuardar;

    public MyPanel() {
        //construct components
        jcomp1 = new JLabel ("Usted ha ingresado lo siguiente:");
        emocion = new JLabel ("Emoción: Felicidad");
        entorno = new JLabel ("Entorno: Universidad");
        botonGuardar = new JButton ("Guardar");

        //adjust size and set layout
        setPreferredSize (new Dimension (338, 213));
        setLayout (null);

        //add components
        add (jcomp1);
        add (emocion);
        add (entorno);
        add (botonGuardar);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (75, 35, 200, 30);
        emocion.setBounds (110, 75, 120, 25);
        entorno.setBounds (105, 105, 145, 30);
        botonGuardar.setBounds (115, 145, 100, 25);

        // Agregar un ActionListener al botón 
            botonGuardar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(MyPanel.this, "Información Guardada Exitosamente");                    
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
