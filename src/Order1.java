import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
	Thread thread1=new Thread();
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
		label_2.setBounds(252, 71, 54, 15);
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
		label_5.setBounds(252, 113, 54, 15);
		contentPane.add(label_5);
		
		JLabel label_7 = new JLabel("预约号");
		label_7.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_7.setBounds(252, 46, 54, 15);
		contentPane.add(label_7);
		
		JButton btnNewButton = new JButton("检测");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread1.start();
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(311, 90, 129, 16);
		contentPane.add(lblNewLabel_3);
		btnNewButton.setBounds(110, 201, 106, 24);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(74, 90, 61, 11);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(74, 40, 106, 21);
		contentPane.add(name);
		name.setColumns(10);
		
		sex = new JTextField();
		
		sex.setBounds(74, 68, 106, 21);
		contentPane.add(sex);
		sex.setColumns(10);
		
		age = new JTextField();
		age.setBounds(311, 67, 100, 21);
		contentPane.add(age);
		age.setColumns(10);
		age.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){  
                      
                }else{  
                    e.consume(); //关键，屏蔽掉非法输入  
                }  
            }  
        });  
		phonenumber = new JTextField();
		phonenumber.setBounds(74, 109, 106, 24);
		contentPane.add(phonenumber);
		phonenumber.setColumns(10);
		//限制只能输入数字
		phonenumber.addKeyListener(new KeyAdapter(){  
		            public void keyTyped(KeyEvent e) {  
		                int keyChar = e.getKeyChar();                 
		                if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){  
		                      
		                }else{  
		                    e.consume(); //关键，屏蔽掉非法输入  
		                }  
		            }  
		        });  
		orderroom = new JTextField();
		orderroom.setBounds(74, 150, 106, 21);
		contentPane.add(orderroom);
		orderroom.setColumns(10);
		
		ordertime = new JTextField();
		ordertime.setBounds(321, 109, 106, 21);
		contentPane.add(ordertime);
		ordertime.setColumns(10);
		
			
		innumber = new JTextField();
		innumber.setBounds(311, 42, 100, 21);
		contentPane.add(innumber);
		innumber.setColumns(10);
		innumber.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){  
                      
                }else{  
                    e.consume(); //关键，屏蔽掉非法输入  
                }  
            }  
        });  
		
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
				Jfa lo=new Jfa();
				lo.setVisible(true);
			}
		});
		button_1.setBounds(6, 7, 93, 23);
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
		button_2.setBounds(252, 201, 93, 24);
		contentPane.add(button_2);
		thread1=new Thread(new Runnable(){
			public void run(){
				
				if("男".equals(sex.getText())||"女".equals(sex.getText())) {lblNewLabel_1.setText("合法");}else
				{lblNewLabel_1.setText("不合法");}

				if("".equals(age.getText())) { lblNewLabel_3.setForeground(Color.black);lblNewLabel_3.setText("年龄不合法");}else
				{lblNewLabel_3.setText("年龄合法");}
			}
			
		
		});
		
	
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
					t.matches("^[\u4e00-\u9fa5]+$");
					b=innumber.getText();b.matches("^[\u4e00-\u9fa5]+$");
					d=sex.getText();d.matches("^[\u4e00-\u9fa5]+$");
					p=age.getText();
					p.matches("\\d");
					l=phonenumber.getText();
					l.matches("\\d");
					m=orderroom.getText();
					m.matches("^[\u4e00-\u9fa5]+$");
					n=ordertime.getText();
					n.matches("\\d");
					System.out.println("11"+t);
					String SQL = " insert into Yuyue values('"+t+"','"+b+"','"+d+"','"+p+"','"+l+"','"+m+"','"+n+"') "; 
					

			         if(SqlHelper.executeUpdate(SQL))  
			         {  
			             System.out.println("插入成功 "); 
			             SqlHelper s=new SqlHelper();
			           
			             JOptionPane.showMessageDialog(contentPane, "预约成功", "标题",JOptionPane.WARNING_MESSAGE); 
			             s.close();
			             
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
		button_3.setBounds(104, 231, 278, 23);
		contentPane.add(button_3);
		
		
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("/Users/yuelei/Desktop/3.jpg"));
		label_8.setBounds(6, 6, 440, 276);
		contentPane.add(label_8);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(192, 70, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(311, 90, 61, 16);
		contentPane.add(lblNewLabel_2);
		}
		}

