package cn.edu.usst.sixline;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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

public class Usermanage extends JFrame {
	
	
	private JPanel contentPane;
	private JTable table;

	
					
		
		
	    
		

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
		label.setBounds(295, 45, 246, 15);
		contentPane.add(label);
		
		int iCount = 0;
		int i = 0;
		Object[] colHeads={"worknum","name","password","dept"};
			try{
			Connection con = null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=hospital","sa","sa");
			/*if(con !=null)
				System.out.println("Connect succeed!");*/
			Statement st=null;
			st=con.createStatement();
			String sqlselect = "select * from doctor";
			ResultSet rs = null;
			rs = st.executeQuery(sqlselect);
			while(rs.next())
				iCount++;

			Object[][] data =new Object[iCount][4];
				while(rs.next()){
					data[i][0]=rs.getString("worknum");
					data[i][1]=rs.getString("name");
					data[i][2]=rs.getString("passwprd ");
					data[i][3]=rs.getString("dept");
					i++;}
					st.close();
		DefaultTableModel dtm=new DefaultTableModel(data,colHeads);
		table = new JTable(dtm);
		table.setBounds(34, 70, 740, 322);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		contentPane.add(table);
				}catch(Exception e){
					System.out.println(e);
				}
	}
}
