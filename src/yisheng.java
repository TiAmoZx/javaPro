package 儿科门诊医生诊疗操作;
import java.awt.event.*;
import javax.swing.*;
public class yisheng extends JFrame{
	private JTextArea keshi,guahaoliang,jine;
	public yisheng(){
		super("各医生就诊数量和金额");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton tuichu1;
		JButton tuichu11=new JButton("返回");
		add(tuichu11);
		tuichu11.setBounds(500,600,100,50);
		setBounds(0,0,1000,700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		keshi=new JTextArea("sdfweafdsf");
		guahaoliang=new JTextArea("dasfwefs");
		jine=new JTextArea("dawfsdfweradsfwaelkrjsiodufwqerqw");
		add(keshi);add(guahaoliang);add(jine);
		keshi.setBounds(0,0,500,300);
		jine.setBounds(500,0,500,600);
		guahaoliang.setBounds(0,300,500,300);
	 tuichu11.addActionListener(new tuichu1());
	}
	class tuichu1 implements ActionListener{
			public void actionPerformed(ActionEvent e){
				dispose();
				Yuanzhangdeanniu f=new Yuanzhangdeanniu();
				f.setVisible(true);
			}
		}
		public static void main(String[] args) {
			// TODO 自动生成的方法存根
	guahaoliang f=new guahaoliang();
		}

	}


