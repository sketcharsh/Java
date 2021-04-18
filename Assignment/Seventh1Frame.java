import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Seventh1Frame extends JFrame {
	
	Container c;
	JLabel first,second,result;
	JTextField t1,t2;
	JButton submit,close;
	
	public Seventh1Frame() {
		// TODO Auto-generated constructor stub
		
		c = this.getContentPane();
		
		first = new JLabel("First Number: ");
		first.setBounds(0, 30, 200, 20);
		
		t1 = new JTextField();
		t1.setBounds(100, 30, 200, 20);
		
		second = new JLabel("Last Number: ");
		second.setBounds(0, 70, 200, 20);
		
		t2 = new JTextField();
		t2.setBounds(100, 70, 200, 20);
				
		result = new JLabel("Result");
		result.setBounds(130, 160, 100, 30);
		
		submit = new JButton("Submit");
		submit.setBounds(100, 250, 100, 30);
		
		close = new JButton("Close");
		close.setBounds(200, 250, 100, 30);
		
		c.add(first);
		c.add(second);
		c.add(t1);
		c.add(t2);
		c.add(result);
		c.add(submit);
		c.add(close);
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str1 = t1.getText();
				String str2 = t2.getText();
				
				int no1 = Integer.parseInt(str1);
				int no2 = Integer.parseInt(str2);
				
				result.setText(((no1*5)+(no2*10))+"");
				
				String r1 = result.getText();
				int no = Integer.parseInt(r1);
				
				if(no>100)
				{
					Seventh2Frame seven = new Seventh2Frame();
				}
				else
				{
					JFrame f = new JFrame();
					JLabel error = new JLabel("ERROR");
					error.setBounds(150, 150, 100, 30);
					f.add(error);
					f.setSize(500,500);
					f.setLayout(null);
					f.setVisible(true);
				}
			}
		});
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	public static void main(String [] args)
	{
		Seventh1Frame s1 = new Seventh1Frame();
		s1.setSize(500,500);
		s1.setLayout(null);
		s1.setVisible(true);
	}
}
