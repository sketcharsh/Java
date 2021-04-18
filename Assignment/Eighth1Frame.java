import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eighth1Frame extends JFrame 
{
	JFrame frame;
	JLabel name,result;
	JTextField t1;
	JButton submit,close;
	
	public Eighth1Frame() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		name = new JLabel("Enter Name: ");
		name.setBounds(30, 100, 100, 30);
		
		t1 = new JTextField();
		t1.setBounds(120, 100, 200, 30);
		
		result = new JLabel("Result");
		result.setBounds(130, 160, 250, 30);
		
		submit = new JButton("Submit");
		submit.setBounds(100, 250, 100, 30);
		
		close = new JButton("Close");
		close.setBounds(200, 250, 100, 30);
		
		frame.add(name);
		frame.add(t1);
		frame.add(result);
		frame.add(submit);
		frame.add(close);
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str1 = t1.getText();
				
				if(str1.matches("[a-zA-Z]"))
				{
					Eighth2Frame second = new Eighth2Frame();
				}
				else
				{
					result.setText("Enter Only Characters.");
				}
			}
		});
	}
	
	public static void main(String [] args)
	{
		Eighth1Frame e1 = new Eighth1Frame();
	}
}
