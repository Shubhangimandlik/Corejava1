


	import javax.swing.*;
	import java.awt.*;

	public class Student_reg {
	  public static void main(String[] args) {
	 
	JFrame f=new JFrame("Employee Registration");
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JLabel l=new JLabel("Employee Registration",SwingConstants.CENTER);
	l.setFont(new Font("Serif",Font.BOLD,30));
	l.setBounds(50,30,400,40);
	l1=new JLabel("Eid");

	l1.setBounds(50,100,100,30);
	l2=new JLabel("Ename");

	l2.setBounds(50,150,100,30);
	l3=new JLabel("Salary");

	l3.setBounds(50,200,100,30);
	l4=new JLabel("Email");

	l4.setBounds(50,250,100,30);
	l5=new JLabel("Designation");

	l5.setBounds(50,300,100,30);
	l6=new JLabel("Gender");

	l6.setBounds(50,370,100,30);
	f.add(l);
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(l5);
	f.add(l6);
	String designation[]= {"Check","Manager"};
	JComboBox c=new JComboBox(designation);
	c.setBounds(200,300,200,30);
	f.add(c);
	JRadioButton r1=new JRadioButton("Male");
	JRadioButton r2=new JRadioButton("Female");
	JRadioButton r3=new JRadioButton("Other");
	r1.setBounds(200,370,100,30);
	r2.setBounds(300,370,100,30);
	r3.setBounds(400,370,100,30);
	f.add(r1);
	f.add(r2);
	f.add(r3);
	t1=new JTextField();
	t1.setBounds(200,100,200,30);
	t2=new JTextField();
	t2.setBounds(200,150,200,30);
	t3=new JTextField();
	t3.setBounds(200,200,200,30);
	t4=new JTextField();
	t4.setBounds(200,250,200,30);
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);

	JButton b=new JButton("Save");
	b.setBounds(50,430,100,40);
	JButton b1=new JButton("Update");
	b1.setBounds(200,430,100,40);
	JButton b2=new JButton("Delete");
	b2.setBounds(350,430,100,40);
	f.add(b);
	f.add(b1);
	f.add(b2);
	f.setSize(500,550);
	f.setLayout(null);
	f.setVisible(true);
	  }

	}

