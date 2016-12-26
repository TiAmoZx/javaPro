import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test extends JFrame {
    private JTextField textField;
    private Statement st = null;
    private Statement validateIdPwdStmt;
    /**
     * Launch the application.
     */
    public Test() {
        initLayout();
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://10.20.177.139:1433;DatabaseName=hosptial", "sa", "sa");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        
        try {
            st = con.createStatement();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test frame = new Test();
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
        setVisible(true);
        setTitle("医生界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorderPainted(false);
        setJMenuBar(menuBar);

        JMenuItem mntmNewMenuItem = new JMenuItem("返回上一层");
        mntmNewMenuItem.setForeground(new Color(255, 99, 71));
        menuBar.add(mntmNewMenuItem);
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Start frame = new Start();
                frame.setVisible(true);
                dispose();
            }
        });
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("返回首页");
        mntmNewMenuItem_1.setForeground(new Color(255, 127, 80));
        menuBar.add(mntmNewMenuItem_1);
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Start frame = new Start();
                frame.setVisible(true);
                dispose();
            }
        });

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(37, 103, 118, 24);
        textArea.setBackground(new Color(135, 206, 235));
        textArea.setText(" 输入病人预约号");
        panel.add(textArea);

        textField = new JTextField();
        textField.setBounds(166, 104, 108, 21);
        panel.add(textField);
        textField.setColumns(15);


        JButton btnNewButton = new JButton("确定");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("确定")) {
                    String sickerid = textField.getText();
                    boolean isValid = false;
                    ResultSet resultSet = null;
					try {
						resultSet = validateIdPwdStmt.executeQuery("SELECT 预约号 FROM Yuyue="+sickerid);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                    String id = null;
					try {
						id = resultSet.getString("预约号");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                    isValid=sickerid.equals(id);
                    try {
						if(resultSet.next()){
							 Diagnose frame = new Diagnose(sickerid);
						     frame.setVisible(true);
						     dispose();
						}else{
							JOptionPane.showMessageDialog(null, "号码输入错误！请重新输入", "友情提示", JOptionPane.INFORMATION_MESSAGE);
						}
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                }
            }
        });
        btnNewButton.setBounds(284, 103, 82, 23);
        btnNewButton.setBackground(new Color(211, 211, 211));
        panel.add(btnNewButton);

    }

}
