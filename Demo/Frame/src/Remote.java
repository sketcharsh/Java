import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Remote extends JFrame
{
	JFrame frame;
	JLabel l1,l2;
	JTextField input;
	JOptionPane title;
	JButton zero,one,two,three,four,five,six,
	seven,eight,nine,up,down,close,user,button;
	int count=0;
	int channelView;
	
	public Remote() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame("Remote");
		
		zero = new JButton("0");
		zero.setBounds(80, 180, 50, 30);
		
		two = new JButton("2");
		two.setBounds(80, 30, 50, 30);
		
		three = new JButton("3");
		three.setBounds(130, 30, 50, 30);
		
		four = new JButton("4");
		four.setBounds(30, 80, 50, 30);
		
		five = new JButton("5");
		five.setBounds(80, 80, 50, 30);
		
		six = new JButton("6");
		six.setBounds(130, 80, 50, 30);
		
		seven = new JButton("7");
		seven.setBounds(30, 130, 50, 30);
		
		eight = new JButton("8");
		eight.setBounds(80, 130, 50, 30);
		
		nine = new JButton("9");
		nine.setBounds(130, 130, 50, 30);
		
		one = new JButton("1");
		one.setBounds(30, 30, 50, 30);
		
		up = new JButton("↑");
		up.setBounds(130, 230, 50, 30);
		
		down = new JButton("↓");
		down.setBounds(30, 230, 50, 30);
		
		user = new JButton("User");
		user.setBounds(180, 350, 100, 30);
		
		close = new JButton("Close");
		close.setBounds(80, 300, 100, 30);
		
		button = new JButton("Button");
		button.setBounds(300, 400, 100, 30);
		
		l1 = new JLabel("Result");
		l1.setBounds(80, 400, 300, 30);
		
		l2 = new JLabel("Result");
		l2.setBounds(200, 500, 300, 30);
		
		input = new JTextField();
		input.setBounds(80, 450, 200, 30);
		
		
		close.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		user.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nonWork = Integer.parseInt(JOptionPane.showInputDialog(null, "Counts of non-working digits: "));
				if(nonWork>1 && nonWork<4)
				{
					int[] nums = new int[nonWork];
					for(int i=0;i<nums.length;i++)
					{
						int digitNotWork = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter digits that are not working: "));
						if(digitNotWork>=0 && digitNotWork<=9){
							switch (digitNotWork) {
							case 0:
						        zero.setEnabled(false);
							break;
							case 1:
					            one.setEnabled(false);
							break;
							case 2:
					            two.setEnabled(false);
							break;
							case 3:
					            three.setEnabled(false);
							break;
							case 4:
					            four.setEnabled(false);
							break;
							case 5:
					            five.setEnabled(false);
							break;
							case 6:
					            six.setEnabled(false);
							break;
							case 7:
					            seven.setEnabled(false);
							break;
							case 8:
					            eight.setEnabled(false);
							break;
							case 9:
					            nine.setEnabled(false);
							break;

							default:
								break;
							}
						}else
						{
							l1.setText("Enter in 1 to 10");
							break;

						}
					}
					channelView = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter channel no to be viewed"));
					l2.setText(channelView+"");
					l1.setText("enter 99 and press 6 times up.");

					if(channelView>=1 && channelView<999){
						button.addActionListener(new ActionListener() {
							
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								String str = input.getText();
								int no = Integer.parseInt(str);
								
								String str2 = l2.getText();
								int no2 = Integer.parseInt(str2);
								
								if(no == no2)
								{
									frame.getContentPane().setBackground(Color.green);
								}
								else
								{
									l1.setText("Fail");
								}
							}
						});
//						up.addActionListener(new ActionListener() {
//							
//							public void actionPerformed(ActionEvent e) {
//								// TODO Auto-generated method stub
//								
//								String str = input.getText();
//								int no = Integer.parseInt(str);
//								
//								String str2 = l2.getText();
//								int no2 = Integer.parseInt(str2);
//								
//								while(no!=no2)
//								{
//									frame.getContentPane().setBackground(Color.green);
//								}
//								else
//								{
//									l1.setText("Fail");
//								}
//							}
//						});
					}
					else{
						l1.setText("Enter channel in 1 to 999");
					}
				}
				else
				{
					l1.setText("Number shoud be in 1 to 4");
				}
			}
		});
		
		
		up.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int no1 = Integer.parseInt(one.getText());
				
			}
		});
		
		

		
		one.addActionListener(new action());
		two.addActionListener(new action());
		three.addActionListener(new action());
		four.addActionListener(new action());
		five.addActionListener(new action());
		six.addActionListener(new action());
		seven.addActionListener(new action());
		eight.addActionListener(new action());
		nine.addActionListener(new action());
		zero.addActionListener(new action());
		
		up.addActionListener(new IncrementListener());
		
		down.addActionListener(new DecrementListener());
	
		
		frame.add(input);
		frame.add(l2);
		frame.add(l1);
		frame.add(zero);
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(four);
		frame.add(five);
		frame.add(six);
		frame.add(seven);
		frame.add(eight);
		frame.add(nine);
		frame.add(up);
		frame.add(down);
		frame.add(close);
		frame.add(button);
		frame.add(user);
		
		frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	private class action implements ActionListener
	
	  {	
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==one)
				input.setText(input.getText().concat("1"));
			
			if(e.getSource()==two)
				input.setText(input.getText().concat("2"));
			
			if(e.getSource()==three)
				input.setText(input.getText().concat("3"));
			
			if(e.getSource()==four)
				input.setText(input.getText().concat("4"));
			
			if(e.getSource()==five)
				input.setText(input.getText().concat("5"));
			
			if(e.getSource()==six)
				input.setText(input.getText().concat("6"));
			
			if(e.getSource()==seven)
				input.setText(input.getText().concat("7"));
			
			if(e.getSource()==eight)
				input.setText(input.getText().concat("8"));
			
			if(e.getSource()==nine)
				input.setText(input.getText().concat("9"));
			
			if(e.getSource()==zero)
				input.setText(input.getText().concat("0"));
		}
	  }
	
	private class IncrementListener implements ActionListener
	
	  {	
		public void actionPerformed (ActionEvent event)
	
		{	String str = input.getText();
			final int no = Integer.parseInt(str);
			count=1;	
			input.setText(no+count+"");		          
		}
	  }
	
	private class DecrementListener implements ActionListener
	
	  {	
		public void actionPerformed (ActionEvent event)
	
		{	
			String str = input.getText();
			int no = Integer.parseInt(str);
			count=-1;	
			input.setText(no+count+"");		          
		}
	  }

	public static void main(String [] args)
	{
		Remote r = new Remote();
	}
}
