import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Yuyue11 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yuyue11 frame = new Yuyue11();
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
	public Yuyue11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u6027\u522B");
		label.setBounds(36, 63, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setBounds(36, 38, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5E74\u9F84");
		label_2.setBounds(36, 88, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u8054\u7CFB\u65B9\u5F0F");
		label_3.setBounds(36, 113, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u9884\u7EA6\u79D1\u5BA4");
		label_4.setBounds(36, 145, 54, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u9884\u7EA6\u65F6\u95F4");
		label_5.setBounds(36, 172, 54, 15);
		contentPane.add(label_5);
		
		textField = new JTextField();
		textField.setBounds(100, 35, 106, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 60, 106, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 85, 106, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(100, 110, 106, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(100, 142, 207, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(100, 169, 207, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 }
		});
		button.setBounds(36, 211, 93, 23);
		contentPane.add(button);
		
		JLabel label_6 = new JLabel("\u533B\u9662\u9884\u7EA6\u754C\u9762");
		label_6.setBounds(167, 10, 106, 15);
		contentPane.add(label_6);
	}
}
