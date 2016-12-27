import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AddItem extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private Statement st = null;
	private JTextField textField;
	Item item = new Item();
	private Recipe recipe;
	/**
	 * Launch the application.
	 */
	public AddItem(Recipe recipe) {
		this.recipe = recipe;
		try {
			st = DatabaseHelper.con.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		initLayout();

	}



	/**
	 * Create the frame.
	 */
	public void initLayout() {
		setTitle("添加项目");
		setBounds(500, 200, 450, 300);
		getContentPane().setLayout(null);

		JLabel label = new JLabel("输入项目名称");
		label.setBounds(10, 10, 98, 15);
		getContentPane().add(label);

		textField = new JTextField();
		textField.setBounds(119, 7, 202, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		JButton button_2 = new JButton("取消");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_2.setBounds(323, 228, 69, 23);
		getContentPane().add(button_2);

		JPanel panel = new JPanel();
		panel.setBounds(25, 38, 363, 190);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label_1 = new JLabel("项目名称");
		label_1.setBounds(36, 10, 48, 15);
		panel.add(label_1);

		JLabel label_2 = new JLabel("价格");
		label_2.setBounds(178, 10, 33, 15);
		panel.add(label_2);

	

		textField_1 = new JTextField();
		textField_1.setBounds(18, 37, 118, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(159, 37, 88, 21);
		panel.add(textField_2);

		JButton button = new JButton("查询");
		button.setBounds(331, 6, 93, 23);
		getContentPane().add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String general = textField.getText().trim();
				if (general.length() == 0) {
					JOptionPane.showMessageDialog(null, "请输入搜索关键字！", "友情提示", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				java.util.List<Item> searchResult = new ArrayList<>();
				try {
					ResultSet resultSet = st.executeQuery("SELECT * FROM item WHERE 项目名称  LIKE '" + general + "%'");

					while (resultSet.next()) {

						item.name = resultSet.getString(1);
						item.price = resultSet.getString(2);
						searchResult.add(item);
					}

				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				if (searchResult.size() == 0) {
					JOptionPane.showMessageDialog(null, "没有符合条件的项目！", "友情提示", JOptionPane.INFORMATION_MESSAGE);
				} else {
					// 有符合条件的打印结果
					textField_1.setText(item.name);
					textField_2.setText(item.price);
				}
			}

		});

		JButton button_1 = new JButton("保存并返回 ");
		button_1.setBounds(207, 228, 98, 23);
		getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet resultSet = null;
				try {
					resultSet = st.executeQuery("Insert into list values('1',"+item.name+")");
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				recipe.setItemList(item);
				dispose();
		}
	});
		
	}
}
