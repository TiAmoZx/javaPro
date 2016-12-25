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
		button_2.setBounds(249, 779, 89, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u5220\u9664\u6B64\u836F\u65B9");
		button_3.setFont(new Font("宋体", Font.PLAIN, 11));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testInsert();
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
			con= DriverManager.getConnection("jdbc:sqlserver://10.20.177.139:1433;DatabaseName=hosptial","sa","sa");
			//System.out.println("Connect succeed!");
			Statement st=null;
			st=con.createStatement();
			String sqlselect="select * from list";
			ResultSet rs=null;
			rs=st.executeQuery(sqlselect);
		
			
	        DefaultTableModel model=new DefaultTableModel();
	        model.setColumnIdentifiers(new Object[]{"序号","1","2","3","4","5","6","7","8"});
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
	        	model.addRow(new Object[]{num,n1,n2,n3,n4,n5,n6,n7,n8});
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
