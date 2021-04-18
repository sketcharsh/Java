import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class Second2Frame extends JFrame
{
	JFrame frame;
	JLabel name,result,clr;
	JTextField t1;
	JSlider slider;
	JButton close;
	JComboBox box;
	Font f;
	
	Second2Frame()
	{
		frame = new JFrame();
		
		name = new JLabel("Name: ");;
		name.setBounds(30, 30, 100, 20);
		
		t1 = new JTextField();
		t1.setBounds(80, 30, 150, 20);
		
		slider = new JSlider(0,30);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(80, 100, 250, 100);
		
		result = new JLabel("result");
		result.setBounds(80, 180, 150, 30);
		
		clr = new JLabel("Colors");
		clr.setBounds(30,250, 80, 30);
		
		String clrName[] = {"Red","Yellow","Gray"};
		box = new JComboBox(clrName);
		box.setBounds(80,250, 100, 30);

		close = new JButton("CLOSE");
		close.setBounds(200, 350, 100, 20);
		
		frame.add(name);
		frame.add(t1);
		frame.add(slider);
		frame.add(result);
		frame.add(clr);
		frame.add(box);
		frame.add(close);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				result.setText("Name: " + t1.getText().toString());
				f = new Font("Arial",f.BOLD,slider.getValue());
				result.setFont(f);
				
			}
		});
		
		box.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				switch(box.getSelectedIndex())
				{
				case 0:
						frame.getContentPane().setBackground(Color.RED);
					break;
				case 1:
						frame.getContentPane().setBackground(Color.YELLOW);
					break;
				case 2:
						frame.getContentPane().setBackground(Color.LIGHT_GRAY);
					break;
				}
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
	
	public static void main(String [] args)
	{
		Second2Frame s2 = new Second2Frame();
	}
}
