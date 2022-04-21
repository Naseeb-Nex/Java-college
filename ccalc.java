import javax.swing.*;
import java.awt.event.*;

public class ccalc extends JFrame {
    private JTextField txt;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b11;
    private JButton b12;
    private JButton b13;

    ccalc(){
        setLayout(null);
        setSize(400,600);

        // textfield
        txt = new JTextField();
        txt.setBounds(45,50,300,40);
        add(txt);

        b1 = new JButton("C");
        b1.setBounds(45,100,75,50);
        add(b1);

        b2 = new JButton("%");
        b2.setBounds(120,100,75,50);
        add(b2);

        b3 = new JButton("/");
        b3.setBounds(195,100,75,50);
        add(b3);

        b4 = new JButton("*");
        b4.setBounds(270,100,75,50);
        add(b4);

        b5 = new JButton("7");
        b5.setBounds(45,140,75,50);
        add(b5);

        b6 = new JButton("8");
        b6.setBounds(120,140,75,50);
        add(b6);

        b7 = new JButton("9");
        b7.setBounds(195,140,75,50);
        add(b7);

        b8 = new JButton("-");
        b8.setBounds(270,140,75,50);
        add(b8);

        setVisible(true);
    }
    public static void main(String[] args) {
        new ccalc();
        
    }
}
