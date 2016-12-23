package Screen;
import javax.swing.*;

import Screen.TimeTable.ShowTime;
import Screen.TimeTable.TimePanel;

import java.util.*;
import java.awt.*;
import java.util.Timer;
import java.text.SimpleDateFormat;
import java.awt.geom.AffineTransform;
public class Screen extends JFrame{
	String time=null;
 private JLabel ji=new JLabel();private JLabel li=new JLabel();private JLabel ai=new JLabel();
	private JLabel bi=new JLabel();private JLabel ci=new JLabel();private JLabel di=new JLabel();
	private JLabel ei=new JLabel();private JLabel fi=new JLabel();private JLabel gi=new JLabel();
	private JLabel hi=new JLabel();private JLabel ii=new JLabel();private JLabel ki=new JLabel();
	private JLabel mi=new JLabel();private JLabel ni=new JLabel();private JLabel oi=new JLabel();
	private JLabel pi=new JLabel();private JLabel qi=new JLabel();private JLabel ri=new JLabel();
	private JLabel si=new JLabel();private JLabel wi=new JLabel();private JLabel xi=new JLabel();
	private JLabel yi=new JLabel();private JLabel zi=new JLabel();private JLabel aa=new JLabel();
	private JLabel bb=new JLabel();private JLabel cc=new JLabel();private JLabel dd=new JLabel();
	private JLabel ee=new JLabel();private JLabel ff=new JLabel();private JLabel gg=new JLabel();
	private JLabel hh=new JLabel();private JLabel jj=new JLabel();private JLabel kk=new JLabel();
	private JLabel zz=new JLabel();private JLabel xx=new JLabel();private JLabel xxxx=new JLabel();
	private static Thread t,n,s,d,f,a,b,c,e,g,h,i,j,k,l,m,o,p;
	private int count,xyz=0;	//xyz在这里刻有可无，如果没有，那么显示效果更好，供参考
	private int prs=620;
	private int abc=20;private int bcd=60;private int cde=100;
	private int def=140;private int efg=180;private int fgh=220;
	private int ghi=260;private int hij=300;private int ijk=340;
	private int jkl=380;private int klm=420;private int lmn=460;
	private int mno=500;private int nop=540;private int opq=580;
	private Container container=getContentPane();
	public Screen(){
		
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(10,10,600,700);
	setLayout(null);
	setVisible(true);
	JLabel l1=new JLabel("姓名");
	JTextField t1=new JTextField("王麻子");
	JLabel l2=new JLabel("科室");
	JTextField t2=new JTextField("消化科");
	JLabel l3=new JLabel("就诊号码");
	JTextField t3=new JTextField("02413175434");
	l1.setBounds(50,0,100,50);
	t1.setBounds(150,0,150,50);
	l2.setBounds(50,50,100,50);
	t2.setBounds(150,50,150,50);
	l3.setBounds(50,100,100,50);
    t3.setBounds(150,100,150,50);
	add(l1);
	add(l2);
	add(l3);
	add(t1);
	add(t2);
	add(t3);
	JLabel l4=new JLabel("姓名");
	JTextField t4=new JTextField("王麻子");
	JLabel l5=new JLabel("科室");
	JTextField t5=new JTextField("消化科");
	JLabel l6=new JLabel("就诊号码");
	JTextField t6=new JTextField("02413175434");
	l4.setBounds(50,160,100,50);
	t4.setBounds(150,160,150,50);
	l5.setBounds(50,210,100,50);
	t5.setBounds(150,210,150,50);
	l6.setBounds(50,260,100,50);
    t6.setBounds(150,260,150,50);
	add(l4);
	add(l5);
	add(l6);
	add(t4);
	add(t5);
	add(t6);
	JLabel l7=new JLabel("姓名");
	JTextField t7=new JTextField("王麻子");
	JLabel l8=new JLabel("科室");
	JTextField t8=new JTextField("消化科");
	JLabel l9=new JLabel("就诊号码");
	JTextField t9=new JTextField("02413175434");
	l7.setBounds(50,320,100,50);
	t7.setBounds(150,320,150,50);
	l8.setBounds(50,370,100,50);
	t8.setBounds(150,370,150,50);
	l9.setBounds(50,420,100,50);
    t9.setBounds(150,420,150,50);
	add(l7);
	add(l8);
	add(l9);
	add(t7);
	add(t8);
	add(t9);
	zz.setText("当前排队xxxx人");
	xx.setText("当前排队xxxx人");
	 zz.setHorizontalAlignment(SwingConstants.LEFT);
	 xx.setHorizontalAlignment(SwingConstants.LEFT);
	 zz.setBounds(400,200,10,50);
	 xx.setBounds(400,200,10,50);
	 p =new Thread(new Runnable(){
		 public void run(){
			 while(prs<900){
				zz.setBounds(400, prs, 200, 50);
				xx.setBounds(400, prs+20, 200, 50);
				try{
					 p.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				prs+=1;
				  if(prs==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  prs=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 p.start();
	 container.add(zz);
	 container.add(xx);
	jj.setText("当前排队xxxx人");
	kk.setText("当前排队xxxx人");
	 jj.setHorizontalAlignment(SwingConstants.LEFT);
	 kk.setHorizontalAlignment(SwingConstants.LEFT);
	 jj.setBounds(400,200,10,50);
	 kk.setBounds(400,200,10,50);
	 o =new Thread(new Runnable(){
		 public void run(){
			 while(opq<900){
				jj.setBounds(400, opq, 200, 50);
				kk.setBounds(400, opq+20, 200, 50);
				try{
					 o.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				opq+=1;
				  if(opq==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  opq=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 o.start();
	 container.add(jj);
	 container.add(kk);
	gg.setText("当前排队xxxx人");
	hh.setText("当前排队xxxx人");
	 gg.setHorizontalAlignment(SwingConstants.LEFT);
	 hh.setHorizontalAlignment(SwingConstants.LEFT);
	 gg.setBounds(400,200,10,50);
	 hh.setBounds(400,200,10,50);
	 m =new Thread(new Runnable(){
		 public void run(){
			 while(nop<900){
				gg.setBounds(400, nop, 200, 50);
				hh.setBounds(400, nop+20, 200, 50);
				try{
					 m.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				nop+=1;
				  if(nop==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  nop=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 m.start();
	 container.add(gg);
	 container.add(hh);
	ee.setText("当前排队xxxx人");
	ff.setText("当前排队xxxx人");
	 ee.setHorizontalAlignment(SwingConstants.LEFT);
	 ff.setHorizontalAlignment(SwingConstants.LEFT);
	 ee.setBounds(400,200,10,50);
	 ff.setBounds(400,200,10,50);
	 l =new Thread(new Runnable(){
		 public void run(){
			 while(mno<900){
				ee.setBounds(400, mno, 200, 50);
				ff.setBounds(400, mno+20, 200, 50);
				try{
					 l.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				mno+=1;
				  if(mno==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  mno=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 l.start();
	 container.add(ee);
	 container.add(ff);
	cc.setText("当前排队xxxx人");
	dd.setText("当前排队xxxx人");
	 cc.setHorizontalAlignment(SwingConstants.LEFT);
	 dd.setHorizontalAlignment(SwingConstants.LEFT);
	 cc.setBounds(400,200,10,50);
	 dd.setBounds(400,200,10,50);
	 k =new Thread(new Runnable(){
		 public void run(){
			 while(lmn<900){
				cc.setBounds(400, lmn, 200, 50);
				dd.setBounds(400, lmn+20, 200, 50);
				try{
					 k.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				lmn+=1;
				  if(lmn==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  lmn=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 k.start();
	 container.add(cc);
	 container.add(dd);
	aa.setText("当前排队xxxx人");
	bb.setText("当前排队xxxx人");
	 aa.setHorizontalAlignment(SwingConstants.LEFT);
	 bb.setHorizontalAlignment(SwingConstants.LEFT);
	 aa.setBounds(400,200,10,50);
	 bb.setBounds(400,200,10,50);
	 j =new Thread(new Runnable(){
		 public void run(){
			 while(klm<900){
				aa.setBounds(400, klm, 200, 50);
				bb.setBounds(400, klm+20, 200, 50);
				try{
					 j.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				klm+=1;
				  if(klm==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  klm=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 j.start();
	 container.add(aa);
	 container.add(bb);
	yi.setText("当前排队xxxx人");
	zi.setText("当前排队xxxx人");
	 yi.setHorizontalAlignment(SwingConstants.LEFT);
	 zi.setHorizontalAlignment(SwingConstants.LEFT);
	 yi.setBounds(400,200,10,50);
	 zi.setBounds(400,200,10,50);
	 i =new Thread(new Runnable(){
		 public void run(){
			 while(jkl<900){
				yi.setBounds(400, jkl, 200, 50);
				zi.setBounds(400, jkl+20, 200, 50);
				try{
					 i.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				jkl+=1;
				  if(jkl==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  jkl=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 i.start();
	 container.add(yi);
	 container.add(zi);
	wi.setText("当前排队xxxx人");
	xi.setText("当前排队xxxx人");
	 wi.setHorizontalAlignment(SwingConstants.LEFT);
	 xi.setHorizontalAlignment(SwingConstants.LEFT);
	 wi.setBounds(400,200,10,50);
	 xi.setBounds(400,200,10,50);
	 h =new Thread(new Runnable(){
		 public void run(){
			 while(ijk<900){
				wi.setBounds(400, ijk, 200, 50);
				xi.setBounds(400, ijk+20, 200, 50);
				try{
					 h.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				ijk+=1;
				  if(ijk==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  ijk=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 h.start();
	 container.add(wi);
	 container.add(xi);
	ri.setText("当前排队xxxx人");
	si.setText("当前排队xxxx人");
	 ri.setHorizontalAlignment(SwingConstants.LEFT);
	 si.setHorizontalAlignment(SwingConstants.LEFT);
	 ri.setBounds(400,200,10,50);
	 si.setBounds(400,200,10,50);
	 g =new Thread(new Runnable(){
		 public void run(){
			 while(hij<900){
				ri.setBounds(400, hij, 200, 50);
				si.setBounds(400, hij+20, 200, 50);
				try{
					 g.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				hij+=1;
				  if(hij==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  hij=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 g.start();
	 container.add(ri);
	 container.add(si);
	pi.setText("当前排队xxxx人");
	qi.setText("当前排队xxxx人");
	 pi.setHorizontalAlignment(SwingConstants.LEFT);
	 qi.setHorizontalAlignment(SwingConstants.LEFT);
	 pi.setBounds(400,200,10,50);
	 qi.setBounds(400,200,10,50);
	 e =new Thread(new Runnable(){
		 public void run(){
			 while(ghi<900){
				pi.setBounds(400, ghi, 200, 50);
				qi.setBounds(400, ghi+20, 200, 50);
				try{
					 e.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				ghi+=1;
				  if(ghi==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  ghi=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 e.start();
	 container.add(pi);
	 container.add(qi);
	ni.setText("当前排队xxxx人");
	oi.setText("当前排队xxxx人");
	 ni.setHorizontalAlignment(SwingConstants.LEFT);
	 oi.setHorizontalAlignment(SwingConstants.LEFT);
	 ni.setBounds(400,200,10,50);
	 oi.setBounds(400,200,10,50);
	 c =new Thread(new Runnable(){
		 public void run(){
			 while(fgh<900){
				ni.setBounds(400, fgh, 200, 50);
				oi.setBounds(400, fgh+20, 200, 50);
				try{
					 c.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				fgh+=1;
				  if(fgh==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  fgh=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 c.start();
	 container.add(ni);
	 container.add(oi);
	ki.setText("当前排队xxxx人");
	mi.setText("当前排队xxxx人");
	 ki.setHorizontalAlignment(SwingConstants.LEFT);
	 mi.setHorizontalAlignment(SwingConstants.LEFT);
	 ki.setBounds(400,200,10,50);
	 mi.setBounds(400,200,10,50);
	 b =new Thread(new Runnable(){
		 public void run(){
			 while(efg<900){
				ki.setBounds(400, efg, 200, 50);
				mi.setBounds(400, efg+20, 200, 50);
				try{
					 b.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				efg+=1;
				  if(efg==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  efg=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 b.start();
	 container.add(ki);
	 container.add(mi);
	hi.setText("当前排队xxxx人");
	ii.setText("当前排队xxxx人");
	 hi.setHorizontalAlignment(SwingConstants.LEFT);
	 ii.setHorizontalAlignment(SwingConstants.LEFT);
	 hi.setBounds(400,200,10,50);
	 ii.setBounds(400,200,10,50);
	 a =new Thread(new Runnable(){
		 public void run(){
			 while(def<900){
				hi.setBounds(400, def, 200, 50);
				ii.setBounds(400, def+20, 200, 50);
				try{
					 a.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				def+=1;
				  if(def==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  def=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 a.start();
	 container.add(hi);
	 container.add(ii);
	fi.setText("当前排队xxxx人");
	gi.setText("当前排队xxxx人");
	 fi.setHorizontalAlignment(SwingConstants.LEFT);
	 gi.setHorizontalAlignment(SwingConstants.LEFT);
	 fi.setBounds(400,200,10,50);
	 gi.setBounds(400,200,10,50);
	 f =new Thread(new Runnable(){
		 public void run(){
			 while(cde<900){
				fi.setBounds(400, cde, 200, 50);
				gi.setBounds(400, cde+20, 200, 50);
				try{
					 f.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				  cde+=1;
				  if(cde==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  cde=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 f.start();
	 container.add(fi);
	 container.add(gi);
	di.setText("当前排队xxxx人");
	ei.setText("当前排队xxxx人");
	 di.setHorizontalAlignment(SwingConstants.LEFT);
	 ei.setHorizontalAlignment(SwingConstants.LEFT);
	 di.setBounds(400,200,10,50);
	 ei.setBounds(400,200,10,50);
	 d =new Thread(new Runnable(){
		 public void run(){
			 while(bcd<900){
				di.setBounds(400, bcd, 200, 50);
				ei.setBounds(400, bcd+20, 200, 50);
				try{
					 d.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				  bcd+=1;
				  if(bcd==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  bcd=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 d.start();
	 container.add(di);
	 container.add(ei);
	bi.setText("当前排队xxxx人");
	ci.setText("当前排队xxxx人");
	 bi.setHorizontalAlignment(SwingConstants.LEFT);
	 ci.setHorizontalAlignment(SwingConstants.LEFT);
	 bi.setBounds(400,200,10,50);
	 ci.setBounds(400,200,10,50);
	 s =new Thread(new Runnable(){
		 public void run(){
			 while(abc<900){
				bi.setBounds(400, abc, 200, 50);
				ci.setBounds(400, abc+20, 200, 50);
				try{
					 s.sleep(25);
				     }
				      catch(Exception e){
					   e.printStackTrace();
				     }
				  abc+=1;
				  if(abc==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
					  abc=-20;
				  } 
			 }
		 }	 
	 }
	 );
	 s.start();
	 container.add(bi);
	 container.add(ci);
	 container.setLayout(null);
		ji.setText("当前排队xxxx人");
		ai.setText("当前排队xxxx人");
		 ji.setHorizontalAlignment(SwingConstants.LEFT);
		 ai.setHorizontalAlignment(SwingConstants.LEFT);
		 ji.setBounds(400,200,10,50);
		 ai.setBounds(400,200,10,50);
		 t =new Thread(new Runnable(){
			 public void run(){
				 while(xyz<900){
					ji.setBounds(400, xyz-20, 200, 50);
					ai.setBounds(400, xyz, 200, 50);
					try{
						 t.sleep(25);
					     }
					      catch(Exception e){
						   e.printStackTrace();
					     }
					xyz+=1;
					  if(xyz==550){//注意考虑到label的宽度 当右边界重合时即可进行恢复
						  xyz=-20;
					  } 
				 }
			 }	 
		 }
		 );
		 t.start();
		 container.add(ji);
		 container.add(ai);
			li.setText("请张三到xxx就诊");
			 li.setHorizontalAlignment(SwingConstants.LEFT);
			 li.setBounds(500,200,10,50);
			 li.setFont(new   java.awt.Font("Dialog",   1,   40));
			 n =new Thread(new Runnable(){
				 public void run(){
					 while(count<300){
						li.setBounds(count, 600, 1000, 50);
						try{
							 n.sleep(60);
						     }
						      catch(Exception e){
							   e.printStackTrace();
						     }
						  count+=1;
						  if(count==250){//注意考虑到label的宽度 当右边界重合时即可进行恢复
							  count=10;
						  } 
					 }
				 }	 
			 });
			 n.start();
			 container.add(li);
		    xxxx.setBounds(80,525,1000,50);	 
		    xxxx.setHorizontalAlignment(SwingConstants.LEFT);        
	container.add(xxxx);
Timer timer = new Timer();
timer.schedule(new RemindTask(), 0, 1000);	
xxxx.setFont(new   java.awt.Font("Dialog",   1,   25));}
	
	   public String getTime() {
	        Calendar calendar = Calendar.getInstance();
	        Date date = (Date) calendar.getTime();
	        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        time = format.format(date);
	         return time;
	    }	
	public static void main(String[] atgs){
		Screen f=new Screen();	

	}
	private class RemindTask extends TimerTask {
        public void run() {
            xxxx.setText(getTime());
        }
   }
}
