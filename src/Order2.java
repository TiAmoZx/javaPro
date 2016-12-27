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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.lang.Thread;




import java.io.DataInputStream;
import javax.swing.JComboBox;




public class Order2 extends JFrame {

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
					Order2 frame = new Order2();
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

			
		
	public Order2() {
		
		
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
		
		String[] type ={"男","女"};
		JComboBox comboBox_1 = new JComboBox(type);
		comboBox_1.setBounds(74, 66, 102, 27);
		contentPane.add(comboBox_1);
		
		String[] type1={"外科","内科","骨科","皮肤科","妇产科"};
		JComboBox comboBox_2 = new JComboBox(type1);
		comboBox_2.setBounds(290, 71, 102, 27);
		contentPane.add(comboBox_2);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_1.setBounds(24, 46, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5E74\u9F84");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_2.setBounds(224, 46, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u8054\u7CFB\u65B9\u5F0F");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_3.setBounds(24, 113, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u9884\u7EA6\u79D1\u5BA4");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_4.setBounds(224, 71, 54, 15);
		contentPane.add(label_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(311, 90, 129, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(74, 90, 61, 11);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(74, 40, 106, 21);
		contentPane.add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setBounds(290, 42, 100, 21);
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
				
				
				age.setText("");
				phonenumber.setText("");
				
				
				
			}
		});
		button_2.setBounds(252, 163, 176, 24);
		contentPane.add(button_2);
		thread1=new Thread(new Runnable(){
			public void run(){
				
				

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
					
					d=comboBox_1.getSelectedItem().toString();
					p=age.getText();
					p.matches("\\d");
					l=phonenumber.getText();
					l.matches("\\d");
					m=comboBox_2.getSelectedItem().toString();
					m.matches("^[\u4e00-\u9fa5]+$");
					Date date=new Date();
					  DateFormat format=new SimpleDateFormat("yyyy：MM：dd HH:mm:ss");
					  n=format.format(date).toString();
					
					System.out.println("11"+t);
					String SQL = " insert into  sicker  values ('"+t+"','"+d+"','"+p+"','"+l+"','"+m+"','"+n+"') "; 
					

			         if(sqlHelper.executeUpdate(SQL))  
			         {  
			             System.out.println("插入成功 "); 
			             sqlHelper s=new sqlHelper();
			           
			             JOptionPane.showMessageDialog(contentPane, "预约成功", "标题",JOptionPane.WARNING_MESSAGE); 
			             
			             
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
					
					String s4 = comboBox_1.getSelectedItem().toString();String s5 = label_3.getText();
					String s6 = age.getText();String s7 = label_4.getText();
					String s8 = comboBox_2.getSelectedItem().toString();String s9 = label_4.getText();
					
					String s12 = phonenumber.getText();String s13 = label_1.getText();
				 out.write(s13+"\t"); 	out.write(s+"\r\n"); 
				
					out.write(s1+"\t");  
				out.write(s4+"\r\n"); 
				 	
						out.write(s7+"\t"); out.write(s8+"\r\n"); 
					out.write(s9+"\t");
					Date date=new Date();
					DateFormat format= new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
					
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
						Query1 qu=new Query1();
						qu.setVisible(true);
					
				}
			
		});
		button_3.setBounds(47, 164, 193, 23);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(74, 66, 52, 27);
		contentPane.add(comboBox);
		}
		}

