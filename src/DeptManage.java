

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeptManage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel label_1;
	private JLabel label_2;
	private JButton button;
	private JButton button_1;
	private JButton button_3;
	private JButton button_4;

	public void ex(){
		DeptManage frame = new DeptManage();
		frame.setVisible(false);
		AdministratorView av = new AdministratorView();
		av.setVisible(true);
		dispose();
	}
	public void ex2(){
		DeptManage frame = new DeptManage();
		frame.setVisible(false);
		AddMember am = new AddMember();
		am.setVisible(true);
		dispose();
	}
		
	public void ex3(){
		DeptManage frame = new DeptManage();
		frame.setVisible(false);
		DeleteMember dm = new DeleteMember();
		dm.setVisible(true);
		dispose();
	}
	
	public void ex4(){
		
		DeptManage frame = new DeptManage();
		frame.setVisible(false);
		ReadDept rd = new ReadDept();
		rd.setVisible(true);
		dispose();
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeptManage frame = new DeptManage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/* 连接医生数据库
	 * 显示科室信息
	 * 
	 */
	@SuppressWarnings("null")
	public int Connectsql(String dept){
		int str = 0;
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con= DriverManager.getConnection("jdbc:sqlserver://192.168.0.9:1433;DatabaseName=hosptial","sa","sa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*if(con !=null)
			System.out.println("Connect succeed!");*/
		Statement st=null;
		try {
		 st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sqlselect = "select count(*) as count1 from doctor where dept= '"+ dept+"'";
		ResultSet rs = null;
		try {
			rs = st.executeQuery(sqlselect);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try {
				while(rs.next()){
					try {
						str = rs.getInt("count1");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
		
	}

	

	/**
	 * Create the frame.
	 */
	public DeptManage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("选择您要进行的操作：");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(20, 226, 174, 15);
		contentPane.add(label);
		
		label_1 = new JLabel("科室名称");
		label_1.setBounds(20, 68, 54, 15);
		contentPane.add(label_1);
		
		label_2 = new JLabel("科室人数");
		label_2.setBounds(397, 68, 54, 15);
		contentPane.add(label_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{"\u5916\u79D1", Connectsql("外科")},
				{"\u5185\u79D1", Connectsql("内科")},
				{"\u76AE\u80A4\u79D1", Connectsql("皮肤科")},
				{"\u9AA8\u79D1", Connectsql("骨科")},
				{"\u5987\u4EA7\u79D1",Connectsql("妇产科")},
				{null, null},
				{null, null},
			},
			new String[] {
				"\u79D1\u5BA4\u540D\u79F0", "New column"
			}
		));
		table.setBounds(20, 68, 754, 128);
		table.setEnabled(false);
		contentPane.add(table);
		
		String[] type = {"外科","内科","皮肤科","骨科","妇产科"};
		
		button = new JButton("浏览人员信息");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ex4();
			}
		});
		button.setBounds(20, 309, 141, 23);
		contentPane.add(button);
		
		button_1 = new JButton("增加人员信息");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ex2();
			}
		});
		button_1.setBounds(224, 309, 141, 23);
		contentPane.add(button_1);
		
		button_3 = new JButton("删除人员信息");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
ex3();}
		});
		button_3.setBounds(429, 309, 141, 23);
		contentPane.add(button_3);
		
		button_4 = new JButton("返回");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ex();}
		});
		button_4.setBounds(626, 309, 148, 23);
		contentPane.add(button_4);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("/Users/yuelei/Desktop/av.jpg"));
		label_4.setBounds(0, 0, 784, 462);
		contentPane.add(label_4);
		
		
	}
}
