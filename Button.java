import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.Socket;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.io.DataOutputStream;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import java.net.InetSocketAddress;  
import java.net.Socket;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;  
  

public class Button extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			 
				 try {
					
					Button frame = new Button();
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
	public Button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		 int length = 0;  
	        double sumL = 0 ;  
	        byte[] sendBytes = null;  
	        Socket socket = null;  
	        DataOutputStream dos = null;  
	        FileInputStream fis = null;  
	        boolean bool = false;
	        String filePath = "D:/temp/"+GetDate.getDate()+"SJ"+new Random().nextInt(10000)+".txt";  
	        
	        JTextArea textArea = new JTextArea();
			textArea.setBounds(72, 36, 317, 122);
			contentPane.add(textArea);

          File file=new File("word.txt");
          try{
            FileReader in=new FileReader(file);
             char byt[]=new  char[1024];
         int len=in.read(byt);

          textArea.setText(new String(byt,0,len));
            in.close();}
           catch(Exception e)
           {
             e.printStackTrace();
                }

		
		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{int length = 0;  
	        double sumL = 0 ;  
	        byte[] sendBytes = null;  
	        Socket socket = null;  
	        DataOutputStream dos = null;  
	        FileInputStream fis = null;  
	        boolean bool = false;  
	        try {  
	            File file = new File("H:/Test/word.txt"); //要传输的文件路径  
	            long l = file.length();   
	            socket = new Socket();    
	            socket.connect(new InetSocketAddress("10.40.70.133", 81));  
	            dos = new DataOutputStream(socket.getOutputStream());  
	            fis = new FileInputStream(file);        
	            sendBytes = new byte[1024];    
	            while ((length = fis.read(sendBytes, 0, sendBytes.length)) > 0) 
	            {  
	                sumL += length;    
	                System.out.println("已传输："+((sumL/l)*100)+"%");  
	                dos.write(sendBytes, 0, length);  
	                dos.flush();  
	            }   
	            //虽然数据类型不同，但JAVA会自动转换成相同数据类型后在做比较  
	            if(sumL==l){  
	                bool = true;  
	            }  
	        }
	        catch (Exception e) {  
	            System.out.println("客户端文件传输异常");  
	            bool = false;  
	            e.printStackTrace();    
	        } 
	        finally{    
	            if (dos != null)
					try {
						dos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
	            if (fis != null)
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}     
	            if (socket != null)
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}      
	        }  
	        System.out.println(bool?"成功":"失败");  
	    
		}
		
	});
		
		button.setBounds(262, 193, 93, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("请再次确认信息！如果无误请确认");
		label.setBounds(41, 186, 211, 37);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\新建文件夹\\QQ图片20161214215736.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 251);
		contentPane.add(lblNewLabel);
		
		
		 
	}
}
