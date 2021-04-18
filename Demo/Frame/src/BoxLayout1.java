import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class BoxLayout1 extends JFrame{
		
	
	Container c;
	
	public BoxLayout1() {
		// TODO Auto-generated constructor stub
		c=this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1=new JButton("Select 1");
		JButton b2=new JButton("Select 2");
		JButton b3=new JButton("Select 1");
		JButton b4=new JButton("Select 2");
		JButton b5=new JButton("Select 1");
		JButton b6=new JButton("Select 2");
	
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		
		panel1.setBorder(BorderFactory.createTitledBorder("LEFT"));
		panel2.setBorder(BorderFactory.createTitledBorder("CENTER"));
		panel3.setBorder(BorderFactory.createTitledBorder("RIGHT"));
		
		BoxLayout layout1 = new BoxLayout(panel1,BoxLayout.Y_AXIS);
		BoxLayout layout2 = new BoxLayout(panel2,BoxLayout.Y_AXIS);
		BoxLayout layout3 = new BoxLayout(panel3,BoxLayout.Y_AXIS);
		
		panel1.setLayout(layout1);
		
		b1.setAlignmentX(Component.LEFT_ALIGNMENT);
		b2.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		panel1.add(b1);
		panel1.add(b2);
		
		panel2.setLayout(layout2);
		
		b3.setAlignmentX(Component.LEFT_ALIGNMENT);
		b4.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		panel2.add(b3);
		panel2.add(b4);
		
		panel3.setLayout(layout3);
		
		b5.setAlignmentX(Component.LEFT_ALIGNMENT);
		b6.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		panel3.add(b5);
		panel3.add(b6);
		
		c.add(panel1);
		c.add(panel2);
		c.add(panel3);
		
		
		
		
		
	}
	
	public static void main(String[] args){
		BoxLayout1 b1= new BoxLayout1();
		b1.setVisible(true);
		
		b1.setSize(500,500);
		b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
