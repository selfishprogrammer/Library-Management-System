package LibraryManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;

class RemoveS extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t10,t6;
	JButton b1,b2,b3;
	JComboBox c1,c2;
	Container c;
	
	RemoveS(){
		
		setTitle("LIBRARY MANAGEMENT SYSTEM");
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
		
		l3=new JLabel("REMOVE STUDENT");
		l3.setBounds(330,60,300,50);
		l3.setFont( new Font("Arial",Font.BOLD,30));
		c.add(l3);
		
		
		l10=new JLabel("ENTER THE STUDENT_ID :");
		l10.setBounds(50,130,390,30);
		
		l10.setFont( new Font("Arial",Font.BOLD,30));
		c.add(l10);
		
		
		t10=new JTextField();
		t10.setBounds(440,132,150,30);
		c.add(t10);
		
		
		b3=new JButton("CHECK");
		b3.setBounds(600,132,150,30);
		c.add(b3);
		
		
		
		
		l2=new JLabel("STUDENT ID : ");
		l2.setBounds(20,150,150,50);
			
		l2.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l2);
		
		l5=new JLabel("NAME : ");
		l5.setBounds(20,200,150,50);
			
		l5.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l5);
		
		
		l4=new JLabel("GENDER :");
		l4.setBounds(20,250,150,50);
			
		l4.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l4);
		
		
		l6=new JLabel("ADDRESS :");
		l6.setBounds(20,300,150,50);
			
		l6.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l6);
		
		
		l7=new JLabel("SEMESTER :");
		l7.setBounds(20,350,150,50);
		
		l7.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l7);
		
		l8=new JLabel("DEPATMENT :");
		l8.setBounds(20,400,150,50);
		
		l8.setFont( new Font("Arial",Font.BOLD,20));

		c.add(l8);
		
		

		
		t1=new JTextField();
		t1.setBounds(200,160,150,30);

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
		
		
				
		t4=new JTextField();
		t4.setBounds(200,310,150,30);
		t4.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t4);
		
		
		t5=new JTextField();
		t5.setBounds(200,360,150,30);
		t5.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t5);
		
		

		t6=new JTextField();
		t6.setBounds(200,410,150,30);
		t6.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t6);

		
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
		 t4.setBorder(BorderFactory.createCompoundBorder(border4,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		 
		 
		 
		 Border border5 = BorderFactory.createLineBorder(Color.BLACK);
		 t5.setBorder(BorderFactory.createCompoundBorder(border5,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		 Border border6 = BorderFactory.createLineBorder(Color.BLACK);
		 t6.setBorder(BorderFactory.createCompoundBorder(border6,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		ImageIcon image2=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Library Management\\src\\libm\\book.png");
		Image img4=image2.getImage().getScaledInstance(250,250,  Image.SCALE_DEFAULT);
		ImageIcon img5=new ImageIcon(img4); 
		l9=new JLabel(img5);
		l9.setBounds(450,150,250,250);
		c.add(l9);
		
		
		b1=new JButton("REMOVE");
		b1.setBounds(410,410,150,30);
		b1.setBackground(Color.CYAN);
		c.add(b1);
		
		b2=new JButton("BACK");
		b2.setBounds(600,410,150,30);
		b2.setBackground(Color.CYAN);
		c.add(b2);
		b3.addActionListener(this);
									
		
		l2.setVisible(false);
		l4.setVisible(false);
		l5.setVisible(false);
		l6.setVisible(false);
		l7.setVisible(false);
		l8.setVisible(false);
		t1.setVisible(false);
		t2.setVisible(false);
		t3.setVisible(false);
		t4.setVisible(false);
		t5.setVisible(false);
		t6.setVisible(false);
		b1.setVisible(false);
		b2.setVisible(false);
		
		
		
		
		
	 
		
		
		
		
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			DataBase db=new DataBase();
			
				String q="select * from student where student_id='"+t10.getText()+"'";
				ResultSet rs=db.s.executeQuery(q);
				if(rs.next()) {
					
					t10.setVisible(false);
					l10.setVisible(false);
					b3.setVisible(false);
					
					t1.setText(rs.getString("student_id"));
					t2.setText(rs.getString("student_name"));
					t3.setText(rs.getString("gender"));
					t4.setText(rs.getString("address"));
					t5.setText(rs.getString("semester"));
					t6.setText(rs.getString("department"));
					
					
					t1.setEditable(false);
					t2.setEditable(false);
					t3.setEditable(false);
					t4.setEditable(false);
					t5.setEditable(false);
					t6.setEditable(false);
					
					
					
					l2.setVisible(true);
					l4.setVisible(true);
					l5.setVisible(true);
					l6.setVisible(true);
					l7.setVisible(true);
					l8.setVisible(true);
					t1.setVisible(true);
					t2.setVisible(true);
					t3.setVisible(true);
					t4.setVisible(true);
					t5.setVisible(true);
					t6.setVisible(true);
					b1.setVisible(true);
					b2.setVisible(true);
					
					
					
					
					b1.addActionListener(this);
					b2.addActionListener(this);
					
				if(e.getSource()==b1) {	
					if(t1.getText().equals(t1.getText())) {
					String q1="delete from student where student_id='"+t1.getText()+"'";
					db.s.executeUpdate(q1);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					JOptionPane.showMessageDialog(null, "Book Removed");
					new Book().setVisible(true);
					setVisible(false);
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Wrong ID");
						
					}
					
				}
				
				
				else if(e.getSource()==b2) {
new Menu().setVisible(true);
setVisible(false);		
					
				}
				}
				
			
			
		}catch(Exception e1) {
			
			e1.printStackTrace();
			
			
		}

		
	}
	
	
}
public class RemoveStudent {

	public static void main(String[] args) {
	new RemoveS();

	}

}
