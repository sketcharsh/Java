import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
	Container c;
	JLabel title, number1, number2;
	JTextField t1, t2;
	JRadioButton simple, complex, red, blue;
	JButton display, close, converter;
	ButtonGroup bg;

	Calculator() {
		c = this.getContentPane();
		c.setBackground(Color.LIGHT_GRAY);

		title = new JLabel("<html><font><b><u>CALCULATE</u></b></font></html>");
		title.setBounds(100, 0, 200, 20);

		number1 = new JLabel("First Number: ");
		number1.setBounds(0, 30, 200, 20);

		t1 = new JTextField();
		t1.setBounds(120, 30, 200, 20);

		number2 = new JLabel("Second Number: ");
		number2.setBounds(0, 70, 200, 20);

		t2 = new JTextField();
		t2.setBounds(120, 70, 200, 20);

		simple = new JRadioButton("Simple", true);
		simple.setBounds(120, 110, 100, 20);

		complex = new JRadioButton("Complex");
		complex.setBounds(120, 150, 90, 20);

		bg = new ButtonGroup();
		bg.add(simple);
		bg.add(complex);

		display = new JButton("Display");
		display.setBounds(80, 220, 100, 20);

		converter = new JButton("Converter");
		converter.setBounds(320, 220, 100, 20);

		red = new JRadioButton("Red", true);
		red.setBounds(120, 270, 100, 20);

		blue = new JRadioButton("Blue");
		blue.setBounds(120, 300, 100, 20);

		bg = new ButtonGroup();
		bg.add(red);
		bg.add(blue);

		close = new JButton("CLOSE");
		close.setBounds(200, 220, 100, 20);

		c.add(title);
		c.add(number1);
		c.add(t1);
		c.add(number2);
		c.add(t2);
		c.add(simple);
		c.add(complex);
		c.add(display);
		c.add(red);
		c.add(blue);
		c.add(converter);

		c.add(close);

		display.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (red.isSelected() && simple.isSelected()) {
					Calc1 c1 = new Calc1();
					c1.getContentPane().setBackground(Color.red);
					c1.setSize(500, 500);
					c1.setLayout(null);
					c1.setVisible(true);

					closeFrame();
				}

				else if (blue.isSelected() && simple.isSelected()) {
					Calc1 c1 = new Calc1();
					c1.getContentPane().setBackground(Color.CYAN);
					c1.setSize(500, 500);
					c1.setLayout(null);
					c1.setVisible(true);

					closeFrame();
				}

				else if (red.isSelected() && complex.isSelected()) {
					Calc2 c2 = new Calc2();
					c2.getContentPane().setBackground(Color.red);
					c2.setSize(500, 500);
					c2.setLayout(null);
					c2.setVisible(true);

					closeFrame();
				}

				else if (blue.isSelected() && complex.isSelected()) {
					Calc2 c2 = new Calc2();
					c2.getContentPane().setBackground(Color.CYAN);
					c2.setSize(500, 500);
					c2.setLayout(null);
					c2.setVisible(true);

					closeFrame();
				}
			}
		});
		converter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Converter c1 = new Converter();
				// c1.getContentPane();
				// c1.setSize(500, 500);
				// c1.setLayout(null);
				// c1.setVisible(true);
				closeFrame();
			}
		});
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

	public void closeFrame() {
		super.dispose();
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setSize(500, 500);
		calc.setLayout(null);
		calc.setVisible(true);
	}
}
