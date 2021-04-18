import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


@SuppressWarnings("serial")
public class Springlayoutdemo extends JFrame {

	Container c;
	Springlayoutdemo()
	{
		c=this.getContentPane();
		SpringLayout layout=new SpringLayout();
		c.setLayout(layout);
		
		JLabel label1=new JLabel("1");
		JTextField t1=new JTextField(10);
		
		JLabel label2=new JLabel("2");
		JTextField t2=new JTextField(10);
		
		JLabel label3=new JLabel("3");
		JTextField t3=new JTextField(10);
		
		JLabel label4=new JLabel("4");
		JTextField t4=new JTextField(10);
		
		JLabel label5=new JLabel("5");
		JTextField t5=new JTextField(10);
		
		JLabel label6=new JLabel("6");
		JTextField t6=new JTextField(10);
		
		c.add(label1);
		c.add(t1);
		
		c.add(label2);
		c.add(t2);
		
		c.add(label3);
		c.add(t3);
		
		c.add(label4);
		c.add(t4);
		
		c.add(label5);
		c.add(t5);
		
		c.add(label6);
		c.add(t6);
		
		layout.putConstraint(SpringLayout.WEST,label1, 10, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,label1, 20, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,t1, 20, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,t1, 20, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,label2, 10, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,label2, 50, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,t2, 20, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,t2, 50, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,label3, 10, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,label3, 80, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,t3, 20, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,t3, 80, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,label4, 250, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,label4, 20, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,t4, 300, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,t4, 20, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,label5, 250, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,label5, 50, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,t5, 300, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,t5, 50, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,label6, 250, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,label6, 80, SpringLayout.NORTH, c);
		
		layout.putConstraint(SpringLayout.WEST,t6, 300, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH,t6, 80, SpringLayout.NORTH, c);
		
		
		
	}
	public static void main(String[] args){
		Springlayoutdemo s1= new Springlayoutdemo();
		s1.setVisible(true);
		
		s1.setSize(500,500);
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
