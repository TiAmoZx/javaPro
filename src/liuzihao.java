package 儿科门诊医生诊疗操作;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sun.awt.*;
import 儿科门诊医生诊疗操作.yisheng.tuichu1;

import javax.swing.*;

import java.awt.event.*;
public class liuzihao extends JFrame{
	private JTextArea keshi,guahaoliang,jine;
	public liuzihao(){
		super("医生就诊数和金额");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		
		
		
		
		
		
		
		
		JButton tuichu1;
		JButton tuichu11=new JButton("返回");
		add(tuichu11);
		tuichu11.setBounds(500,600,100,50);
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
			liuzihao f=new liuzihao();
		}

	}


