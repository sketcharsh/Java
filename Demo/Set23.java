import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Set23 extends JFrame {
    Container c;
    JComboBox cb;

    Set23() {
        c = this.getContentPane();
        String clrName[] = { "Red", "Blue", "Gray" };
        cb = new JComboBox(clrName);
        cb.setBounds(30, 70, 100, 30);
        c.add(cb);
        cb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                switch (cb.getSelectedIndex()) {
                case 0:
                    c.setBackground(Color.RED);
                    break;
                case 1:
                    c.setBackground(Color.BLUE);
                    break;
                case 2:
                    c.setBackground(Color.GRAY);
                    break;
                }
            }
        });
    }

    public static void main(String[] args) {
        Set23 s3 = new Set23();
        s3.setSize(500, 500);
        s3.setLayout(null);
        s3.setVisible(true);
    }
}