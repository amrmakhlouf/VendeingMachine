package PipePlatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoreAboutTheJob {
	

	
	JFrame frame001 = new JFrame("More");
	JPanel panel001 = new JPanel();
	JButton button[] = new JButton[100];
    
	JLabel label001 = new JLabel("الوظيفة");
	JLabel label002 = new JLabel("اسم المشروع");
	JLabel label003 = new JLabel("المرتب");
	JLabel label004 = new JLabel("اللغات المطلوبة");
	JLabel label005 = new JLabel("طلبات اخرى");
	JLabel label006 = new JLabel();
	JLabel label007 = new JLabel();
	JLabel label008 = new JLabel();
	JLabel label009 = new JLabel();
	JLabel label010 = new JLabel();
	JLabel image001 = new JLabel(new ImageIcon("logIn002.png"));
	
	MoreAboutTheJob(final JPanel panelbeforbefor ,final String array[][],final int i,String a , String b , String c , String d , String e ){
		
		 label006 = new JLabel(a);
		 label007 = new JLabel(b);
		 label008 = new JLabel(c);
		 label009 = new JLabel(d);
		 label010 = new JLabel(e);
		
		
		label001.setBounds(400, 70, 100, 30);
		label002.setBounds(400, 170, 100, 30);
		label003.setBounds(400, 270, 100, 30);
		label004.setBounds(400, 370, 100, 30);
		label005.setBounds(400, 470, 100, 30);
		
		label006.setBounds(50, 70, 250, 30);
		label007.setBounds(50, 170, 250, 30);
		label008.setBounds(50, 270, 250, 30);
		label009.setBounds(50, 370, 250, 30);
		label010.setBounds(50, 470, 250, 30);
		
		image001.setBounds(-200, -200, 1000, 1000);

		
		frame001.add(label001);
		frame001.add(label002);
		frame001.add(label003);
		frame001.add(label004);
		frame001.add(label005);
		frame001.add(label006);
		frame001.add(label007);
		frame001.add(label008);
		frame001.add(label009);
		frame001.add(label010);
		frame001.add(image001);
		frame001.setBackground(Color.red);
		
		label001.setForeground(Color.white);
		label002.setForeground(Color.white);
		label003.setForeground(Color.white);
		label004.setForeground(Color.white);
		label005.setForeground(Color.white);
	
		label006.setForeground(Color.yellow);
		label007.setForeground(Color.yellow);                                                                                 
		label008.setForeground(Color.yellow);
		label009.setForeground(Color.yellow);
		label010.setForeground(Color.yellow);
		

		button[i]=new JButton("المزيد");
		button[i].setBounds(110, (80*i)+35, 100, 40);
		

		
		LogIn.buttons[LogIn.accounts.userId][LogIn.buttonsCounter[LogIn.accounts.userId]]=new JButton("المزيد");

		LogIn.buttons[LogIn.accounts.userId][LogIn.buttonsCounter[LogIn.accounts.userId]].addActionListener(new ActionListener(){


			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(true);

				new MoreAboutTheJob(panelbeforbefor,array, i,array[0][i],array[1][i],array[2][i],array[3][i],array[4][i]);

				
			}});
		//LogIn.buttons[LogIn.buttonsCounter[LogIn.accounts.userId]][LogIn.buttonsCounter[LogIn.accounts.userId]].setBounds(500, (LogIn.buttonsCounter[LogIn.accounts.userId]*10)+40, 100, 40);

		
		System.out.println(""+LogIn.buttonsCounter[LogIn.accounts.userId]);

		
		panelbeforbefor.add(button[i]);
			
		LogIn.pipeMain.ButtonStyleMaker(button[i], 13);
		
		
		button[i].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame001.setVisible(true);

				  new MoreAboutTheJob(panelbeforbefor,array, i,array[0][i],array[1][i],array[2][i],array[3][i],array[4][i]);
					
			}}); 
	

	
		

		
		frame001.add(panel001);
		panel001.setLayout(null);
		
		panel001.setBounds(0, 0, 500, 600);
		frame001.setVisible(false);
		frame001.setLayout(null);
		frame001.setSize(500, 600);
		
	}
	
	
	

}
