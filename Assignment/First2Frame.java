import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First2Frame extends JFrame {
	
	JFrame frame;
	JLabel name,mail,gender,designation,dept,addr;
	JTextField t1,t2,t3,t4;
	JTextArea taddr;
	JRadioButton male,female;
	ButtonGroup bg;
	JScrollPane scroll;
	JButton submit,close;
	
	public First2Frame() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		name = new JLabel("Name: ");
		name.setBounds(30, 30, 100, 30);
		
		t1 = new JTextField();
		t1.setBounds(150, 30, 200, 30);
		
		mail = new JLabel("Mail Id: ");
		mail.setBounds(30, 80, 100, 30);
		
		t2 = new JTextField();
		t2.setBounds(150, 80, 200, 30);
		 
		gender = new JLabel("Gender: ");
		gender.setBounds(30, 130, 100, 30);
		
		male = new JRadioButton("Male",true);
		male.setBounds(150, 130, 80, 30);
		
		female = new JRadioButton("Female",true);
		female.setBounds(250, 130, 80, 30);
		
		bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		 
		designation = new JLabel("Designation: ");
		designation.setBounds(30, 180, 100, 30);
		
		t3 = new JTextField();
		t3.setBounds(150, 180, 200, 30);
		 
		dept = new JLabel("Department: ");
		dept.setBounds(30, 230, 100, 30);
		
		t4 = new JTextField();
		t4.setBounds(150, 230, 200, 30);
		 
		addr = new JLabel("Address: ");
		addr.setBounds(30, 280, 100, 30);
		
		taddr = new JTextArea();
		scroll = new JScrollPane(taddr);
		scroll.setBounds(150, 280, 200, 80);
		
		submit = new JButton("Submit");
		submit.setBounds(150, 400, 100, 30);
		
		close = new JButton("Close");
		close.setBounds(250, 400, 100, 30);
		
		frame.add(name);
		frame.add(mail);
		frame.add(gender);
		frame.add(designation);
		frame.add(dept);
		frame.add(addr);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(scroll);
		frame.add(male);
		frame.add(female);
		frame.add(submit);
		frame.add(close);
		
		frame.setSize(500,500);
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
				String str2 = t2.getText();
				String str3 = t3.getText();
				String str4 = t4.getText();
				String str6 = taddr.getText();
				
				String str5;
				if(male.isSelected())
				{
					str5 = male.getText();
				}
				else
				{
					str5 = female.getText();
				}
				
				frame = new JFrame();
				
				JLabel name = new JLabel("Name: ");
				name.setBounds(30, 30, 100, 30);
				
				JLabel display1 = new JLabel("Display");
				display1.setBounds(150, 30, 200, 30);
				
				JLabel mail = new JLabel("Mail Id: ");
				mail.setBounds(30, 80, 100, 30);
				
				JLabel display2 = new JLabel("Display");
				display2.setBounds(150, 80, 200, 30);
				 
				JLabel gender = new JLabel("Gender: ");
				gender.setBounds(30, 130, 100, 30);
				
				JLabel display3 = new JLabel("Display");
				display3.setBounds(150, 130, 80, 30);
				
				JLabel designation = new JLabel("Designation: ");
				designation.setBounds(30, 180, 100, 30);
				
				JLabel display4 = new JLabel("Display");
				display4.setBounds(150, 180, 200, 30);
				 
				JLabel dept = new JLabel("Department: ");
				dept.setBounds(30, 230, 100, 30);
				
				JLabel display5 = new JLabel("Display");
				display5.setBounds(150, 230, 200, 30);
				 
				JLabel addr = new JLabel("Address: ");
				addr.setBounds(30, 280, 100, 30);
				
				JTextArea displayAddr = new JTextArea();
				scroll = new JScrollPane(displayAddr);
				scroll.setBounds(150, 280, 200, 80);
				
				frame.add(name);
				frame.add(mail);
				frame.add(gender);
				frame.add(designation);
				frame.add(dept);
				frame.add(addr);
				frame.add(display1);
				frame.add(display2);
				frame.add(display3);
				frame.add(display4);
				frame.add(display5);
				frame.add(scroll);
				
				frame.setSize(500, 500);
				frame.setLayout(null);
				frame.setVisible(true);
				
				display1.setText(str1);
				display2.setText(str2);
				display3.setText(str5);
				display4.setText(str3);
				display5.setText(str4);
				displayAddr.setText(str6);
				
			}
		});
	}
	
	public static void main(String [] args)
	{
		First2Frame first = new First2Frame();
	}
}
