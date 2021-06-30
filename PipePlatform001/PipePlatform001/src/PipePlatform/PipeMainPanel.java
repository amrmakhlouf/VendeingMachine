package PipePlatform;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PipeMainPanel {
	
	
	
	//panel001 components
		JLabel image001 = new JLabel(new ImageIcon("pipeMain005.jpg"));
		JLabel image005 = new JLabel(new ImageIcon("logIn005.png"));
		JLabel image006 = new JLabel(new ImageIcon("logIn005.png"));
		JLabel image008 = new JLabel(new ImageIcon("logIn008.png"));
		JLabel image020 = new JLabel(new ImageIcon("logIn005.png"));

		JPanel panel = new JPanel();
		JLabel label001 = new JLabel("Pipe Platform");
		JButton button000 = new JButton("USELESS_BUTTON");//This is usles button just to erase selection ont other buttons

		JButton button001 = new JButton("تسجيل الخروج");
		JButton button002 = new JButton("حسابي");

		JPanel littlePanel = new JPanel(); // for hello user
		//panel001 components
		SidedPanel panel002 ;
		CenterdPanel panel001 = new CenterdPanel(panel,300, 23, 600, 500);
	
		PipeMainPanel(JPanel panel000){
			
			
			
		littlePanel.setBounds(1080, -11, 220, 200);
		littlePanel.setOpaque(false); //tansperant 	

		panel002 = new SidedPanel(panel000,1010, 200, 255, 440);
		littlePanel.setLayout(null);
		panel000.add(littlePanel);
		
		panel.setBackground(Color.gray);
		littlePanel.add(button000);

		littlePanel.add(button001);
		littlePanel.add(button002);

		label001.setFont(new Font("Serif", Font.BOLD, 47));
		label001.setForeground(Color.WHITE);
		
		/*Sender sender1 = new Sender(mainPanel,	 33,100,400,500);
		Sender sender2 = new Sender(mainPanel, 	440,100,400,500);
		
		sender2.Conv(sender1);
		sender1.Conv(sender2);*/
		
		label001.setBounds(200, 40, 500, 100);
		button001.setBounds(20, 133, 100, 30);
		button002.setBounds(20, 89, 100, 30);
		image005.setBounds(987, 0, 305, 1000);
		image006.setBounds(-50, 0, 1400, 170);
		image008.setBounds(20, 10, 160, 160);
		panel.setBounds(100, 190, 750, 500);
		
		
		

		button001.setOpaque(false);
		button001.setForeground(Color.yellow);
		button001.setBackground(Color.yellow);
		button001.setBorder(BorderFactory.createLineBorder(Color.white)); 


		button002.setOpaque(false);
		button002.setForeground(Color.yellow);
		button002.setBackground(Color.yellow);
		button002.setBorder(BorderFactory.createLineBorder(Color.white)); 


		image020.setBounds(80, 200, 800, 500);
		button000.setBounds(-1000, 50, 200, 50);
		image001.setBounds(0, 0, 1400, 800);
		//adding pacel001 components
		panel000.add(label001);
		panel000.add(image008);

		panel000.add(image006);
		panel000.add(panel);
		//panel settings
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		panel.setOpaque(false); //tansperant 
		
		panel000.add(image020);
		
		panel000.add(image005);

		panel000.add(image001);
		
		panel.revalidate();
		panel.repaint();

		

	}
		void addHelloUser(JPanel panel000){
			littlePanel.add(button000);

			littlePanel.add(button001);
			littlePanel.add(button002);

			littlePanel.add(LogIn.label003);
			panel000.add(littlePanel);
			panel000.add(image008);
			panel000.add(image006);

			panel000.add(image020);
			
			panel000.add(image005);

			panel000.add(image001);
			
		}

}
