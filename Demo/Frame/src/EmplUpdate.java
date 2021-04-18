import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;
public class EmplUpdate
{
	JFrame f1;
	JLabel id,ename, gender, dept, des, hobby, address;
	JTextArea Add;
	JTextField t1,t2;
	JRadioButton m, f;
	JComboBox deptCB, desCB;
	JCheckBox reading, singing, football;
	ButtonGroup bg;
	JScrollPane sp;
	JButton close, update,show;
	EmplUpdate()
	{
		f1 = new JFrame();
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
		Add = new JTextArea(5, 10);
		sp = new JScrollPane(Add);
		sp.setBounds(150, 280, 200, 70);
		t1 = new JTextField();
		t1.setBounds(150, 30, 100, 30);
		bg = new ButtonGroup();
		m = new JRadioButton("Male", true);
		m.setBounds(150, 80, 70, 30);
		f = new JRadioButton("Female");
		f.setBounds(250, 80, 100, 30);
		bg.add(m);
		bg.add(f);
		String dep[] = { "Sales", "Marketing", "HR", "IT" };
		deptCB = new JComboBox(dep);
		deptCB.setBounds(150, 130, 150, 30);
		String desg[] = { "CEO", "Analyst", "Admin", "Manager" };
		desCB = new JComboBox(desg);
		desCB.setBounds(150, 180, 150, 30);
		reading = new JCheckBox("Reading", true);
		reading.setBounds(150, 230, 85, 30);
		singing = new JCheckBox("Singing");
		singing.setBounds(230, 230, 80, 30);
		football = new JCheckBox("Football");
		football.setBounds(310, 230, 100, 30);
		
		close = new JButton("Close");
		close.setBounds(400, 430, 100, 30);

		update = new JButton("Update");
		update.setBounds(170, 370, 100, 30);

		show = new JButton("Display");
		show.setBounds(370, 370, 100, 30);
		
		show.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				EmplDisplay d1 = new EmplDisplay();
			}
		});
		update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					JDBCFile f1 = new JDBCFile();
					String fname = t1.getText();
					String gender = "Female";
					if (m.isSelected())
						gender = "Male";
					String depart = (String) deptCB.getSelectedItem();
					String desig = (String) desCB.getSelectedItem();
					String valuesOfCheckBox = "";
					if (reading.isSelected() || singing.isSelected() || football.isSelected()) {
						if (reading.isSelected()) {
							valuesOfCheckBox = reading.getText();
						}
						if (singing.isSelected()) {
							valuesOfCheckBox = singing.getText();
						}
						if (football.isSelected()) {
							valuesOfCheckBox = football.getText();
						}
						if (reading.isSelected() && singing.isSelected()) {
							valuesOfCheckBox = reading.getText() + "," + singing.getText();
						}
						if (reading.isSelected() && football.isSelected()) {
							valuesOfCheckBox = reading.getText() + "," + football.getText();
						}
						if (singing.isSelected() && football.isSelected()) {
							valuesOfCheckBox = singing.getText() + "," + football.getText();
						}
						if (reading.isSelected() && singing.isSelected() && football.isSelected()) {
							valuesOfCheckBox = reading.getText() + "," + singing.getText() + "," + football.getText();
						}
					} else {
						valuesOfCheckBox = "No Hobbies";
					}
					String addr = Add.getText();
					String id = t2.getText().toString();
					String query = "update EmplJDBC set ename=?,gender=?,dept=?,des=?,hobby=?,addr=? where eid=?";
					PreparedStatement preparedStmt = (PreparedStatement) f1.connection.prepareStatement(query);
					preparedStmt.setString(1, fname);
					preparedStmt.setString(2, gender);
					preparedStmt.setString(3, depart);
					preparedStmt.setString(4, desig);
					preparedStmt.setString(5, valuesOfCheckBox);
					preparedStmt.setString(6, addr);
					preparedStmt.setString(7, id);

					int set = preparedStmt.executeUpdate();
					// int set = f1.statement.executeUpdate("INSERT INTO EmplJDBC
					// (ename,gender,dept,des,hobby,addr) VALUES
					// ('"+fname+"','"+gender+"','"+depart+"','"+desig+"','"+valuesOfCheckBox+"','"+addr+"')");
					if (set > 0) {
						System.out.println("Updated");
					} else {
						System.out.println("Result not set");
					}
				} catch (Exception e) {
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
		f1.add(id);
		f1.add(ename);
		f1.add(gender);
		f1.add(dept);
		f1.add(des);
		f1.add(hobby);
		f1.add(address);
		f1.add(sp);
		f1.add(t1);
		f1.add(t2);
		f1.add(m);
		f1.add(deptCB);
		f1.add(f);
		f1.add(desCB);
		f1.add(reading);
		f1.add(singing);
		f1.add(football);
		f1.add(close);
		f1.add(update);
		f1.add(show);
		f1.setSize(500,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		EmplUpdate d1 = new EmplUpdate();
	}
}
