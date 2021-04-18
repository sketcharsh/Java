import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;
public class EmplDelete
{
	JFrame f1;
	JLabel l1;
	JTextField t1;
	JButton delete,close;
	EmplDelete()
	{
		f1 = new JFrame();
		l1 = new JLabel("ID");
		l1.setBounds(30, 30, 100, 20);
	
		t1 = new JTextField();
		t1.setBounds(50,30,100,20);
		
		delete = new JButton("Delete");
		delete.setBounds(40,60,100,30);
		
		close = new JButton("Close");
		close.setBounds(150,60,100,30);
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try
				{
					String id = t1.getText().toString();
					
					JDBCFile f1 = new JDBCFile();
					String query = "delete from EmplJDBC where eid=?";
					PreparedStatement preparedStmt = (PreparedStatement)f1.connection.prepareStatement(query);
					preparedStmt.setString(1,id);
					preparedStmt.executeUpdate();
					System.out.println("Delete successfully");
				}
				catch(Exception e)
				{	
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
		f1.add(l1);
		f1.add(t1);
		f1.add(delete);
		f1.add(close);
		f1.setSize(500,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		EmplDelete d1 = new EmplDelete();
	}
}
