import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calculator extends JFrame{
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
    private int r;
    private String op;

    calculator(){
        setLayout(null);
        setSize(400,600);

        // textfield
        txt = new JTextField();
        txt.setBounds(45,50,300,40);
        add(txt);

        b1 = new JButton("C");
        b1.setBounds(45,100,70,40);
        add(b1);

        b2 = new JButton("%");
        b2.setBounds(120,100,70,40);
        add(b2);

        b3 = new JButton("/");
        b3.setBounds(195,100,70,40);
        add(b3);

        b4 = new JButton("*");
        b4.setBounds(270,100,75,40);
        add(b4);

        b5 = new JButton("7");
        b5.setBounds(45,140,70,40);
        add(b5);

        b6 = new JButton("8");
        b6.setBounds(120,140,70,40);
        add(b6);

        b7 = new JButton("9");
        b7.setBounds(195,140,70,40);
        add(b7);

        b8 = new JButton("-");
        b8.setBounds(270,140,75,40);
        add(b8);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new calculator();
    }
}
