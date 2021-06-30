package PipePlatform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DesktopApplications {

		Jobs jobspanel = new Jobs();
		JobsPanel panel001 = new JobsPanel(jobspanel.panel001,250,55,800,600);
	
	static String Jobs[][] = new String[5][100];
	JLabel label[][] = new JLabel[5][100];

	static int counter=0;
	JButton button001 = new JButton("يا رب ما يزبط");
	
	
	DesktopApplications(){
		TheJobsGenerator thejobsGenertaterSoftWareEngineering = new TheJobsGenerator(Jobs, label, counter, jobspanel, panel001);
		panel001.addTheImage();
		jobspanel.addImage();
	}	
	
	
	public static void addActionListener(final JFrame frame001,JButton button001,final AddJobPanel addJobPanel,final JTextField textfield001 ,final JTextField textfield002 ,final JTextField textfield003 ,final JTextField textfield004 ){
		
		button001.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
	
			DesktopApplications.Jobs[0][DesktopApplications.counter]=textfield001.getText();
			DesktopApplications.Jobs[1][DesktopApplications.counter]=textfield002.getText();
			DesktopApplications.Jobs[2][DesktopApplications.counter]=textfield003.getText();
			DesktopApplications.Jobs[3][DesktopApplications.counter]=textfield004.getText();
	//	}	
			++counter;
			
			//JOptionPane.showMessageDialog(null, "Well Done");
			//System.out.println(textfield001.getText());
			
			frame001.setVisible(false);
			

			
			}});
			
		}

}




