package yao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dingdan extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dingdan frame = new Dingdan();
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
	public Dingdan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(73, 138, 168, 29);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\u9009\u62E9\u836F\u65B9\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(73, 88, 108, 29);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setBounds(337, 103, 258, 309);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(SystemColor.info);
		label_1.setBounds(73, 188, 108, 29);
		contentPane.add(label_1);
		
		JButton button = new JButton("\u9000\u51FA");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(537, 409, 89, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				 yao a=new yao();
				 a.setVisible(true);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(411, 409, 89, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u53D6\u836F");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(73, 270, 89, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u5220\u9664\u6B64\u836F\u65B9");
		button_3.setFont(new Font("宋体", Font.PLAIN, 11));
		button_3.setBounds(73, 320, 89, 29);
		contentPane.add(button_3);
		
		JLabel label_2 = new JLabel("\u836F\u623F\u7BA1\u7406\u7CFB\u7EDF");
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(268, 21, 149, 29);
		contentPane.add(label_2);
	}
}
