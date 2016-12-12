package cn.edu.usst.sixline;

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

public class WelcomeView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

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
	public WelcomeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u533B\u9662\u95E8\u8BCA\u5DE5\u4F5C\u7CFB\u7EDF");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("华文楷体", Font.PLAIN, 25));
		label.setBounds(63, 18, 258, 44);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(47, 84, 80, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(47, 126, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u7528\u6237\u7C7B\u578B\uFF1A");
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		label_3.setBounds(47, 168, 80, 15);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(122, 81, 215, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 123, 215, 21);
		contentPane.add(passwordField);
		
		String[] type = {"病人","医生","收费人员","药师","院长","管理员"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(122, 165, 215, 21);
		contentPane.add(comboBox);
		
		JButton button = new JButton("\u767B\u9646");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(47, 242, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(244, 242, 93, 23);
		contentPane.add(button_1);
		
		JLabel label_4 = new JLabel("\u6CA1\u6709\u7528\u6237\uFF1F\u90A3\u5C31\u6765\u521B\u5EFA\u4E00\u4E2A\u5427\uFF01");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 330, 310, 15);
		contentPane.add(label_4);
		
		JButton button_2 = new JButton("\u521B\u5EFA");
		button_2.setBounds(247, 327, 93, 21);
		contentPane.add(button_2);
	}
}
