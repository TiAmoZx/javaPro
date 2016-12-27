

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
		table.setBounds(34, 70, 725, 314);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		JScrollPane scrollPane=new JScrollPane();
		table.add(scrollPane);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("查询");
		btnNewButton.setBounds(176, 408, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread1.start();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("返回首页");
		button.setBounds(6, 6, 176, 29);
		button.setBackground(Color.DARK_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
				Jfa j=new Jfa();
			j.setVisible(true);
			}
		});
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(6, 6, 796, 466);
		label_1.setIcon(new ImageIcon("/Users/yuelei/Desktop/111.jpg"));
		contentPane.add(label_1);
		thread1=new Thread(new Runnable(){
			public void run(){
				try{
					Connection con = null;
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con= DriverManager.getConnection("jdbc:sqlserver://10.40.229.251:1433;DatabaseName=hosptial","sa","sa");
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
									
									model.addRow(new Object[]{wn,name,psword,dept});
					}
					//最后，用模型生成表格
					
						}catch(Exception e){
							System.out.println(e);
						}
			}
			
		});
		
		
		
	}
}
