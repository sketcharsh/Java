import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class panel extends JFrame {
	Container c;
	JLabel userName, password;
	JTextField t1;
	JPasswordField p1;
	JButton login;
	JPanel pan;

	panel() {
		c = this.getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		c.setVisible(true);

		userName = new JLabel("USER NAME: ");

		password = new JLabel("PASSWORD: ");

		t1 = new JTextField(20);

		p1 = new JPasswordField(20);

		login = new JButton("LOGIN");

		pan = new JPanel(new FlowLayout());
		pan.setVisible(true);

		pan.add(userName);
		pan.add(password);
		pan.add(t1);
		pan.add(p1);
		pan.add(login);
		pan.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login"));
		c.add(pan);
	}

	public static void main(String[] args) {
		panel p = new panel();
		p.setSize(400, 400);
		// p.setLayout(null);
		p.setVisible(true);
	}
}
