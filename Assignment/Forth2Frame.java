import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Forth2Frame extends JFrame
{
	JFrame frame;
	JLabel title,name,gender,course,categories;
	JTextField t1,t2;
	JButton close,submit;
	JRadioButton male,female;
	ButtonGroup bg;
	JComboBox box;
	
	public Forth2Frame() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		
		title = new JLabel("Student Sports Registration form");
		title.setBounds(100,0, 250, 30);
		
		name = new JLabel("Name: ");
		name.setBounds(30, 30, 100, 30);
		
		t1 = new JTextField();
		t1.setBounds(100, 30, 180, 30);
		
		gender = new JLabel("Gender: ");
		gender.setBounds(30, 70, 100, 30);
		
		male = new JRadioButton("Male");
		male.setBounds(100, 70, 70, 30);
		
		female = new JRadioButton("Female",true);
		female.setBounds(180, 70, 80, 30);
		
		bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		course = new JLabel("Course: ");
		course.setBounds(30, 110, 100, 30);
		
		t2 = new JTextField();
		t2.setBounds(100, 110, 180, 30);
		
		categories = new JLabel("Categories: ");
		categories.setBounds(30, 150, 100, 30);
		
		String item[] = {"Athletic sports","Acrobatic sports","Beach sports","Indoor sports"
				,"Summer sports"};
		box = new JComboBox(item);
		box.setBounds(100, 150, 160, 30);
		
		submit = new JButton("Submit");
		submit.setBounds(100, 200, 100, 20);
		
		close = new JButton("CLOSE");
		close.setBounds(200, 350, 100, 20);
		
		frame.add(title);
		frame.add(name);
		frame.add(gender);
		frame.add(course);
		frame.add(categories);
		frame.add(t1);
		frame.add(t2);
		frame.add(male);
		frame.add(female);
		frame.add(box);
		frame.add(submit);
		frame.add(close);
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
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
				String str1 = t1.getText().toString();
				String str2 = t2.getText().toString();
				String str3;
				if(male.isSelected())
				{
					str3 = male.getText().toString();
				}
				else
				{
					str3 = female.getText().toString();
				}
				String str5 = box.getSelectedItem().toString();
			
				JFrame f = new JFrame();
				JLabel result = new JLabel("Result");
				result.setBounds(0, 150, 500, 30);
				f.add(result);
				result.setText("Name: "+str1+"\n"+"Course Name: "+str2+"\n"
				+"Gender: "+str3+"\n"+"Categories: "+str5+"\n");
				f.setSize(500,500);
				f.setLayout(null);
				f.setVisible(true);
			}
		});
	}
	
	public static void main(String [] args)
	{
		Forth2Frame f2 = new Forth2Frame();
		
	}
}
