import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class azlogindemo extends JFrame {

	azlogindemo()
	{
		Container c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GRAY);
		JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12;
		JTextField t1,t2;
		JButton button1;
		JRadioButton RButton1,RButton2;
		ButtonGroup btngrp;
		JCheckBox CButton1,CButton2;
		JComboBox Com1;
		String arr[]= {"Ahmedabad","Surat","Vadodara"};
		label1=new JLabel("log in page");
		label2=new JLabel("First name");
		label3=new JLabel("Lastname");
		label4=new JLabel("Gender");
		label5=new JLabel("Interested in ");
		label6=new JLabel("City");
		label7=new JLabel("...");
		label8=new JLabel("...");
		label9=new JLabel("...");
		label10=new JLabel("...");
		label11=new JLabel("...");
		label12=new JLabel("...");
		
		
		t1=new JTextField();
		t2=new JTextField();
		
		RButton1=new JRadioButton("Male");
		RButton2=new JRadioButton("Female");
		CButton1=new JCheckBox("Java");
		CButton2=new JCheckBox("Python");
		Com1=new JComboBox(arr);
		button1=new JButton("Submit");
		btngrp=new ButtonGroup();
		
		btngrp.add(RButton1);
		btngrp.add(RButton2);
		
		
		c.add(label1);
		c.add(label2);
		c.add(label3);
		c.add(label4);
		c.add(label5);
		c.add(label6);
		c.add(label7);
		c.add(label8);
		c.add(label9);
		c.add(t1);
		c.add(t2);
		c.add(CButton1);
		c.add(CButton2);
		c.add(RButton1);
		c.add(RButton2);
		c.add(Com1);
		c.add(button1);
		c.add(label10);
		c.add(label11);
		c.add(label12);
		
		label1.setBounds(200,50,80,40);
		label2.setBounds(50,100,80,40);
		t1.setBounds(150,100,100,40);
		label3.setBounds(50,150,80,40);
		t2.setBounds(150,150,100,40);
		label4.setBounds(50,200,80,40);

		RButton1.setBounds(150,200,80,40);
		RButton2.setBounds(250,200,80,40);
		
		label5.setBounds(50,250,80,40);

		Com1.setBounds(150,250,100,40);
		
		label6.setBounds(50,300,80,40);
		CButton1.setBounds(150,300,80,40);
		CButton2.setBounds(250,300,80,40);
		
		button1.setBounds(200,350,80,40);
		
		label7.setBounds(50,400,80,40);
		label8.setBounds(100,400,80,40);
		label9.setBounds(200,400,80,40);
		label10.setBounds(250,400,80,40);
		label11.setBounds(350,400,80,40);
		label12.setBounds(400,400,80,40);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text1=t1.getText();
				label7.setText(text1);
				String text2=t2.getText();
				label8.setText(text2);
				
				if(RButton1.isSelected()) {
					label9.setText(RButton1.getText().toString());
				}
				if(RButton2.isSelected()) {
					label9.setText(RButton1.getText().toString());
				}
				
				label10.setText(Com1.getSelectedItem().toString());
				
				if(CButton1.isSelected()) {
					label11.setText(CButton1.getText().toString());
				}
				if(CButton2.isSelected()) {
					label12.setText(CButton2.getText().toString());
				}
			}
		});
	}
	public static void main(String args[]) {
		azlogindemo s1=new azlogindemo();
		s1.setVisible(true);
		s1.setLayout(null);
		s1.setSize(500, 500);
	}
}
