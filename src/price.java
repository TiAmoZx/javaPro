import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTabbedPane;

public class price extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	Thread thread1=new Thread();
	
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					price frame = new price();
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
	public price() {
		
		setBounds(120,120,300,400);
		thread1=new Thread(new Runnable(){
			public void run(){
				try{
					Connection con = null;
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con= DriverManager.getConnection("jdbc:sqlserver://10.20.168.23:1433;DatabaseName=hosptial","sa","sa");
					/*if(con !=null)
						System.out.println("Connect succeed!");*/
					Statement st=null;
					st=con.createStatement();
					String sqlselect = "select * from Yuyue";
					ResultSet rs = null;
					rs = st.executeQuery(sqlselect);
					
					//再次，添加数据
					while(rs.next())
					{
					String wn=rs.getString("姓名");
									String name=rs.getString("性别");
									String psword=rs.getString("年龄");
									String dept=rs.getString("预约号");
					//把以上数据添加到表格模型的一行中
									
									
					}
					
					//最后，用模型生成表格
					
						}catch(Exception e){
							System.out.println(e);
						}
			}
			
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("查询");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread1.start();
			}
		});
		btnNewButton.setBounds(84, 134, 75, 29);
		
		JButton btnNewButton_1 = new JButton("重置");
		btnNewButton_1.setBounds(218, 134, 75, 29);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");//将文本框的内容归零
				textField_1.setText("");
			}
		});
		
		textField = new JTextField();
		textField.setBounds(171, 96, 130, 26);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 36, 130, 26);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("挂号号码");
		lblNewLabel.setBounds(74, 41, 52, 16);
		
		JLabel lblNewLabel_1 = new JLabel("病人姓名");
		lblNewLabel_1.setBounds(74, 101, 52, 16);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(5, 5, 440, 22);
		
		JButton btnNewButton_2 = new JButton("返回首页");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Jfa jj=new Jfa();
				jj.setVisible(true);
			}
		});
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(" 退出系统");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		toolBar.add(btnNewButton_3);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(lblNewLabel);
		contentPane.add(textField_1);
		contentPane.add(toolBar);
		
		textField_2 = new JTextField();
		textField_2.setBounds(6, 191, 438, 81);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
