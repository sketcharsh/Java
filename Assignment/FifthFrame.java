import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;

public class FifthFrame extends JFrame
{
	JTabbedPane tab;
	
	public FifthFrame() {
		// TODO Auto-generated constructor stub
		
		tab = new JTabbedPane();
		tab.add("List",new Jlist());
		tab.add("Colours",new Jclr());
		tab.add("EMI",new JEMI());
		
		add(tab);
	}
	
	public static void main(String [] args)
	{
		FifthFrame five = new FifthFrame();
		five.setSize(500, 500);
		five.setVisible(true);
	}
}

class Jlist extends JPanel
{
	JLabel display;
	JList list;
	Jlist()
	{
		String week[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		list = new JList(week);
		list.setSelectedIndex(0);
		display = new JLabel();
		add(list);
		add(display);
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				display.setText("Today is " + list.getSelectedValue().toString() + ".");
			}
		});
	}
}

class Jclr extends JPanel
{
	JComboBox box;
	Jclr()
	{
		String clrName[] = {"Red","Yellow","Gray"};
		box = new JComboBox(clrName);
		add(box);
		
		box.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				switch(box.getSelectedIndex())
				{
				case 0:
						setBackground(Color.RED);
					break;
				case 1:
						setBackground(Color.YELLOW);
					break;
				case 2:
						setBackground(Color.LIGHT_GRAY);
					break;
				}
			}
		});
	}
}

class JEMI extends JPanel
{
	JLabel principal,rate,time,display;
	JTextField t1,t2,t3;
	JButton calculate,close;
	
	public JEMI() {
		// TODO Auto-generated constructor stub
		
		principal = new JLabel("Enter principal: ");
		
		rate = new JLabel("Enter rate: ");
		
		time = new JLabel("Enter time in year: ");
		
		display = new JLabel("Display");
		
		t1 = new JTextField(20);
		
		t2 = new JTextField(20);
		
		t3 = new JTextField(20);
				
		calculate = new JButton("Calculate");
		
		close = new JButton("Close");
		
		add(principal);
		add(t1);
		add(rate);
		add(t2);
		add(time);
		add(t3);
		add(display);
		add(calculate);
		add(close);
		
		calculate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Double p,r,t,simple;
				
				p = Double.parseDouble(t1.getText().toString());
				r = Double.parseDouble(t2.getText().toString());
				t = Double.parseDouble(t3.getText().toString());
				
				simple=p*r*t/100;
				
				display.setText("Your Monthly EMI is: " + simple + ".");
			}
		});
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}
