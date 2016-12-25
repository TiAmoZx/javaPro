<<<<<<< HEAD


import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
=======
package 儿科门诊医生诊疗操作;

import java.awt.BorderLayout;
>>>>>>> pr/30
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
<<<<<<< HEAD
=======

>>>>>>> pr/30
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
<<<<<<< HEAD
=======

>>>>>>> pr/30
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class Medicine extends JFrame {
<<<<<<< HEAD




	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

			
		
		
		
=======
	private JPanel contentPane;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
>>>>>>> pr/30
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medicine frame = new Medicine();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		}
<<<<<<< HEAD


=======
>>>>>>> pr/30
	/**
	 * Create the frame.
	 */
	public Medicine() {
<<<<<<< HEAD
		
		
		
		
		
		
		
=======
>>>>>>> pr/30
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
<<<<<<< HEAD
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
=======
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Yuanzhangdeanniu f=new Yuanzhangdeanniu();
				f.setVisible(true);
>>>>>>> pr/30
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(764, 779, 89, 29);
<<<<<<< HEAD
		contentPane.add(button_1);
		
		
		JLabel label_2 = new JLabel("\u836F\u623F\u7BA1\u7406\u7CFB\u7EDF");
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(361, 61, 149, 29);
		contentPane.add(label_2);
		
		JButton button_2 = new JButton("\u67E5\u770B\u5DF2\u6709\u8BA2\u5355");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			 Order d1=new Order();
			 d1.setVisible(true);
			
			}
		});
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));


		button_2.setBounds(622, 770, 116, 29);

		button_2.setBounds(630, 779, 116, 29);

		button_2.setBounds(630, 779, 116, 29);

		button_2.setBounds(445, 752, 116, 29);

		button_2.setBounds(630, 779, 116, 29);

		contentPane.add(button_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 874, 40);
		contentPane.add(menuBar);
		
		JButton button = new JButton("修改药品信息");
		getContentPane().setLayout(null);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				 Change a=new Change();
				 a.setVisible(true);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));


		button.setBounds(293, 739, 116, 38);

		button.setBounds(494, 779, 116, 29);


		button.setBounds(494, 779, 116, 29);

		button.setBounds(255, 752, 116, 29);
		button.setBounds(494, 779, 116, 29);

		contentPane.add(button);
=======
		contentPane.add(button_1);	
		JLabel label_2 = new JLabel("\u836F\u623F\u7BA1\u7406\u7CFB\u7EDF");
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(361, 61, 149, 29);
		contentPane.add(label_2);	
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 874, 40);
		contentPane.add(menuBar);
>>>>>>> pr/30
		/*button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				thread1.start();
			}
<<<<<<< HEAD
		});*/
		
=======
		});*/	
>>>>>>> pr/30
		try{
				Connection con=null;
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con= DriverManager.getConnection("jdbc:sqlserver://10.20.177.139:1433;DatabaseName=hosptial","sa","sa");
				//System.out.println("Connect succeed!");
				Statement st=null;
				st=con.createStatement();
				String sqlselect="select * from Drug";
				ResultSet rs=null;
<<<<<<< HEAD
				rs=st.executeQuery(sqlselect);
			
				
=======
				rs=st.executeQuery(sqlselect);			
>>>>>>> pr/30
		        DefaultTableModel model=new DefaultTableModel();
		        model.setColumnIdentifiers(new Object[]{"序号","药品名","库存","价格"});
		        while(rs.next()){
		        	String num=rs.getString("序号");
		        	String name=rs.getString("药品名");
		        	String kc=rs.getString("库存");
		        	String price=rs.getString("价格");
		        	model.addRow(new Object[]{num,name,kc,price});
<<<<<<< HEAD
		        }
		        
		        
		JTable table = new JTable(model);
		table.setBounds(21, 125, 745, 570);

		table.setBounds(21, 125, 832, 633);

		table.setBounds(21, 125, 832, 633);

		table.setBounds(21, 125, 832, 615);

		table.setBounds(21, 125, 832, 633);

=======
		        }		    	        
		JTable table = new JTable(model);
		table.setBounds(21, 125, 832, 633);
>>>>>>> pr/30
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		contentPane.add(table);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}