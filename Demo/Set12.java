import javax.swing.*;
import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.events.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Set12 extends JFrame {
    Container c;
    JLabel eName, eMail, gender, designation, dept, address, result;
    JTextField eNameText, eMailText, desText, deptText;
    ButtonGroup bg;
    JRadioButton m, f;
    JButton close, display;
    JTextArea r2, addText;
    JScrollPane sp;

    Set12() {
        c = this.getContentPane();
        eName = new JLabel("Name");
        eName.setBounds(10, 40, 200, 30);

        eMail = new JLabel("Email");
        eMail.setBounds(10, 80, 200, 30);

        gender = new JLabel("Gender");
        gender.setBounds(10, 120, 200, 30);

        designation = new JLabel("Designation");
        designation.setBounds(10, 160, 200, 30);

        dept = new JLabel("Department");
        dept.setBounds(10, 200, 200, 30);

        address = new JLabel("Address");
        address.setBounds(10, 240, 200, 30);

        eNameText = new JTextField();
        eNameText.setBounds(120, 30, 200, 20);

        eMailText = new JTextField();
        eMailText.setBounds(120, 70, 200, 20);

        m = new JRadioButton("Male", true);
        m.setBounds(80, 110, 70, 20);

        f = new JRadioButton("Female");
        f.setBounds(150, 110, 90, 20);

        bg = new ButtonGroup();
        bg.add(m);
        bg.add(f);

        desText = new JTextField();
        desText.setBounds(120, 150, 200, 20);

        deptText = new JTextField();
        deptText.setBounds(120, 190, 200, 20);

        addText = new JTextArea(10, 30);
        addText.setBounds(120, 230, 200, 20);

        display = new JButton("Display");
        display.setBounds(120, 300, 100, 20);

        close = new JButton("Close");
        close.setBounds(200, 300, 100, 20);

        result = new JLabel("Result");
        result.setBounds(120, 350, 100, 20);

        r2 = new JTextArea(10, 30);
        r2.setBounds(120, 400, 100, 20);
        sp = new JScrollPane(r2);

        display.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                result.setText(eNameText.getText());
                // r2.setText(addText.getText());
            }
        });
        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        c.add(eName);
        c.add(eMail);
        c.add(eNameText);
        c.add(eMailText);
        c.add(gender);
        c.add(m);
        c.add(f);
        c.add(desText);
        c.add(dept);
        c.add(deptText);
        c.add(addText);
        c.add(address);
        c.add(designation);
        c.add(display);
        c.add(result);
        c.add(close);
        c.add(r2);
        c.add(sp);
    }

    public static void main(String[] args) {
        Set12 s2 = new Set12();
        s2.setSize(500, 500);
        s2.setLayout(null);
        s2.setVisible(true);
    }
}