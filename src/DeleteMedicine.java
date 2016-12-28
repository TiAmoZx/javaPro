

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;  
import java.sql.SQLException;  



import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class DeleteMedicine extends JFrame {
	

	private JPanel contentPane;
	private static JTextField textField;
	static String selectt;

	  private static void testInsert()  
	    {  
		    String name=textField.getText().toString();
		    
	         String SQL = " DELETE FROM drug WHERE 药品名 = '"+name+"'";  
	         sqlHelper.executeUpdate(SQL); 
	       
	    }  
	  
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Change frame = new Change();
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
	public DeleteMedicine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("药房管理系统");
		label.setBackground(Color.WHITE);
		label.setBounds(359, 0, 149, 29);
		contentPane.add(label);
		
		JButton button = new JButton("退出");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(764, 739, 89, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				 Medicine a=new Medicine();
				 a.setVisible(true);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(654, 739, 89, 29);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("请输入要删除的药品名字：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 21));
		label_1.setBounds(280, 516, 259, 44);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 13));
		textField.setBounds(295, 581, 227, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_4 = new JLabel("删除库房药品");
		label_4.setFont(new Font("宋体", Font.PLAIN, 15));
		label_4.setBounds(382, 50, 126, 29);
		contentPane.add(label_4);
		
		JButton button_2 = new JButton("确定");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testInsert();
				dispose();
				 Medicine a=new Medicine();
				 a.setVisible(true);
			}
		});
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(544, 739, 89, 29);
		
		contentPane.add(button_2);
		
		
		try{
			Connection con=null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection("jdbc:sqlserver://192.168.0.9:1433;DatabaseName=hosptial","sa","sa");
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
	table.setBounds(21, 106, 832, 390);
	table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	contentPane.add(table);
	}catch(Exception e){
		System.out.println(e);
	}
		
	}
}

