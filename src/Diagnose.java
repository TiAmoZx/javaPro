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
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Diagnose extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Statement st = null;
	// Test te=new Test();
	private String sickId;
	Sick si = new Sick();
	/**
	 * Launch the application.
	 */
	private String doctorName;

	public void setDocName(String name) {
		doctorName = name;
	}

	public Diagnose(String sickId) {
		this.sickId = sickId;
		try {
			st = DatabaseHelper.con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initLayout();
		
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diagnose frame = new Diagnose("");
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
	public void initLayout() {
		setTitle("医生诊断界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 493, 340);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenuItem menuItem = new JMenuItem("返回上一层");
		menuItem.setForeground(new Color(255, 99, 71));
		menuBar.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test te = new Test(doctorName);
				te.setVisible(true);
				dispose();
			}
		});

		JMenuItem menuItem_1 = new JMenuItem("返回首页");
		menuItem_1.setForeground(new Color(255, 99, 71));
		menuBar.add(menuItem_1);
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start st = new Start();
				st.setVisible(true);
				dispose();
			}
		});
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label_1 = new JLabel("病人编号：");
		label_1.setBounds(27, 10, 65, 15);
		contentPane.add(label_1);

		// 病人预约号栏
		textField_2 = new JTextField();
		textField_2.setBackground(UIManager.getColor("Button.background"));
		textField_2.setEditable(false);
		textField_2.setBounds(92, 7, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(sickId);

		JLabel label_2 = new JLabel("姓名：");
		label_2.setBounds(168, 10, 47, 15);
		contentPane.add(label_2);

		java.util.List<Sick> searchResult = new ArrayList<>();
		ResultSet resultSet = null;
		try {
			resultSet = st.executeQuery("SELECT name,age FROM sicker WHERE innum= " + sickId);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			while (resultSet.next()) {

				si.name = resultSet.getString(1);
				si.age = resultSet.getString(2);
				searchResult.add(si);
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		// 姓名栏
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBackground(UIManager.getColor("Button.background"));
		textField_3.setBounds(215, 7, 66, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText(si.name);

		JLabel label_3 = new JLabel("年龄：");
		label_3.setBounds(291, 10, 54, 15);
		contentPane.add(label_3);

		// 年龄栏
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBackground(UIManager.getColor("Button.background"));
		textField_4.setBounds(338, 7, 66, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setText(si.age);

		JButton btnNewButton_1 = new JButton("保存");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("病历.txt");
				try {
					FileWriter out = new FileWriter(file);
					String s = textField.getText();
					String s1 = textField_1.getText();
					out.write("病情描述:\t" + s1 + "\r\n");
					out.write("诊断意见:\t" + s + "\r\n");
					out.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
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
				Recipe frame = new Recipe();
				frame.setDocName(doctorName);
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

	}
}

class Sick {
	String id;
	String name;
	String age;
}
