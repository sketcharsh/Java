import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class tabbedpane extends JFrame
{
	JTabbedPane tp = new JTabbedPane();
	
	tabbedpane()
	{
		tp.add("Colors",new cpane());
		tp.add("Scrollpane",new spane());
		tp.add("Jlist",new fpane());
		add(tp);
	}
	public static void main(String args[])
	{
		tabbedpane l1=new tabbedpane();
		l1.setSize(600,600);
		l1.setVisible(true);
	
	}
}
class cpane extends JPanel
{
	final JComboBox cb = new JComboBox();
	public cpane() {
		// TODO Auto-generated constructor stub
		cb.addItem("red");
		cb.addItem("blue");
		cb.addItem("green");
		add(cb);
		
		cb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(cb.getSelectedIndex())
				{
					case 0:
						setBackground(Color.red);
						break;
					case 1:
						setBackground(Color.blue);
						break;
					case 2:
						setBackground(Color.green);
						break;
				}
			}
		});
	}
	
}
class spane extends JPanel
{
	spane()
	{
		JTextArea ta = new JTextArea(5,30);
		JScrollPane sp = new JScrollPane(ta);
		add(sp,BorderLayout.CENTER);
	}
}
class fpane extends JPanel
{
	fpane()
	{
		String week[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		final JList ls = new JList(week);
		ls.setSelectedIndex(0);
		final JLabel l = new JLabel();
		add(ls);
		add(l);
		
		ls.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				l.setText("selected day is->"+ls.getSelectedValue().toString());
			}
		});
		
	}
}
