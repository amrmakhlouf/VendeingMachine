package PipePlatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CenterdPanel {
	//panel001 which will be in the center of panel001
	JPanel panel001 = new JPanel();
	//panel001 components
	JButton button001 = new JButton("هندسة البرمجيات");
	JButton button002 = new JButton("تطوير الويب");	
	JButton button003 = new JButton("التصميم");
	JButton button004 = new JButton("سطح المكتب");
	JButton button005 = new JButton("تطوير الالعاب");
	JButton button006 = new JButton("الحماية");
	JButton button007 = new JButton("عمارة الحاسوب");
	JButton button008 = new JButton("الشبكات");
	JLabel image003 = new JLabel(new ImageIcon("signUp003.jpg"));
	JPanel panel002 = new JPanel();//panel inside a panel (panel002 inside panel001)
	
	CenterdPanel(JPanel panel000 , int x , int y , int w , int h){
		
		
		
		
		
				//panel001 Settings
				panel001.setLayout(null);
				panel001.setOpaque(false); //tansperant 	
				//Bounding panel001 components
				button001.setBounds(10, 50, 150, 70);
				button002.setBounds(210, 50, 150, 70);
				button003.setBounds(10, 150, 150, 70);
				button004.setBounds(210, 150, 150, 70);
				button005.setBounds(10, 250, 150, 70);
				button006.setBounds(210, 250, 150, 70);
				button007.setBounds(10, 350, 150, 70);
				button008.setBounds(210, 350, 150, 70);
				//adding pacel002 components
				panel002.add(button001);
				panel002.add(button002);
				panel002.add(button003);
				panel002.add(button004);
				panel002.add(button005);
				panel002.add(button006);
				panel002.add(button007);
				panel002.add(button008);
				//Setting panel002 components
				LogIn.pipeMain.ButtonStyleMaker(button001,15);
				LogIn.pipeMain.ButtonStyleMaker(button002,15);
				LogIn.pipeMain.ButtonStyleMaker(button003,15);
				LogIn.pipeMain.ButtonStyleMaker(button004,15);
				LogIn.pipeMain.ButtonStyleMaker(button005,15);
				LogIn.pipeMain.ButtonStyleMaker(button006,15);
				LogIn.pipeMain.ButtonStyleMaker(button007,15);
				LogIn.pipeMain.ButtonStyleMaker(button008,15);
				//adding panel001 components to it
				panel001.add(panel002);
				//Bounding panel001 components
				panel002.setBounds(100, 0, 400, 500);
				image003.setBounds(0, 0, w, h);

				//Setting of panel002
				panel002.setLayout(null);
				panel002.setOpaque(false); //tansperant 
				//adding this panel to the Imported panel 
				panel000.add(panel001);
				
				
				//Bounding this panel
				panel001.setBounds(x, y, w, h);
				
			

	}
	
	void addImage(){
		panel001.add(image003);

	}
}
