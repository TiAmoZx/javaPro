package yao;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
<<<<<<< HEAD:src/Order1.java
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import java.awt.FlowLayout;
=======
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
>>>>>>> one:src/Order.java
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
<<<<<<< HEAD:src/Order1.java
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;
=======
>>>>>>> one:src/Order.java
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
<<<<<<< HEAD:src/Order1.java
import java.lang.Thread;




import java.io.DataInputStream;




public class Order1 extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField sex;
	private JTextField age;
	private JTextField phonenumber;
	private JTextField orderroom;
	private JTextField ordertime;
	private JTextField innumber;

	Thread thread=new Thread();
=======
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class Order extends JFrame {
	private JPanel contentPane;
	private JTable table;
	
	
   String num[];
   int i=0;
   public void dingdan(){
	try{
		Connection con = null;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con= DriverManager.getConnection("jdbc:sqlserver://10.20.181.203:1433;DatabaseName=hospital","sa","sa");
		/*if(con !=null)
			System.out.println("Connect succeed!");*/
		Statement st=null;
		st=con.createStatement();
		String sqlselect = "select 编号  from Drug" ;
		ResultSet rs = null;
		rs = st.executeQuery(sqlselect);
		while(rs.next()){
        	 num[i]=rs.getString("编号");
        	 i++;
		}
	}catch(Exception e){
		System.out.println(e);
	}
   }
	


	

>>>>>>> one:src/Order.java
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order1 frame = new Order1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
<<<<<<< HEAD:src/Order1.java
=======
	/*public void Connectsql(){
		//try{
			//Connection con = null;
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//con= DriverManager.getConnection("jdbc:sqlserver://10.20.181.203:1433;DatabaseName=hospital","sa","sa");
			if(con !=null)
				System.out.println("Connect succeed!");
			Statement st=null;
			st=con.createStatement();
			
			String sqlselect = "select * from "+ stype ;
			ResultSet rs = null;
			rs = st.executeQuery(sqlselect);
			
			再次，添加数据
	}*/
>>>>>>> one:src/Order.java
	/**
	 * Create the frame.
	 */
	public Order1() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
<<<<<<< HEAD:src/Order1.java

		JLabel label = new JLabel("\u6027\u522B");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label.setBounds(24, 71, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_1.setBounds(24, 46, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5E74\u9F84");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_2.setBounds(288, 71, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u8054\u7CFB\u65B9\u5F0F");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_3.setBounds(24, 113, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u9884\u7EA6\u79D1\u5BA4");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_4.setBounds(24, 153, 54, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u9884\u7EA6\u65F6\u95F4");
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_5.setBounds(24, 190, 54, 15);
		contentPane.add(label_5);
		
		JLabel label_7 = new JLabel("预约号");
		label_7.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_7.setBounds(277, 46, 54, 15);
		contentPane.add(label_7);
		
		name = new JTextField();
		name.setBounds(74, 40, 106, 21);
		contentPane.add(name);
		name.setColumns(10);
		
		sex = new JTextField();
		sex.setBounds(74, 68, 106, 21);
		contentPane.add(sex);
		sex.setColumns(10);
=======
>>>>>>> one:src/Order.java
		

		dingdan();
		
		contentPane.setLayout(null);
		JComboBox comboBox = new JComboBox(num);
		comboBox.setBounds(160, 162, 168, 29);
		contentPane.add(comboBox);
		
<<<<<<< HEAD:src/Order1.java
			
		innumber = new JTextField();
		innumber.setBounds(321, 43, 100, 21);
		contentPane.add(innumber);
		innumber.setColumns(10);
=======

		JButton button_4 = new JButton("确定");
		button_4.setFont(new Font("宋体", Font.PLAIN, 17));
		button_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			
			
			
		});
		button_4.setBounds(239, 260, 89, 23);
		contentPane.add(button_4);
		
		JLabel lblNewLabel = new JLabel("\u9009\u62E9\u836F\u65B9\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(54, 162, 108, 29);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(SystemColor.info);
		label_1.setBounds(73, 188, 108, 29);
		contentPane.add(label_1);
		
		JButton button = new JButton("\u9000\u51FA");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(706, 779, 89, 29);
		contentPane.add(button);
>>>>>>> one:src/Order.java
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
<<<<<<< HEAD:src/Order1.java
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Log lo=new Log();
				lo.setVisible(true);
=======
			public void actionPerformed(ActionEvent e) {
				dispose();
				 Medicine a=new Medicine();
				 a.setVisible(true);
>>>>>>> one:src/Order.java
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(596, 779, 89, 29);
		contentPane.add(button_1);
		
<<<<<<< HEAD:src/Order1.java
		
	
		
		
		JButton button_2 = new JButton("重置");
		button_2.setForeground(new Color(204, 0, 102));
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				name.setText("");
				innumber.setText("");
				sex.setText("");
				age.setText("");
				phonenumber.setText("");
				orderroom.setText("");
				ordertime.setText("");
				
			}
		});
		button_2.setBounds(202, 232, 93, 23);
		contentPane.add(button_2);
		
		
	
		thread=new Thread(new Runnable(){
			public void run(){
				  try{
					String t;
					String b;
					String d;
					String p;
					String l;
					String m;
					String n;
					t=name.getText();
					b=innumber.getText();
					d=sex.getText();
					p=age.getText();
					l=phonenumber.getText();
					m=orderroom.getText();
					n=ordertime.getText();
					System.out.println("11"+t);
					String SQL = " insert into Yuyue values('"+t+"','"+b+"','"+d+"','"+p+"','"+l+"','"+m+"','"+n+"') "; 
			
			         if(SqlHelper.executeUpdate(SQL))  
			         {  
			             System.out.println("插入成功 ");  
			         }else  
			         {  
			             System.out.println("插入失败 ");  
			         }  
	         }
			catch(Exception e){
				e.printStackTrace();			
			}	
			}});
	
		JButton button_3 = new JButton("提交");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 thread.start();
					
				}
			
		});
		button_3.setBounds(50, 232, 93, 23);
		contentPane.add(button_3);
		
		
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\新建文件夹\\QQ图片20161214215736.jpg"));
		label_8.setBounds(10, 10, 436, 261);
		contentPane.add(label_8);
		}
		}

=======
		JButton button_2 = new JButton("\u53D6\u836F");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(134, 433, 89, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u5220\u9664\u6B64\u836F\u65B9");
		button_3.setFont(new Font("宋体", Font.PLAIN, 11));
		button_3.setBounds(134, 526, 89, 29);
		contentPane.add(button_3);
		
		JLabel label_2 = new JLabel("\u836F\u623F\u7BA1\u7406\u7CFB\u7EDF");
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(367, 53, 149, 29);
		contentPane.add(label_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 874, 40);
		contentPane.add(menuBar);
		
		table = new JTable();
		table.setBounds(417, 188, 436, 581);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		contentPane.add(table);
	}
}
>>>>>>> one:src/Order.java
