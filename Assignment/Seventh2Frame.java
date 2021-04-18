import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Seventh2Frame extends JFrame
{
	JFrame frame;
	JLabel number1,number2;
	JTextField t1,t2;
	JButton add,multi,divide,sub,close;
	
	Seventh2Frame()
	{
		frame = new JFrame();
		
		number1 = new JLabel("First Number: ");
		number1.setBounds(0, 30, 200, 20);
		
		t1 = new JTextField();
		t1.setBounds(120, 30, 200, 20);
		
		number2 = new JLabel("Second Number: ");
		number2.setBounds(0, 70, 200, 20);
		
		t2 = new JTextField();
		t2.setBounds(120, 70, 200, 20);
		
		add = new JButton("ADD");
		add.setBounds(50, 150, 60, 20);
		
		multi = new JButton("MULTI");
		multi.setBounds(130, 150, 60, 20);
		
		divide = new JButton("DIVIDE");
		divide.setBounds(210, 150, 60, 20);
		
		sub = new JButton("SUB");
		sub.setBounds(290, 150, 60, 20);
				
		
		close = new JButton("CLOSE");
		close.setBounds(130, 250, 100, 20);
		
		frame.add(number1);
		frame.add(number2);
		frame.add(t1);
		frame.add(t2);
		frame.add(multi);
		frame.add(add);
		frame.add(divide);
		frame.add(sub);
		frame.add(close);
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		close.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		add.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String strNum1 = t1.getText();
				String strNum2 = t2.getText();
				
				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				
				
				JFrame f = new JFrame();
				JLabel result = new JLabel("Result");
				result.setBounds(150, 150, 100, 30);
				f.add(result);
				result.setText(no1+no2+"");
				f.setSize(500,500);
				f.setLayout(null);
				f.setVisible(true);
 			}
		});
		
		multi.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String strNum1 = t1.getText();
				String strNum2 = t2.getText();
				
				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				
				JFrame f = new JFrame();
				JLabel result = new JLabel("Result");
				result.setBounds(150, 150, 100, 30);
				f.add(result);
				result.setText(no1*no2+"");
				f.setSize(500,500);
				f.setLayout(null);
				f.setVisible(true);
			}
		});

		divide.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				String strNum1 = t1.getText();
				String strNum2 = t2.getText();
				
				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				
				JFrame f = new JFrame();
				JLabel result = new JLabel("Result");
				result.setBounds(150, 150, 100, 30);
				f.add(result);
				result.setText(no1/no2+"");
				f.setSize(500,500);
				f.setLayout(null);
				f.setVisible(true);
			}
		});

		sub.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				String strNum1 = t1.getText();
				String strNum2 = t2.getText();
				
				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				
				JFrame f = new JFrame();
				JLabel result = new JLabel("Result");
				result.setBounds(150, 150, 100, 30);
				f.add(result);
				result.setText(no1-no2+"");
				f.setSize(500,500);
				f.setLayout(null);
				f.setVisible(true);
			}
		});
	}
	public static void main(String [] args)
	{
		Seventh2Frame s2 = new Seventh2Frame();
	}
}
