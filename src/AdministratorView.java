package cn.edu.usst.sixline;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class AdministratorView extends JFrame {

	private JPanel contentPane;
	static String selecttype  ;
//跳转用户管理界面
	public void ex(){
		
		AdministratorView frame = new AdministratorView();
		frame.setVisible(false);
		DeptManage dm = new DeptManage();
		dm.setVisible(true);
		dispose();
	}
	//跳转科室管理
	public void ex2(){
		AdministratorView frame = new AdministratorView();
		frame.setVisible(false);
		Usermanage um = new Usermanage();
		um.setVisible(true);
		dispose();
	}
	public void ex3(){
		AdministratorView frame = new AdministratorView();
		frame.setVisible(false);
		WelcomeView wv = new WelcomeView();
		wv.setVisible(true);
		dispose();
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorView frame = new AdministratorView();
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
	public AdministratorView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 505);
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u60A8\u73B0\u5728\u7684\u8EAB\u4EFD\u662F\uFF1A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(71, 68, 156, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7BA1\u7406\u5458");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(221, 68, 54, 15);
		contentPane.add(label_1);
		
		
		String[] type={"用户管理","医院科室管理"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(89, 126, 210, 21);
		contentPane.add(comboBox);
		
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecttype = comboBox.getSelectedItem().toString();
				if(selecttype == "用户管理"){
					ex2();}
				else if(selecttype == "医院科室管理")
					{ex();}
			}
		});
		button.setBounds(89, 242, 93, 23);
		contentPane.add(button);
		
		
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ex3();
			}
		});
		button_1.setBounds(206, 242, 93, 23);
		contentPane.add(button_1);
		
		
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\15036\\Desktop\\av.jpg"));
		label_2.setBounds(-96, -76, 482, 542);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\15036\\Desktop\\LLiu\\av.jpg"));
		label_3.setBounds(0, 0, 386, 466);
		contentPane.add(label_3);
	}
}
