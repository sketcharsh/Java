import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame {
	Converter() {
		JFrame f1 = new JFrame("Converter");
		JMenuBar mb = new JMenuBar();
		JMenu Temp, Size, Currency;
		JMenuItem t1, t2, s1, s2, c1, c2;
		JLabel title, number1;
		final JLabel result;
		final JTextField text1;
		JButton close;

		title = new JLabel("Converter");
		title.setBounds(150, 0, 200, 20);

		number1 = new JLabel("Enter Value: ");
		number1.setBounds(0, 30, 200, 20);

		text1 = new JTextField();
		text1.setBounds(120, 30, 200, 20);

		// number2 = new JLabel("Second Number: ");
		// number2.setBounds(0, 70, 200, 20);
		//
		// text2 = new JTextField();
		// text2.setBounds(120, 70, 200, 20);

		result = new JLabel("Result");
		result.setBounds(130, 100, 100, 20);

		Temp = new JMenu("Temp");
		Size = new JMenu("Size");
		Currency = new JMenu("Currency");

		close = new JButton("CLOSE");
		close.setBounds(200, 100, 100, 20);

		t1 = new JMenuItem("C to F");
		t2 = new JMenuItem("F to C");
		s1 = new JMenuItem("M to CM");
		s2 = new JMenuItem("KM to M");
		c1 = new JMenuItem("D to R");
		c2 = new JMenuItem("R to D");

		Temp.add(t1);
		Temp.add(t2);

		Size.add(s1);
		Size.add(s2);

		Currency.add(c1);
		Currency.add(c2);

		mb.add(Temp);
		mb.add(Size);
		mb.add(Currency);

		f1.add(title);
		f1.add(number1);
		f1.add(text1);
		// f1.add(number2);
		// f1.add(text2);
		f1.add(result);
		f1.add(close);

		f1.setJMenuBar(mb);

		f1.setSize(500, 500);
		f1.setLayout(null);
		f1.setVisible(true);

		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		s1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String strNum1 = text1.getText();

				int no1 = Integer.parseInt(strNum1);

				result.setText(no1 * 100 + "CM");

			}
		});

		s2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String strNum1 = text1.getText();

				int no1 = Integer.parseInt(strNum1);

				result.setText(no1 * 1000 + "KM");

			}
		});

		t1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String strNum1 = text1.getText();

				int no1 = Integer.parseInt(strNum1);

				result.setText((no1 - 32) * 5 / 9 + "�F");

			}
		});

		t2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String strNum1 = text1.getText();

				int no1 = Integer.parseInt(strNum1);

				result.setText((no1 * 9 / 5) + 32 + "�F");

			}
		});

		c1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String strNum1 = text1.getText();

				int no1 = Integer.parseInt(strNum1);

				result.setText(no1 * 67 + "Rupee");

			}
		});

		c2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sntrNum1 = text1.getText();

				float no1 = Integer.parseInt(strNum1);

				result.setText(no1 / 67 + "Dollar");
				JFrame fr = new JFrame();
				fr.setSize(500, 500);
				fr.setLayout(null);
				fr.setVisible(true);

				JLabel l = new JLabel("REsult");
				l.setBounds(130, 100, 100, 20);
				fr.add(l);
				l.setText(result.getText());

			}
		});

	}

	public static void main(String[] args) {
		Converter c1 = new Converter();
	}

}
