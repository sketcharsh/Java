import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    Container c;
    JLabel title, fName, lName, gender, lCity, tech;
    JTextField tFirst, tLast;
    JRadioButton male, female;
    ButtonGroup bg;
    JComboBox city;
    JCheckBox java, swing, android;
    // JCheckBox IntTech;
    JButton submit, close;
    JLabel display;

    RegForm()
	{
		c = this.getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		
//		Font f = new Font("Arial",20,Font.BOLD);
		
		title = new JLabel("<html><font><b><u>REGISTRATION FORM</u></b></font></html>");
		title.setBounds(100, 0, 200, 20);
//		title.setFont(f);
		
		fName = new JLabel("First Name: ");
		fName.setBounds(0, 30, 200, 20);
		
		tFirst = new JTextField();
		tFirst.setBounds(80, 30, 200, 20);
		
		lName = new JLabel("Last Name: ");
		lName.setBounds(0, 70, 200, 20);
		
		tLast = new JTextField();
		tLast.setBounds(80, 70, 200, 20);
		
		gender = new JLabel("Gender");
		gender.setBounds(0, 110, 200, 20);
		
		male = new JRadioButton("Male",true);
		male.setBounds(80, 110, 70, 20);
		
		female = new JRadioButton("Female");
		female.setBounds(150, 110, 90, 20);
		
		bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		lCity = new JLabel("City");
		lCity.setBounds(0, 150, 200, 20);
	
		String cityName[] = {"Rajkot","Ahmedabad","Surat"};
		city = new JComboBox(cityName);
		city.setBounds(80, 150, 200, 20);
		
		tech = new JLabel("Int. Tech.: ");
		tech.setBounds(0, 190, 200, 20);
		
//		String[] value = {"Java","Swing","Android"};
//		JCheckBox[] boxes = new JCheckBox[value.length];
//		for(int i = 0; i < boxes.length; i++)
//		{
//			IntTech = new JCheckBox(value[i]);
//		}
//		IntTech.setBounds(80, 190, 200, 20);	
		
		java = new JCheckBox("Java");
		java.setBounds(80, 190, 60, 20);
		
		swing = new JCheckBox("Swing",true);
		swing.setBounds(140, 190, 80, 20);
		
		android = new JCheckBox("Android");
		android.setBounds(210, 190, 90, 20);
		
		submit = new JButton("SUBMIT");
		submit.setBounds(80, 220, 100, 20);
		
		close = new JButton("CLOSE");
		close.setBounds(200, 220, 100, 20);
		
		display = new JLabel();
		display.setBounds(0, 270, 1000, 100);
		
		c.add(title);
		c.add(fName);
		c.add(tFirst);
		c.add(lName);
		c.add(tLast);
		c.add(gender);
		c.add(male);
		c.add(female);
		c.add(lCity);
		c.add(city);
		c.add(tech);
//		c.add(IntTech);
		c.add(java);
		c.add(swing);
		c.add(android);
		c.add(submit);
		c.add(close);
		c.add(display);
		
	    submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				
//				display.setText("FIRST NAME: " + tFirst.getText() + "\n"
//						+ "LAST NAME: " + tLast.getText() + "\n");		
//				if(male.isSelected())
//				{
//					display.setText("FIRST NAME: " + tFirst.getText()
//							+ "\n LAST NAME: " + tLast.getText() 
//							+ "\n GENDER: " + male.getText() 
//							+ "\n CITY: " + city.getSelectedItem().toString() 
//							+ "\n Int. Tech.:");
//				}
//				else
//				{
//					display.setText("FIRST NAME: " + tFirst.getText()
//							+ "\n LAST NAME: " + tLast.getText()
//							+ "\n GENDER: " + female.getText()
//							+ "\n CITY: " + city.getSelectedItem().toString()
//							+ "\n Int. Tech.:");
//				}
				
				display.setText("FIRST NAME: " + tFirst.getText()
						+ "\n LAST NAME: " + tLast.getText() 
						+ "\n GENDER: " + male.getText() 
						+ "\n CITY: " + city.getSelectedItem().toString() 
						+ "\n Int. Tech.:");
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

    public static void main(String[] args) {
        Register rf = new Register();
        rf.setSize(400, 400);
        rf.setLayout(null);
        rf.setVisible(true);
    }
}
