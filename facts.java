import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class facts extends JFrame implements ActionListener{
    private JTextField t1, t2;
    private Label l1, l2;
    private JButton b1;
    int sum;
    facts(){
        setLayout(null);
        setSize(640, 720);

        l1 = new Label("Enter a number");
        l1.setBounds(100,100, 100, 30);

        t1 = new JTextField();
        t1.setBounds(250, 100, 200, 30);

        l2 = new Label("Same Number ");
        l2.setBounds(100, 200, 100, 30);

        t2 = new JTextField();
        t2.setBounds(250, 200, 200, 30);

        b1 = new JButton("COPY");
        b1.setBounds(200, 250, 100, 30);

        add(t1);add(l1);
        add(t2);add(l2);
        add(b1);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            t2.setText(t1.getText());
        }
    }

    public static void main(String[] args) {
        new facts().setVisible(true);
    }

}
