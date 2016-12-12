import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Yuyue11 extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField sex;
	private JTextField age;
	private JTextField phonenumber;
	private JTextField orderroom;
	private JTextField ordertime;
	private JTextField innumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yuyue11 frame = new Yuyue11();
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
	public Yuyue11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u6027\u522B");
		label.setBounds(36, 63, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setBounds(36, 38, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5E74\u9F84");
		label_2.setBounds(232, 63, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u8054\u7CFB\u65B9\u5F0F");
		label_3.setBounds(36, 88, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u9884\u7EA6\u79D1\u5BA4");
		label_4.setBounds(36, 130, 54, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u9884\u7EA6\u65F6\u95F4");
		label_5.setBounds(36, 155, 54, 15);
		contentPane.add(label_5);
		
		name = new JTextField();
		name.setBounds(100, 35, 106, 21);
		contentPane.add(name);
		name.setColumns(10);
		
		sex = new JTextField();
		sex.setBounds(100, 60, 106, 24);
		contentPane.add(sex);
		sex.setColumns(10);
		
		age = new JTextField();
		age.setBounds(296, 60, 100, 21);
		contentPane.add(age);
		age.setColumns(10);
		
		phonenumber = new JTextField();
		phonenumber.setBounds(100, 88, 106, 24);
		contentPane.add(phonenumber);
		phonenumber.setColumns(10);
		
		orderroom = new JTextField();
		orderroom.setBounds(100, 127, 196, 21);
		contentPane.add(orderroom);
		orderroom.setColumns(10);
		
		ordertime = new JTextField();
		ordertime.setBounds(100, 152, 196, 21);
		contentPane.add(ordertime);
		ordertime.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 /*     String[] s=new String[6];
                     s[0]=new String(name.getText());
                    s[1]=new String(sex.getText());
                    s[2]=new String(age.getText());
                      s[3]=new String(phonenumber.getText());
                      s[4]=new String(orderroom.getText());
                      s[5]=new String(ordertime.getText());
                      StuAddHandler stu=new StuAddHandler(s);
                      int i=stu.addStu;
                      if(i==1){
                    	  JOptionPane.showMessageDialog(null, "Ìí¼Ó³É¹¦");
                    	  dispose();
                      }*/
                      
			 }
		});
		button.setBounds(55, 211, 93, 23);
		contentPane.add(button);
		
		JLabel label_6 = new JLabel("\u533B\u9662\u9884\u7EA6\u754C\u9762");
		label_6.setBounds(167, 10, 106, 15);
		contentPane.add(label_6);
		
		JButton button_1 = new JButton("\u5173\u95ED");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*    */
			}
		});
		button_1.setBounds(303, 211, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u67E5\u8BE2");
		button_2.setBounds(180, 211, 93, 23);
		contentPane.add(button_2);
		
		JLabel label_7 = new JLabel("\u4F4F\u9662\u53F7");
		label_7.setBounds(232, 38, 54, 15);
		contentPane.add(label_7);
		
		innumber = new JTextField();
		innumber.setBounds(296, 35, 100, 21);
		contentPane.add(innumber);
		innumber.setColumns(10);
	}
}
