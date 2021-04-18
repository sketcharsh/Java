import javax.swing.*;
import java.awt.event.*;  

public class menubarjava implements ActionListener{
	JMenu menu1,menu2,menu3,menu4,submenu;
	JMenuBar mb;
	JTextArea ta;  
	JFrame jf;
	JMenuItem a1,a2,a3,a4,a5,i1,i2,i3,i4;
	
	menubarjava()
	{
		jf=new JFrame();
		mb=new JMenuBar();
		
		menu1=new JMenu("File");
		menu2=new JMenu("Edit");
		menu3=new JMenu("Exit");
		menu4=new JMenu("Help");
		
		submenu=new JMenu("Sub Menu");
		i1=new JMenuItem("Cut");
		i2=new JMenuItem("Copy");
		i3=new JMenuItem("Paste");
		i4=new JMenuItem("SelectAll");
		
		a1=new JMenuItem("New");
		a2=new JMenuItem("Open");
		a3=new JMenuItem("Save");
		a4=new JMenuItem("Save as");
		a5=new JMenuItem("Exit");
		
		i1.addActionListener(this);  
		i2.addActionListener(this);  
		i3.addActionListener(this);  
		i4.addActionListener(this); 
		a4.addActionListener(this);  
		a5.addActionListener(this); 
		
		menu1.add(a1);menu1.add(a2);menu1.add(a3);
		menu1.add(a4);menu1.add(a5);
		
		menu2.add(i1);menu2.add(i2);menu2.add(i3);menu2.add(i4);
		
		//edit.add(a1);edit.add(a2);edit.add(a3);edit.add(a4);  
		
		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);
		mb.add(menu4);
		
		ta=new JTextArea();  
		ta.setBounds(1,1,460,460);  
		
		jf.setJMenuBar(mb);
		jf.setSize(400,200);
		jf.setLayout(null); 
		jf.setVisible(true); 
		jf.add(ta);  
	}
	public static void main(String []args)
	{
		new menubarjava();
	}

		public void actionPerformed(ActionEvent e)
		{  
			if(e.getSource()==i1)  
			ta.cut();  
			if(e.getSource()==i2)  
			ta.copy();  
			if(e.getSource()==i3)  
			ta.paste(); 
			if(e.getSource()==i4)  
			ta.selectAll(); 
			}  
	}


