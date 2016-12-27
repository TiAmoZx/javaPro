

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
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class Order extends JFrame {
	private JPanel contentPane;
   private static JTextField textField;
	  private static void testInsert()  
	    {  
		    String name=textField.getText().toString();
		    
	         String SQL = " DELETE FROM list WHERE 病人编号 = '"+name+"'";  
	         sqlHelper.executeUpdate(SQL); 
	       
	    }  
	  private static void testInsert1(){
		  String name=textField.getText().toString();
		 if("1"=="select 状态 from list where 病人编号='"+name+"'"){
			  System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
			  JOptionPane.showMessageDialog(null, "密码输入错误！请重新输入", "友情提示", JOptionPane.INFORMATION_MESSAGE);}
			  else{
		  
		  try{
		    
		    
	         String SQL = " UPDATE list SET 状态 = '1' WHERE 病人编号 = '"+name+"'";  
	         sqlHelper.executeUpdate(SQL); 
	        /* String a0="select 药品1 from list where 病人编号='"+name+"'".toString();
	         String a1="select 药品2 from list where 病人编号='"+name+"'".trim();
	         String a2="select 药品3 from list where 病人编号='"+name+"'".trim();
	         String a3="select 药品4 from list where 病人编号='"+name+"'".trim();
	         String a4="select 药品5 from list where 病人编号='"+name+"'".trim();
	         String a5="select 药品6 from list where 病人编号='"+name+"'".trim();
	         String a6="select 药品7 from list where 病人编号='"+name+"'".trim();
	         String a7="select 药品8 from list where 病人编号='"+name+"'".trim();
	         String p0="select 价格 from drug where 药品名='"+a0+"'".trim();
	         String p1="select 价格 from drug where 药品名='"+a1+"'".trim();
	         String p2="select 价格 from drug where 药品名='"+a2+"'".trim();
	         String p3="select 价格 from drug where 药品名='"+a3+"'".trim();
	         String p4="select 价格 from drug where 药品名='"+a4+"'".trim();
	         String p5="select 价格 from drug where 药品名='"+a5+"'".trim();
	         String p6="select 价格 from drug where 药品名='"+a6+"'".trim();
	         String p7="select 价格 from drug where 药品名='"+a7+"'".trim();*/
	         Connection con=null;
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con= DriverManager.getConnection("jdbc:sqlserver://172.16.0.77:1433;DatabaseName=hosptial","sa","sa");
				//System.out.println("Connect succeed!");
				Statement st=null;
				st=con.createStatement();
				String sqlselect="select * from list where 病人编号='"+name+"'";
				ResultSet rs=null;
				rs=st.executeQuery(sqlselect);
			
				
		     
		        while(rs.next()){
		        	
		        	String a0=rs.getString("药品1");
		        	String a1=rs.getString("药品2");
		        	String a2=rs.getString("药品3");
		        	String a3=rs.getString("药品4");
		        	String a4=rs.getString("药品5");
		        	String a5=rs.getString("药品6");
		        	String a6=rs.getString("药品7");
		        	String a7=rs.getString("药品8");
		        	Statement st1=null;
					st1=con.createStatement();
					String sqlselect99="UPDATE list SET 金额=0";
					sqlHelper.executeUpdate(sqlselect99);
		        	String sqlselect1="UPDATE list SET 金额 = 金额+drug.价格 from drug,list WHERE  drug.药品名=list.药品1";
		        	String sqlselect2="UPDATE list SET 金额 = 金额+drug.价格 from drug,list WHERE  drug.药品名=list.药品2";
		        	String sqlselect3="UPDATE list SET 金额 = 金额+drug.价格 from drug,list WHERE  drug.药品名=list.药品3";
		        	String sqlselect4="UPDATE list SET 金额 = 金额+drug.价格 from drug,list WHERE  drug.药品名=list.药品4";
		        	String sqlselect5="UPDATE list SET 金额 = 金额+drug.价格 from drug,list WHERE  drug.药品名=list.药品5";
		        	String sqlselect6="UPDATE list SET 金额 = 金额+drug.价格 from drug,list WHERE  drug.药品名=list.药品6";
		        	String sqlselect7="UPDATE list SET 金额 = 金额+drug.价格 from drug,list WHERE  drug.药品名=list.药品7";
		        	String sqlselect8="UPDATE list SET 金额 = 金额+drug.价格 from drug,list WHERE  drug.药品名=list.药品8";
					
					sqlHelper.executeUpdate(sqlselect1);
					sqlHelper.executeUpdate(sqlselect2);
					sqlHelper.executeUpdate(sqlselect3);
					sqlHelper.executeUpdate(sqlselect4);
					sqlHelper.executeUpdate(sqlselect5);
					sqlHelper.executeUpdate(sqlselect6);
					sqlHelper.executeUpdate(sqlselect7);
					sqlHelper.executeUpdate(sqlselect8);
			        /*while(rs1.next()){
			        	
			        	String p0=rs.getString("药品1");
			        	int price0=Integer.parseInt(p0);
			        	String SQL1 = " UPDATE list SET 金额 =金额+'+price0+' WHERE 病人编号 = '"+name+"'"; 
				         sqlHelper.executeUpdate(SQL1); 
			        }
			        Statement st2=null;
					st2=con.createStatement();
			        String sqlselect2="select * from drug where 药品名='"+a1+"'";
					ResultSet rs2=null;
					rs2=st2.executeQuery(sqlselect2);
				    while(rs2.next()){
				    	String p0=rs.getString("药品2");
			        	int price0=Integer.parseInt(p0);
			        	String SQL1 = " UPDATE list SET 金额 = 金额+'+price0+' WHERE 病人编号 = '"+name+"'"; 
				         sqlHelper.executeUpdate(SQL1); 
			        	
				    }
				    Statement st3=null;
					st3=con.createStatement();
				    String sqlselect3="select * from drug where 药品名='"+a2+"'";
					ResultSet rs3=null;
					rs3=st3.executeQuery(sqlselect3);
				    while(rs3.next()){
				    	String p0=rs.getString("药品3");
			        	int price0=Integer.parseInt(p0);
			        	String SQL1 = " UPDATE list SET 金额 = 金额+'+price0+' WHERE 病人编号 = '"+name+"'"; 
				         sqlHelper.executeUpdate(SQL1);
				    }
				    Statement st4=null;
					st4=con.createStatement();
				    String sqlselect4="select * from drug where 药品名='"+a3+"'";
					ResultSet rs4=null;
					rs4=st4.executeQuery(sqlselect4);
				    while(rs4.next()){
				    	String p0=rs.getString("药品4");
			        	int price0=Integer.parseInt(p0);
			        	String SQL1 = " UPDATE list SET 金额 = 金额+'+price0+' WHERE 病人编号 = '"+name+"'"; 
				         sqlHelper.executeUpdate(SQL1);
				    }
				    Statement st5=null;
					st5=con.createStatement();
				    String sqlselect5="select * from drug where 药品名='"+a4+"'";
					ResultSet rs5=null;
					rs5=st5.executeQuery(sqlselect5);
				    while(rs5.next()){
				    	String p0=rs.getString("药品2");
			        	int price0=Integer.parseInt(p0);
			        	String SQL1 = " UPDATE list SET 金额 = 金额+'+price0+' WHERE 病人编号 = '"+name+"'"; 
				         sqlHelper.executeUpdate(SQL1);
				    }
				    Statement st6=null;
					st6=con.createStatement();
				    String sqlselect6="select * from drug where 药品名='"+a5+"'";
					ResultSet rs6=null;
					rs6=st6.executeQuery(sqlselect6);
				    while(rs6.next()){
				    	String p0=rs.getString("药品2");
			        	int price0=Integer.parseInt(p0);
			        	String SQL1 = " UPDATE list SET 金额 = 金额+'+price0+' WHERE 病人编号 = '"+name+"'"; 
				         sqlHelper.executeUpdate(SQL1);
				    }
				    Statement st7=null;
					st7=con.createStatement();
				    String sqlselect7="select * from drug where 药品名='"+a6+"'";
					ResultSet rs7=null;
					rs7=st7.executeQuery(sqlselect7);
				    while(rs7.next()){
				    	String p0=rs.getString("药品2");
			        	int price0=Integer.parseInt(p0);
			        	String SQL1 = " UPDATE list SET 金额 = 金额+'+price0+' WHERE 病人编号 = '"+name+"'"; 
				         sqlHelper.executeUpdate(SQL1);
				    }
				    Statement st8=null;
					st8=con.createStatement();
				    String sqlselect8="select * from drug where 药品名='"+a7+"'";
					ResultSet rs8=null;
					rs8=st8.executeQuery(sqlselect8);
				    while(rs8.next()){
				    	String p0=rs.getString("药品2");
			        	int price0=Integer.parseInt(p0);
			        	String SQL1 = " UPDATE list SET 金额 =金额+'+price0+' WHERE 病人编号 = '"+name+"'"; 
				         sqlHelper.executeUpdate(SQL1);
				    }*/
				    
			         
				    
				        	
				        
				        
		        }
		  
	        
	         
	         
	         Connection cona=null;
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con= DriverManager.getConnection("jdbc:sqlserver://172.16.0.77:1433;DatabaseName=hosptial","sa","sa");
				//System.out.println("Connect succeed!");
				Statement sta=null;
				st=con.createStatement();
				String sqlselecta="select * from list where 病人编号='"+name+"'";
				ResultSet rsa=null;
				rs=st.executeQuery(sqlselect);
			
				
		     
		        while(rs.next()){
		        	
		        	String b0=rs.getString("药品1");
		        	String b1=rs.getString("药品2");
		        	String b2=rs.getString("药品3");
		        	String b3=rs.getString("药品4");
		        	String b4=rs.getString("药品5");
		        	String b5=rs.getString("药品6");
		        	String b6=rs.getString("药品7");
		        	String b7=rs.getString("药品8");
		        	String sqlselect12="update drug set 库存= 库存-1  WHERe 药品名 = '"+b0+"'";
		        	String sqlselect22="update drug set 库存= 库存-1  WHERe 药品名 = '"+b1+"'";
		        	String sqlselect32="update drug set 库存= 库存-1  WHERe 药品名 = '"+b2+"'";
		        	String sqlselect42="update drug set 库存= 库存-1  WHERe 药品名 = '"+b3+"'";
		        	String sqlselect52="update drug set 库存= 库存-1  WHERe 药品名 = '"+b4+"'";
		        	String sqlselect62="update drug set 库存= 库存-1  WHERe 药品名 = '"+b5+"'";
		        	String sqlselect72="update drug set 库存= 库存-1  WHERe 药品名 = '"+b6+"'";
		        	String sqlselect82="update drug set 库存= 库存-1  WHERe 药品名 = '"+b7+"'";
		        	sqlHelper.executeUpdate(sqlselect12);
		        	sqlHelper.executeUpdate(sqlselect22);
		        	sqlHelper.executeUpdate(sqlselect32);
		        	sqlHelper.executeUpdate(sqlselect42);
		        	sqlHelper.executeUpdate(sqlselect52);
		        	sqlHelper.executeUpdate(sqlselect62);
		        	sqlHelper.executeUpdate(sqlselect72);
		        	sqlHelper.executeUpdate(sqlselect82);
		        }
		        
	         
		  }catch(Exception e){
				System.out.println(e);
			}
			  }
	       
	         
	    }  
	  

	


	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
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
	/**
	 * Create the frame.
	 */
	public Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("填写病人预约号：");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(21, 744, 115, 29);
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
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				 Medicine a=new Medicine();
				 a.setVisible(true);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(596, 779, 89, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u53D6\u836F");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testInsert1();
				dispose();
				 Order a=new Order();
				 a.setVisible(true);
			}
		});
		button_2.setBounds(249, 779, 89, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u5220\u9664\u6B64\u836F\u65B9");
		button_3.setFont(new Font("宋体", Font.PLAIN, 11));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testInsert();
				dispose();
				 Order a=new Order();
				 a.setVisible(true);
			}
		});
		button_3.setBounds(359, 779, 103, 29);
		contentPane.add(button_3);
		
		JLabel label_2 = new JLabel("\u836F\u623F\u7BA1\u7406\u7CFB\u7EDF");
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(367, 53, 149, 29);
		contentPane.add(label_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 874, 40);
		contentPane.add(menuBar);
		
		try{
			Connection con=null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection("jdbc:sqlserver://172.16.0.77:1433;DatabaseName=hosptial","sa","sa");
			//System.out.println("Connect succeed!");
			Statement st=null;
			st=con.createStatement();
			String sqlselect="select * from list";
			ResultSet rs=null;
			rs=st.executeQuery(sqlselect);
		
			
	        DefaultTableModel model=new DefaultTableModel();
	        model.setColumnIdentifiers(new Object[]{"序号","1","2","3","4","5","6","7","8","状态","金额"});
	        while(rs.next()){
	        	String num=rs.getString("病人编号");
	        	String n1=rs.getString("药品1");
	        	String n2=rs.getString("药品2");
	        	String n3=rs.getString("药品3");
	        	String n4=rs.getString("药品4");
	        	String n5=rs.getString("药品5");
	        	String n6=rs.getString("药品6");
	        	String n7=rs.getString("药品7");
	        	String n8=rs.getString("药品8");
	        	String n9=rs.getString("状态");
	        	String n10=rs.getString("金额");
	        	model.addRow(new Object[]{num,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10});
	        }
	        
	        
	JTable table = new JTable(model);
	table.setBounds(21, 125, 832, 608);
	table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	contentPane.add(table);
		}catch(Exception e){
			System.out.println(e);
		}
		
		textField = new JTextField();
		textField.setBounds(10, 781, 126, 26);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
