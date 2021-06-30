package PipePlatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddJob {
	
	JFrame frame001 = new JFrame();
	 JPanel panel001 = new JPanel();
	JLabel label001 = new JLabel("اختر نوع الوظيفة");
	  CenterdPanel centerdpanel = new CenterdPanel(panel001,-85,-12,500,500);
	

	AddJob(){
		
		JLabel image003 = new JLabel("pipeMain002.jpg");

		frame001.add(label001);
		centerdpanel.addImage();
		centerdpanel.button001.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				frame001.setVisible(false);
				AddingJobForm addingjobform =new AddingJobForm();
				 SoftwareEngineering.addActionListener(addingjobform.frame001,addingjobform.addJobPanel.button001, addingjobform.addJobPanel, addingjobform.addJobPanel.textfield001, addingjobform.addJobPanel.textfield002,addingjobform.addJobPanel.textfield003, addingjobform.addJobPanel.textfield004, addingjobform.addJobPanel.textfield005);
				 ++LogIn.buttonsCounter[LogIn.accounts.userId];

				
			}
			
		});

		centerdpanel.button002.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				frame001.setVisible(false);
				AddingJobForm addingjobform =new AddingJobForm();
				WebDevelopment.addActionListener(addingjobform.frame001,addingjobform.addJobPanel.button001, addingjobform.addJobPanel, addingjobform.addJobPanel.textfield001, addingjobform.addJobPanel.textfield002,addingjobform.addJobPanel.textfield003, addingjobform.addJobPanel.textfield004);

				
			}
			
		});
	

		centerdpanel.button003.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				frame001.setVisible(false);
				AddingJobForm addingjobform =new AddingJobForm();
				Design.addActionListener(addingjobform.frame001,addingjobform.addJobPanel.button001, addingjobform.addJobPanel, addingjobform.addJobPanel.textfield001, addingjobform.addJobPanel.textfield002,addingjobform.addJobPanel.textfield003, addingjobform.addJobPanel.textfield004);

				
			}
			
		});
	

		centerdpanel.button004.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				frame001.setVisible(false);
				AddingJobForm addingjobform =new AddingJobForm();
				DesktopApplications.addActionListener(addingjobform.frame001,addingjobform.addJobPanel.button001, addingjobform.addJobPanel, addingjobform.addJobPanel.textfield001, addingjobform.addJobPanel.textfield002,addingjobform.addJobPanel.textfield003, addingjobform.addJobPanel.textfield004);

				
			}
			
		});

		centerdpanel.button005.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				frame001.setVisible(false);
				AddingJobForm addingjobform =new AddingJobForm();
				GamesDevelopment.addActionListener(addingjobform.frame001,addingjobform.addJobPanel.button001, addingjobform.addJobPanel, addingjobform.addJobPanel.textfield001, addingjobform.addJobPanel.textfield002,addingjobform.addJobPanel.textfield003, addingjobform.addJobPanel.textfield004);

				
			}
			
		});

		centerdpanel.button006.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				frame001.setVisible(false);
				AddingJobForm addingjobform =new AddingJobForm();
				Security.addActionListener(addingjobform.frame001,addingjobform.addJobPanel.button001, addingjobform.addJobPanel, addingjobform.addJobPanel.textfield001, addingjobform.addJobPanel.textfield002,addingjobform.addJobPanel.textfield003, addingjobform.addJobPanel.textfield004);

				
			}
			
		});

		centerdpanel.button007.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				frame001.setVisible(false);
				AddingJobForm addingjobform =new AddingJobForm();
				ComputerArchitecture.addActionListener(addingjobform.frame001,addingjobform.addJobPanel.button001, addingjobform.addJobPanel, addingjobform.addJobPanel.textfield001, addingjobform.addJobPanel.textfield002,addingjobform.addJobPanel.textfield003, addingjobform.addJobPanel.textfield004);

				
			}
			
		});

		centerdpanel.button008.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				frame001.setVisible(false);
				AddingJobForm addingjobform =new AddingJobForm();
				Networks.addActionListener(addingjobform.frame001,addingjobform.addJobPanel.button001, addingjobform.addJobPanel, addingjobform.addJobPanel.textfield001, addingjobform.addJobPanel.textfield002,addingjobform.addJobPanel.textfield003, addingjobform.addJobPanel.textfield004);

				
			}
			
		});
		
	
		
		label001.setBounds(150, 0, 124, 30);
		label001.setForeground(Color.black);

		
		panel001.setBounds(0, 0,500,500);
		panel001.setLayout(null);
		frame001.add(panel001);
		
		frame001.setSize(400,500);
		frame001.setLayout(null);
		frame001.setVisible(true);
	}
	
	

	
}
