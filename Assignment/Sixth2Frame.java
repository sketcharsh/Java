import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class Sixth2Frame extends JFrame{
	
	JFrame frame;
	JLabel one,two,three;
	JSlider red,yellow,gray;
	JButton close;
	
	public Sixth2Frame() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		one = new JLabel("Red Slider ");
		one.setBounds(40, 40, 100, 30);
		
		red = new JSlider();
		red.setBounds(100, 40, 250, 100);
		
		two = new JLabel("Yellow Slider ");
		two.setBounds(40, 100, 100, 30);
		
		yellow = new JSlider();
		yellow.setBounds(100, 100, 250, 100);
		
		three = new JLabel("Gray Slider ");
		three.setBounds(40, 160, 100, 30);
		
		gray = new JSlider();
		gray.setBounds(100, 160, 250, 100);
		
		close = new JButton("CLOSE");
		close.setBounds(200, 350, 100, 20);
		
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(red);
		frame.add(yellow);
		frame.add(gray);
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
		
		red.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().setBackground(Color.RED);
			}
		});
		
		yellow.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().setBackground(Color.YELLOW);
			}
		});

		gray.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().setBackground(Color.LIGHT_GRAY);
			}
		});
	}
	
	public static void main(String [] args)
	{
		Sixth2Frame s2 = new Sixth2Frame();
	}
}
