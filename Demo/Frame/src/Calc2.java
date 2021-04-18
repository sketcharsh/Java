import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc2 extends JFrame
{
	Container c;
	JLabel title;
	JTextField t1;
	JButton close,seven,eight,nine,four,five,six,one,two,three,zero,dot,equal,AC,beforeSign,per,divide,multi,sub,add;
	
	Calc2()
	{
		c = this.getContentPane();
		
		title = new JLabel("<html><font><b><u>CALCULATOR 2</u></b></font></html>");
		title.setBounds(190, 0, 200, 20);
		
		t1 = new JTextField();
		t1.setBounds(120, 30, 264, 50);
		
		AC = new JButton("AC");
		AC.setBounds(122, 100, 50, 20);
		
		beforeSign = new JButton("+/-");
		beforeSign.setBounds(192, 100, 50, 20);
		
		per = new JButton("%");
		per.setBounds(262, 100, 50, 20);
		
		divide = new JButton("-");
		divide.setBounds(332, 100, 50, 20);
		
		seven = new JButton("7");
		seven.setBounds(122, 140, 50, 20);
		
		eight = new JButton("8");
		eight.setBounds(192, 140, 50, 20);
		
		nine = new JButton("9");
		nine.setBounds(262, 140, 50, 20);
		
		multi = new JButton("x");
		multi.setBounds(332, 140, 50, 20);
		
		four = new JButton("4");
		four.setBounds(122, 180, 50, 20);
		
		five = new JButton("5");
		five.setBounds(192, 180, 50, 20);
		
		six = new JButton("6");
		six.setBounds(262, 180, 50, 20);
		
		sub = new JButton("-");
		sub.setBounds(332, 180, 50, 20);
		
		one = new JButton("1");
		one.setBounds(122, 220, 50, 20);
		
		two = new JButton("2");
		two.setBounds(192, 220, 50, 20);
		
		three = new JButton("3");
		three.setBounds(262, 220, 50, 20);
		
		add = new JButton("+");
		add.setBounds(332, 220, 50, 20);
		
		zero = new JButton("0");
		zero.setBounds(122, 260, 120, 20);
		
		dot = new JButton(".");
		dot.setBounds(262, 260, 50, 20);
		
		equal = new JButton("=");
		equal.setBounds(332, 260, 50, 20);
		
		
		close = new JButton("CLOSE");
		close.setBounds(190, 350, 100, 20);
		
		c.add(title);
		c.add(t1);
		c.add(one);
		c.add(two);
		c.add(three);
		c.add(four);
		c.add(five);
		c.add(six);
		c.add(seven);
		c.add(eight);
		c.add(nine);
		c.add(zero);
		c.add(dot);
		c.add(equal);
		c.add(AC);
		c.add(beforeSign);
		c.add(per);
		c.add(divide);
		c.add(multi);
		c.add(sub);
		c.add(sub);
		c.add(add);
		c.add(close);
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	public static void main (String []  args)
	{
		Calc2 c2 = new Calc2();
		c2.setSize(500,500);
		c2.setLayout(null);
		c2.setVisible(true);
	}
}
