package LibraryManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;


class Book extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	JComboBox c1,c2;
	Container c;
	
	
	Book(){
		
		setTitle("LIBRARY MANAGEMENT SYSTEM");
		setBounds(100,100,900,500);
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
		
		l3=new JLabel("ADD BOOK");
		l3.setBounds(300,90,300,50);
		l3.setFont( new Font("Arial",Font.BOLD,40));
		c.add(l3);
		
		l2=new JLabel("BOOK ID : ");
		l2.setBounds(20,150,150,50);
			
		l2.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l2);
		
		l5=new JLabel("AUTHOR : ");
		l5.setBounds(20,200,150,50);
			
		l5.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l5);
		
		
		l4=new JLabel("BOOK-NAME :");
		l4.setBounds(20,250,150,50);
			
		l4.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l4);
		
		
		l6=new JLabel("EDITION :");
		l6.setBounds(20,300,150,50);
			
		l6.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l6);
		
		
		l7=new JLabel("DATE :");
		l7.setBounds(20,350,150,50);
		
		l7.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l7);
		
		l8=new JLabel("BRANCH :");
		l8.setBounds(20,400,150,50);
		
		l8.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l8);
		
		
		Random random=new Random();
		long card3=(random.nextLong() % 90000L)+ 100L;
		long card4=Math.abs(card3);	
		
		
		t1=new JTextField();
		t1.setBounds(200,160,150,30);
		t1.setText("21"+card4);
		t1.setEditable(false);
		t1.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t1);
		
		
		t2=new JTextField();
		t2.setBounds(200,210,150,30);
		t2.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t2);
		
		
		t3=new JTextField();
		t3.setBounds(200,260,150,30);
		t3.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t3);
		
		

		
		String[] branch = {"CSE","EE","ME","CE","ECE"};
		c2=new JComboBox(branch);
		c2.setBounds(200,410,150,30);
		c2.setFont(new Font("Arial",Font.BOLD,15));
		c.add(c2);
		
		
		t5=new JTextField();
		t5.setBounds(200,360,150,30);
		t5.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t5);
		
		
		String[] edition = {"1","2","3","4","5"};
		c1=new JComboBox(edition);
		c1.setBounds(200,310,150,30);
		c1.setFont(new Font("Arial",Font.BOLD,15));
		c.add(c1);
		

		
		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 t1.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		 t2.setBorder(BorderFactory.createCompoundBorder(border3,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		 Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		 t3.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		
		 Border border4 = BorderFactory.createLineBorder(Color.BLACK);
		 c2.setBorder(BorderFactory.createCompoundBorder(border4,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		 
		 
		 
		 Border border5 = BorderFactory.createLineBorder(Color.BLACK);
		 t5.setBorder(BorderFactory.createCompoundBorder(border5,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		 Border border6 = BorderFactory.createLineBorder(Color.BLACK);
		 c1.setBorder(BorderFactory.createCompoundBorder(border6,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		ImageIcon image2=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Library Management\\src\\libm\\book.png");
		Image img4=image2.getImage().getScaledInstance(250,250,  Image.SCALE_DEFAULT);
		ImageIcon img5=new ImageIcon(img4); 
		l9=new JLabel(img5);
		l9.setBounds(450,150,250,250);
		c.add(l9);
		
		
		b1=new JButton("SUBMIT");
		b1.setBounds(410,410,150,30);
		b1.setBackground(Color.CYAN);
		c.add(b1);
		
		b2=new JButton("BACK");
		b2.setBounds(600,410,150,30);
		b2.setBackground(Color.CYAN);
		c.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);

		
		
		setVisible(true);
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		String a=(String)c1.getSelectedItem();
		String b=(String)c2.getSelectedItem();
		
		
		if(e.getSource()==b1) {
			try {
				
				if(t1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Fill All Field");
				
				}
				else {
					DataBase db=new DataBase();
					String q="insert into book values ('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+a+"','"+t5.getText()+"','"+b+"')";
					db.s.executeUpdate(q);
					JOptionPane.showMessageDialog(null, "Book is Added Successfully");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					
					t5.setText("");
				}
			
				
				
				
				}catch(Exception e1) {
					
					
				e1.printStackTrace();
				
				
			}
			
		}
		
		
		else if(e.getSource()==b2) {
			
			new Menu().setVisible(true);
			setVisible(false);
			
		}
		
		
		
		
	}
	

	
	
	
	
}
public class AddBooks {

	public static void main(String[] args) {
		
		new Book();

	}

}
