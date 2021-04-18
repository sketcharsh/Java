import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JTab extends JFrame {
    JTabbedPane tp;

    JTab() {
        tp = new JTabbedPane();
        tp.add("Colors", new CPanel());
        tp.add("Text", new DPanel());
        tp.add("Text", new Panel());
    }

    public static void main(String[] args) {
        JTab t1 = new JTab("");
        t1.setSize(500, 500);
        t1.setVisible(true);
    }
}

class CPanel extends JPanel {
    JComboBox cb;

    CPanel() {
        String clrName[] = { "R", "B", "G" };
        cb = new JComboBox();
        add(cb);
        cb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                switch (cb.getSelectedIndex()) {
                case 0:
                    setBackground(Color.RED);
                    break;
                case 1:
                    setBackground(Color.Blue);
                    break;
                case 2:
                    setBackground(Color.Green);
                    break;
                }
            }
        });
    }
}

class DPanel extends JPanel {
    DPanel() {
        JTextArea textArea = new JTextArea(5, 30);
        JScrollPane sp = new JScrollPane(textArea);
        add(scrollpane, BorderLayout.CENTER);
    }
}

class EPanel extends JPanel {
    JLabel display;
    JList jw;

    EPanel()
    {
        display = new JLabel();
        String week[] = { "A","B,"C","D"};
        jw = new JList(week);
        jw.setSelectedIndex(0);
        add(display);
        add(jw);

        jw.addListSelectionListener(new ListSelectionListener(){
        
            @Override
            public void valueChanged(ListSelectionEvent e) {
                
            }
        });
    }
}