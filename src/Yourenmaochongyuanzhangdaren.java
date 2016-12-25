
import javax.swing.*;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Yourenmaochongyuanzhangdaren extends JFrame{

	
	public Yourenmaochongyuanzhangdaren(){
		super("这里有人冒充院长大人");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50,50,500,100);
		setVisible(true);
		JLabel l1=new JLabel("快来人呐，这里有人冒充院长大人！");
		add(l1);
		l1.setBounds(300,250,100,60);
	}
	public static void main(String[] args) {
		Yourenmaochongyuanzhangdaren f=new Yourenmaochongyuanzhangdaren();
			}
}
