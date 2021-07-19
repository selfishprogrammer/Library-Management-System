package LibraryManagement;
import java.awt.*;
import javax.swing.*;
class about extends JFrame{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	Container c;
	
	
	about(){
		
		setTitle("LIBRARY MANAGEMENT SYSTEM");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(null);
		
		l1=new JLabel("ABOUT US");
		l1.setBounds(140,20,300,50);
		Font font = new Font("Arial",Font.BOLD,40);
		l1.setFont(font);
		c.add(l1);
		
		l2=new JLabel("THIS PROJECT IS CREATED BY RAHUL JHA.");
		l2.setBounds(30,60,500,50);
		
		l2.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l2);
		
		
		l3=new JLabel("FOR ANY QUERY MAIL US ");
		l3.setBounds(120,100,500,50);
		
		l3.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l3);
		
		
		l4=new JLabel("rahuljha3246@gmail.com");
		l4.setBounds(130,140,500,50);
		l4.setForeground(Color.MAGENTA);
		
		l4.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l4);
		
		ImageIcon image4=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Library Management\\src\\libm\\2.jpeg");
		Image img8=image4.getImage().getScaledInstance(200,200,  Image.SCALE_DEFAULT);
		ImageIcon img9=new ImageIcon(img8); 
		l5=new JLabel(img9);
		l5.setBounds(150,190,200,200);
		c.add(l5);
		
		l5=new JLabel("THANK YOU");
		l5.setBounds(190,400,500,50);
		l5.setForeground(Color.BLACK);
		
		l5.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l5);
		
		
		setVisible(true);
		
		
		
		
	}
	
	
}


public class AboutUsClass {

	public static void main(String[] args) {
		new about();

	}

}
