package ilmoitin;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class Ilmoitin implements Runnable {

    private JFrame frame;
    private JButton nappi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private JLabel label1;
    private JTextField textField;

    @Override
    public void run() {
        frame = new JFrame("ikkuna");

        frame.setPreferredSize(new Dimension(500, 300));

     

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {

               buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        textField = new JTextField();
        nappi = new JButton();
        label1 = new JLabel();

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Ikuna");
       
        container.setLayout(new java.awt.GridLayout(3, 1));

        textField.setBackground(new java.awt.Color(255, 255, 255));
        textField.setText("textField");
        container.add(textField);

        nappi.setLabel("Päivitä");
        nappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        container.add(nappi);

        
        
        container.add(label1);
    }  
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.label1.setText(textField.getText());
        this.textField.setText("");
    }  


public JFrame getFrame() {
        return frame;
    }
}
