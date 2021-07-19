package LibraryManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.Border;

import net.proteanit.sql.DbUtils;


class RecordIssue extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4;
	JTable table;
	Container c;
	RecordIssue(){
		setTitle("LIBRARY MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		
		l1=new JLabel("SEARCH BY ID:");
		l1.setBounds(10,5,350,50);
		Font font = new Font("Arial",Font.BOLD,20);
		l1.setFont(font);
		c.add(l1);
		
		
		l2=new JLabel("FULL RECORD :");
		l2.setBounds(550,5,350,50);
		l2.setFont( new Font("Arial",Font.BOLD,20));
		c.add(l2);
		
		
		t1=new JTextField ();
		t1.setBounds(190,15,150,30);
		t1.setFont(new Font ("Arial",Font.BOLD,20));
		c.add(t1);
		
		b1=new JButton("CHECK");
		b1.setBounds(350,15,150,30);
		b1.setBackground(Color.cyan);
		c.add(b1);
		
		
		
		b2=new JButton("CHECK");
		b2.setBounds(720,15,150,30);
		b2.setBackground(Color.cyan);
		c.add(b2);
		
		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 b1.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		 b2.setBorder(BorderFactory.createCompoundBorder(border3,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		 Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		 t1.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		 
	table=new JTable();
	table.setBounds(0,100,900,600);
	table.setFont(new Font ("Arial",Font.BOLD,15));
	
	Border border5 = BorderFactory.createLineBorder(Color.BLACK);
	 table.setBorder(BorderFactory.createCompoundBorder(border5,
	            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
	 
	 table.setBackground(Color.GRAY);
	 table.setForeground(Color.WHITE);
		c.add(table);
	 
	 
	 JScrollPane jsp=new JScrollPane(table);
	 jsp.setBounds(0,100,900,600);
	 c.add(jsp);
	 table.enable(false);
	
	

	
	b1.addActionListener(this);
	
	b2.addActionListener(this);
		
		
		
		
		
		
		setVisible(true);
		
		
		
		
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			if(e.getSource()==b1) {
				
				DataBase db=new DataBase();
		String q="select * from issue where student_id='"+t1.getText()+"'";
		ResultSet rs=db.s.executeQuery(q);
		
		
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		
		
			
		
				
			}
			
			
			
			
			
			else if(e.getSource()==b2) {
				DataBase db=new DataBase();
				t1.setText("");
				String q1="select * from issue";
				ResultSet rs=db.s.executeQuery(q1);
				table.setModel(DbUtils.resultSetToTableModel(rs));
					
				
			
				
				
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
			
		}
		 
		
	}
	
	
	
}
public class IssueRecord {

	public static void main(String[] args) {
		new RecordIssue();

	}

}
