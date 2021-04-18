import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;

import java.awt.*;
import java.awt.event.*;
public class JMenuDemo extends JFrame
{
//	Container c;
	JMenuBar mb;
	JButton close;
	JLabel title,number1,number2,result;
	JTextField t1,t2;
	JMenu m;
	JMenuItem it1,it2,it3,it4;
	JMenuDemo()
	{
//		c=this.getContentPane();
		JFrame f = new JFrame("Menu and MenuItem Example");
		
		title = new JLabel("CALCULATOR");
		title.setBounds(100, 0, 200, 20);
		
		number1 = new JLabel("First Number: ");
		number1.setBounds(0, 30, 200, 20);
		
		t1 = new JTextField();
		t1.setBounds(120, 30, 200, 20);
		
		number2 = new JLabel("Second Number: ");
		number2.setBounds(0, 70, 200, 20);
		
		t2 = new JTextField();
		t2.setBounds(120, 70, 200, 20);
		
		result = new JLabel("Result");
		result.setBounds(130, 200, 100, 20);
		
		mb = new JMenuBar();
		m = new JMenu("Calculator");
		it1 = new JMenuItem("Add");
		it2 = new JMenuItem("Mul");
		it3 = new JMenuItem("Div");
		it4 = new JMenuItem("sub");
		
		m.add(it1);
		m.add(it2);
		m.add(it3);
		m.add(it4);
		mb.add(m);
		
		f.add(title);
		f.add(number1);
		f.add(t1);
		f.add(number2);
		f.add(t2);
		f.add(result);
		close = new JButton("CLOSE");
		close.setBounds(130, 250, 100, 20);
		
		f.setJMenuBar(mb);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
//		c.add(mb);
//		c.add(m);
		f.add(close);
		
		it1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String strNum1 = t1.getText();
				String strNum2 = t2.getText();
				
				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				result.setText(no1+no2+"");
			}
		});
		
		it2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String strNum1 = t1.getText();
				String strNum2 = t2.getText();
				
				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				result.setText(no1*no2+"");
			}
		});
		
	it3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String strNum1 = t1.getText();
				String strNum2 = t2.getText();
				
				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				result.setText(no1/no2+"");
			}
		});
	it4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			String strNum1 = t1.getText();
			String strNum2 = t2.getText();
			
			int no1 = Integer.parseInt(strNum1);
			int no2 = Integer.parseInt(strNum2);
			result.setText(no1-no2+"");
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
	public static void main(String[]args)
	{
		JMenuDemo m1 =new JMenuDemo();
	}
}
