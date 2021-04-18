import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sixth1Frame extends JFrame {
	
	Container c;
	JLabel first,second,result;
	JTextField t1,t2;
	JButton submit,close;
	
	public Sixth1Frame() {
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
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                int i, fact = 1;
                
                for (i = 1; i <= no2; i++) 
                {
					fact = fact * i;
					if(no1 == fact)
					{
						result.setText(fact+"");
						Sixth2Frame second = new Sixth2Frame();
					}
					else
					{
						result.setText("Error");
					}
				}
			}
		});
	}
	
	public static void main(String [] args)
	{
		Sixth1Frame s1 = new Sixth1Frame();
		s1.setSize(500,500);
		s1.setLayout(null);
		s1.setVisible(true);
	}
}
