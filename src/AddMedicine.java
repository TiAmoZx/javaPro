import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMedicine extends JInternalFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
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
	public AddMedicine() {
		setTitle("添加药品");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("输入拼音首字母");
		label.setBounds(10, 10, 98, 15);
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(106, 7, 202, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("查询");
		button.setBounds(319, 6, 93, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("保存");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
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

	}
}
