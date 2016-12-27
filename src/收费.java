
import java.io.IOException; 
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class 收费 extends JFrame {
	
	
	private JPanel contentPane;
	private JTable table;
Thread thread1=new Thread();
private JTextField textField;
private JTextField textField_1;
	Thread thread2=new Thread();
	int port =9898;    
    InetAddress address;  
    MulticastSocket socket; 				
		
    JLabel lblNewLabel_2 = new JLabel("");
	    
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					收费 frame = new 收费();
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
	public static void newFile(String filePathAndName, String fileContent) {
        try {
            File myFilePath = new File(filePathAndName.toString());
            if (!myFilePath.exists()) { // 如果该文件不存在,则创建
                myFilePath.createNewFile();
            }
            // FileWriter(myFilePath, true); 实现不覆盖追加到文件里
             //FileWriter(myFilePath); 覆盖掉原来的内容
            FileWriter resultFile = new FileWriter(myFilePath, true);
            PrintWriter myFile = new PrintWriter(resultFile);
            // 给文件里面写内容,原来的会覆盖掉
            myFile.println(fileContent);
            resultFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public 收费() {
		thread2=new Thread(new Runnable(){
			public void run(){
				 
			    	 
			    		   String info =textField.getText();
			    		   try{  
			    		   lblNewLabel_2.setText(info);
			    		       address=InetAddress.getByName("233.0.0.0");    
			    		       socket=new MulticastSocket(port);    
			    		       socket.setTimeToLive(1);    
			    		       socket.joinGroup(address);    
			    		       }catch(IOException e){  
			    		           e.printStackTrace();  
			    		       } 
			    		   
			    		        while(true){    
			    		            byte[] data=info.getBytes();    
			    		            DatagramPacket packet=new DatagramPacket(data,data.length,address,port);    
			    		              
			    		            try {    
			    		                socket.send(packet);   
			    		                Thread.sleep(3000);  
			    		            } catch (Exception e) {    
			    		                e.printStackTrace();    
			    		            }    
			    		            System.out.println("消息已发送：");    
			    		        }    
			    
			}
			
		});
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
		table.setBounds(100, 318, 446, 134);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		JScrollPane scrollPane=new JScrollPane();
		table.add(scrollPane);
		contentPane.add(table);
		ListSelectionModel model1 = table.getSelectionModel();
	    model1.addListSelectionListener(new ListSelectionListener() {
	      public void valueChanged(ListSelectionEvent e) {
	    	 thread2.start();
	        //行选中事件处理代码
	      }
	    });
		JButton btnNewButton = new JButton("查询");
		btnNewButton.setBounds(147, 247, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread1.start();
			}
		});
		
		JLabel lblNewLabel_7 = new JLabel("姓名");
		lblNewLabel_7.setBounds(219, 290, 61, 16);
		contentPane.add(lblNewLabel_7);
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
		
		JLabel lblNewLabel_6 = new JLabel("总价（元）");
		lblNewLabel_6.setBounds(335, 288, 93, 16);
		contentPane.add(lblNewLabel_6);
		contentPane.add(button);
		
		JButton button_1 = new JButton("重置");
		button_1.setBounds(278, 247, 117, 29);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("预约号码");
		lblNewLabel.setBounds(62, 118, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("姓名");
		lblNewLabel_1.setBounds(62, 174, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("预约号");
		lblNewLabel_5.setBounds(121, 290, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(219, 169, 176, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(219, 113, 176, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		String m;
		m=textField_1.getText();
		
		JButton btnNewButton_1 = new JButton("缴费");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread2.start();
			}
		});
		btnNewButton_1.setBounds(504, 247, 117, 29);
		contentPane.add(btnNewButton_1);
		JLabel label_1 = new JLabel("");
		label_1.setBounds(6, 6, 796, 446);
		label_1.setIcon(new ImageIcon("/Users/yuelei/Desktop/5.jpg"));
		contentPane.add(label_1);
		lblNewLabel_2.setBounds(452, 118, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(429, 174, 117, 29);
		contentPane.add(button_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(109, 290, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(288, 290, 61, 16);
		contentPane.add(lblNewLabel_4);
		thread1=new Thread(new Runnable(){
			public void run(){
				String t;
				t=textField_1.getText();
				try{System.out.println(m);
					Connection con = null;
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con= DriverManager.getConnection("jdbc:sqlserver://172.16.0.77:1433;DatabaseName=hosptial","sa","sa");
					/*if(con !=null)
						System.out.println("Connect succeed!");*/
					Statement st=null;
					st=con.createStatement();
					String sqlselect = "select * from list where 病人编号='"+t+"'";
					ResultSet rs = null;
					rs = st.executeQuery(sqlselect);
					
					//再次，添加数据
					while(rs.next())
					{
					String wn=rs.getString("病人编号");
									String price=rs.getString("金额");
									String name=textField.getText();
									
					//把以上数据添加到表格模型的一行中
									
									model.addRow(new Object[]{wn,name,price});
					}
					//最后，用模型生成表格
					
						}catch(Exception e){
							System.out.println(e);
						}
			}
			
		});
		
		
		
	}
}
