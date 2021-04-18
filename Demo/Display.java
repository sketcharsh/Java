import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Display extends JFrame {
	Container c;
	JLabel fn, ln, r1, r2;
	JButton close, search;
	Connection connection;
	Statement statement;

	Display() {
		c = this.getContentPane();
		fn = new JLabel("First Name");
		fn.setBounds(0, 30, 100, 20);

		ln = new JLabel("Last Name");
		ln.setBounds(0, 70, 100, 20);

		r1 = new JLabel("Result 1");
		r1.setBounds(70, 30, 100, 20);

		r2 = new JLabel("Result 2");
		r2.setBounds(70, 70, 100, 20);

		close = new JButton("Close");
		close.setBounds(70, 150, 80, 30);

		search = new JButton("Search");
		search.setBounds(140, 150, 80, 30);

		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String url = "jdbc:mysql://128.66.203.247/it18a36";
				String user = "it18a36";
				String pass = "sumo@123";

				try {

					Class.forName("com.mysql.jdbc.Driver");
					connection = DriverManeger.getConnection(url, user, pass);
					statement = connection.createStatement();
					ResultSet set = statement.executeQuery("select * from JavaStud");
					while (set.next())
						;
					{
						int S_id = set.getInt("S_id");
						String Fname = set.getString("Fname");
						String Lname = set.getString("Lname");
					}

				} catch (Exception e) {
					e.getMessage();
				}
			}
		});

		c.add(fn);
		c.add(ln);
		c.add(r1);
		c.add(r2);
		c.add(close);
		c.add(search);
	}

	public static void main(String[] args) {
		Display d1 = new Display();
		d1.setSize(500, 500);
		d1.setLayout(null);
		d1.setVisible(true);
	}
}