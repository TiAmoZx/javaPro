
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class guahaoliang extends JFrame{
private JTextArea keshi,guahaoliang,jine;
public guahaoliang(){
	super("挂号量和总金额");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JButton tuichu1;
	JButton tuichu11=new JButton("返回");
	add(tuichu11);
	tuichu11.setBounds(500,600,100,50);
    tuichu11.setFont(new Font("",Font.BOLD,22));
	setBounds(0,0,1000,700);
	setLayout(null);
	setVisible(true);
	
	
	
	try{
		Connection con=null;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con= DriverManager.getConnection("jdbc:sqlserver://192.168.0.9:1433;DatabaseName=hosptial","sa","sa");
		//System.out.println("Connect succeed!");
		Statement st=null;
		st=con.createStatement();
		String sqlselect="select * from sicker";
		ResultSet rs=null;
		rs=st.executeQuery(sqlselect);			
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"序号","药品名","库存","价格"});
        while(rs.next()){
        	String num=rs.getString("innum");
        	String name=rs.getString("name");
        	String kc=rs.getString("sex");
        	String price=rs.getString("dept");
        	model.addRow(new Object[]{num,name,kc,price});
        }		    	        
JTable table = new JTable(model);
table.setBounds(10,10,950,550);
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
add(table);
}catch(Exception e){
	System.out.println(e);
}
	

	
	
	
	
	
	
	
	
 tuichu11.addActionListener(new tuichu1());
}
class tuichu1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dispose();
			Yuanzhangdeanniu f=new Yuanzhangdeanniu();
			f.setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO �Զ���ɵķ������
guahaoliang f=new guahaoliang();
	}

}
