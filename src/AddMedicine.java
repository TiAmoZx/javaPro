import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import domain.Medicine;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class AddMedicine extends JFrame {
	private JTextField textField;
	private JPanel contentPane;
	private JTextField textField_drugname;
	private JTextField textField_drugprice;
	private JTextField textField_drugamount;
	private Recipe recipe;
	private Statement st = null;
	Medicine medicine = new Medicine();
	java.util.List<Medicine> searchResult = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */
	public void medicineInsert() {
		
		String drugname = textField_drugname.getText().toString();
		String drugprice = textField_drugprice.getText().toString();
		String drugamount = textField_drugamount.getText().toString();

	}

	public AddMedicine(Recipe recipe) {
		this.recipe = recipe;
		try {
			st = DatabaseHelper.con.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		initLayout();
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMedicine frame = new AddMedicine(null);
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
		setBounds(500, 200, 479, 321);
		getContentPane().setLayout(null);

		JLabel label = new JLabel("输入药品名称");
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
				
				try {
					ResultSet resultSet = st.executeQuery("SELECT * FROM drug WHERE 药品名 LIKE '" + general + "%'");

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
					// 有符合条件的打印结果
					textField_drugname.setText(medicine.name);
					textField_drugprice.setText(medicine.price);
				}
			}
		});

		button.setBounds(319, 6, 93, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("保存并返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					medicine.amount = textField_drugamount.getText();
					ResultSet resultSet = null;
					try {
						resultSet = st.executeQuery("Insert into list values('1',medicine.name)");
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					recipe.setMedicineList(medicine);
					dispose();
			}
		});

		button_1.setBounds(210, 238, 98, 23);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("取消");
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

		textField_drugname = new JTextField();
		textField_drugname.setEditable(false);
		textField_drugname.setBounds(10, 37, 126, 21);
		panel.add(textField_drugname);
		textField_drugname.setColumns(10);

		textField_drugprice = new JTextField();
		textField_drugprice.setEditable(false);
		textField_drugprice.setBounds(173, 37, 88, 21);
		panel.add(textField_drugprice);
		textField_drugprice.setColumns(10);

		textField_drugamount = new JTextField();
		textField_drugamount.setBounds(287, 37, 66, 21);
		panel.add(textField_drugamount);
		textField_drugamount.setColumns(10);

	}

	
}