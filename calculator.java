import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calculator extends JFrame implements ActionListener {

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
  private JButton b14;
  private JButton b15;
  private JButton b16;
  private JButton b17;
  private Integer r;
  private String op;

  calculator() {
    setLayout(null);
    setSize(400, 400);

    // textfield
    txt = new JTextField();
    txt.setBounds(45, 50, 300, 40);
    add(txt);

    b1 = new JButton("C");
    b1.setBounds(45, 100, 70, 40);
    add(b1);
    b1.addActionListener(this);

    b2 = new JButton("%");
    b2.setBounds(120, 100, 70, 40);
    add(b2);
    b2.addActionListener(this);

    b3 = new JButton("/");
    b3.setBounds(195, 100, 70, 40);
    add(b3);
    b3.addActionListener(this);

    b4 = new JButton("*");
    b4.setBounds(270, 100, 75, 40);
    add(b4);
    b4.addActionListener(this);

    b5 = new JButton("7");
    b5.setBounds(45, 145, 70, 40);
    add(b5);
    b5.addActionListener(this);

    b6 = new JButton("8");
    b6.setBounds(120, 145, 70, 40);
    add(b6);
    b6.addActionListener(this);

    b7 = new JButton("9");
    b7.setBounds(195, 145, 70, 40);
    add(b7);
    b7.addActionListener(this);

    b8 = new JButton("-");
    b8.setBounds(270, 145, 75, 40);
    add(b8);
    b8.addActionListener(this);

    b9 = new JButton("4");
    b9.setBounds(45, 190, 70, 40);
    add(b9);
    b9.addActionListener(this);

    b10 = new JButton("5");
    b10.setBounds(120, 190, 70, 40);
    add(b10);
    b10.addActionListener(this);

    b11 = new JButton("6");
    b11.setBounds(195, 190, 70, 40);
    add(b11);
    b11.addActionListener(this);

    b12 = new JButton("+");
    b12.setBounds(270, 190, 75, 85);
    add(b12);
    b12.addActionListener(this);

    b13 = new JButton("1");
    b13.setBounds(45, 235, 70, 40);
    add(b13);
    b13.addActionListener(this);

    b14 = new JButton("2");
    b14.setBounds(120, 235, 70, 40);
    add(b14);
    b14.addActionListener(this);

    b15 = new JButton("3");
    b15.setBounds(195, 235, 70, 40);
    add(b15);
    b15.addActionListener(this);

    b16 = new JButton("0");
    b16.setBounds(120, 280, 70, 40);
    add(b16);
    b16.addActionListener(this);

    b17 = new JButton("=");
    b17.setBounds(195, 280, 70, 40);
    add(b17);
    b17.addActionListener(this);

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b16) txt.setText(txt.getText() + "0"); else if (
      e.getSource() == b13
    ) txt.setText(txt.getText() + "1"); else if (
      e.getSource() == b14
    ) txt.setText(txt.getText() + "2"); else if (
      e.getSource() == b15
    ) txt.setText(txt.getText() + "3"); else if (
      e.getSource() == b9
    ) txt.setText(txt.getText() + "4"); else if (
      e.getSource() == b10
    ) txt.setText(txt.getText() + "5"); else if (
      e.getSource() == b11
    ) txt.setText(txt.getText() + "6"); else if (
      e.getSource() == b5
    ) txt.setText(txt.getText() + "7"); else if (
      e.getSource() == b6
    ) txt.setText(txt.getText() + "8"); else if (
      e.getSource() == b7
    ) txt.setText(txt.getText() + "9"); else if (e.getSource() == b1) {
      txt.setText("");
      op = null;
      r = 0;
    } 
    else if (e.getSource() == b12) doopr("+");
    else if (e.getSource() == b8) doopr("-");
    else if (e.getSource() == b4) doopr("*");
    else if (e.getSource() == b3) doopr("/");
    else if (e.getSource() == b2) doopr("%");
    else if (e.getSource() == b17) doopr("=");
  }

  public void doopr(String o) {
    if (op == null) {
      op = o;
      r = Integer.parseInt(txt.getText());
      txt.setText("");
    } else {
      switch (op) {
        case "+":
          r = r + Integer.parseInt(txt.getText());
          break;
        
        case "-":
          r = r - Integer.parseInt(txt.getText());
          break;
        
        case "*":
          r = r * Integer.parseInt(txt.getText());
          break;

        case "%":
          r = r % Integer.parseInt(txt.getText());
          break;
      }
      if(op.equals("=")){
          txt.setText(r.toString());
          r = 0;
          op = null;
      }
      else{
          op = o;
          txt.setText("");
      }

    }
  }

  public static void main(String[] args) {
    new calculator();
  }
}
