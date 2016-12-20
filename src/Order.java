package yao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Order extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(160, 162, 168, 29);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\u9009\u62E9\u836F\u65B9\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(54, 162, 108, 29);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.GRAY);
		label.setBounds(352, 198, 443, 518);
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
		button.setBounds(706, 779, 89, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				 Medicine a=new Medicine();
				 a.setVisible(true);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(596, 779, 89, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u53D6\u836F");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(134, 433, 89, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u5220\u9664\u6B64\u836F\u65B9");
		button_3.setFont(new Font("宋体", Font.PLAIN, 11));
		button_3.setBounds(134, 526, 89, 29);
		contentPane.add(button_3);
		
		JLabel label_2 = new JLabel("\u836F\u623F\u7BA1\u7406\u7CFB\u7EDF");
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(367, 53, 149, 29);
		contentPane.add(label_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 874, 40);
		contentPane.add(menuBar);
	}

}
