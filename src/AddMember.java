

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class AddMember extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	static String stype;        //     定义一个变量 stype用于选择添加信息到那个数据库表
	
	//跳转返回界面
	public void ex(){
		AddMember frame = new AddMember();
		frame.setVisible(false);
		AdministratorView av = new AdministratorView();
		av.setVisible(true);
		dispose();
		
	}
	public void connectsql(){	 
	String worknum=textField.getText().toString();
	String name=textField_1.getText().toString();
	String password=passwordField.getText().toString();
	String dept = textField_2.getText().toString();;
		try{Connection con = null;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=hospital","sa","sa");
		/*if(con !=null)
			System.out.println("Connect succeed!");*/
		Statement st=null;
		st=con.createStatement();
		String sql;
		if(stype =="doctor"){
		sql= "insert into "+ stype +" values('"+worknum+"','"+name+"','"+password+"','"+dept+"')";}
		else{
		sql= "insert into "+ stype +" values('"+worknum+"','"+name+"','"+password+"')";
		}
		st.executeUpdate(sql);
		}catch(Exception e){
		System.out.println(e);}
		
	}
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMember frame = new AddMember();
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
	public AddMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("工号：");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(36, 92, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("姓名：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(36, 141, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("密码：");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(36, 190, 54, 15);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(100, 89, 226, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 138, 226, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 187, 226, 21);
		contentPane.add(passwordField);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 292, 226, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		String[] type = {"药师","收费人员","医生"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(100, 237, 226, 21);
		contentPane.add(comboBox);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(36, 422, 290, 15);
		label_5.setForeground(Color.green);
		contentPane.add(label_5);
		
		JButton button = new JButton("添加");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(comboBox.getSelectedItem().toString()){
				case "医生": stype = "doctor";break;
				case "收费人员":stype = "cashier";break;
				case "药师":stype = "phar";break;
				}	
				connectsql();
				label_5.setText("** 添加成功 ！");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				passwordField.setText("");
			}
			
		});
		button.setBounds(36, 382, 100, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ex();
			}
		});
		button_1.setBounds(227, 382, 100, 23);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("部门：");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(36, 240, 54, 15);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel label_3 = new JLabel("科室：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		label_3.setBounds(36, 295, 54, 15);
		contentPane.add(label_3);
		
		
		
		JLabel label_4 = new JLabel("（科室一栏非医生人员可不填）");
		label_4.setBounds(36, 343, 290, 15);
		contentPane.add(label_4);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("/Users/yuelei/Desktop/avlogin.jpg"));
		label_6.setBounds(6, -50, 382, 520);
		contentPane.add(label_6);
		
		
		
		
	}
}
