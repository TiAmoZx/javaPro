
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//import ��������ҽ�����Ʋ���.Yuanzhangdeanniu.myButton1;
public class yaopinkucun extends JFrame{
	private JButton tuichu;
	private JTextArea keshi,guahaoliang,jine;
	public yaopinkucun(){	
	super("ҩƷ���");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JButton tuichu=new JButton("����");
	setBounds(0,0,1000,700);
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	keshi=new JTextArea("sdfweafdsf");
	guahaoliang=new JTextArea("dasfwefs");
	jine=new JTextArea("dawfsdfweradsfwaelkrjsiodufwqerqw");
	add(keshi);
	add(guahaoliang);
	add(jine);
	add(tuichu);
	keshi.setBounds(0,0,500,300);
	tuichu.setBounds(500,600,150,50);
	jine.setBounds(500,0,500,600);
	guahaoliang.setBounds(0,300,500,300);
    tuichu.addActionListener(new tuichu());
	}
	class tuichu implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dispose();
			Yuanzhangdeanniu f=new Yuanzhangdeanniu();
			f.setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
yaopinkucun f=new yaopinkucun();
	}
}
