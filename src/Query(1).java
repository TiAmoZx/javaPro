import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Query extends JFrame {

	private JPanel contentPane;
	private JTextField innumber;
	private JTextField name;
	private JTextField sex;
	private JTextField age;
	private JTextField phonenumber;
	private JTextField orderroom;
	private JTextField ordertime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Query frame = new Query();
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
	public Query() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel label = new JLabel("\u533B\u9662\u9884\u7EA6\u67E5\u8BE2");
		label.setBounds(165, 10, 93, 28);
		layeredPane.add(label);
		
		JLabel label_1 = new JLabel("\u4F4F\u9662\u53F7");
		label_1.setBounds(56, 51, 54, 15);
		layeredPane.add(label_1);
		
		innumber = new JTextField();
		innumber.setBounds(113, 48, 66, 21);
		layeredPane.add(innumber);
		innumber.setColumns(10);
		
		JButton button = new JButton("\u67E5\u627E");
		button.setBounds(217, 48, 93, 23);
		layeredPane.add(button);
		
		JLabel label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(56, 88, 54, 15);
		layeredPane.add(label_2);
		
		name = new JTextField();
		name.setBounds(114, 85, 66, 21);
		layeredPane.add(name);
		name.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6027\u522B");
		label_3.setBounds(204, 88, 54, 15);
		layeredPane.add(label_3);
		
		sex = new JTextField();
		sex.setBounds(277, 85, 66, 21);
		layeredPane.add(sex);
		sex.setColumns(10);
		
		JLabel label_4 = new JLabel("\u5E74\u9F84");
		label_4.setBounds(56, 124, 54, 15);
		layeredPane.add(label_4);
		
		age = new JTextField();
		age.setBounds(114, 121, 66, 21);
		layeredPane.add(age);
		age.setColumns(10);
		
		JLabel label_5 = new JLabel("\u8054\u7CFB\u7535\u8BDD");
		label_5.setBounds(204, 124, 54, 15);
		layeredPane.add(label_5);
		
		phonenumber = new JTextField();
		phonenumber.setBounds(277, 121, 66, 21);
		layeredPane.add(phonenumber);
		phonenumber.setColumns(10);
		
		JLabel label_6 = new JLabel("\u9884\u7EA6\u79D1\u5BA4");
		label_6.setBounds(56, 162, 54, 15);
		layeredPane.add(label_6);
		
		orderroom = new JTextField();
		orderroom.setBounds(114, 159, 144, 21);
		layeredPane.add(orderroom);
		orderroom.setColumns(10);
		
		JLabel label_7 = new JLabel("\u9884\u7EA6\u65F6\u95F4");
		label_7.setBounds(56, 197, 54, 15);
		layeredPane.add(label_7);
		
		ordertime = new JTextField();
		ordertime.setBounds(114, 194, 144, 21);
		layeredPane.add(ordertime);
		ordertime.setColumns(10);
		
		JButton button_1 = new JButton("\u66F4\u65B0");
		button_1.setBounds(43, 222, 93, 23);
		layeredPane.add(button_1);
		
		JButton button_2 = new JButton("\u5220\u9664");
		button_2.setBounds(165, 222, 93, 23);
		layeredPane.add(button_2);
		
		JButton button_3 = new JButton("\u8FD4\u56DE");
		button_3.setBounds(277, 222, 93, 23);
		layeredPane.add(button_3);
	}
}
