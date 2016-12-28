

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class search extends JFrame {
	
	
	private JPanel contentPane;
	private JTable table;
Thread thread1=new Thread();
Thread thread2=new Thread();
	
					
		
		
	    
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search frame = new search();
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
	public search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("预约情况");
		label.setBounds(300, 43, 246, 15);
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		contentPane.add(label);
		DefaultTableModel model=new DefaultTableModel();
		//创建表头
		model.setColumnIdentifiers(new Object[]{"工号","姓名","密码","科室"});
		JTable table=new JTable(model);
		table.setBounds(34, 96, 725, 272);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		JScrollPane scrollPane=new JScrollPane();
		table.add(scrollPane);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("查询");
		btnNewButton.setBounds(176, 408, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread1.start();
				thread2.start();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("返回首页");
		button.setBounds(34, 38, 176, 29);
		button.setBackground(Color.DARK_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
				Jfa j=new Jfa();
			j.setVisible(true);
			}
		});
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("当前预约人数");
		lblNewLabel.setBounds(44, 370, 138, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(176, 375, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(6, 6, 796, 466);
		label_1.setIcon(new ImageIcon("/Users/yuelei/Desktop/111.jpg"));
		contentPane.add(label_1);
		thread1=new Thread(new Runnable(){
			public void run(){
				try{
					Connection con = null;
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con= DriverManager.getConnection("jdbc:sqlserver://172.16.0.77:1433;DatabaseName=hosptial","sa","sa");
					/*if(con !=null)
						System.out.println("Connect succeed!");*/
					Statement st=null;
					st=con.createStatement();
					String sqlselect = "select * from sicker";
					
					ResultSet rs = null;
					rs = st.executeQuery(sqlselect);
					
					//再次，添加数据
					while(rs.next())
					{
					String wn=rs.getString("name");
									String innum=rs.getString("innum");
									String sex=rs.getString("sex");
									String age=rs.getString("age");
									String telphone=rs.getString("telphone");
									String dept=rs.getString("dept");
									String ordertime=rs.getString("ordertime");
					//把以上数据添加到表格模型的一行中
									
									model.addRow(new Object[]{wn,innum,sex,age,telphone,dept,ordertime});
					}
					//最后，用模型生成表格
					
						}catch(Exception e){
							System.out.println(e);
						}
			}
			
		});
		thread2=new Thread(new Runnable(){
			public void run(){
				try{
					Connection con = null;
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con= DriverManager.getConnection("jdbc:sqlserver://192.168.0.9:1433;DatabaseName=hosptial","sa","sa");
					/*if(con !=null)
						System.out.println("Connect succeed!");*/
					Statement st=null;
					st=con.createStatement();
					String sqlselect = "SELECT COUNT(*) as count  from sicker";
					
					ResultSet rs = null;
					rs = st.executeQuery(sqlselect);
					if(rs.next()){
						int aa = rs.getInt("count");
						lblNewLabel_1.setText(aa+"");
						}

					
					//再次，添加数据
					
					//最后，用模型生成表格
					
						}catch(Exception e){
							System.out.println(e);
						}
			}
			
		});
		
		
		
	}
}
