

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class DeleteMember extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static String stype;
	
	
	public void ex(){
		DeleteMember frame = new DeleteMember();
		frame.setVisible(false);
		AdministratorView av = new AdministratorView();
		av.setVisible(true);
		dispose();}
	
	
	public void connectsql(){	 
	String worknum=textField.getText().toString();
	String name=textField_1.getText().toString();
		try{Connection con = null;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=hospital","sa","sa");
		/*if(con !=null)
			System.out.println("Connect succeed!");*/
		Statement st=null;
		st=con.createStatement();
		String sql1 = "delete from " + stype + " where worknum = '"+worknum+"'";
		String sql2 = "delete from " + stype + " where name = '"+name+"'";
		st.executeUpdate(sql1);
		st.executeUpdate(sql2);
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
					DeleteMember frame = new DeleteMember();
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
	public DeleteMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("工号：");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(38, 94, 54, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(102, 91, 234, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("姓名：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(38, 148, 54, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 145, 234, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("部门：");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(38, 199, 54, 15);
		contentPane.add(label_2);
		
		String[] type = {"药师","收费人员","医生"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(102, 196, 234, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(38, 329, 298, 15);
		lblNewLabel.setForeground(Color.green);
		contentPane.add(lblNewLabel);
		
		
		JButton button = new JButton("删除");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(comboBox.getSelectedItem().toString()){
				case "医生": stype = "doctor";break;
				case "收费人员":stype = "cashier";break;
				case "药师":stype = "phar";break;
				}	
				connectsql();
				lblNewLabel.setText("** 删除成功 ！");
				textField.setText("");
				textField_1.setText("");}
		});
		button.setBounds(38, 296, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ex();
			}
		});
		button_1.setBounds(243, 296, 93, 23);
		contentPane.add(button_1);
		
		
		JLabel label_3 = new JLabel("（任意填写一栏即可删除，别忘记选择部门！）");
		label_3.setBounds(38, 257, 300, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\15036\\Desktop\\LLiu\\av.jpg"));
		label_4.setBounds(0, 0, 384, 461);
		contentPane.add(label_4);
		
	}

}
