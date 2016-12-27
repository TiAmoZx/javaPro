
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
	static String selecttype; //定义一个全局变量用来存储跳转哪个页面
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

	
	//管理员页面跳转
			public void ex(){
			WelcomeView frame = new WelcomeView();
			frame.setVisible(false);
			AdministatorLogin adl= new AdministatorLogin();
			adl.setVisible(true);
			dispose();
			}
	//院长页面跳转
			public void ex2(){
				WelcomeView frame = new WelcomeView();
				frame.setVisible(false);
				//此处新建院长对象
				//此处院长窗体可视化
				dispose();
				}
	//药师页面跳转
			public void ex3(){
				WelcomeView frame = new WelcomeView();
				frame.setVisible(false);
				//此处新建药师对象
				//此处药师窗体可视化
				dispose();
				}	
	//收费人员页面跳转
			public void ex4(){
				WelcomeView frame = new WelcomeView();
				frame.setVisible(false);
				//此处新建收费人员对象
				//此处收费人员窗体可视化
				dispose();
				}	
	//医生页面跳转
			public void ex5(){
				WelcomeView frame = new WelcomeView();
				frame.setVisible(false);
				//此处新建医生对象
				//此处医生窗体可视化
				dispose();
				}	
	/**
	 * Create the frame.（欢迎界面设计）
	 */
	
	public  WelcomeView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label_3 = new JLabel("用户类型：");
		label_3.setBounds(51, 282, 80, 15);
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		
		String[] type = {"医生","收费人员","药师","院长","管理员"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(126, 279, 215, 21);
		
		
		JButton button = new JButton("确定");
		button.setBounds(51, 336, 93, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selecttype = comboBox.getSelectedItem().toString();//跳转页面用comobobox的选择项
				switch(selecttype){
				case "管理员":
					ex();break;
				case "院长":
					ex2();break;
				case "药师":
					ex3();break;
				case "收费人员":
					dispose();
					pricestart a=new pricestart();
					a.setVisible(true);
					break;
				case "医生":
					dispose();
					Start b=new Start();
					b.setVisible(true);
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
		
		JLabel label = new JLabel("");
		label.setBounds(-12, 0, 396, 472);
		label.setIcon(new ImageIcon("/Users/yuelei/Desktop/wel.jpg"));
		contentPane.setLayout(null);
		contentPane.add(comboBox);
		contentPane.add(button_1);
		contentPane.add(label_3);
		contentPane.add(button);
		contentPane.add(label);
	
	
	}}
	
