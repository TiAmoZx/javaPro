package 儿科门诊医生诊疗操作;
import javax.swing.*;
public class $ {
  
    public static void main(String[] args) {
  
        String answer = JOptionPane.showInputDialog("请输入口令");
        if ("123456".equals(answer)) {
  new Yuanzhangdeanniu().setVisible(true);
            // do some thing for a

    		
        } else {
            // do some thing for b
  
        	  new Yourenmaochongyuanzhangdaren().setVisible(true);
        } 
    }
}