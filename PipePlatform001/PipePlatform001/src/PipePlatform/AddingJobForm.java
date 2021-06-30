package PipePlatform;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AddingJobForm {
	
	
		JFrame frame001 = new JFrame("تعبئة طلب اضافة وظيفة");
		JPanel panel001 = new JPanel();	
		AddJobPanel addJobPanel =new AddJobPanel(panel001,0,0,500,700); 

		AddingJobForm(){
			
			
			frame001.add(panel001);
			panel001.setLayout(null);
			panel001.setBounds(0, 0, 500, 800);
			
			
			frame001.setSize(500, 666);
			frame001.setVisible(true);
			frame001.setLayout(null);
			
		}

		public void  setFrameVisible(boolean n){
			if (n) frame001.setVisible(true);
			else frame001.setVisible(false);
			
		}
		
}
