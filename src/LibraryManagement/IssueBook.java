package LibraryManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.Border;

import com.toedter.calendar.JDateChooser;

class Issue extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l20;
	JDateChooser d1;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
	JButton b1,b2,b3,b4,b5;
	Container c;
	
	Issue(){
		setTitle("LIBRARY MANAGEMENT SYSTEM");
		setBounds(100,10,1200,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GRAY);
		
		l1=new JLabel("LIBRARY MANAGEMENT SYSTEM");
		l1.setBounds(280,2,750,50);
		Font font=new Font("Arial",Font.BOLD,40);
		l1.setFont(font);
		
		c.add(l1);
		
		
		
		JPanel p1=new JPanel();
		
		p1.setBounds(15,50,575,500);
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
		 t7.setBounds(170,60,150,30);
		 c.add(t7);
		 
		 b1=new JButton("CHECK");
		 b1.setBounds(340,60,150,30);
		 b1.setBackground(Color.CYAN);
		 c.add(b1);
		 
		 l9=new JLabel("BOOK ID : ");
			l9.setBounds(20,150,150,50);
				
			l9.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l9);
			
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
			
			l20=new JLabel("DATE OF ISSUE :");
			l20.setBounds(60,500,300,30);
			
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
			
			
			d1=new JDateChooser();
			d1.setBounds(240,500,200,30);
			
			c.add(d1);
			
		
		 
		 
		 
		c.add(p1);
		
		
		JPanel p2=new JPanel();
		p2.setBounds(595,50,575,500);
		p2.setBackground(Color.WHITE);
		
		 Border border7 = BorderFactory.createLineBorder(Color.BLACK);
		 p2.setBorder(BorderFactory.createCompoundBorder(border7,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 p2.setBackground(Color.CYAN);
		 l10=new JLabel("STUDENT  ID :");
		 l10.setBounds(620,60,150,30);
		 l10.setFont(new Font("Arial",Font.BOLD,20));
		 c.add(l10);
		 
		 t9=new JTextField();
		 t9.setBounds(800,60,150,30);
		 c.add(t9);
		 
		 b3=new JButton("CHECK");
		 b3.setBounds(990,60,150,30);
		 b3.setBackground(Color.CYAN);
		 c.add(b3);
		 
		 l11=new JLabel("STUDENT  ID : ");
			l11.setBounds(620,150,150,50);
				
			l11.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l11);
			
			l12=new JLabel("NAME : ");
			l12.setBounds(620,200,150,50);
				
			l12.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l12);
			
			
			l13=new JLabel("GENDER :");
			l13.setBounds(620,250,150,50);
				
			l13.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l13);
			
			
			l14=new JLabel("ADDRESS :");
			l14.setBounds(620,300,150,50);
				
			l14.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l14);
			
			
			l15=new JLabel("SEMESTER :");
			l15.setBounds(620,350,150,50);
			
			l15.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l15);
			
			l16=new JLabel("DEPARTMENT :");
			l16.setBounds(620,400,150,50);
			
			l16.setFont( new Font("Arial",Font.BOLD,20));

			c.add(l16);
			
			t10=new JTextField();
			t10.setBounds(800,160,150,30);
			t10.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t10);
			
			
			t11=new JTextField();
			t11.setBounds(800,210,150,30);
			t11.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t11);
			
			
			t12=new JTextField();
			t12.setBounds(800,260,150,30);
			t12.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t12);
			
			

			
			
			t13=new JTextField();
			t13.setBounds(800,410,150,30);
			t13.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t13);
			
			
			t14=new JTextField();
			t14.setBounds(800,360,150,30);
			t14.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t14);
			
			
			
			t15=new JTextField();
			t15.setBounds(800,310,150,30);
			t15.setFont(new Font("Arial",Font.BOLD,15));
			c.add(t15);
			
			
			b4=new JButton("ENTER");
			b4.setBounds(600,500,565,30);
			 b4.setBackground(Color.CYAN);
			c.add(b4);
			
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
			 
			 
			 
			 Border border18 = BorderFactory.createLineBorder(Color.BLACK);
			 t6.setBorder(BorderFactory.createCompoundBorder(border18,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 
			 Border border17 = BorderFactory.createLineBorder(Color.BLACK);
			 t7.setBorder(BorderFactory.createCompoundBorder(border17,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 
//			 Border border16 = BorderFactory.createLineBorder(Color.BLACK);
//			 t8.setBorder(BorderFactory.createCompoundBorder(border16,
//			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
//			 
//			 
//			 
//			 Border border15 = BorderFactory.createLineBorder(Color.BLACK);                                                                
//			 t9.setBorder(BorderFactory.createCompoundBorder(border15,
//			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			
			 Border border14 = BorderFactory.createLineBorder(Color.BLACK);
			 t10.setBorder(BorderFactory.createCompoundBorder(border14,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			
			 
			 
			 
			 Border border13 = BorderFactory.createLineBorder(Color.BLACK);
			 t11.setBorder(BorderFactory.createCompoundBorder(border13,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 
			 
			 Border border12 = BorderFactory.createLineBorder(Color.BLACK);
			 t12.setBorder(BorderFactory.createCompoundBorder(border12,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 Border border22 = BorderFactory.createLineBorder(Color.BLACK);
			 t13.setBorder(BorderFactory.createCompoundBorder(border22,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 
			 Border border33 = BorderFactory.createLineBorder(Color.BLACK);
			 t14.setBorder(BorderFactory.createCompoundBorder(border33,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 
			 
			 Border border55 = BorderFactory.createLineBorder(Color.BLACK);                                                                
			 t15.setBorder(BorderFactory.createCompoundBorder(border55,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			
			 Border border42 = BorderFactory.createLineBorder(Color.BLACK);
			 d1.setBorder(BorderFactory.createCompoundBorder(border42,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			
			 
			 
			 
			 Border border20 = BorderFactory.createLineBorder(Color.BLACK);
			 b1.setBorder(BorderFactory.createCompoundBorder(border20,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 
			 
			 Border border19 = BorderFactory.createLineBorder(Color.BLACK);
			 b3.setBorder(BorderFactory.createCompoundBorder(border19,
			            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			 
			 t1.setEditable(false);
			 t2.setEditable(false);
			 
			 t3.setEditable(false);
			 
			 t4.setEditable(false);
			 
			 t5.setEditable(false);
			 
			 t6.setEditable(false);
			 
			 
			 
			 t12.setEditable(false);
			 
			 
			
			 
			 t10.setEditable(false);
			 
			 
			 t11.setEditable(false);
			 t13.setEditable(false);
			 
			 t14.setEditable(false);
			 t15.setEditable(false);
		 
		 
		c.add(p1);
		 
		 
		 
		c.add(p2);
		
		b1.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		setVisible(true);
		
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			DataBase  db=new DataBase();
			if(e.getSource()==b1) {
				
				String q="select * from book where book_id='"+t7.getText()+"'";
				ResultSet rs=db.s.executeQuery(q);
				
				if(rs.next()) {
					
					t1.setText(rs.getString("book_id"));
					t2.setText(rs.getString("author_name"));
					t3.setText(rs.getString("book_name"));
					t4.setText(rs.getString("edition"));
					t5.setText(rs.getString("date"));
					t6.setText(rs.getString("branch"));
					
					t7.setText("");
					
					
					
				}
				
				
				
				
			}
			
			else if(e.getSource()==b3) {
				String q1="select * from student where student_id='"+t9.getText()+"'";
				ResultSet rs=db.s.executeQuery(q1);
if(rs.next()) {
					
					t10.setText(rs.getString("student_id"));
					t11.setText(rs.getString("student_name"));
					t12.setText(rs.getString("gender"));
					t13.setText(rs.getString("address"));
					t14.setText(rs.getString("semester"));
					t15.setText(rs.getString("department"));
					t9.setText("");
					
				}
				
			}
			
			
			else if(e.getSource()==b4) {
				
				String a=((JTextField) d1.getDateEditor().getUiComponent()).getText();
				
				String q2="insert into issue values('"+t1.getText()+"','"+t10.getText()+"','"+t11.getText()+"','"+t3.getText()+"','"+t2.getText()+"','"+t15.getText()+"','"+a+"')";
				db.s.executeUpdate(q2);
				
				JOptionPane.showMessageDialog(null, "Book Has Been Successfully Issued");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				
				t10.setText("");
				t11.setText("");
				t12.setText("");
				t13.setText("");
				t14.setText("");
				t15.setText("");
				
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
			
		}
		
	}
}
public class IssueBook {

	public static void main(String[] args) {
		
new Issue();
	}

}
