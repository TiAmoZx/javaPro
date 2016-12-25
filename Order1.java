import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
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
	/**
	 * Create the frame.
	 */
	public Order1() {
		
		
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
		
		age = new JTextField();
		age.setBounds(321, 74, 100, 21);
		contentPane.add(age);
		age.setColumns(10);
		
		phonenumber = new JTextField();
		phonenumber.setBounds(74, 109, 106, 24);
		contentPane.add(phonenumber);
		phonenumber.setColumns(10);
		
		orderroom = new JTextField();
		orderroom.setBounds(74, 150, 106, 21);
		contentPane.add(orderroom);
		orderroom.setColumns(10);
		
		ordertime = new JTextField();
		ordertime.setBounds(74, 187, 106, 21);
		contentPane.add(ordertime);
		ordertime.setColumns(10);
		
			
		innumber = new JTextField();
		innumber.setBounds(321, 43, 100, 21);
		contentPane.add(innumber);
		innumber.setColumns(10);
		
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
				Log lo=new Log();
				lo.setVisible(true);
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

