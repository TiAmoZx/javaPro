package cn.edu.usst.sixline;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministratorView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorView frame = new AdministratorView();
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
	public AdministratorView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u60A8\u73B0\u5728\u7684\u8EAB\u4EFD\u662F\uFF1A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
		label.setBounds(64, 55, 156, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7BA1\u7406\u5458");
		label_1.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(214, 55, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u9009\u62E9\u60A8\u7684\u64CD\u4F5C\uFF1A");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(132, 124, 104, 15);
		contentPane.add(label_2);
		
		JRadioButton radioButton = new JRadioButton("\u7528\u6237\u7BA1\u7406");
		radioButton.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton.setBounds(79, 145, 79, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u533B\u9662\u79D1\u5BA4\u7BA1\u7406");
		radioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton_1.setBounds(179, 145, 110, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u836F\u54C1\u7BA1\u7406");
		radioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton_2.setBounds(79, 170, 79, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("\u6536\u8D39\u9879\u76EE\u7BA1\u7406");
		radioButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton_3.setBounds(179, 170, 110, 23);
		contentPane.add(radioButton_3);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setBounds(79, 214, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_1.setBounds(196, 214, 93, 23);
		contentPane.add(button_1);
	}
}
