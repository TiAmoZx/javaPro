

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ReadDept extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static String stype;
	DefaultTableModel model=new DefaultTableModel();
	
	
	//跳转返回界面
	public void ex(){
		ReadDept frame = new ReadDept();
		frame.setVisible(false);
		DeptManage dm = new DeptManage();
		dm.setVisible(true);
		dispose();
		
	}
	
	
	public void Connectsql(){
		try{
			Connection con = null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection("jdbc:sqlserver://10.20.168.23:1433;DatabaseName=hospital","sa","sa");
			/*if(con !=null)
				System.out.println("Connect succeed!");*/
			Statement st=null;
			st=con.createStatement();
			
			String sqlselect = "select * from doctor where dept = '"+ stype+"'" ;
			ResultSet rs = null;
			rs = st.executeQuery(sqlselect);
			model.setColumnIdentifiers(new String[]{"worknum","name","password","dept"});
			while(rs.next()){
				String wn=rs.getString("worknum");
				String name=rs.getString("name");
				String psword=rs.getString("password");
				String dept=rs.getString("dept");
//把以上数据添加到表格模型的一行中
				
				model.addRow(new Object[]{wn,name,psword,dept});
				
				
			}
			}catch(Exception e){
				System.out.println(e);
				}
			}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReadDept frame = new ReadDept();
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
	public ReadDept() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] type = {"外科","内科","皮肤科","骨科","妇产科"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(32, 303, 435, 21);
		contentPane.add(comboBox);
		
		table = new JTable(model);
		table.setBounds(32, 29, 716, 230);
		contentPane.add(table);
		
		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				table.setModel(model);
				stype = comboBox.getSelectedItem().toString();
				Connectsql();
			}
		});
		button.setBounds(552, 302, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ex();
			}
		});
		button_1.setBounds(655, 302, 93, 23);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("（医生信息表头：工号，姓名，密码，科室）");
		label_1.setBounds(32, 352, 716, 15);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/yuelei/Desktop/av.jpg"));
		label.setBounds(0, 0, 784, 460);
		contentPane.add(label);
	}
}
