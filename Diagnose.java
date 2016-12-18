import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Diagnose extends JFrame {

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
					Diagnose frame = new Diagnose();
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
	public Diagnose() {
		setTitle("医生诊断界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 334);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("返回上一层");
		menu.setForeground(new Color(255, 99, 71));
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("返回首页");
		menu_1.setForeground(new Color(255, 0, 0));
		menuBar.add(menu_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("保存");
		btnNewButton_1.setBounds(219, 223, 76, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("诊断意见");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel.setBounds(25, 112, 86, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText(" 输入诊断结果……");
		textField.setBounds(24, 138, 379, 75);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("开处方");
		button.setBounds(310, 223, 93, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("病情描述");
		label.setFont(new Font("宋体", Font.PLAIN, 15));
		label.setBounds(25, 10, 86, 23);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setText(" 输入病人所描述的症状……");
		textField_1.setBounds(25, 34, 378, 68);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
