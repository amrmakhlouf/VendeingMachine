package PipePlatform;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jobs {
	
	
	JButton button000 = new JButton("XxXxXx_USELESS_BUTTON_xXxXxX");
	
	JPanel panel001 = new JPanel(); 
	JFrame frame001 = new JFrame("Jobs");
	JLabel image001 = new JLabel(new ImageIcon("pipeMain004.jpg"));

	
	Jobs (){
		
		new BackButton(LogIn.pipeMain.frame001,frame001,panel001,10,10);

		image001.setBounds(0, 0, 1300, 800);

		button000.setBounds(-1000, -10000, 2, 2);
		panel001.add(button000);
		
		panel001.setLayout(null);
		panel001.setBounds(0, 0, 1300, 800);

		frame001.add(panel001);
		frame001.setSize(1300, 800);
		frame001.setVisible(true);
		//frame001.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame001.setLayout(null);
		
	}
	
	void addImage(){
		panel001.add(image001);
	}

}
