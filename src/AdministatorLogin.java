

import java.awt.BorderLayout;
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

public class AdministatorLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button;
	private JButton button_1;
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

	public void ex(){
		AdministatorLogin adl = new AdministatorLogin();
		adl.setVisible(false);
		WelcomeView frame = new WelcomeView();
		frame.setVisible(true);
		dispose();
	}
	public void ex2(){
		
		
		
		AdministatorLogin adl = new AdministatorLogin();
		adl.setVisible(false);
		AdministratorView adv = new AdministratorView();
		adv.setVisible(true);
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
		label.setBounds(126, 214, 67, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(185, 211, 175, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(126, 258, 54, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 255, 175, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		button = new JButton("返回首页");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ex();}
		});
		button.setBounds(267, 306, 93, 23);
		contentPane.add(button);
		
		button_1 = new JButton("登陆");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ex2();}
		});
		button_1.setBounds(114, 306, 93, 23);
		contentPane.add(button_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("/Users/yuelei/Desktop/avlogin.jpg"));
		label_2.setBounds(0, 10, 390, 461);
		contentPane.add(label_2);
	}
}
