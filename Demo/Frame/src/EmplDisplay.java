import javax.swing.*;
import com.mysql.jdbc.PreparedStatement;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class EmplDisplay 
{
	JFrame f1;
	EmplDisplay()
	{
		f1 = new JFrame();
		JLabel id,ename, gender, dept, des, hobby, address,pename,pgender,pdept,pdes,phobby,paddress;
		JTextField t2;
		JButton show,close,add;
		id = new JLabel("E_ID: ");
		id.setBounds(280, 30, 100, 30);
		t2 = new JTextField();
		t2.setBounds(320, 30, 100, 30);
		ename = new JLabel("Employee Name: ");
		ename.setBounds(30, 30, 150, 30);
		gender = new JLabel("Gender: ");
		gender.setBounds(30, 80, 100, 30);
		dept = new JLabel("Department: ");
		dept.setBounds(30, 130, 100, 30);
		des = new JLabel("Designation: ");
		des.setBounds(30, 180, 100, 30);
		hobby = new JLabel("Hobby: ");
		hobby.setBounds(30, 230, 100, 30);
		address = new JLabel("Address: ");
		address.setBounds(30, 280, 100, 30);
		
		pename = new JLabel("Display Ename");
		pename.setBounds(150, 30, 100, 30);
		pgender = new JLabel("Gender");
		pgender.setBounds(150, 80, 70, 30);
		pdept = new JLabel("Dept");
		pdept.setBounds(150, 130, 150, 30);
		pdes = new JLabel("Designation");
		pdes.setBounds(150, 180, 150, 30);
		phobby = new JLabel("Hobby");
		phobby.setBounds(150, 230, 185, 30);
		paddress = new JLabel("Address");
		paddress.setBounds(150, 280, 200, 30);
		
		add = new JButton("Insert");
		add.setBounds(70, 370, 100, 30);
		show = new JButton("Display");
		show.setBounds(370, 370, 100, 30);
		close = new JButton("Close");
		close.setBounds(270, 370, 100, 30);
		f1.add(t2);
		f1.add(id);
		f1.add(ename);
		f1.add(gender);
		f1.add(dept);
		f1.add(des);
		f1.add(hobby);
		f1.add(address);
		f1.add(pename);
		f1.add(pgender);
		f1.add(pdept);
		f1.add(pdes);
		f1.add(phobby);
		f1.add(paddress);
		f1.add(show);
		f1.add(close);
		f1.add(add);
		f1.setSize(500,500);
		f1.setLayout(null);
		f1.setVisible(true);
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				EmplJDBC e1 = new EmplJDBC();
			}
		});
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					JDBCFile f1 = new JDBCFile();
					String id = t2.getText().toString();
//					ResultSet set = f1.statement.executeQuery("select * from EmplJDBC where eid=id");
					String query = "select ename,gender,dept,des,hobby,addr from EmplJDBC where eid=?";
					PreparedStatement preparedStmt = (PreparedStatement) f1.connection.prepareStatement(query);
					preparedStmt.setString(1,id);
					ResultSet set = preparedStmt.executeQuery(query);
					while (set.next()) {
						// int id = set.getInt("S_id");
						String pn = set.getString("ename");
						String pg = set.getString("gender");
						String pdpt = set.getString("dept");
						String pds = set.getString("des");
						String phob = set.getString("hobby");
						String padd = set.getString("addr");
						pename.setText(pn);
						pgender.setText(pg);
						pdept.setText(pdpt);
						pdes.setText(pds);
						phobby.setText(phob);
						paddress.setText(padd);
					}

				} catch (Exception e) {
					e.getMessage();
				}
			}
		});
		
	}
	public static void main(String[] args) 
	{
		EmplDisplay d1 = new EmplDisplay();
	}
}
