import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SliderDemo extends JFrame {
    Container c;
    JTextField t1;
    JLabel name, result;
    JButton close;
    JSlider slider;
    Font f;

    SliderDemo() {
        c = this.getContentPane();
        c.setBackground(Color.GRAY);

        name = new JLabel("Enter name");
        name.setBounds(10, 0, 80, 20);

        t1 = new JTextField();
        t1.setBounds(90, 0, 150, 20);

        result = new JLabel("Result");
        result.setBounds(10, 100, 180, 30);

        close = new JButton("Close");
        close.setBounds(90, 60, 100, 30);

        slider = new JSlider(0, 100);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBounds(10, 130, 250, 100);

        c.add(t1);
        c.add(name);
        c.add(close);
        c.add(result);
        c.add(slider);

        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        slider.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
               // result.setText(t1.getText().toString());
                f = new Font("Arial", f.BOLD, slider.getValue());
                result.setFont(f);
            }
        });
    }

    public static void main(String[] args) {
        SliderDemo s1 = new SliderDemo();
        s1.setSize(500, 500);
        s1.setLayout(null);
        s1.setVisible(true);
    }
}
