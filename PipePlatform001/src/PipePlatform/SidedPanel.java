package PipePlatform;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SidedPanel {
	

	//panel001 which will be inside panel001
	JPanel panel001 = new JPanel();
	//panel001 components
	JButton button001 = new JButton("وظائف");
	JButton button002 = new JButton("أضف وظيفة");
	JButton button003 = new JButton("ملفي الوظيفي");
	JButton button004 = new JButton("أبحث عن مبرمج");
	JButton button005 = new JButton("اعمالي");
	JButton button006 = new JButton("مسابقات");
	JLabel image002 = new JLabel(new ImageIcon("sslogIn002.png"));
	
	SidedPanel(JPanel panel000 , int x , int y , int w , int h ){
		
		//panel001 settings
		panel001.setLayout(null);
		panel001.setOpaque(false); //tansperant 
		//Bounding panel001 components
		button001.setBounds(30, 50, 200, 50);
		button002.setBounds(30, 120, 200, 50);
		button003.setBounds(30, 190, 200, 50);
		button004.setBounds(30, 260, 200, 50);
		button005.setBounds(30, 330, 200, 50);
		button006.setBounds(30, 400, 200, 50);
		image002.setBounds(0, 0, w, h);
		//adding panel001 components
		panel001.add(button001);
		panel001.add(button002);
		panel001.add(button003);
		panel001.add(button004);
		panel001.add(button005);
		panel001.add(image002);
		//Setting panel001 components
		LogIn.pipeMain.ButtonStyleMaker(button001,15);
		LogIn.pipeMain.ButtonStyleMaker(button002,15);
		LogIn.pipeMain.ButtonStyleMaker(button003,15);
		LogIn.pipeMain.ButtonStyleMaker(button004,15);
		LogIn.pipeMain.ButtonStyleMaker(button005,15);
		LogIn.pipeMain.ButtonStyleMaker(button006,15);
		
		panel001.setBounds(x,y,w,h);
		//adding this panel to the Imported panel 
		panel000.add(panel001);
	
	
}

}

