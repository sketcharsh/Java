import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Convertermenu extends JFrame implements ActionListener {
	
	Container c;
	JMenuBar mb=new JMenuBar();
	JMenu menu1=new JMenu("1");
	JMenuItem Item1=new JMenuItem("cm to meter");
	JMenuItem Item2=new JMenuItem("meter to cm");
	JMenuItem Item3=new JMenuItem("cm to mm");
	JMenuItem Item4=new JMenuItem("ml to mt");
	JMenu menu2=new JMenu("2");
	JMenuItem Item5=new JMenuItem("cel to far");
	JMenu menu3=new JMenu("3");
	JMenuItem Item6=new JMenuItem("Dollar to Rupees");
	JMenuItem Item7=new JMenuItem("Euro to Rupees");
	JMenuItem Item8=new JMenuItem("yen to Rupees");
	
	JLabel label1=new JLabel("No.1 : ");
	
	JLabel label2=new JLabel("...");
	JTextField Textbox1=new JTextField();
	
	Convertermenu()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GRAY);
		
		c.add(Textbox1);
	
		c.add(label1);
		c.add(label2);
		
		setJMenuBar(mb);
		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);
		
		menu1.add(Item1);
		menu1.add(Item2);
		menu1.add(Item3);
		menu1.add(Item4);
		
		menu2.add(Item5);
		
		menu3.add(Item6);
		menu3.add(Item7);
		menu3.add(Item8);
		
		
		label1.setBounds(50,100,80,20);
		Textbox1.setBounds(150,100,100,20);
		
		label2.setBounds(150,300,200,20);
		
		Item1.addActionListener(this);
		Item2.addActionListener(this);
		Item3.addActionListener(this);
		Item4.addActionListener(this);
		Item5.addActionListener(this);
		Item6.addActionListener(this);
		Item7.addActionListener(this);
		Item8.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Item1)
		{
			float  no1=Float.parseFloat(Textbox1.getText());
			double ans=no1/100;
			label2.setText(" "+ans);
		}
		if(e.getSource()==Item2)
		{
			float  no1=Float.parseFloat(Textbox1.getText());
			float ans=no1*100;
			label2.setText(" "+ans);
		}
		if(e.getSource()==Item3)
		{
			float  no1=Float.parseFloat(Textbox1.getText());
			double ans=no1*10;
			label2.setText(" "+ans);
		}
		if(e.getSource()==Item4)
		{
			float  no1=Float.parseFloat(Textbox1.getText());
			double ans=no1/1000;
			label2.setText(" "+ans);
		}
		if(e.getSource()==Item5)
		{
			float  no1=Float.parseFloat(Textbox1.getText());
			double ans=no1*9/5+32;
			label2.setText(" "+ans);
		}
		if(e.getSource()==Item6)
		{
			float  no1=Float.parseFloat(Textbox1.getText());
			double ans=no1*71.04;
			label2.setText(" "+ans);
		}
		if(e.getSource()==Item7)
		{
			float  no1=Float.parseFloat(Textbox1.getText());
			double ans=no1*81.03;
			label2.setText(" "+ans);
		}
		if(e.getSource()==Item8)
		{
			float  no1=Float.parseFloat(Textbox1.getText());
			double ans=no1*1.53;
			label2.setText(" "+ans);
		}
	}
	
	public static void main(String[] args){
		Convertermenu m1= new Convertermenu();
		m1.setVisible(true);
		m1.setLayout(null);
		m1.setSize(500,500);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

