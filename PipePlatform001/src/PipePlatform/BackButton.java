package PipePlatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BackButton {
	
	JButton button001 = new JButton(new ImageIcon("BackButton001.png"));
	
	BackButton(final JFrame frame001 , final JFrame frame002 ,JPanel panel001, int x , int y ){
		button001.setOpaque(false);
		button001.setForeground(Color.yellow);
		button001.setBackground(Color.yellow);
		button001.setBorder(null); 

		button001.setBounds(x, y, 100, 100);
		panel001.add(button001);
		
		button001.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame002.setVisible(false);	
				frame001.setVisible(true);
				
			}});
		
	}

}
