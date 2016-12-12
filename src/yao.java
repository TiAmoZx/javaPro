

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class yao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yao frame = new yao();
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
	public yao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(107, 119, 202, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setFont(new Font("����", Font.PLAIN, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(244, 193, 65, 22);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(375, 71, 258, 309);
		contentPane.add(lblNewLabel);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setFont(new Font("����", Font.PLAIN, 14));
		button_1.setBounds(544, 381, 89, 29);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("\u8BF7\u5199\u5165\u836F\u54C1");
		label_1.setFont(new Font("����", Font.PLAIN, 13));
		label_1.setBounds(21, 123, 65, 29);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u836F\u623F\u7BA1\u7406\u7CFB\u7EDF");
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(275, 21, 149, 29);
		contentPane.add(label_2);
		
		JButton button_2 = new JButton("\u67E5\u770B\u5DF2\u6709\u8BA2\u5355");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			 Dingdan d1=new Dingdan();
			 d1.setVisible(true);
			
			}
		});
		button_2.setFont(new Font("����", Font.PLAIN, 14));
		button_2.setBounds(407, 381, 116, 29);
		contentPane.add(button_2);
	}
}
