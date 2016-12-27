
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginDemo extends JFrame{
public LoginDemo(){
	super("你真的院长么");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(50,50,950,850);
	setLayout(null);
	setVisible(true);
	JLabel l1=new JLabel("账号:");
	JLabel l2=new JLabel("密码:");
	JTextField t1=new JTextField("岳磊");
	JTextField t2=new JTextField("***********");
	JButton B1=new JButton("登录");
	JButton B2=new JButton("退出");
	add(l1);add(l2);add(t1);add(t2);
	add(B1);add(B2);
	l1.setBounds(300,250,100,60);
	l2.setBounds(300,310,100,60);
	t1.setBounds(350,250,260,60);
	t2.setBounds(350,310,260,60);
	B1.setBounds(300,370,140,60);
	B2.setBounds(470,370,140,60);
	B2.addActionListener(new B2());
	B1.addActionListener(new B1());
}
class B2 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
}
class B1 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		dispose();
		new Yuanzhangdeanniu().setVisible(true);
	}
}
	public static void main(String[] args) {
LoginDemo f=new LoginDemo();
	}

}
