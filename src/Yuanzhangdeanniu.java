
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//import ��������ҽ�����Ʋ���.LoginDemo.B1;
public class Yuanzhangdeanniu extends JFrame{
private JButton myButton1,myButton2,myButton3,myButton4;
public Yuanzhangdeanniu(){
	super("Ժ���Ĳ�ѯ��ť");
	setBounds(0,0,1000,645);
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	myButton1=new JButton("���ҹҺ������ܽ��");
	myButton2=new JButton("���ҹҺ������ܽ��(��ͼ)");
	myButton3=new JButton("��ҩƷ���");
	myButton4=new JButton("��ҽ�����������ͽ��");
	add(myButton1);
	add(myButton2);
	add(myButton3);
	add(myButton4);
	myButton1.setBounds(0,0,500,300);
	myButton2.setBounds(500,0,500,300);
	myButton3.setBounds(0,300,500,300);
	myButton4.setBounds(500,300,500,300);
	myButton1.addActionListener(new myButton1());
	myButton3.addActionListener(new myButton3());
	myButton4.addActionListener(new myButton4());
}
class myButton1 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		new guahaoliang().setVisible(true);
		dispose();
	}
}
class myButton3 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		new yaopinkucun().setVisible(true);
		dispose();
	}
}
class myButton4 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		new yisheng().setVisible(true);
		dispose();
	}
}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Yuanzhangdeanniu f=new Yuanzhangdeanniu();
	}

}
