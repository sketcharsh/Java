


import javax.swing.JFrame;
import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class complexcalculator extends JFrame 
{
	Container c;
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	
	public complexcalculator() 
	{
		c=this.getContentPane();
		
		t1=new JTextField(20);
		t1.setBounds(100,90,150,30);
		c.add(t1);
		
		b1=new JButton("AC");
		b1.setBounds(100,120,30,30);
		c.add(b1);
		
		b2=new JButton("+/-");
		b2.setBounds(130,120,30,30);
		c.add(b2);
		
		b3=new JButton("%");
		b3.setBounds(160,120,30,30);
		c.add(b3);
		
		b4=new JButton("/");
		b4.setBounds(190,120,30,30);
		c.add(b4);
		
		b5=new JButton("7");
		b5.setBounds(100,150,30,30);
		c.add(b5);
		
		b6=new JButton("8");
		b6.setBounds(130,150,30,30);
		c.add(b6);
		
		b7=new JButton("9");
		b7.setBounds(160,150,30,30);
		c.add(b7);
		
		b8=new JButton("*");
		b8.setBounds(190,150,30,30);
		c.add(b8);
		
		b9=new JButton("4");
		b9.setBounds(100,180,30,30);
		c.add(b9);
		
		b10=new JButton("5");
		b10.setBounds(130,180,30,30);
		c.add(b10);
		
		b11=new JButton("6");
		b11.setBounds(160,180,30,30);
		c.add(b11);
		
		b12=new JButton("-");
		b12.setBounds(190,180,30,30);
		c.add(b12);
		
		b13=new JButton("1");
		b13.setBounds(100,210,30,30);
		c.add(b13);
		
		b14=new JButton("2");
		b14.setBounds(130,210,30,30);
		c.add(b14);
		
		b15=new JButton("3");
		b15.setBounds(160,210,30,30);
		c.add(b15);
		
		b16=new JButton("+");
		b16.setBounds(190,210,30,30);
		c.add(b16);
		
		b17=new JButton("0");
		b17.setBounds(100,240,30,30);
		c.add(b17);
		
		b18=new JButton("00");
		b18.setBounds(130,240,30,30);
		c.add(b18);
		
		b19=new JButton(".");
		b19.setBounds(160,240,30,30);
		c.add(b19);
		
		b20=new JButton("=");
		b20.setBounds(190,240,30,30);
		c.add(b20);
	}
	
	
	public static void main(String[] args)
	{
		complexcalculator ccl=new complexcalculator();
		ccl.setLayout(null);
		ccl.setSize(400,500);
		ccl.setVisible(true);
		ccl.setBackground(Color.BLUE);
	}
}

