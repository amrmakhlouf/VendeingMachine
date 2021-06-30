package PipePlatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TheJobsGenerator {
	
	
	//JLabel image001 = new JLabel(new ImageIcon(""));

	 int whati=0;
	TheJobsGenerator(final String array[][],JLabel label[][],int counter,Jobs jobspanel ,final JobsPanel panel001 ){
	
			
	
	//image001.setBounds(0, 0, 800, 600);
	
	

		

	
		

	for( int i = 0 ; i < counter ; i ++){
		
	
		
	
			
			label[0][i]=new JLabel(""+array[0][i]);
			label[0][i].setBounds(690, 80*i, 250, 100);
			label[0][i].setForeground(Color.YELLOW);
			panel001.panel001.add(label[0][i]);
			
			label[1][i]=new JLabel(""+array[1][i]);
			label[1][i].setBounds(500, 80*i, 250, 100);
			label[1][i].setForeground(Color.YELLOW);
			panel001.panel001.add(label[1][i]);
			
			
			label[2][i]=new JLabel(""+array[2][i]);
			label[2][i].setBounds(300, 80*i, 250, 100);
			label[2][i].setForeground(Color.YELLOW);
			panel001.panel001.add(label[2][i]);
			
			whati=i;

			  new MoreAboutTheJob(panel001.panel001,array, i,array[0][i],array[1][i],array[2][i],array[3][i],array[4][i]);


			jobspanel.panel001.revalidate();
			jobspanel.panel001.repaint();
			panel001.panel001.revalidate();
			panel001.panel001.repaint();
			
			
			
			
		
	}
	
		
		
		
	}	
	



}
