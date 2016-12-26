package cn.edu.usst.sixline;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPasswordField;

public class AdministatorLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton button;
	private JButton button_1;
	private JLabel label_3;
	private JPasswordField passwordField_1;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministatorLogin adl = new AdministatorLogin();
					adl.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void ex(){  //返回首页跳转
		AdministatorLogin adl = new AdministatorLogin();
		adl.setVisible(false);
		WelcomeView frame = new WelcomeView();
		frame.setVisible(true);
		dispose();
	}
	public void ex2(){ //管理员登陆成功跳转
		String name = textField.getText();
		String password = passwordField_1.getText();
		
		if(name.equals("5201314") && password.equals("1314520") )
		{label_3.setText("*  登陆成功！");
		AdministatorLogin adl = new AdministatorLogin();
		adl.setVisible(false);
		AdministratorView adv = new AdministratorView();
		adv.setVisible(true);
		dispose();
	}else{
		label_3.setText("* 登陆失败，请验证用户名和密码！");}
	}
	/**
	 * Create the frame.
	 */
	public AdministatorLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("用户名：");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(126, 202, 67, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(185, 199, 175, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(126, 246, 54, 15);
		contentPane.add(label_1);
		
		button = new JButton("返回首页");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ex();}
		});
		button.setBounds(267, 294, 93, 23);
		contentPane.add(button);
		
		button_1 = new JButton("登陆");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ex2();}
		});
		button_1.setBounds(114, 294, 93, 23);
		contentPane.add(button_1);
		
		label_3 = new JLabel("");
		label_3.setBounds(114, 327, 246, 27);
		label_3.setForeground(Color.red);
		contentPane.add(label_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(185, 243, 175, 21);
		contentPane.add(passwordField_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\15036\\Desktop\\avlogin.jpg"));
		label_2.setBounds(0, 10, 384, 461);
		contentPane.add(label_2);
	}
}
