import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Test extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setVisible(true);
		setTitle("医生界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("返回上一层");
		mntmNewMenuItem.setForeground(new Color(255, 99, 71));
		menuBar.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Start frame=new Start();
				frame.setVisible(true);
				dispose();		}
		});
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("返回首页");
		mntmNewMenuItem_1.setForeground(new Color(255, 127, 80));
		menuBar.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Start frame=new Start();
				frame.setVisible(true);
				dispose();		}
		});
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(37, 103, 118, 24);
		textArea.setBackground(new Color(135, 206, 235));
		textArea.setText(" 输入病人编号");
		panel.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(166, 104, 108, 21);
		panel.add(textField);
		textField.setColumns(15);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("确定"))               
				{                 
					Diagnose frame=new Diagnose();
					frame.setVisible(true);
					//添加一个线程 传递给大屏可读取病人编号
					dispose();
				}				 
			}
		});
		btnNewButton.setBounds(284, 103, 82, 23);
		btnNewButton.setBackground(new Color(211, 211, 211));
		panel.add(btnNewButton);
		
	}
	
}
