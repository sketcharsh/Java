import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First1Frame extends JFrame {
	
	JFrame frame;
	JLabel first,second,result;
	JTextField t1,t2;
	JButton submit,close;
	
	public First1Frame() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
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
		
		frame.add(first);
		frame.add(t1);
		frame.add(second);
		frame.add(t2);
		frame.add(result);
		frame.add(submit);
		frame.add(close);
		
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str1 = t1.getText();
				String str2 = t2.getText();
				
				Integer no1 = Integer.parseInt(str1);
				Integer no2 = Integer.parseInt(str2);
				
				Integer no = no2*no2*no2;
				
				if(no == no1)
				{
					First2Frame second = new First2Frame();
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
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	public static void main(String [] args)
	{
		First1Frame first = new First1Frame();
	}
}
