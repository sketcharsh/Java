import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JavaStud extends JFrame
{
	Container c;
	JLabel fn,ln;
	JTextField t1,t2;
	JButton close,add,update,delete,show;
	JavaStud()
	{
		c = this.getContentPane();
		fn = new JLabel("First Name");
		fn.setBounds(0, 30, 100, 20);
		
		ln = new JLabel("Last Name");
		ln.setBounds(0,70,100,20);
		
		t1 = new JTextField();
		t1.setBounds(100,30,100,20);
		
		t2 = new JTextField();
		t2.setBounds(100,70,100,20);
		
		close = new JButton("Close");
		close.setBounds(30,150,80,30);
		
		add = new JButton("Add");
		add.setBounds(120,150,80,30);
		
		update = new JButton("Update");
		update.setBounds(210,150,80,30);
		
		delete = new JButton("Delete");
		delete.setBounds(300,150,80,30);
		
		show = new JButton("Display");
		show.setBounds(390,150,80,30);
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		show.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Display d1 = new Display();
				d1.setSize(500,500);
				d1.setLayout(null);
				d1.setVisible(true);
			}
		});
		
		c.add(fn);
		c.add(ln);
		c.add(t1);
		c.add(t2);
		c.add(close);
		c.add(update);
		c.add(delete);
		c.add(show);
		c.add(add);
	}
	public static void main(String[] args) 
	{
		JavaStud s1 = new JavaStud();
		s1.setSize(500,500);
		s1.setLayout(null);
		s1.setVisible(true);
	}
}
