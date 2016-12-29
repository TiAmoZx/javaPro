import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Innum extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Innum frame = new Innum();
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
	public Innum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("您前面还有");
		label.setBounds(80, 90, 101, 34);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(153, 90, 84, 26);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("人");
		label_2.setBounds(301, 101, 54, 15);
		contentPane.add(label_2);
		
		JButton button = new JButton("继续");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			T2 t=new T2();
			t.setVisible(true);
			}
		});
		button.setBounds(252, 197, 93, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/yuelei/Desktop/医院.jpg"));
		lblNewLabel.setBounds(10, 6, 434, 245);
		contentPane.add(lblNewLabel);
		
		Thread thread1=new Thread();
		thread1=new Thread(new Runnable(){
			public void run(){
				try{
					Connection con = null;
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con= DriverManager.getConnection("jdbc:sqlserver://10.20.168.23:1433;DatabaseName=hosptial","sa","sa");
					/*if(con !=null)
						System.out.println("Connect succeed!");*/
					Statement st=null;
					st=con.createStatement();
					String sqlselect = "SELECT COUNT(*) as count  from sicker";
					
					ResultSet rs = null;
					rs = st.executeQuery(sqlselect);
					if(rs.next()){
						int aa = rs.getInt("count");
						label_1.setText(aa+"");
						}

					
					//再次，添加数据
					
					//最后，用模型生成表格
					
						}catch(Exception e){
							System.out.println(e);
						}
			}
			
		}); thread1.start();
	}

}
