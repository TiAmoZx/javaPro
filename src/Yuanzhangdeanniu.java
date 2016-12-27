
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;
import java.text.SimpleDateFormat;

import javax.swing.*;


public class Yuanzhangdeanniu extends JFrame{
	private Container container=getContentPane();
	String time=null;
	private JLabel xxxx=new JLabel();
	 private JLabel ji=new JLabel();
private JButton myButton1,myButton2,myButton3,myButton4,myButton5;
public Yuanzhangdeanniu(){
	super("医院信息预览");
	setBounds(0,0,1000,645);
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	myButton5=new JButton("关闭");
	myButton1=new JButton("挂号量和总金额");
	myButton2=new JButton(getTime());
	myButton3=new JButton("药品库存");
	myButton4=new JButton("医生就诊数和金额");
    add(myButton1);
    add(myButton2);
	add(myButton3);
	add(myButton4);
	add(myButton5);
    myButton1.setFont(new Font("",Font.BOLD,22));
    myButton2.setFont(new Font("",Font.BOLD,22));
    myButton3.setFont(new Font("",Font.BOLD,22));
    myButton4.setFont(new Font("",Font.BOLD,22));
    myButton5.setFont(new Font("",Font.BOLD,22));
	myButton1.setBounds(0,0,400,200);
	myButton2.setBounds(600,0,400,200);
	myButton3.setBounds(0,400,400,200);
	myButton4.setBounds(600,400,400,200);
	myButton5.setBounds(400,200,200,200);
	myButton1.addActionListener(new myButton1());
	myButton3.addActionListener(new myButton3());
	myButton4.addActionListener(new myButton4());
	myButton5.addActionListener(new myButton5());
    xxxx.setBounds(100,280,1000,50);	 
    xxxx.setHorizontalAlignment(SwingConstants.LEFT);        

Timer timer = new Timer();
timer.schedule(new RemindTask(), 0, 1000);	
xxxx.setFont(new   java.awt.Font("Dialog",   1,   25));
}
public String getTime() {
    Calendar calendar = Calendar.getInstance();
    Date date = (Date) calendar.getTime();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    time = format.format(date);
     return time;
}	
class myButton5 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
}
class myButton3 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		
		Medicine1 m=new Medicine1();
		m.setVisible(true);
		dispose();
	}
}
class myButton1 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		new guahaoliang().setVisible(true);
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
		Yuanzhangdeanniu f=new Yuanzhangdeanniu();
	}
	private class RemindTask extends TimerTask {
        public void run() {
            xxxx.setText(getTime());
        }
   }
}
