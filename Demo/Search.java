import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Search extends JFrame
{
	JFrame frame;
	JLabel fn,ln,r1,r2;
	JButton close,show;
	Search()
	{
		frame = new JFrame();
		
		fn = new JLabel("First Name");
		fn.setBounds(0, 30, 100, 20);
		
		ln = new JLabel("Last Name");
		ln.setBounds(0,70,100,20);
		
		r1 = new JLabel("Result 1");
		r1.setBounds(70, 30, 100, 20);
		
		r2 = new JLabel("Result 2");
		r2.setBounds(70,70,100,20);
		
		close = new JButton("Close");
		close.setBounds(70,120,80,30);
		
		show = new JButton("Display");
		show.setBounds(150,120,80,30);
		
		frame.add(fn);
		frame.add(ln);
		frame.add(r1);
		frame.add(r2);
		frame.add(close);
		frame.add(show);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
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
//				String user="mscfy36";
//				String pass="sumo@123";
//				String url="jdbc:mysql://128.66.203.247/mscfy36";
//				
				try
				{
					
//						Class.forName("com.mysql.jdbc.Driver");
//						
//						connection = DriverManager.getConnection(url,user,pass);
//						statement = connection.createStatement();
						JDBCFile f1 = new JDBCFile();
						ResultSet set = f1.statement.executeQuery("select * from JavaStud");
						while(set.next())
						{
							//int id = set.getInt("S_id");
							String fname = set.getString("Fname");
							String lname = set.getString("Lname");
							
							r1.setText(fname);
							r2.setText(lname);
						}

				}
				catch(Exception e)
				{
					e.getMessage();
				}
			}
		});
		
	}
	public static void main(String[] args) 
	{
		Search s1 = new Search();
	}
}