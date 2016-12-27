import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.lang.Thread;




import java.io.DataInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JList;


public class T2 extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField phonenumber;


	Thread thread=new Thread();
	Thread thread1=new Thread();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T2 frame = new T2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	/**
	 * Create the frame.
	 */
	public T2() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 150, 462, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		
		JLabel label_5 = new JLabel("预约时间(当前时间)");
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_5.setBounds(24, 190, 119, 15);
		contentPane.add(label_5);
		
		JLabel label_7 = new JLabel("预约号");
		label_7.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_7.setBounds(277, 46, 54, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(329, 46, 54, 15);
		contentPane.add(label_8);
		
		name = new JTextField();
		name.setBounds(74, 40, 106, 21);
		contentPane.add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setBounds(321, 74, 100, 21);
		contentPane.add(age);
		age.setColumns(10);
		
		phonenumber = new JTextField();
		phonenumber.setBounds(74, 109, 106, 24);
		contentPane.add(phonenumber);
		phonenumber.setColumns(10);
		
		Thread thread2=new Thread();
		thread2=new Thread(new Runnable(){
			public void run(){
				try{
					Connection con = null;
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con= DriverManager.getConnection("jdbc:sqlserver://172.16.0.77:1433;DatabaseName=hosptial","sa","sa");
					/*if(con !=null)
						System.out.println("Connect succeed!");*/
				 Statement st=null;
					st=con.createStatement();
					String sqlselect = "SELECT COUNT(*) as count  from sicker";
					
					ResultSet rs = null;
					rs = st.executeQuery(sqlselect);
					if(rs.next()){
						int aa = rs.getInt("count");
						int c=aa+1;
						label_8.setText(c+"");
						}

					
					//再次，添加数据
					
					//最后，用模型生成表格
					
						}catch(Exception e){
							System.out.println(e);
						}
			}
			
		}); thread2.start();
		
		JLabel label_6 = new JLabel("\u533B\u9662\u9884\u7EA6\u754C\u9762");
		label_6.setForeground(new Color(204, 0, 102));
		label_6.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_6.setBounds(214, 10, 106, 15);
		contentPane.add(label_6);
				
		JButton button_1 = new JButton("\u5173\u95ED");
		button_1.setForeground(new Color(102, 0, 102));
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Log lg=new Log();
				lg.setVisible(true);	
			}
		});
		button_1.setBounds(328, 232, 93, 23);
		contentPane.add(button_1);
		
		
	
		
		
		JButton button_2 = new JButton("重置");
		button_2.setForeground(new Color(204, 0, 102));
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				name.setText("");
				
				
				age.setText("");
				phonenumber.setText("");
				
				
				
			}
		});
		button_2.setBounds(202, 232, 93, 23);
		contentPane.add(button_2);
		
		String[] type  = {"男","女"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(74, 68, 106, 21);
		contentPane.add(comboBox);
		
		String[] type1  = {"外科","内科","骨科","皮肤科","妇产科"};
		JComboBox comboBox_1 = new JComboBox(type1);
		comboBox_1.setBounds(74, 150, 106, 21);
		contentPane.add(comboBox_1);
		
		
	
		thread=new Thread(new Runnable(){
			public void run(){
				  try{
					String t;
					
					
					String d;
					String p;
					String l;
					String m;
					String n;												    
					t=name.getText();
							
					d=comboBox.getSelectedItem().toString();
			     	p=age.getText();					
					l=phonenumber.getText();
					
					m=comboBox_1.getSelectedItem().toString();
					
					Date date=new Date();
					DateFormat format= new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
					n=format.format(date).toString();
					
					
					System.out.println("11"+t);
					String SQL = " insert into sicker values('"+t+"','"+d+"','"+p+"','"+l+"','"+m+"','"+n+"') "; 
			
			         if(SqlHelper.executeUpdate(SQL))  
			         {  
			             System.out.println("插入成功 ");  
			             JOptionPane.showMessageDialog(contentPane, "预约成功", "标题", JOptionPane.WARNING_MESSAGE);
			         }else  
			         {  
			             System.out.println("插入失败 ");  
			         }  
	         }
			catch(Exception e){
				e.printStackTrace();			
			}	
			}});
	
		thread1=new Thread(new Runnable(){
			public void run(){
				File file = new File("word.txt");
				try {
					// 创建FileWriter对象
					FileWriter out = new FileWriter(file);
					// 获取文本域中文本
					String s = name.getText();String s1 = label.getText();
					String s2 = label_8.getText();String s3=label_2.getText();
					String s4 = comboBox.getSelectedItem().toString();String s5 = label_3.getText();
					String s6 = age.getText();String s7 = label_4.getText();
					String s8 = comboBox_1.getSelectedItem().toString();String s9 = label_5.getText();
					String s10 ;String s11 =label_7.getText();
					String s12 = phonenumber.getText();String s13 = label_1.getText();
				 out.write(s13+"\t"); 	out.write(s+"\r\n"); 
				out.write(s11+"\t");	out.write(s2+"\r\n");  
					out.write(s1+"\t");  
				out.write(s4+"\r\n"); 
				 	out.write(s3+"\t");out.write(s6+"\r\n"); 
						out.write(s7+"\t"); out.write(s8+"\r\n"); 
					out.write(s9+"\t");
					Date date=new Date();
					DateFormat format= new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
					s10=format.format(date).toString();
					out.write(s10+"\r\n");
					out.write(s5+"\t"); 
					out.write(s12+"\r\n");
					
					out.close(); // 将流关闭
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		
		
		JButton button_3 = new JButton("提交");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 thread.start();
					 thread1.start();
					 dispose();
						Query qu=new Query();
						qu.setVisible(true);	
					
				}
			
		});
		
		
		button_3.setBounds(50, 232, 93, 23);
		contentPane.add(button_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\新建文件夹\\QQ图片20161214215736.jpg"));
		lblNewLabel.setBounds(0, 10, 446, 261);
		contentPane.add(lblNewLabel);
		}
		}

