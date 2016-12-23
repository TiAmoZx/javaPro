package cn.edu.usst.sixline;

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

public class DeptManage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel label_1;
	private JLabel label_2;

	
		
		
	
	
	
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
			con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=hospital","sa","sa");
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
		label.setBounds(276, 43, 174, 15);
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
		contentPane.add(table);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\15036\\Desktop\\av.jpg"));
		label_3.setBounds(0, 0, 784, 452);
		contentPane.add(label_3);
	}
}
