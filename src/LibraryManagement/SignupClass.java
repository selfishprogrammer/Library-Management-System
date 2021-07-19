package LibraryManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

class signup extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	Container c;
	JPasswordField p;
	
	
	
	signup(){
		setTitle("LIBRARY MANAGEMENT SYSTEM");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.WHITE);
		
		l1=new JLabel("SIGN UP");
		l1.setBounds(180,10,250,50);
		Font font =new Font("Arial",Font.BOLD,30);
		l1.setFont(font);
		c.add(l1);
		
		
		l2=new JLabel("NAME :");
		l2.setBounds(10,100,150,50);
		
		l2.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l2);
		
		
		
		l3=new JLabel("EMAIL :");
		l3.setBounds(10,150,150,50);
		
		l3.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l3);
		
		
		
		
		l4=new JLabel("PASSWORD :");
		l4.setBounds(10,200,250,50);
		
		l4.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l4);
		
		
		
		
		l5=new JLabel("RE-PASSWORD :");
		l5.setBounds(10,250,250,50);
		
		l5.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l5);
		
		
		t1=new JTextField();
		t1.setBounds(190,110,150,30);
		t1.setFont(new Font("Arial",Font.PLAIN,12));
		c.add(t1);
		
		t2=new JTextField();
		t2.setBounds(190,160,150,30);
		t2.setFont(new Font("Arial",Font.PLAIN,12));
		c.add(t2);
		
		
		t3=new JTextField();
		t3.setBounds(190,210,150,30);
		t3.setFont(new Font("Arial",Font.PLAIN,12));
		c.add(t3);
		
		
		p=new JPasswordField();
		p.setBounds(190,260,150,30);
		p.setFont(new Font("Arial",Font.PLAIN,12));
		c.add(p);
		
		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 t1.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		 t2.setBorder(BorderFactory.createCompoundBorder(border3,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		 Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		 t3.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		 Border border5 = BorderFactory.createLineBorder(Color.BLACK);
		 p.setBorder(BorderFactory.createCompoundBorder(border5,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		
		 
		 
		
		
		b1=new JButton("SUBMIT");
		b1.setBounds(30,320,150,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		c.add(b1);
		
		
		
		
		b2=new JButton("CANCEL");
		b2.setBounds(310,320,150,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		c.add(b2);
		
		
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Library Management\\src\\libm\\login.png");
		Image img=image.getImage().getScaledInstance(150,150,  Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img); 
		l6=new JLabel(img1);
		l6.setBounds(340,120,150,150);
		
		
		c.add(l6);
		
		
		b1.addActionListener(this);
		
		b2.addActionListener(this);
		setVisible(true);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			new Login().setVisible(true);
			setVisible(false);
			
			
		}
		
		else if(e.getSource()==b1) {
			try {
				DataBase db=new DataBase();
				if(t3.getText().equals(p.getText())) {
				String q="insert into login values ('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+p.getText()+"')";
				db.s.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"Your Data Has Been Inserted");
				
				new Login().setVisible(true);
				setVisible(false);
				
				}
				else {
					JOptionPane.showMessageDialog(null,"Somethings Went Wrong");
				}
			}catch(Exception e1) {
				e1.printStackTrace();
				
			}
			
		}
		
	}
	
	
}


public class SignupClass {

	public static void main(String[] args) {
		
new signup();
	}

}
