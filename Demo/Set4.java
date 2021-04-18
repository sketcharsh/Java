import javax.swing.*;

import com.sun.javafx.scene.layout.region.Margins.Converter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.events.*;

class Set4 extends JFrame {
    Container c;
    JLabel usrName, psw, result;
    JTextField t1, t2;
    JButton close, display;

    Set4() {
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
        result = new JLabel("Result");
        result.setBounds(130, 100, 100, 20);
        display = new JButton("Display");
        display.setBounds(80, 220, 100, 20);

        c.add(usrName);
        c.add(psw);
        c.add(close);
        c.add(t1);
        c.add(t2);
        c.add(result);
        c.add(display);

        display.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                int no3 = no1 + no2;

                if (no3 % 2 == 0) {
                    result.setText("Done");
                } else {
                    result.setText("Fail");
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
        Set4 s4 = new Set4();
        s4.setSize(500, 500);
        s4.setLayout(null);
        s4.setVisible(true);
    }
}