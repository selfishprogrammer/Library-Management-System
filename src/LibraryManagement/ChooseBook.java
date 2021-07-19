package LibraryManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Choose1 extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3;
	Container c;
Choose1(){
	setTitle("LIBRARY MANAGEMENT");
	setBounds(100,100,400,200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	c=getContentPane();
	c.setLayout(null);
	
	

	l1=new JLabel("LIBRARY MANAGEMENT SYSTEM");
	l1.setBounds(25,0,400,50);
	l1.setForeground(Color.RED);
	Font font=new Font("Arial",Font.BOLD,20);	
	l1.setFont(font);
	c.add(l1);
	
	
	b1=new JButton("ADD BOOK");
	b1.setBounds(5,50,180,30);
	b1.setBackground(Color.BLACK);
	b1.setForeground(Color.white);
	c.add(b1);
	
	
	b2=new JButton("REMOVE");
	b2.setBounds(200,50,180,30);
	b2.setBackground(Color.BLACK);
	b2.setForeground(Color.white);
	c.add(b2);
	
	b3=new JButton("CANCEL");
	b3.setBounds(100,110,180,30);
	b3.setBackground(Color.BLACK);
	b3.setForeground(Color.white);
	c.add(b3);
	

	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	
	
	
	
	
	
	
	
	
	setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1) {
	new Book().setVisible(true);
	setVisible(false);
}
else if(e.getSource()==b2) {
	new RemoveB().setVisible(true);
	setVisible(false);
}
else if(e.getSource()==b3) {
	new Menu().setVisible(true);
	setVisible(false);
}
	
}
	
	
}
public class ChooseBook {

	public static void main(String[] args) {
		new Choose1();

	}

}
