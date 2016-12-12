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
		setBounds(100, 100, 502, 391);
		
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
		
		JMenuItem menu_zxyygh = new JMenuItem("已在线预约挂号");
		menu_zxyygh.setPressedIcon(new ImageIcon("/Users/yuelei/Desktop/1.jpg"));
		menu.add(menu_zxyygh);
		
		JMenuItem menu_wzxyy = new JMenuItem("未在线预约");
		menu.add(menu_wzxyy);
		
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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel label123 = new JLabel(" 欢迎进入挂号收费系统",JLabel.CENTER);
		label123.setBackground(Color.CYAN);
		label123.setHorizontalAlignment(SwingConstants.CENTER);
		label123.setFont(new Font("Adobe Gothic Std", Font.BOLD, 20));
		label123.setForeground(Color.BLACK);
		contentPane.add(label123, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(0, 20));
		panel.setBorder(new CompoundBorder());
		panel.setPreferredSize(new Dimension(10, 25));
		panel.setRequestFocusEnabled(false);
		panel.setBackground(Color.CYAN);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel Jlable1 = new JLabel("门诊管理系统");
		Jlable1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.add(Jlable1);
		Jlable1.setLocation(10, 10);
		
		JLabel Jlable2 = new JLabel("欢迎使用");
		Jlable2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.add(Jlable2);
		//DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
		//String dataString=df.format(new Date(0));
		JLabel Jlable3 = new JLabel("日期");
	
		Jlable3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Jlable3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(Jlable3);
		//DateFormat df1=DateFormat.getTimeInstance(DateFormat.MEDIUM);
		//String dataString1=df1.format(new Date(0));//由于时间设置时间不对而且不会自动改变 所以暂时不要
		JLabel Jlable4 = new JLabel("时间");
		Jlable4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.add(Jlable4);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		//JLabel label_1 = new JLabel("当前预约情况");
		

		
		 String path = "/Users/yuelei/Desktop/Hosptial/医院2.jpg";  
		 ImageIcon background = new ImageIcon(path);  
		
		 
		 JPanel imagePanel = (JPanel) this.getContentPane();  
	   
		 JLabel label_1 = new JLabel(background);
		 label_1.setHorizontalAlignment(SwingConstants.LEFT);
	
		 label_1.setBounds(0, 0, this.getWidth(), this.getHeight()); 
		 JPanel imagePanel1 = (JPanel) this.getContentPane();  
	        imagePanel.setOpaque(false);  
	        this.getLayeredPane().add(label_1, new Integer(Integer.MIN_VALUE));  
	        setVisible(true);
	        panel_2.add(label_1);
		
	
	}
	protected void closeThis() {
		// TODO Auto-generated method stub
		
	}

	public void actionPormed(ActionEvent e){
		try{
			if (e.getActionCommand()=="已在线预约挂号")
		      {
			System.exit(0);
			
		      }
		}
		   catch(Exception ex){
			   ex.printStackTrace();
		      }
		
		
	                                        }
	
	
}
