import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
class Slider2 extends JFrame{
	//Container window;
	JPanel panel;
	JLabel text;
	JSlider slide;
	Slider2(){
		//window = this.getContentPane();
		
		panel = new JPanel(new FlowLayout());
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Login Panel"));
		
		text = new JLabel("Hello");
		text.setBounds(100, 50, 250, 250);
		//window.add(text);
		panel.add(text);
		
		slide = new JSlider(0,100);
		slide.setBounds(20, 50, 50, 250);
		slide.setOrientation(JSlider.VERTICAL);
		slide.setPaintTicks(true);
		slide.setPaintLabels(true);
		slide.setMajorTickSpacing(10);
		slide.setLabelTable(slide.createStandardLabels(10));
		//window.add(slide);
		panel.add(slide);
		
		add(panel);
		
		
		
		slide.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int val = slide.getValue();
				Font f = new Font("Times New Roman",Font.BOLD,val);
				text.setFont(f);
			}
		});
		
		//window.setLayout(null);
		
	}

	public static void main(String[] args) {
		Slider2 sl = new Slider2();
		sl.setVisible(true);
		sl.setBounds(100,200,400,400);
		sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	

}

}