import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc1 extends JFrame {
	Container c;
	JLabel title, number1, number2, result;
	JTextField t1, t2, t3;
	JButton add, multi, divide, sub, close;

	Calc1() {
		c = this.getContentPane();

		title = new JLabel("<html><font><b><u>CALCULATOR 1</u></b></font></html>");
		title.setBounds(100, 0, 200, 20);

		number1 = new JLabel("First Number: ");
		number1.setBounds(0, 30, 200, 20);

		t1 = new JTextField();
		t1.setBounds(120, 30, 200, 20);

		number2 = new JLabel("Second Number: ");
		number2.setBounds(0, 70, 200, 20);

		t2 = new JTextField();
		t2.setBounds(120, 70, 200, 20);

		add = new JButton("ADD");
		add.setBounds(50, 150, 60, 20);

		multi = new JButton("MULTI");
		multi.setBounds(130, 150, 60, 20);

		divide = new JButton("DIVIDE");
		divide.setBounds(210, 150, 60, 20);

		sub = new JButton("SUB");
		sub.setBounds(290, 150, 60, 20);

		result = new JLabel("Result");
		result.setBounds(130, 200, 100, 20);

		close = new JButton("CLOSE");
		close.setBounds(130, 250, 100, 20);

		c.add(title);
		c.add(number1);
		c.add(t1);
		c.add(number2);
		c.add(t2);
		c.add(add);
		c.add(multi);
		c.add(divide);
		c.add(sub);
		c.add(result);
		c.add(close);

		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				// String strNum1 = t1.getText();
				// String strNum2 = t2.getText();

				int no1 = Integer.parseInt(t1.getText());
				int no2 = Integer.parseInt(t2.getText());
				result.setText(no1 + no2 + "");
			}
		});

		multi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				String strNum1 = t1.getText();
				String strNum2 = t2.getText();

				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				result.setText(no1 * no2 + "");
			}
		});

		divide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				String strNum1 = t1.getText();
				String strNum2 = t2.getText();

				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				result.setText(no1 / no2 + "");
			}
		});

		sub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				String strNum1 = t1.getText();
				String strNum2 = t2.getText();

				int no1 = Integer.parseInt(strNum1);
				int no2 = Integer.parseInt(strNum2);
				result.setText(no1 - no2 + "");
			}
		});
	}

	public static void main(String[] args) {
		Calc1 c1 = new Calc1();
		c1.setSize(500, 500);
		c1.setLayout(null);
		c1.setVisible(true);
	}
}
