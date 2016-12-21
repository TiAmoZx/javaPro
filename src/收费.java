import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 收费 extends JFrame {
	public 收费() {
		setBounds(165, 180, 400, 300);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 6, 438, 298);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setIcon(new ImageIcon("/Users/yuelei/Desktop/医院.jpg"));
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("welcome");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Jfa j=new Jfa();
				j.setVisible(true);//注意 只有加了这个页面调用才会显示
			}
		});
		btnNewButton.setBounds(165, 180, 117, 29);
		getContentPane().add(btnNewButton);
		getContentPane().add(lblNewLabel);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   收费 收费1=new 收费();
   收费1.setVisible(true);
	}
}
