
import javax.swing.*;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Yourenmaochongyuanzhangdaren extends JFrame{

	
	public Yourenmaochongyuanzhangdaren(){
		super("口令输入不正确");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50,50,300,100);
		setVisible(true);
		JLabel l1=new JLabel("请重新输入口令");
		add(l1);
		l1.setBounds(300,250,100,60);
	}
	public static void main(String[] args) {
		Yourenmaochongyuanzhangdaren f=new Yourenmaochongyuanzhangdaren();
			}
}
