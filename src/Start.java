import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Start extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldId;
    private JTextField textFieldPwd;
    public String id;
    private JLabel labelId;
    private JLabel labelPassword;
    private Statement validateIdPwdStmt;

    public String getId(){
    	return id;
    }

    public Start() {
<<<<<<< HEAD
        // 初始化布局
        initLayout();
        // 初始化数据库连接
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://172.16.0.77:1433;DatabaseName=hosptial";
        String userName = "sa";
        String userPwd = "sa";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://172.16.0.77:1433;DatabaseName=hosptial", "sa", "sa");
            validateIdPwdStmt = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("数据库初始化失败！");
            e.printStackTrace();
        }
=======
	        // 初始化布局
	        initLayout();
            try {
				validateIdPwdStmt = DatabaseHelper.con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
>>>>>>> pr/38
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Start frame = new Start();
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
    public void initLayout() {

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        labelId = new JLabel("输入工号：");
        labelId.setBounds(59, 64, 103, 63);
        labelId.setForeground(new Color(255, 127, 80));
        labelId.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        contentPane.add(labelId);

        labelPassword = new JLabel("输入密码：");
        labelPassword.setBounds(59, 111, 96, 69);
        labelPassword.setForeground(new Color(255, 127, 80));
        labelPassword.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        contentPane.add(labelPassword);

        JButton button = new JButton("确认");
        button.setBounds(273, 176, 93, 23);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //验证工号和密码
                 id = textFieldId.getText();
<<<<<<< HEAD
=======
                 String name = "";
>>>>>>> pr/38
               String pwd = textFieldPwd.getText();
                boolean isValid = false;
                try {
                    ResultSet resultSet = validateIdPwdStmt.executeQuery(
<<<<<<< HEAD
                            "SELECT password FROM cashier WHERE worknum = " + id
=======
                            "SELECT password, name FROM doctor WHERE worknum = " + id
>>>>>>> pr/38
                    );

                    // 用户存在
                    if (resultSet.next()) {
                        String pwde = resultSet.getString("password");
<<<<<<< HEAD
                        isValid = pwd.equals(pwd);
=======
                        pwde = pwde.trim();
                        name = resultSet.getString(2);
                        isValid = pwd.equals(pwde);
>>>>>>> pr/38
                    }

                } catch (SQLException e1) {
                    e1.printStackTrace();
                    return;
                }


                if (isValid) {
                    // TODO: 登录成功的逻辑
<<<<<<< HEAD
                	 Jfa j=new Jfa();
                	 j.setVisible(true);
                	  
=======
                	  Test frame = new Test(name);
                	  frame.setVisible(true);
>>>>>>> pr/38

                } else {
                    JOptionPane.showMessageDialog(null, "密码输入错误！请重新输入", "友情提示", JOptionPane.INFORMATION_MESSAGE);
                }
                dispose();
            }
        });
        button.setFont(new Font("微软雅黑", Font.PLAIN, 13));
        contentPane.add(button);

        textFieldId = new JTextField();
        textFieldId.setBounds(165, 85, 132, 21);
        contentPane.add(textFieldId);
        textFieldId.setColumns(10);

        textFieldPwd = new JTextField();
        textFieldPwd.setBounds(165, 136, 132, 21);
        contentPane.add(textFieldPwd);
        textFieldPwd.setColumns(10);

        JLabel label_2 = new JLabel("欢迎登入系统！");
        label_2.setBounds(90, 10, 234, 54);
        label_2.setForeground(new Color(123, 104, 238));
        label_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label_2);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("/Users/yuelei/Desktop/3.jpg"));
        lblNewLabel.setBounds(-21, -14, 465, 292);
        contentPane.add(lblNewLabel);
    }
}
