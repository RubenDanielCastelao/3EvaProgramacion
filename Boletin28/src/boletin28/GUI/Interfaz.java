package boletin28.GUI;

import java.awt.Color;
import java.awt.ComponentOrientation;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Interfaz {
    
    JFrame marco;
    JPanel panel;
    JLabel etiqueta1, etiqueta2;
    JTextField lTexto1;
    JPasswordField lTexto2;
    JTextArea aTexto;
    JButton b1, b2;
    
    public void iniciar(){
        marco = new JFrame("Boletin 28");
        panel = new JPanel();
        etiqueta1 = new JLabel("NOME");
        etiqueta2 = new JLabel("PASSWORD");
        lTexto1 = new JTextField();
        lTexto2 = new JPasswordField();
        aTexto = new JTextArea("   Area de texto");
        b1 = new JButton("PREMER");
        b2 = new JButton("LIMPAR");
        
        
        marco.setSize(800, 800);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
        panel.setBounds(25, 25, 750, 750);
        panel.setLayout(null);
        
        etiqueta1.setBounds(100,40,100,50);
        lTexto1.setBounds(350, 40, 300, 70);
        etiqueta2.setBounds(100,150,100,50);
        lTexto2.setBounds(350, 150, 300, 70);
        lTexto2.setEchoChar('⚫');
        
        aTexto.setBounds(90, 300, 500, 205);
        
        b1.setBounds(125, 650, 210, 50);
        
        
        b2.setBounds(450, 650, 210, 50);
        
        
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(lTexto1);
        panel.add(lTexto2);
        panel.add(aTexto);
        panel.add(b1);
        panel.add(b2);
        marco.add(panel);
    }
}
