import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TabPane extends JFrame{

	JTabbedPane ashka;
	TabPane()
	{
		ashka = new JTabbedPane();
		ashka.add("Tab1", new Tab1());
		ashka.add("Tab2",new Tab2());
		ashka.add("Tab3",new Tab3());
		add(ashka);
	}
	public static void main(String[] args) {
		TabPane t = new TabPane();
		t.setVisible(true);
		t.setBounds(250, 150, 500, 500);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Tab1 extends JPanel
{
	JComboBox cb;
	Tab1()
	{
		cb = new JComboBox();
		cb.addItem("BLUE");
		cb.addItem("RED");
		cb.addItem("GREEN");
		cb.setBounds(20, 50, 100, 50);
		add(cb);
		
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = (String) cb.getSelectedItem();
				switch(val)
				{
					case "RED" :
						setBackground(Color.RED);
						break;
					case "BLUE":
						setBackground(Color.BLUE);
						break;
					case "GREEN":
						setBackground(Color.GREEN);
						break;
				}
			}
		});
	}
}
class Tab2 extends JPanel
{
	JList l;
	JLabel abc;
	String week[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	Tab2()
	{
		l = new JList(week);
		l.setBounds(10, 20, 100, 100);
		add(l);
		
		abc = new JLabel();
		abc.setBounds(30, 150, 100, 40);
		add(abc);
		
		l.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				String val = (String) l.getSelectedValue();
				abc.setText("You Selected -> " + val);
				
			}
		});
	}
}
class Tab3 extends JPanel
{
	JTextArea xyz;
	JScrollPane sc;
	Tab3()
	{
		xyz = new JTextArea(10,30);
		add(xyz);
		
		sc = new JScrollPane(xyz);
		add(sc);
	}
	
}
