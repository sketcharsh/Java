import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class Set22 extends JFrame {
    Container c;
    JLabel name, result;
    JTextField t1;
    JSlider slider;
    JButton close;
    Font f;

    Set22() {
        c = this.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);

        name = new JLabel("Name: ");
        name.setBounds(30, 0, 100, 20);

        t1 = new JTextField();
        t1.setBounds(80, 0, 150, 20);

        // slider = new JSlider(JSlider.VERTICAL);
        slider = new JSlider(0, 30);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBounds(80, 100, 250, 100);

        result = new JLabel("result");
        result.setBounds(80, 180, 150, 30);

        close = new JButton("CLOSE");
        close.setBounds(200, 250, 100, 20);

        c.add(name);
        c.add(t1);
        c.add(slider);
        c.add(result);
        c.add(close);

        slider.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent arg0) {
                // TODO Auto-generated method stub
                result.setText("Name: " + t1.getText().toString());
                f = new Font("Arial", f.BOLD, slider.getValue());
                result.setFont(f);

            }
        });

        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Set22 s2 = new Set22();
        s2.setSize(400, 400);
        s2.setLayout(null);
        s2.setVisible(true);
    }
}
