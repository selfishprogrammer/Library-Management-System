package LibraryManagement;
import java.awt .*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.Border;

import com.toedter.calendar.JDateChooser;
class Return extends JFrame implements ActionListener{

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l20;
	JDateChooser d1;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
	JButton b1,b2,b3,b4,b5;
	Container c;
	Return(){
		
		setTitle("LIBRARY MANAGEMENT SYSTEM");
		setBounds(100,10,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GRAY);
		
		l1=new JLabel("LIBRARY MANAGEMENT SYSTEM");
		l1.setBounds(50,2,600,50);
		Font font=new Font("Arial",Font.BOLD,30);
		l1.setFont(font);
		c.add(l1);
		
JPanel p1=new JPanel();
		
		p1.setBounds(5,50,575,500);
		p1.setBackground(Color.WHITE);
		
		 Border border6 = BorderFactory.createLineBorder(Color.BLACK);
		 p1.setBorder(BorderFactory.createCompoundBorder(border6,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 p1.setBackground(Color.CYAN);
		 
		 l2=new JLabel("BOOK ID :");
		 l2.setBounds(50,60,150,30);
		 l2.setFont(new Font("Arial",Font.BOLD,20));
		 c.add(l2);
		 
		 t7=new JTextField();
		 t7.setBounds(220,60,150,30);
		 c.add(t7);
		 
		 b1=new JButton("CHECK");
		 b1.setBounds(400,60,150,30);
		 b1.setBackground(Color.CYAN);
		 c.add(b1);
		 
		 
		 l9=new JLabel("BOOK ID : ");
			l9.setBounds(20,150,150,50);
				
			l9.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l9);
			
			l5=new JLabel("STUDENT ID : ");
			l5.setBounds(20,200,150,50);
				
			l5.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l5);
			
			
			l4=new JLabel("STUDENT-NAME :");
			l4.setBounds(20,250,200,50);
				
			l4.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l4);
			
			
			l6=new JLabel("BOOK-NAME :");
			l6.setBounds(20,300,150,50);
				
			l6.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l6);
			
			
			l7=new JLabel("AUTHOR NAME :");
			l7.setBounds(20,350,200,50);
			
			l7.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l7);
			
			l8=new JLabel("DEPARTMENT :");
			l8.setBounds(20,400,150,50);
			
			l8.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l8);
			
			l10=new JLabel("DATE OF ISSUE:");
			l10.setBounds(20,450,250,50);
			
			l10.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l10);
			
			l20=new JLabel("DATE OF RETURN :");
			l20.setBounds(20,500,300,30);
			
			l20.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l20);
			
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
			t4.setBounds(200,410,150,30);
			t4.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t4);
			
			
			t5=new JTextField();
			t5.setBounds(200,360,150,30);
			t5.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t5);
			
			
			
			t6=new JTextField();
			t6.setBounds(200,310,150,30);
			t6.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t6);
			
			t8=new JTextField();
			t8.setBounds(200,460,150,30);
			t8.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t8);
			
			
			d1=new JDateChooser();
			d1.setBounds(220,500,200,30);
			
			c.add(d1);
			 b2=new JButton("RETURN");
			 b2.setBounds(430,500,130,30);
			 b2.setBackground(Color.CYAN);
			 c.add(b2);
		
	
		 
		c.add(p1);
		
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 
		
		setVisible(true);
		
		
		
		
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			DataBase db=new DataBase();
			if(e.getSource()==b1) {
			String q="select * from issue where book_id='"+t7.getText()+"'";
			ResultSet rs=db.s.executeQuery(q);
			if(rs.next()) {
				

				t1.setText(rs.getString("book_id"));
				t2.setText(rs.getString("student_id"));
				t3.setText(rs.getString("student_name"));
				t4.setText(rs.getString("department"));
				t5.setText(rs.getString("author_name"));
				t6.setText(rs.getString("book_name"));
				t8.setText(rs.getString("date_of_issue"));
				
		
				
			}
			}
			
			
			else if(e.getSource()==b2) {
				
				String a=((JTextField) d1.getDateEditor().getUiComponent()).getText();
				String q2="insert into returnbook values('"+t2.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+a+"')";
				db.s.executeUpdate(q2);
				
				String q1="delete from issue where book_id='"+t7.getText()+"' and student_id='"+t2.getText()+"'";
				db.s.executeUpdate(q1);
				


			
				
				
			
				
				JOptionPane.showMessageDialog(null, "Your Book Has Returned Successfully");
			
				
			}
		}catch(Exception e1) {
			e1.printStackTrace();
			
		}
	
		
	}
	
}


public class ReturnClass {

	public static void main(String[] args) {
		
		new Return();
		

	}

}
