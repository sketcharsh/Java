import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Third2Frame extends JFrame {
	
	JFrame frame;
	JLabel unit,result;
	JTextField t1;
	JMenu menu1,menu2;
	JMenuBar bar;
	JMenuItem RtoD,RtoE,RtoY,CtoM,CtoK;
	JButton close;
	
	public Third2Frame() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame("Menu");
		
		bar = new JMenuBar();
		
		menu1 = new JMenu("Menu1");
		RtoD = new JMenuItem("RtoD");
		RtoE = new JMenuItem("RtoE");
		RtoY = new JMenuItem("RtoY");
		menu1.add(RtoD);
		menu1.add(RtoE);
		menu1.add(RtoY);
		bar.add(menu1);
		
		menu2 = new JMenu("Menu1");
		CtoM = new JMenuItem("CtoM");
		CtoK = new JMenuItem("CtoK");
		menu2.add(CtoM);
		menu2.add(CtoK);
		bar.add(menu2);
		
		unit = new JLabel("Enter Number: ");
		unit.setBounds(30, 30, 100, 30);
		
		t1 = new JTextField();
		t1.setBounds(130, 30, 140, 30);
		
		result = new JLabel("Result");
		result.setBounds(130, 100, 100, 30);
		
		close = new JButton("CLOSE");
		close.setBounds(200, 300, 100, 20);
		
		frame.setJMenuBar(bar);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(unit);
		frame.add(t1);
		frame.add(result);
		frame.add(close);
		
		RtoD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = t1.getText();
				
				Double no1 = Double.parseDouble(str);
				result.setText(no1*0.014+"");
			}
		});
		
		RtoE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = t1.getText();
				
				Double no1 = Double.parseDouble(str);
				result.setText(no1*0.012+"");
			}
		});
		
		RtoY.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = t1.getText();
				
				Double no1 = Double.parseDouble(str);
				result.setText(no1*1.54+"");
			}
		});
		
		CtoM.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = t1.getText();
				
				Double no1 = Double.parseDouble(str);
				result.setText(no1*0.01+"");
			}
		});
		
		CtoK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = t1.getText();
				
				Double no1 = Double.parseDouble(str);
				result.setText(no1*0.00001+"");
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
		Third2Frame t2 = new Third2Frame();
		
	}
}
