

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Usermanage extends JFrame {
	
	
	private JPanel contentPane;
	private JTable table;
	static String stype;//浏览信息中类别的选择
	DefaultTableModel model=new DefaultTableModel();//新建一个tabelmodel对象用于储存数据库中数据
					
		
		
	//跳转返回界面    
	public void ex(){
		Usermanage frame = new Usermanage();
		frame.setVisible(false);
		AdministratorView av= new AdministratorView();
		av.setVisible(true);
		dispose();
	}
	//跳转添加人员界面
	public void ex2(){
		Usermanage frame = new Usermanage();
		frame.setVisible(false);
		AddMember am = new AddMember();
		am.setVisible(true);
		dispose();
		
	}
	//跳转删除人员界面
	public void ex3(){
		Usermanage frame = new Usermanage();
		frame.setVisible(true);
		DeleteMember dm = new DeleteMember();
		dm.setVisible(true);
		dispose();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usermanage frame = new Usermanage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Connectsql(){
		try{
			Connection con = null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection("jdbc:sqlserver://172.16.0.77:1433;DatabaseName=hospital","sa","sa");
			/*if(con !=null)
				System.out.println("Connect succeed!");*/
			Statement st=null;
			st=con.createStatement();
			
			String sqlselect = "select * from "+ stype ;//stype已经通过comobobox选择出来的
			ResultSet rs = null;
			rs = st.executeQuery(sqlselect);
			if(stype == "doctor"){
			//创建表头
				
			model.setColumnIdentifiers(new String[]{"worknum","name","password","dept"});}
			else if(stype == "cashier" || stype == "phar"){
				model.setColumnIdentifiers(new Object[]{"工号","姓名","密码"});
			}else if(stype == "sicker"){
				model.setColumnIdentifiers(new Object[]{"预约号","姓名","性别","年龄","预约时间","电话"});
			}
			//再次，添加数据
			while(rs.next())
			{
				//因为建立的数据库中医生表，收费人员表，药师表，和病人表中的列数不相同，所以model的信息不同，用一个if（）...else if() ...区分
				if(stype == "doctor"){
							String wn=rs.getString("worknum");
							String name=rs.getString("name");
							String psword=rs.getString("password");
							String dept=rs.getString("dept");
			//把以上数据添加到表格模型的一行中
							
							model.addRow(new Object[]{wn,name,psword,dept});
							}else if(stype =="cashier" || stype =="phar"){
								String wn=rs.getString("worknum");
								String name=rs.getString("name");
								String psword=rs.getString("password");
								model.addRow(new Object[]{wn,name,psword});
							}else if(stype == "sicker"){
								String on = rs.getString("ordernum");
								String name = rs.getString("name");
								String sex = rs.getString("sex");
								String age = rs.getString("age");
								String ordertime = rs.getString("ordertime");
								String tel = rs.getString("telphone");
								model.addRow(new Object[]{on,name,sex,age,ordertime,tel});

							}
							}
			
			
		
			//最后，用模型生成表格
		
		
				}catch(Exception e){
					System.out.println(e);
				}
	}
		
		
	
		
	/**
	 * Create the frame.
	 */
	public Usermanage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("请选择你要进行的操作：");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(22, 243, 246, 15);
		contentPane.add(label);
		
		String[] type = {"病人","医生","药师","收费人员"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(32, 268, 499, 21);
		contentPane.add(comboBox);
		
		
		JTable table_1=new JTable();
		table_1.setBounds(22, 10, 739, 211);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		contentPane.add(table_1);
		
		
		JButton button = new JButton("浏览人员信息");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				table_1.setModel(model);	//每次model清空，避免出现点一次按钮，上次的数据重复出现
				switch(comboBox.getSelectedItem().toString()){    //tabel显示comobobox所选中的选项的信息
				case "病人": stype = "sicker";break;
				case "医生": stype = "doctor";break;
				case "收费人员":stype = "cashier";break;
				case "药师":stype = "phar";break;
				}
			Connectsql();
			table_1.setModel(model);
			}
		});
		button.setBounds(22, 384, 147, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("添加人员信息");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ex2();}
		});
		button_1.setBounds(224, 384, 147, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("删除人员信息");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ex3();}
		});
		button_2.setBounds(417, 384, 147, 23);
		contentPane.add(button_2);
		
		JButton button_4 = new JButton("返回");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ex();
			}
		});
		button_4.setBounds(614, 384, 147, 23);
		contentPane.add(button_4);
		
		JLabel label_2 = new JLabel("（病人信息表头：预约号，姓名，性别，年龄，预约时间，电话号码");
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(32, 309, 729, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("医生信息表头：工号，姓名，密码，科室");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(42, 334, 719, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("药师，收费人员信息表头：工号，姓名，密码）");
		label_4.setForeground(Color.BLACK);
		label_4.setBounds(42, 359, 719, 15);
		contentPane.add(label_4);
		
		
		
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/Users/yuelei/Desktop/av.jpg"));
		label_1.setBounds(0, 0, 828, 461);
		contentPane.add(label_1);
		
		
			
			}
}
