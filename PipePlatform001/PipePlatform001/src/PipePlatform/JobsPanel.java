package PipePlatform;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JobsPanel {
	
	JPanel panel001 = new JPanel();
	
	JLabel label001 = new JLabel("الوظيفة");
	JLabel label002 = new JLabel("اسم المشروع");
	JLabel label003 = new JLabel("المرتب");
	
	static JLabel image001 = new JLabel(new ImageIcon("logIn005.png"));
	
	JButton button001 = new JButton("المزيد");
	JobsPanel(JPanel panel000, int x, int y, int h, int w){
		label001.setBounds(700, 0, 200, 50);
		label002.setBounds(500, 0, 200, 50);
		label003.setBounds(300, 0, 200, 50);
		image001.setBounds(0, -200, 1300, 800);
		
		label001.setForeground(Color.GREEN);
		label002.setForeground(Color.GREEN);
		label003.setForeground(Color.GREEN);
		
		panel001.add(label001);
		panel001.add(label002);
		panel001.add(label003);
		
		panel001.setBackground(Color.gray);
		panel001.setOpaque(false);
		panel001.setBounds(x, y, h, w);
		panel001.setLayout(null);
		
		
		panel000.add(panel001);

		
	}
	public void addTheImage() {
		// TODO Auto-generated method stub
		panel001.add(image001);
		
	}

}
