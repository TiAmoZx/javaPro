import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class AddMedicine extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMedicine frame = new AddMedicine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddMedicine() {
		setTitle("添加药品");
		setBounds(100, 100, 450, 300);

	}

}
