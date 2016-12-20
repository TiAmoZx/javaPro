import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class Recipe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
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
	public Recipe() {
		setTitle("医生诊断界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 334);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("返回上一层");
		mntmNewMenuItem.setForeground(new Color(255, 99, 71));
		menuBar.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Diagnose di=new Diagnose();
				di.setVisible(true);
				dispose();
			}
		});
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("返回首页");
		mntmNewMenuItem_1.setForeground(new Color(255, 99, 71));
		menuBar.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Start st=new Start();
				st.setVisible(true);
				dispose();
			}
		});
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("保存");
		btnNewButton_1.setBounds(219, 223, 76, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("处方");
		label.setForeground(new Color(106, 90, 205));
		label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label.setBounds(24, 20, 108, 29);
		contentPane.add(label);
		
		JButton button = new JButton("添加药品");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMedicine frame=new AddMedicine();
				frame.setVisible(true);
			}
		});
		button.setBounds(334, 98, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("添加项目");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddItem frame=new AddItem();
				frame.setVisible(true);
			}
		});
		button_1.setBounds(334, 162, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("下一个");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//连接到大屏
			}
		});
		button_2.setBounds(305, 223, 93, 23);
		contentPane.add(button_2);
		
		textField = new JTextField();
		textField.setText("点击添加药品或添加项目……");
		textField.setBounds(24, 59, 300, 154);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
