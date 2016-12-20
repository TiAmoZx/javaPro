

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
public class WelcomeView extends JFrame {

	private JPanel contentPane;
	static String selecttype;
	Thread thread1=new Thread();
	Thread thread2=new Thread();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeView frame = new WelcomeView();
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
	
		public void ex(){
		WelcomeView frame = new WelcomeView();
		frame.setVisible(false);
		AdministatorLogin adl= new AdministatorLogin();
		adl.setVisible(true);
		dispose();
		}
		
	
	public  WelcomeView() {
		thread1 =new Thread(new Runnable(){
			public void run(){
				
				try{
					WelcomeView frame = new WelcomeView();
					frame.setVisible(false);
					收费 收费2=new 收费();
					收费2.setVisible(true);
				}
				catch(Exception e){e.printStackTrace();}
			}
			
		});
		thread2 =new Thread(new Runnable(){
			public void run(){
				
				try{
					WelcomeView frame = new WelcomeView();
					frame.setVisible(false);
					Start s1=new Start();
					s1.setVisible(true);
				}
				catch(Exception e){e.printStackTrace();}
			}
			
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label_3 = new JLabel("用户类型：");
		label_3.setBounds(51, 282, 80, 15);
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		
		String[] type = {"病人","医生","收费人员","药师","院长","管理员"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(126, 279, 215, 21);
		
		
		JButton button = new JButton("确定");
		button.setBounds(51, 336, 93, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selecttype = comboBox.getSelectedItem().toString();
				switch(selecttype){
				case "管理员":
					ex();
					break;
				case"收费人员":
					dispose();
					thread1.start();
					break;
				case"医生":
					dispose();
					thread2.start();
					break;
				case"药师":
					ex();
					break;
				case"院长":
					ex();
					break;
					
				}
				
				
			}
				
		
		});
		
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.setBounds(248, 336, 93, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel label_4 = new JLabel("\u6CA1\u6709\u7528\u6237\uFF1F\u90A3\u5C31\u6765\u521B\u5EFA\u4E00\u4E2A\u5427\uFF01");
		label_4.setBounds(10, 404, 291, 15);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton button_2 = new JButton("\u521B\u5EFA");
		button_2.setBounds(248, 401, 93, 21);
		
		JLabel label = new JLabel("");
		label.setBounds(-12, 0, 396, 472);
		label.setIcon(new ImageIcon("/Users/yuelei/Desktop/wel.jpg"));
		contentPane.setLayout(null);
		contentPane.add(comboBox);
		contentPane.add(button_1);
		contentPane.add(label_3);
		contentPane.add(button);
		contentPane.add(button_2);
		contentPane.add(label_4);
		contentPane.add(label);
	
	
	}}
	
