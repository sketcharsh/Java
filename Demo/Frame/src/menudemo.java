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
public class menudemo extends JFrame implements ActionListener{
	
	Container c;
	JTextField Textbox1=new JTextField();
	JTextField Textbox2=new JTextField();
	JLabel label1=new JLabel("No.1 : ");
	JLabel label2=new JLabel("No.2 : ");
	JLabel label3=new JLabel("...");
	JMenuBar mb=new JMenuBar();
	JMenu menu=new JMenu("Menu");
	JMenuItem Item1=new JMenuItem("Addition");
	JMenuItem Item2=new JMenuItem("Subtraction");
	JMenuItem Item3=new JMenuItem("Multiplication");
	JMenuItem Item4=new JMenuItem("Division");
	JMenu submenu=new JMenu("Sub Menu");
	JMenuItem Item5=new JMenuItem("Item5");
	JMenuItem Item6=new JMenuItem("Item6");
	menudemo()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GRAY);
		
		
		
		
		c.add(Textbox1);
		c.add(Textbox2);
		c.add(label1);
		c.add(label2);
		c.add(label3);
		setJMenuBar(mb);
		mb.add(menu);
		
		menu.add(Item1);
		menu.add(Item2);
		menu.add(Item3);
		menu.add(Item4);
		submenu.add(Item5);
		submenu.add(Item6);
		menu.add(submenu);
		
		label1.setBounds(50,100,80,20);
		Textbox1.setBounds(150,100,100,20);
		label2.setBounds(50,200,80,40);
		Textbox2.setBounds(150,200,100,20);
		label3.setBounds(150,300,80,20);
		
		Item1.addActionListener(this);
		Item2.addActionListener(this);
		Item3.addActionListener(this);
		Item4.addActionListener(this);
	}
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==Item1)
				{
					int  no1=Integer.parseInt(Textbox1.getText());
					int  no2=Integer.parseInt(Textbox2.getText());
					int ans=no1+no2;
					label3.setText(" "+ans);
				}
				if(e.getSource()==Item2)
				{
					int  no1=Integer.parseInt(Textbox1.getText());
					int  no2=Integer.parseInt(Textbox2.getText());
					int ans=no1-no2;
					label3.setText(" "+ans);
				}
				if(e.getSource()==Item3)
				{
					int  no1=Integer.parseInt(Textbox1.getText());
					int  no2=Integer.parseInt(Textbox2.getText());
					int ans=no1*no2;
					label3.setText(" "+ans);
				}
				if(e.getSource()==Item4)
				{
					int  no1=Integer.parseInt(Textbox1.getText());
					int  no2=Integer.parseInt(Textbox2.getText());
					int ans=no1/no2;
					label3.setText(" "+ans);
				}
			}
		
		
		
	
	
	public static void main(String[] args){
		menudemo m1= new menudemo();
		m1.setVisible(true);
		m1.setLayout(null);
		m1.setSize(500,500);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
