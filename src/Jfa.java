import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.ScrollPane;

public class Jfa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
	
			
			public void run() {
				try {
					Jfa frame = new Jfa();
					frame.setVisible(true);
					frame.addWindowListener(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	JMenuItem menu_zxyygh = new JMenuItem("已在线预约挂号");
	JMenuItem menu_wzxyy = new JMenuItem("现场预约");
	/**
	 * Create the frame.
	 */
	public Jfa() {
		setType(Type.POPUP);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		 
		setTitle("挂号");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 150, 400, 400);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		menuBar.setSize(new Dimension(4, 2));
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("挂号");
		menu.setAutoscrolls(true);
		menu.setPreferredSize(new Dimension(150, 35));
		menu.setMinimumSize(new Dimension(4, 2));
		menu.setToolTipText("");
		menu.setBackground(Color.RED);
		menuBar.add(menu);
		
		
		menu_zxyygh.setPressedIcon(new ImageIcon("/Users/yuelei/Desktop/1.jpg"));
		menu.add(menu_zxyygh);
		menu_zxyygh.addActionListener(actionListener);
		
		
		menu.add(menu_wzxyy);
		menu_wzxyy.addActionListener(actionListener);
		
		JButton button1 = new JButton("退出");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		
		JButton btnNewButton = new JButton("收费系统");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getActionCommand().equals("收费系统")){
				dispose();//销毁当前窗口
				price sf=new price();
			        sf.setVisible(true);
				}
				
			}
		});
		menuBar.add(btnNewButton);
		menuBar.add(button1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label123 = new JLabel(" 欢迎进入挂号收费系统",JLabel.CENTER);
		label123.setBounds(6, 6, 388, 41);
		label123.setBackground(Color.CYAN);
		label123.setHorizontalAlignment(SwingConstants.CENTER);
		label123.setFont(new Font("Adobe Gothic Std", Font.BOLD, 20));
		label123.setForeground(Color.BLACK);
		
		//JLabel label_1 = new JLabel("当前预约情况");
		

		
		 String path = "/Users/yuelei/Desktop/Hosptial/医院2.jpg";  
		 ImageIcon background = new ImageIcon(path);  
		
		 
		 JPanel imagePanel = (JPanel) this.getContentPane();
		 JPanel imagePanel1 = (JPanel) this.getContentPane();  
	        imagePanel.setOpaque(false);
	        contentPane.setLayout(null);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setLabelFor(this);
	        lblNewLabel.setBounds(6, 36, 388, 340);
	        lblNewLabel.setIcon(new ImageIcon("/Users/yuelei/Desktop/医院.jpg"));
	        contentPane.add(lblNewLabel);
	        contentPane.add(label123);
	        
	        JButton btnNewButton_1 = new JButton("New button");
	        btnNewButton_1.setBounds(6, 168, 117, 29);
	        contentPane.add(btnNewButton_1);
	        
	        ScrollPane scrollPane = new ScrollPane();
	        scrollPane.setBounds(16, 65, 378, 267);
	        contentPane.add(scrollPane);
	        
	        JButton btnNewButton_2 = new JButton("New button");
	        btnNewButton_2.setBounds(53, 168, 117, 29);
	        contentPane.add(btnNewButton_2);
	        setVisible(true);
		
	
	}
	protected void closeThis() {
		// TODO Auto-generated method stub
		
	}
	private ActionListener actionListener = new ActionListener() {//监听事件

        @Override
        public void actionPerformed(ActionEvent e) {
            // 可以监听不同事件
            if (e.getSource() == menu_zxyygh) {
               System.exit(0);;
            }
            if(e.getSource()==menu_wzxyy){
            	dispose();
            	现场挂号 f=new 现场挂号();
            	f.setVisible(true);
            }
        }
    };
}
