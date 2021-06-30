package PipePlatform;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddJobPanel {
	
	JPanel panel001 = new JPanel();
	
	
	JTextField textfield001 = new JTextField(100);
	JTextField textfield002 = new JTextField(100);
	JTextField textfield003 = new JTextField(100);	
	JTextField textfield004 = new JTextField(100);
	JTextField textfield005 = new JTextField(100);
	
	JLabel label001 = new JLabel("الوظيفة");
	JLabel label002 = new JLabel("أسم المشروع");
	JLabel label003 = new JLabel("المرتب");
	JLabel label004 = new JLabel("اللغات المطلوبة");
	JLabel label005 = new JLabel("طلبات اخرى");

	JButton button001 = new JButton("اضافة");
	
	JLabel image001 = new JLabel(new ImageIcon("logIn002.png"));
	

	AddJobPanel(JPanel panel000,int x , int y , int w , int h){
		
		
		panel001.add(textfield001);
		panel001.add(textfield002);
		panel001.add(textfield003);
		panel001.add(textfield004);
		panel001.add(textfield005);
		panel001.add(button001);
		
		panel001.add(label001);
		panel001.add(label002);
		panel001.add(label003);
		panel001.add(label004);
		panel001.add(label005);
		panel001.add(button001);
		panel001.add(image001);
	
		label001.setBounds(350, 30, 200, 60);
		label002.setBounds(350, 110, 200, 60);
		label003.setBounds(350, 190, 200, 60);
		label004.setBounds(350, 270, 200, 60);
		label005.setBounds(350, 350, 200, 60);
		panel001.setBackground(Color.gray);
		image001.setBounds(-200, -200, 1000, 1000);
		
		label001.setForeground(Color.YELLOW);
		label002.setForeground(Color.YELLOW);
		label003.setForeground(Color.YELLOW);
		label004.setForeground(Color.YELLOW);
		label005.setForeground(Color.YELLOW);
		
		textfield001.setBounds(50, 44, 200, 30);
		textfield002.setBounds(50, 123, 200, 30);
		textfield003.setBounds(50, 203, 200, 30);
		textfield004.setBounds(50, 283, 200, 30);
		textfield005.setBounds(50, 364, 200, 30);
		button001.setBounds(100, 460, 100, 50);
		
		LogIn.pipeMain.ButtonStyleMaker(button001, 12);
		
		panel001.setBounds(x, y, w, h);
		panel001.setLayout(null);
		
		panel000.add(panel001);
		
		
	}
	
	void addImage(){
		
		
	}

}
