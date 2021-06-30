package PipePlatform;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PipeMain {


	

	//The frame of this class
	 static JFrame frame001 = new JFrame("PipeChatting");
	// Main panel which works alter to frame001
	 JPanel panel001 = new JPanel();

	 PipeMainPanel pipeMainPanel = new PipeMainPanel(panel001);
	 
	  

	
	PipeMain(){
				
		

		ActionListenerToPipeMainPanel(pipeMainPanel);

		ActionListenerForCenterdPanel(pipeMainPanel.panel001);
		
		pipeMainPanel.panel.removeAll();

		//panel001 settings
		panel001.setBounds(0, 0, 1500, 800);
		panel001.setLayout(null);
		
		//adding components to frame001


		frame001.add(panel001);	
		//frame001 settings
		frame001.setSize(1300, 800);
		//frame001.setVisible(true);
		frame001.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame001.setLayout(null);
		
		

	}
	
	
	static void ButtonStyleMaker(final JButton button001, final int fontSize){
		
		button001.setFont(new Font("Arial", Font.BOLD, fontSize));
		button001.setBackground(new Color(33, 135, 76));
		button001.setOpaque(true);
		button001.setBorder(BorderFactory.createLineBorder(new Color(33, 135, 76)));
		button001.setContentAreaFilled(true);
		button001.setForeground(Color.WHITE);

		
		button001.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
				button001.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
				button001.setBorder(BorderFactory.createLineBorder(new Color(33, 114, 76)));
		    }
		});
		
	}
	static void ActionListenerForCenterdPanel(final CenterdPanel centerdpanel){
		
	
		centerdpanel.button001.addActionListener(new ActionListener(){ 

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
				new SoftwareEngineering();
				
			}});
		
		centerdpanel.button002.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
			
				new WebDevelopment();
				
			}});

		
		centerdpanel.button003.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
			
				new Design();
				
			}});

		
		centerdpanel.button004.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
			
				new DesktopApplications();
				
			}});

		
		centerdpanel.button005.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
			
				new GamesDevelopment();
				
			}});
		
		centerdpanel.button006.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
			
				new Security();
				
			}});
		
		centerdpanel.button007.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
			
				new ComputerArchitecture();
				
			}});
		
		
		centerdpanel.button008.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
			
				new Networks();
				
			}});
		
		

	
	
	
	
	
	
	}
	static public void ActionListenerToPipeMainPanel(final PipeMainPanel pipeMainPanel){

		
		
		pipeMainPanel.button001.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
				new LogIn();
				
			}});
		
		
		pipeMainPanel.button002.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				LogIn.myAccount.frame001.setVisible(true);
				frame001.setVisible(false);
				new BackButton(LogIn.pipeMain.frame001,LogIn.myAccount.frame001,LogIn.myAccount.panel001,10,10);
				
				LogIn.myAccount.panel001.add(LogIn.myAccount.image005);
			}});
		

		pipeMainPanel.panel002.button001.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				pipeMainPanel.panel.removeAll();
				pipeMainPanel.panel001= new CenterdPanel(pipeMainPanel.panel,100,0,600,600);
				ActionListenerForCenterdPanel(pipeMainPanel.panel001);
				
			}});

		pipeMainPanel.panel002.button002.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				new AddJob();
			
			}});
		
		
	
		pipeMainPanel.panel002.button003.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			
			LogIn.cv.frame001.setVisible(true);
			frame001.setVisible(false);
			new BackButton(LogIn.pipeMain.frame001,LogIn.cv.frame001,LogIn.cv.panel001,10,10);
			LogIn.cv.panel001.add(LogIn.cv.image001);
		}});
	}
	

	


void setVisibel(boolean a ){
	frame001.setVisible(a);
}

}
