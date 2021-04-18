import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.events.*;

class Set2 extends JFrame {
    Container c;
    JLabel usrName, psw, result;
    JTextField t1, t2;
    JButton close, display;

    Set2() {
        c = this.getContentPane();
        usrName = new JLabel("Username");
        usrName.setBounds(10, 40, 200, 30);
        psw = new JLabel("Password");
        psw.setBounds(10, 80, 200, 30);
        t1 = new JTextField();
        t1.setBounds(120, 30, 200, 20);
        t2 = new JTextField();
        t2.setBounds(120, 70, 200, 20);
        close = new JButton("Close");
        close.setBounds(200, 220, 100, 20);
        display = new JButton("Display");
        display.setBounds(120, 300, 100, 20);
        result = new JLabel("Result");
        result.setBounds(120, 350, 100, 20);

        c.add(display);
        c.add(usrName);
        c.add(psw);
        c.add(close);
        c.add(t1);
        c.add(t2);
        c.add(result);
        display.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                int i, fact = 1;
                // int number=no2;//It is the number to calculate factorial
                for (i = 1; i <= no2; i++) {
                    fact = fact * i;
                    // return fact;
                    if (no1 == fact) {
                        result.setText("done");
                    } else {
                        result.setText("fail");
                    }
                }
            }
        });

        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        Set2 s1 = new Set2();
        s1.setSize(500, 500);
        s1.setLayout(null);
        s1.setVisible(true);
    }
}