import java.awt.Container;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

	@SuppressWarnings("serial")
	public class Slider1 extends JFrame{

		Container c;
		JSlider s;
		JLabel lbl1,lbl2,lbl3;
		JTextField txt1;
		
		Slider1()
		{
			c = this.getContentPane();
			c.setLayout(null);
			c.setVisible(true);
			
			s = new JSlider();
			
			lbl1 = new JLabel("Name : ");
			lbl2 = new JLabel("Name :");
			lbl3 = new JLabel("");
			
			txt1 = new JTextField();
			
			c.add(lbl1);
			c.add(lbl2);
			c.add(lbl3);
			c.add(txt1);
			c.add(s);
			
			lbl1.setBounds(100,100,100,50);
			txt1.setBounds(200,100,100,50);
			s.setBounds(50,200,50,200);
			s.setOrientation(1);
			lbl2.setBounds(100,250,100,50);
			lbl3.setBounds(200,250,100,100);
			s.setMinimum(0);
			s.setMaximum(20);
			
			s.setMajorTickSpacing(5);
			s.setPaintTicks(true);
			s.setPaintLabels(true);
			
			s.addChangeListener(new ChangeListener() {
				
				@Override
				public void stateChanged(ChangeEvent arg0) {
					// TODO Auto-generated method stub
					String sname = txt1.getText();
					lbl3.setText(sname);
					int size = s.getValue();
					Font f = new Font("Arial",Font.BOLD,size);
					
					lbl3.setFont(f);
				
			
					
				}
			});
		}
		public static void main(String[] args)
		{
			
			Slider1 s1 = new Slider1();
			s1.setVisible(true);
			s1.setLayout(null);
			s1.setSize(500,400);
			
		}
}
