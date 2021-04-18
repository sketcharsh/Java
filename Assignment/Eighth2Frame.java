import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eighth2Frame extends JFrame
{
	JFrame frame;
	JLabel label;
	JMenuBar bar;
	JMenu menu1,menu2;
	JMenuItem cut,copy,paste,selectAll;
	JTextArea text;
	JScrollPane scroll;
	JButton close;
	
	public Eighth2Frame() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		bar = new JMenuBar();
		
		menu1 = new JMenu("Menu 1");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		menu1.add(cut);
		menu1.add(copy);
		
		menu2 = new JMenu("Menu 2");
		paste = new JMenuItem("Paste");
		selectAll = new JMenuItem("Select All");
		menu2.add(paste);
		menu2.add(selectAll);
		
		bar.add(menu1);
		bar.add(menu2);
		
		label = new JLabel("Text: ");
		label.setBounds(30, 100, 100, 30);
		
		text = new JTextArea();
		scroll = new JScrollPane(text);
		scroll.setBounds(100, 100, 250, 80);
		
		close = new JButton("Close");
		close.setBounds(130, 250, 100, 20);
		
		frame.setJMenuBar(bar);
		frame.add(label);
		frame.add(scroll);
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
		
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.cut();
			}
		});
		
		paste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.paste();
			}
		});
		
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.copy();
			}
		});
		
		selectAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.selectAll();
			}
		});
	}
	
	public static void main(String [] args)
	{
		Eighth2Frame e2 = new Eighth2Frame();
	}
}
