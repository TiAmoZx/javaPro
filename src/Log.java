import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Log extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		  
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
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
	public Log() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100,514,310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("点此跳转！");
		btnNewButton.setForeground(new Color(0, 102, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Order1 yu=new Order1();
				yu.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		btnNewButton.setBounds(171, 228, 150, 33);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("请您前去预约");
		label.setForeground(Color.GRAY);
		label.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		label.setBounds(206, 194, 137, 33);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("欢迎使用医院预约APP");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(204, 0, 153));
		lblNewLabel_1.setBounds(182, 26, 150, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\新建文件夹\\QQ图片20161214215736.jpg"));
		label_1.setBounds(10, 0, 478, 271);
		contentPane.add(label_1);
	}
}
