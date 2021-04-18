import javax.swing.*;
import com.mysql.jdbc.PreparedStatement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class StudPrep extends JFrame
{
	Container c;
	JLabel fn,ln;
	JTextField t1,t2;
	JButton close,add,update,delete,show;
	StudPrep()
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
				SearchPre s1 = new SearchPre();
			}
		});
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try
				{
				JDBCFile f1 = new JDBCFile();
			
				String fname = t1.getText();
				String lname = t2.getText();
				String query = "insert into JavaStud(Fname,Lname) values(?,?);";
				 PreparedStatement preparedStmt = (PreparedStatement)f1.connection.prepareStatement(query);
			      preparedStmt.setString(1, fname);
			      preparedStmt.setString(2, lname);
			      int set = preparedStmt.executeUpdate();
			      JDBCFile.connection.close();
//				int set = f1.statement.executeUpdate("INSERT INTO JavaStud (Fname,Lname) VALUES ('"+fname+"','"+lname+"')");
				 if(set > 0)
				 {
					 System.out.println("Done");
				 }
				 else
				 {
					 System.out.println("Result not set");
				 }
				}
				catch(Exception e)
				{
				}
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
		StudPrep s1 = new StudPrep();
		s1.setSize(500,500);
		s1.setLayout(null);
		s1.setVisible(true);
	}
}
