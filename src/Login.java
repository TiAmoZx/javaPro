<<<<<<< Updated upstream

package yao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("药房管理员登录界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("输入工号：");
		label.setForeground(new Color(255, 127, 80));
		label.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		label.setBounds(70, 63, 103, 63);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("输入密码：");
		label_1.setForeground(new Color(255, 127, 80));
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		label_1.setBounds(70, 111, 85, 69);
		contentPane.add(label_1);
		
		JButton button = new JButton("确认");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medicine frame=new Medicine();
				frame.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("微软雅黑", Font.PLAIN, 13));
		button.setBounds(273, 176, 93, 23);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(165, 85, 132, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 136, 132, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("欢迎登入医生系统！");
		label_2.setForeground(new Color(123, 104, 238));
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(90, 10, 234, 54);
		contentPane.add(label_2);
	}
}
=======


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("药房管理员登录界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("输入工号：");
		label.setForeground(new Color(255, 127, 80));
		label.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		label.setBounds(70, 63, 103, 63);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("输入密码：");
		label_1.setForeground(new Color(255, 127, 80));
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		label_1.setBounds(70, 111, 85, 69);
		contentPane.add(label_1);
		
		JButton button = new JButton("确认");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medicine frame=new Medicine();
				frame.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("微软雅黑", Font.PLAIN, 13));
		button.setBounds(273, 176, 93, 23);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(165, 85, 132, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 136, 132, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("欢迎登入医生系统！");
		label_2.setForeground(new Color(123, 104, 238));
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(90, 10, 234, 54);
		contentPane.add(label_2);
	}
}
>>>>>>> Stashed changes
