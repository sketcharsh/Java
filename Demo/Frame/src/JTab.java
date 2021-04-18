import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class JTab extends JFrame {
	JTabbedPane tp;

	JTab() {
		tp = new JTabbedPane();
		tp.add("colors", new cPanel());
		tp.add("Scroll Pane", new DPanel());
		tp.add("Scroll Pane", new Epanel());
		add(tp);
	}

	public static void main(String[] args) {
		JTab t = new JTab();
		t.setSize(500, 500);
		t.setVisible(true);
	}
}

class cPanel extends JPanel {
	JComboBox cb;

	cPanel() {
		String clrName[] = { "Red", "Blue", "Gray" };
		cb = new JComboBox(clrName);
		add(cb);
		cb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch (cb.getSelectedIndex()) {
				case 0:
					setBackground(Color.RED);
					break;
				case 1:
					setBackground(Color.BLUE);
					break;
				case 2:
					setBackground(Color.GRAY);
					break;
				}
			}
		});

	}
}

class DPanel extends JPanel {
	DPanel() {
		JTextArea textArea = new JTextArea(5, 30);
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER);
	}
}

class Epanel extends JPanel {
	JLabel display;
	JList jw;

	Epanel() {
		display = new JLabel();
		String week[] = { "A", "B", "C", "D" };
		jw = new JList(week);
		jw.setSelectedIndex(0);
		add(display);
		add(jw);

		jw.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				display.setText("Today is " + jw.getSelectedValue().toString());
			}
		});
	}
}