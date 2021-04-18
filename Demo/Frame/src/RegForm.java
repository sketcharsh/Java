import javax.swing.*;
import java.awt.*;

public class RegForm extends JFrame
{
	Container c;
	JLabel title,fName,lName,gender,lCity,tech;
	JTextField tFirst,tLast;
	JRadioButton male,female;
	JComboBox city;
	JCheckBox java,swing,android;
	JButton submit;
	
	RegForm()
	{
		c = this.getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		
//		Font f = new Font("Arial",20,Font.BOLD);
		
		title = new JLabel("REGISTRATION FORM");
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
		
		lCity = new JLabel("City");
		lCity.setBounds(0, 150, 200, 20);
	
		String cityName[] = {"Rajkot","Ahmedabad","Surat"};
		city = new JComboBox(cityName);
		city.setBounds(80, 150, 200, 20);
		
		tech = new JLabel("Int. Tech.: ");
		tech.setBounds(0, 190, 200, 20);
		
		java = new JCheckBox("Java");
		java.setBounds(80, 190, 60, 20);
		
		swing = new JCheckBox("Swing",true);
		swing.setBounds(140, 190, 80, 20);
		
		android = new JCheckBox("Android");
		android.setBounds(210, 190, 90, 20);
		
		submit = new JButton("SUBMIT");
		submit.setBounds(80, 220, 100, 20);
		
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
		c.add(java);
		c.add(swing);
		c.add(android);
		c.add(submit);
	}
	public static void main(String [] args)
	{
		RegForm rf = new RegForm();
		rf.setSize(400,400);
		rf.setLayout(null);
		rf.setVisible(true);
	}
}
