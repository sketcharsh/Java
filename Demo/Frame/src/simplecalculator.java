

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class simplecalculator extends JFrame 
{
	Container c;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	JLabel l1;
	
	
	public simplecalculator() 
	{
		c=this.getContentPane();
		
		t1=new JTextField(15);
		t1.setBounds(50,90,120,30);
		c.add(t1);
		
		t2=new JTextField(15);
		t2.setBounds(50,120,120,30);
		c.add(t2);
		
		b1=new JButton("+");
		b1.setBounds(50,150,50,30);
		c.add(b1);
		
		b2=new JButton("-");
		b2.setBounds(100,150,50,30);
		c.add(b2);
		
		b3=new JButton("*");
		b3.setBounds(150,150,50,30);
		c.add(b3);
		
		b4=new JButton("/");
		b4.setBounds(200,150,50,30);
		c.add(b4);
		
		l1=new JLabel();
		l1.setBounds(100,200,120,30);
		c.add(l1);
		
		
	}
	
	public static void main(String[] args)
	{
		simplecalculator smp=new simplecalculator();
		smp.setVisible(true);
		smp.setSize(400,500);
		smp.setLayout(null);
		smp.setBackground(Color.RED);
	}
	
}
