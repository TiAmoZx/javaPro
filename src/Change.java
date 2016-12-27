

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Change extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public void tian(){
		try{
			Connection con=null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection("jdbc:sqlserver://176.16.0.77:1433;DatabaseName=hospital","sa","sa");
			//System.out.println("Connect succeed!");
			Statement st=null;
			st=con.createStatement();
			String sqlselect="select * from Drug";
			ResultSet rs=null;
			rs=st.executeQuery(sqlselect);
		}catch(Exception e){
				System.out.println(e);
			}
		
	}
	
	public void shan(){
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Change frame = new Change();
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
	public Change() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("药房管理系统");
		label.setBackground(Color.WHITE);
		label.setBounds(359, 0, 149, 29);
		contentPane.add(label);
		
		JButton button = new JButton("退出");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(764, 739, 89, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				 Medicine a=new Medicine();
				 a.setVisible(true);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(654, 739, 89, 29);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("名字：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 15));
		label_1.setBounds(467, 243, 65, 29);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("库存：");
		label_2.setFont(new Font("宋体", Font.PLAIN, 15));
		label_2.setBounds(467, 361, 65, 29);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("单价：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 15));
		label_3.setBounds(467, 492, 65, 29);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 13));
		textField.setBounds(553, 246, 126, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(553, 364, 126, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(553, 495, 126, 21);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("选择需修改的选项");
		label_4.setFont(new Font("宋体", Font.PLAIN, 15));
		label_4.setBounds(21, 246, 126, 29);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("提示:  添加新药品时需同时填写三个框\r\n ");
		label_5.setFont(new Font("宋体", Font.PLAIN, 11));
		label_5.setBounds(134, 378, 200, 57);
		contentPane.add(label_5);
		
		JButton button_2 = new JButton("确定");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(544, 739, 89, 29);
		contentPane.add(button_2);
		
		String[] sexs = { "请选择","添加药品","删除药品" };
		JComboBox comboBox = new JComboBox(sexs);
		comboBox.setBounds(158, 304, 168, 29);
		
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("删除药品信息时只需填写第一栏名字");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 11));
		lblNewLabel.setBounds(174, 429, 190, 29);
		contentPane.add(lblNewLabel);
		
		JButton button_3 = new JButton("确定");
		button_3.setFont(new Font("宋体", Font.PLAIN, 14));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			switch(comboBox.getSelectedItem().toString()){
			case "添加药品": tian();
			break;
			case "删除药品": shan();
			break;
			}
		
			}
		});
		button_3.setBounds(261, 365, 65, 21);
		contentPane.add(button_3);
	}
}

