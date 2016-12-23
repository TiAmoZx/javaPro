<<<<<<< Updated upstream
=======


>>>>>>> Stashed changes
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;




import java.io.DataInputStream;




public class Order extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField sex;
	private JTextField age;
	private JTextField phonenumber;
	private JTextField orderroom;
	private JTextField ordertime;
	private JTextField innumber;
	Thread thread1=new Thread();
	
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

	/**
	 * Create the frame.
	 */
	public Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 150, 462, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		  double sumL = 0 ;  
	        byte[] sendBytes = null;  
	        Socket socket = null;  
	        DataOutputStream dos = null;  
	        FileInputStream fis = null;  
	        boolean bool = false;
	        String filePath = "D:/temp/"+GetDate.getDate()+"SJ"+new Random().nextInt(10000)+".txt";  
		
		
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
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setForeground(new Color(102, 0, 102));
		button.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				thread1.start();
				
				dispose();
				Button btn=new Button();
				btn.setVisible(true);
			}
			
		});
		
		thread1=new Thread(new Runnable(){
		   public void run(){
				   try{
					 File file=new File("word.txt"); 
					 FileWriter out=new FileWriter(file);
              	     
                    String s13=label_7.getText();
              	     String s=name.getText();
                    String s7=label_1.getText();
               	 String s1=age.getText();
              	     String s8=label_2.getText();
                	 String s2=sex.getText();
           	         String s9=label.getText();           	  
             	     String s3=phonenumber.getText();
          	         String s10=label_3.getText();      	  
              	     String s4=orderroom.getText();
   	                 String s11=label_4.getText();  	    	         
   	                 String s5=ordertime.getText();
	                 String s12=label_5.getText();	  
	                 String s6=innumber.getText();	           	             
	                 out.write(s7+"\t");  out.write(s+"\r\n");
                 out.write(s8+"\t");  out.write(s1+"\r\n");
	                 out.write(s9+"\t");  out.write(s2+"\r\n");
	                 out.write(s10+"\t"); out.write(s3+"\r\n");
                out.write(s11+"\t"); out.write(s4+"\r\n");
	                 out.write(s12+"\t"); out.write(s5+"\r\n");
	                 out.write(s13+"\t"); out.write(s6+"\r\n");
	                 out.close();
	                 name.setText(""); 
	 				 sex.setText("");	 				
	 				 age.setText(""); 
	 				 innumber.setText(""); 
				     phonenumber.setText("");	
	 			     orderroom.setText("");	
	 			   	 ordertime.setText(""); 	
                  }
                  catch(Exception e1)
				   {e1.printStackTrace();
                    }
				
			}
			
		});
		
		
		
		
		innumber = new JTextField();
		innumber.setBounds(321, 43, 100, 21);
		contentPane.add(innumber);
		innumber.setColumns(10);
		button.setBounds(51, 232, 93, 23);
		contentPane.add(button);
		
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
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\新建文件夹\\QQ图片20161214215736.jpg"));
		label_8.setBounds(10, 10, 436, 261);
		contentPane.add(label_8);
	}

	protected void close() {
		// TODO Auto-generated method stub
		
	}

	protected void connect(InetSocketAddress inetSocketAddress) {
		// TODO Auto-generated method stub
		
	}

	protected OutputStream getOutputStream() {
		// TODO Auto-generated method stub
		return null;
	}
}
