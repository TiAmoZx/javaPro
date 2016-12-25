

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class Medicine extends JFrame {




	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

			
		
		
		
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


	/**
	 * Create the frame.
	 */
	public Medicine() {
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(764, 779, 89, 29);
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
		button_2.setBounds(445, 752, 116, 29);
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
		button.setBounds(255, 752, 116, 29);
		contentPane.add(button);
		/*button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				thread1.start();
			}
		});*/
		
		try{
				Connection con=null;
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con= DriverManager.getConnection("jdbc:sqlserver://10.20.177.139:1433;DatabaseName=hosptial","sa","sa");
				//System.out.println("Connect succeed!");
				Statement st=null;
				st=con.createStatement();
				String sqlselect="select * from Drug";
				ResultSet rs=null;
				rs=st.executeQuery(sqlselect);
			
				
		        DefaultTableModel model=new DefaultTableModel();
		        model.setColumnIdentifiers(new Object[]{"序号","药品名","库存","价格"});
		        while(rs.next()){
		        	String num=rs.getString("序号");
		        	String name=rs.getString("药品名");
		        	String kc=rs.getString("库存");
		        	String price=rs.getString("价格");
		        	model.addRow(new Object[]{num,name,kc,price});
		        }
		        
		        
		JTable table = new JTable(model);
		table.setBounds(21, 125, 832, 615);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		contentPane.add(table);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}