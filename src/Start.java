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
    private JLabel labelId;
    private JLabel labelPassword;
    private Statement validateIdPwdStmt;
    private Connection con = null;


    public Start() {
        // 初始化布局
        initLayout();
        // 初始化数据库连接
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://10.20.177.139:1433;DatabaseName=hosptial";
        String userName = "sa";
        String userPwd = "sa";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://10.20.177.139:1433;DatabaseName=hosptial", "sa", "sa");
            validateIdPwdStmt = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("数据库初始化失败！");
            e.printStackTrace();
        }
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

        setTitle("医生登录界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        labelId = new JLabel("输入工号：");
        labelId.setForeground(new Color(255, 127, 80));
        labelId.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        labelId.setBounds(70, 63, 103, 63);
        contentPane.add(labelId);

        labelPassword = new JLabel("输入密码：");
        labelPassword.setForeground(new Color(255, 127, 80));
        labelPassword.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        labelPassword.setBounds(70, 111, 85, 69);
        contentPane.add(labelPassword);

        JButton button = new JButton("确认");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //验证工号和密码
                String id = textFieldId.getText();
                String password = textFieldPwd.getText();
                boolean isValid = false;
                try {
                    ResultSet resultSet = validateIdPwdStmt.executeQuery(
                            "SELECT 密码 FROM yisheng WHERE 工号 = " + id
                    );

                    // 用户存在
                    if (resultSet.next()) {
                        String pwd = resultSet.getString("密码");
                        isValid = pwd.equals(password);
                    }

                } catch (SQLException e1) {
                    e1.printStackTrace();
                    return;
                }


                if (isValid) {
                    // TODO: 登录成功的逻辑
                	  Test frame = new Test();
                	  frame.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "密码输入错误！请重新输入", "友情提示", JOptionPane.INFORMATION_MESSAGE);
                }
                dispose();
            }
        });
        button.setFont(new Font("微软雅黑", Font.PLAIN, 13));
        button.setBounds(273, 176, 93, 23);
        contentPane.add(button);

        textFieldId = new JTextField();
        textFieldId.setBounds(165, 85, 132, 21);
        contentPane.add(textFieldId);
        textFieldId.setColumns(10);

        textFieldPwd = new JTextField();
        textFieldPwd.setBounds(165, 136, 132, 21);
        contentPane.add(textFieldPwd);
        textFieldPwd.setColumns(10);

        JLabel label_2 = new JLabel("欢迎登入医生系统！");
        label_2.setForeground(new Color(123, 104, 238));
        label_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        label_2.setBounds(90, 10, 234, 54);
        contentPane.add(label_2);
    }

}
