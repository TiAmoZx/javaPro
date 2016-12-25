import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class AddMedicine extends JFrame {
    private JTextField textField;
    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField_2;
    private Statement st = null;
    Medicine medicine = new Medicine();
    /**
     * Launch the application.
     */

    public AddMedicine() {
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
                    AddMedicine frame = new AddMedicine();
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
        setTitle("添加药品");
        setBounds(500, 200, 450, 300);
        getContentPane().setLayout(null);

        JLabel label = new JLabel("输入拼音首字母");
        label.setBounds(10, 10, 98, 15);
        getContentPane().add(label);

        textField = new JTextField();
        textField.setBounds(106, 7, 202, 21);
        getContentPane().add(textField);
        textField.setColumns(10);

        JButton button = new JButton("查询");
        button.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         String general = textField.getText().trim();
                                         if (general.length() == 0) {
                                             JOptionPane.showMessageDialog(null, "请输入搜索关键字！", "友情提示", JOptionPane.INFORMATION_MESSAGE);
                                             return;
                                         }
                                         java.util.List<Medicine> searchResult = new ArrayList<>();
                                         try {
                                             ResultSet resultSet = st.executeQuery(
                                                     "SELECT * FROM drug WHERE 药品名 LIKE '" + general + "%'"
                                             );

                                             while (resultSet.next()) {
                                                
                                                 medicine.id = resultSet.getInt(1);
                                                 medicine.name = resultSet.getString(2);
                                                 medicine.stock = resultSet.getString(3);
                                                 medicine.price = resultSet.getString(4);
                                                 searchResult.add(medicine);
                                             }

                                         } catch (SQLException e1) {
                                             e1.printStackTrace();
                                         }


                                         if (searchResult.size() == 0) {
                                             JOptionPane.showMessageDialog(null, "没有符合条件的药品！", "友情提示", JOptionPane.INFORMATION_MESSAGE);
                                         } else {
                                             //有符合条件的打印结果
                                        	 textField_1.setText(medicine.name);
                                        	 textField_2.setText(medicine.price);
                                         }
                                     }
                                 }
        );

        button.setBounds(319, 6, 93, 23);
        getContentPane().add(button);

        JButton button_1 = new JButton("保存");

        button_1.setBounds(238, 238, 70, 23);
        getContentPane().add(button_1);

        JButton button_2 = new JButton("返回");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        button_2.setBounds(318, 238, 70, 23);
        getContentPane().add(button_2);

        JPanel panel = new JPanel();
        panel.setBounds(25, 38, 363, 190);
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel label_1 = new JLabel("药品名称");
        label_1.setBounds(36, 10, 72, 15);
        panel.add(label_1);

        JLabel label_2 = new JLabel("价格");
        label_2.setBounds(197, 10, 33, 15);
        panel.add(label_2);

        JLabel label_3 = new JLabel("数量");
        label_3.setBounds(301, 10, 33, 15);
        panel.add(label_3);

        JSpinner spinner = new JSpinner();
        spinner.setBounds(301, 37, 29, 22);
        panel.add(spinner);

        textField_1 = new JTextField();
        textField_1.setEditable(false);
        textField_1.setBounds(10, 37, 126, 21);
        panel.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setEditable(false);
        textField_2.setBounds(173, 37, 88, 21);
        panel.add(textField_2);
        textField_2.setColumns(10);

    }

    class Medicine {
        int id;
        String name;
        String stock;
        String price;

        @Override
        public String toString() {
            return id + ", 药品名:" + name + ", 库存:" + stock + ", 价格:" + price;
        }
    }
}