import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import domain.Item;
import domain.Medicine;

public class Recipe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Statement st = null;
	private String doctorName;
	private StringBuilder sb = new StringBuilder();
	public void setItemList(Item result) {

		sb.append(result.toString()).append("\n");

		textField.setText(sb.toString());
	}
	public void setMedicineList(Medicine result) {

		sb.append(result.toString()).append("\n");

		textField.setText(sb.toString());
	}

	public void setDocName(String name) {
		doctorName = name;
	}

	/**
	 * Launch the application.
	 */
	public Recipe() {
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
					Recipe frame = new Recipe();
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
		setTitle("医生开处方界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 492, 332);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenuItem mntmNewMenuItem = new JMenuItem("返回上一层");
		mntmNewMenuItem.setForeground(new Color(255, 99, 71));
		menuBar.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Diagnose di = new Diagnose("");
				di.setVisible(true);
				dispose();
			}
		});

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("返回首页");
		mntmNewMenuItem_1.setForeground(new Color(255, 99, 71));
		menuBar.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start st = new Start();
				st.setVisible(true);
				dispose();
			}
		});
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton_1 = new JButton("保存");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
			}
		});
		btnNewButton_1.setBounds(218, 213, 76, 23);
		contentPane.add(btnNewButton_1);

		JLabel label = new JLabel("处方");
		label.setForeground(new Color(106, 90, 205));
		label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label.setBounds(24, 10, 108, 29);
		contentPane.add(label);
		textField = new JTextField();
		textField.setText("点击添加药品或添加项目……");
		textField.setBounds(24, 49, 300, 154);
		contentPane.add(textField);
		textField.setColumns(10);
		final Recipe recipeFrame = this;

		JButton button = new JButton("添加药品");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AddMedicine frame = new AddMedicine(recipeFrame);
				frame.setVisible(true);
			}
		});
		button.setBounds(334, 98, 93, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("添加项目");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddItem frame = new AddItem(recipeFrame);
				frame.setVisible(true);
			}
		});
		button_1.setBounds(334, 162, 93, 23);
		contentPane.add(button_1);

		JButton button_2 = new JButton("下一个");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test ts = new Test(doctorName);
				ts.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(305, 213, 93, 23);
		contentPane.add(button_2);

	}
}
