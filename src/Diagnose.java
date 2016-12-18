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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Diagnose extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		btnNewButton_1.setBounds(220, 241, 76, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("诊断意见");
		lblNewLabel.setForeground(new Color(106, 90, 205));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		lblNewLabel.setBounds(25, 133, 86, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText(" 输入诊断结果……");
		textField.setBounds(25, 156, 379, 75);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("开处方");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Recipe frame=new Recipe();
				frame.setVisible(true);
				dispose();
			}
		});
		button.setBounds(310, 241, 93, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("病情描述");
		label.setForeground(new Color(106, 90, 205));
		label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label.setBounds(25, 32, 86, 23);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setText(" 输入病人所描述的症状……");
		textField_1.setBounds(26, 55, 378, 68);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("病人编号：");
		label_1.setBounds(27, 10, 65, 15);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(UIManager.getColor("Button.background"));
		textField_2.setEditable(false);
		textField_2.setBounds(92, 7, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("姓名：");
		label_2.setBounds(168, 10, 47, 15);
		contentPane.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBackground(UIManager.getColor("Button.background"));
		textField_3.setBounds(215, 7, 66, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBackground(UIManager.getColor("Button.background"));
		textField_4.setBounds(358, 7, 66, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
