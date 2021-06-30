package PipePlatform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Design {

		Jobs jobspanel = new Jobs();
		JobsPanel panel001 = new JobsPanel(jobspanel.panel001,250,55,800,600);
	
	static String Jobs[][] = new String[5][100];
	JLabel label[][] = new JLabel[5][100];

	static int counter=0;
	JButton button001 = new JButton("يا رب ما يزبط");
	
	
	Design(){
		TheJobsGenerator thejobsGenertaterSoftWareEngineering = new TheJobsGenerator(Jobs, label, counter, jobspanel, panel001);
		panel001.addTheImage();
		jobspanel.addImage();
	}	
	
	
	public static void addActionListener(final JFrame frame001,JButton button001,final AddJobPanel addJobPanel,final JTextField textfield001 ,final JTextField textfield002 ,final JTextField textfield003 ,final JTextField textfield004 ){
		
		button001.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
	
			Design.Jobs[0][Design.counter]=textfield001.getText();
			Design.Jobs[1][Design.counter]=textfield002.getText();
			Design.Jobs[2][Design.counter]=textfield003.getText();
			Design.Jobs[3][Design.counter]=textfield004.getText();
	//	}	
			++counter;
			
			//JOptionPane.showMessageDialog(null, "Well Done");
			//System.out.println(textfield001.getText());
			
			frame001.setVisible(false);
			

			
			}});
			
		}

}




