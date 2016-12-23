

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
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;

public class Medicine extends JFrame {


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Connection con = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=(local)\\SQLEXPRESS","sa","sa");
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
				
				String sqlselect = "select * from Drugs";
				ResultSet rs = null;
				try {
					st.executeQuery(sqlselect);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					while(rs.next()){
						System.out.println("药名："+rs.getString("username"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*String sql = "insert into student values" + "(1111,'liu','F','jungongRoad','010101010110',20)";
				try {
					st.executeUpdate(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/

		

			
		
		
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(21, 180, 832, 560);
		contentPane.add(lblNewLabel);
		
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
		button_2.setBounds(630, 779, 116, 29);
		contentPane.add(button_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 874, 40);
		contentPane.add(menuBar);
		
		JButton button = new JButton("修改药品信息");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				 Change a=new Change();
				 a.setVisible(true);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(494, 779, 116, 29);
		contentPane.add(button);
		
		JLabel label = new JLabel("药房库存");
		label.setBounds(38, 130, 108, 29);
		contentPane.add(label);
	}

}