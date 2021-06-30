package PipePlatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CV {
	
	String programmingLanguages [][] = new String [100] [100] ;
	String cv [][] = new String [100] [100] ;
	JTextField textfield []= new JTextField[100];
	JLabel lable001 = new JLabel("الاسم");
	JLabel lable002 = new JLabel("العمر");
	JLabel lable003 = new JLabel("المجال");
	JLabel lable004 = new JLabel("عدد سنوات الخبرة");
	JLabel lable005 = new JLabel("اللغات");
	JLabel lable006 = new JLabel("الاسم");
	JLabel lable007 = new JLabel("الاسم");
	JLabel image001 = new JLabel(new ImageIcon("SoftwareEngineering001.png"));
	JLabel image002 = new JLabel(new ImageIcon("logIn005.png"));

	JPanel panel001 = new JPanel();
	JPanel panel002 = new JPanel();
	JPanel panel003 = new JPanel();
	JPanel panel004 = new JPanel();
	JButton button002 = new JButton("حفظ");
	JButton button000 = new JButton("USELESS_BUTTON");//This is usles button just to erase selection ont other buttons

	JFrame frame001 = new JFrame(LogIn.accounts.accountsArray[2][LogIn.accounts.userId]+" " +LogIn.accounts.accountsArray[3][LogIn.accounts.userId]);
	
	CV(){
		
		
		for(int i = 1  ; i < 7 ; i++) {
			
			
			textfield[0]= new JTextField(LogIn.accounts.accountsArray[0][LogIn.accounts.userId]+" " +LogIn.accounts.accountsArray[1][LogIn.accounts.userId]);
			textfield[0].setEditable(false);
			textfield[i]=new JTextField(LogIn.myInformations.array[i][LogIn.accounts.userId]);
			textfield[0].setBounds(30, 50, 150, 30);
			panel002.add(textfield[0]);
			textfield[i].setBounds(30, 50*(i+1), 150, 30);
			panel002.add(textfield[i]);
		}
		
		button000.setBounds(-1000, -100, 200, 50);
		panel001.add(button000);
		panel001.setBounds(0, 0, 1400, 800);
		panel001.add(panel002);
		panel001.setLayout(null);
		frame001.add(panel001);
		
		panel002.setLayout(null);
		panel002.setBounds(800, 60, 400, 500);
		
		lable001.setBounds(240, 50, 200, 30);
		lable002.setBounds(240, 100,200, 30);
		lable003.setBounds(240, 150,200, 30);
		lable004.setBounds(240, 200,200, 30);
		lable005.setBounds(240, 250,200, 30);
		lable006.setBounds(240, 300,200, 30);
		lable007.setBounds(240, 350,200, 30);
		
		lable001.setForeground(Color.GREEN);
		lable002.setForeground(Color.GREEN);
		lable003.setForeground(Color.GREEN);
		lable004.setForeground(Color.GREEN);
		lable005.setForeground(Color.GREEN);
		lable006.setForeground(Color.GREEN);
		lable007.setForeground(Color.GREEN);
		
		
		image002.setBounds(-10, -10, 1300, 800);
		image001.setBounds(0, 0, 1300, 800);
		
		
		panel002.setBackground(Color.red);

		button002.setBounds(155, 432, 100, 40);
		PipeMain.ButtonStyleMaker(button002, 13);

		
		
		panel002.add(lable001);
		panel002.add(lable002);
		panel002.add(lable003);
		panel002.add(lable004);
		panel002.add(lable005);
		panel002.add(lable006);
		panel002.add(lable007);
		panel002.add(button002);
		panel002.add(image002);
		
		
		
		panel001.add(image001);
		
		frame001.setBounds(0, 0, 1300, 800);
		frame001.setLayout(null);
		//frame001.setVisible(true);
		
		panel002.setOpaque(false);
		
		button002.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				LogIn.myInformations.insertTheCV(textfield);
				LogIn.myInformations.outputTheCV(textfield); 
				JOptionPane.showMessageDialog(null, "تم");

				
			}});
		
		
	}

}
