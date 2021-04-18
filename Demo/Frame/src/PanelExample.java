import java.awt.Color;
import java.awt.Container;


import javax.swing.*;


@SuppressWarnings("serial")
public class PanelExample extends JFrame{

	JPanel p1;
	JLabel lbl1,lbl2;
	JTextField txt1,txt2;
	JButton submit;
	Container c;
	
	
	
	PanelExample()
	{
		c = this.getContentPane();
		c.setVisible(true);
		c.setLayout(null);
		
		
		p1 = new JPanel();
		p1.setVisible(true);
		p1.setLayout(null);
		
		p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Login Page"));
		
		
		
		//p1.setForeground(Color.BLUE);
		lbl1 = new JLabel("Username : ");
		lbl2 = new JLabel("Password :");
		txt1 = new JTextField();
		txt2 = new JTextField();
		submit = new JButton("Submit");
		
		lbl1.setBounds(100,100,100,40);
		txt1.setBounds(180,100,100,40);
		p1.setBounds(50,50,300,300);
		lbl2.setBounds(100,150,100,40);
		txt2.setBounds(180,150,100,40);
		
		submit.setBounds(150,200,60,40);
		p1.add(lbl1);
		p1.add(lbl2);
		p1.add(txt1);
		p1.add(txt2);
		p1.add(submit);
		
		p1.setBackground(Color.gray);
		c.add(p1);
	//	c.setBackground(Color.black);
		
		
		
	}
	
	public static void main(String[] args)
	{
		PanelExample p2 = new PanelExample();
		p2.setVisible(true);
		p2.setSize(500,500);
		p2.setLayout(null);
		
	}
}
