package LibraryManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;



class Menu extends JFrame implements ActionListener{

Container c;
JLabel l1,l2,l3,l4,l5,l6;
JButton b1,b2,b3,b4;
JMenuBar m1;
JMenuItem m2,m3,m4,m5,m6;
JMenu m7;



		Menu(){
			setTitle("EMPLOYEE MANAGEMENT");
			setBounds(100,100,900,600);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			c=getContentPane();
			c.setLayout(null);
			c.setBackground(Color.CYAN);
			
			
			
			
			

			l1=new JLabel("LIBRARY MANAGEMENT SYSTEM");
			l1.setBounds(120,10,900,50);
			l1.setForeground(Color.BLACK);
			Font font=new Font("Arial",Font.BOLD,40);	
			l1.setFont(font);
			c.add(l1);
			ImageIcon image1=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Library Management\\src\\libm\\book.png");
			Image img2=image1.getImage().getScaledInstance(130,130,  Image.SCALE_DEFAULT);
			ImageIcon img3=new ImageIcon(img2); 
			l3=new JLabel(img3);
			l3.setBounds(40,220,130,130);
			c.add(l3);
			
			
			ImageIcon image2=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Library Management\\src\\libm\\student.png");
			Image img4=image2.getImage().getScaledInstance(150,150,  Image.SCALE_DEFAULT);
			ImageIcon img5=new ImageIcon(img4); 
			l4=new JLabel(img5);
			l4.setBounds(270,210,150,150);
			c.add(l4);
			
			
			
			ImageIcon image3=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Library Management\\src\\libm\\book4.png");
			Image img6=image3.getImage().getScaledInstance(150,150,  Image.SCALE_DEFAULT);
			ImageIcon img7=new ImageIcon(img6); 
			l5=new JLabel(img7);
			l5.setBounds(510,210,150,150);
			c.add(l5);
			

			ImageIcon image4=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Library Management\\src\\libm\\studentid.png");
			Image img8=image4.getImage().getScaledInstance(130,130,  Image.SCALE_DEFAULT);
			ImageIcon img9=new ImageIcon(img8); 
			l2=new JLabel(img9);
			l2.setBounds(740,220,130,130);
			c.add(l2);
			
			
			
			b1=new JButton("BOOK");
			b1.setBounds(40,370,130,30);
			b1.setBackground(Color.CYAN);
			c.add(b1);
			
			b2=new JButton("STUDENT");
			b2.setBounds(280,370,130,30);
			b2.setBackground(Color.CYAN);
			c.add(b2);
			
			
			b3=new JButton("B-RECORD");
			b3.setBounds(520,370,130,30);
			b3.setBackground(Color.CYAN);
			c.add(b3);
			
			
			b4=new JButton("STU-RECORD");
			b4.setBounds(740,370,130,30);
			b4.setBackground(Color.CYAN);
			c.add(b4);
			
			
			Border border2 = BorderFactory.createLineBorder(Color.BLACK);
			 b1.setBorder(BorderFactory.createCompoundBorder(border2,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 
			 Border border3 = BorderFactory.createLineBorder(Color.BLACK);
			 b2.setBorder(BorderFactory.createCompoundBorder(border3,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 
			 
			 Border border1 = BorderFactory.createLineBorder(Color.BLACK);
			 b3.setBorder(BorderFactory.createCompoundBorder(border1,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 
			 
			 Border border5 = BorderFactory.createLineBorder(Color.BLACK);
			 b4.setBorder(BorderFactory.createCompoundBorder(border5,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			
			 
			 m1=new JMenuBar();
			 m1.setBackground(Color.GRAY);
			 
			 m7=new JMenu("CATAGORIES");
			 m7.setForeground(Color.WHITE);
			 m2=new JMenuItem("BOOK ISSUE");
			 m3=new JMenuItem("BOOK RETURN");
			 m4=new JMenuItem("RECORDS");
			 m5=new JMenuItem("ABOUT US");
			 m6=new JMenuItem("LOGOUT");
			 m2.setForeground(Color.WHITE);
			 m3.setForeground(Color.WHITE);
			 m4.setForeground(Color.WHITE);
			 m5.setForeground(Color.WHITE);
			 m6.setForeground(Color.WHITE);
			 
			 
			 m7.add(m2);
			 m7.add(m3);
			 m7.add(m4);
			 m7.add(m5);
			 m7.add(m6);
			 
			 
			 m1.add(m7);
			 
			 
			 
			 Border border6 = BorderFactory.createLineBorder(Color.BLACK);
			 m1.setBorder(BorderFactory.createCompoundBorder(border6,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			
			 
			 setJMenuBar(m1);
			
			
			
			b1.addActionListener(this);
			b2.addActionListener(this);

			b3.addActionListener(this);

			b4.addActionListener(this);
			m2.addActionListener(this);
			m3.addActionListener(this);
			m4.addActionListener(this);
			m5.addActionListener(this);
			m6.addActionListener(this);

			
			
		
			
			setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
if(e.getSource()==b1) {
	
	new Choose1().setVisible(true);
	setVisible(false);
			
		}
else if(e.getSource()==b2) {
	new Choose2().setVisible(true);
	setVisible(false);
	
			
		}
else if(e.getSource()==b3) {
	
	new Record1().setVisible(true);
	setVisible(false);
	
			
		}
else if(e.getSource()==b4) {
	new Record2().setVisible(true);
	setVisible(false);
	
	
}
else if(e.getSource()==m2) {
	
	new Issue().setVisible(true);
	setVisible(false);
	
}
else if(e.getSource()==m3) {
	new Return().setVisible(true);
	setVisible(false);
}
else if(e.getSource()==m4) {
	
	new RecordCho().setVisible(true);
	setVisible(false);
	
}
else if(e.getSource()==m5) {
	
	new about().setVisible(true);
	setVisible(false);
	
}
else if(e.getSource()==m6) {
	
	
	new Login().setVisible(true);
	setVisible(false);
	
	
}
		

		
	}
	
}
public class MenuClass {

	public static void main(String[] args) {
		
	new Menu();	
		

	}

}
