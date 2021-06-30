package PipePlatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyAccount {
	
JFrame frame001 = new JFrame("اعدادات حسابي");
	
	JPanel panel001 = new JPanel();
	JPanel panel002 = new JPanel();
	
	
	//panel002 componets
	JLabel label001 = new JLabel("الأسم الأول");
	JLabel label002 = new JLabel("أسم العائلة");
	JLabel label003 = new JLabel("الايميل");
	JLabel label004 = new JLabel("رقم هاتف المستخدم");
	JLabel label005 = new JLabel("تاريخ الميلاد");
	JLabel label005a = new JLabel("يوم");
	JLabel label005b = new JLabel("شهر");
	JLabel label005c = new JLabel("سنة");
	JLabel label006 = new JLabel("المسمى الوظيفي");
	JLabel label007 = new JLabel("كلمة المرور");
	JLabel error001 = new JLabel("يجب عليك تعبئة جميع الحقول");
	JLabel error002 = new JLabel("يوجد ايميل بنفس العنوان مسبقا");
	
	JTextField textfield001 = new JTextField(100);
	JTextField textfield002 = new JTextField(100);
	JTextField textfield003 = new JTextField(100);
	JTextField textfield004 = new JTextField(100);
	JTextField textfield005a = new JTextField(30);
	JTextField textfield005b = new JTextField(30);
	JTextField textfield005c = new JTextField(30);
	JTextField textfield006 = new JTextField(100);
	JPasswordField textfield007 = new JPasswordField(100);
	JButton button001 = new JButton("حفظ");
	JLabel image002 = new JLabel(new ImageIcon("logIn005.png")); //panel's background
	JLabel image005 = new JLabel(new ImageIcon("SoftwareEngineering001.png")); //frame background

	MyAccount(){

		
		//adding components tp panel002
		panel002.add(label001);
		panel002.add(label002);
		panel002.add(label003);
		panel002.add(label004);
		panel002.add(label005);
		panel002.add(label005a);
		panel002.add(label005b);
		panel002.add(label005c);
		panel002.add(label006);
		panel002.add(label007);
		panel002.add(textfield001);
		panel002.add(textfield002);
		panel002.add(textfield003);
		panel002.add(textfield004);
		panel002.add(textfield005a);
		panel002.add(textfield005b);
		panel002.add(textfield005c);
		panel002.add(textfield006);
		panel002.add(textfield007);
		panel002.add(button001);
		panel002.add(image002);

		//bounding components of panel002
		label001.setBounds(350, 30, 200, 60);
		label002.setBounds(350, 110, 200, 60);
		label003.setBounds(350, 190, 200, 60);
		label004.setBounds(350, 270, 200, 60);
		label005.setBounds(350, 350, 200, 60);
		label005a.setBounds(217, 375, 200, 60);
		label005b.setBounds(141, 375, 200, 60);
		label005c.setBounds(62, 375, 200, 60);
		label006.setBounds(350, 430, 200, 60);
		label007.setBounds(350, 510, 200, 60);
		textfield001.setBounds(50, 44, 200, 30);
		textfield002.setBounds(50, 123, 200, 30);
		textfield003.setBounds(50, 203, 200, 30);
		textfield004.setBounds(50, 283, 200, 30);
		textfield005a.setBounds(202, 363, 50, 30);
		textfield005b.setBounds(129, 363, 50, 30);
		textfield005c.setBounds(50, 363, 50, 30);
		textfield006.setBounds(50, 443, 200, 30);
		textfield007.setBounds(50, 523, 200, 30);
		error001.setBounds(70, 560, 200, 40);
		error002.setBounds(60, 240, 200, 40);
		button001.setBounds(100, 600, 100, 50);
		image002.setBounds(0, 0, 500, 700);
		//panel002 componentssettings
		label001.setForeground(Color.white);
		label002.setForeground(Color.white);
		label003.setForeground(Color.white);
		label004.setForeground(Color.white);
		label005.setForeground(Color.white);
		label005a.setForeground(Color.white);
		label005b.setForeground(Color.white);
		label005c.setForeground(Color.white);
		label006.setForeground(Color.white);
		label007.setForeground(Color.white);
		
		
		
		
		error001.setForeground(Color.red);
		error002.setForeground(Color.red);
		//changing buttons style 
		button001.setOpaque(false);
		button001.setForeground(Color.yellow);
		button001.setBackground(Color.yellow);
		button001.setBorder(BorderFactory.createLineBorder(Color.white)); 

		//panel002 settings
		panel002.setLayout(null);
		panel002.setBackground(Color.gray);
		panel002.setOpaque(false); //tansperant 
		
		//panel001 settings
				panel001.setLayout(null);
				panel001.setBounds(0, 0, 1300, 800);
				//adding components to panel001
				panel001.add(panel002);
				panel001.add(image005);
				//panel001 components Bounding
				panel002.setBounds(444, 50, 500, 700);
				image005.setBounds(0, 0, 1300, 800);
			
	
				
				textfield001.setText(LogIn.accounts.accountsArray[0][LogIn.accounts.userId]);
				textfield002.setText(LogIn.accounts.accountsArray[1][LogIn.accounts.userId]);
				textfield003.setText(LogIn.accounts.accountsArray[2][LogIn.accounts.userId]);
				textfield004.setText(LogIn.accounts.accountsArray[3][LogIn.accounts.userId]);
				textfield005a.setText(LogIn.accounts.accountsArray[4][LogIn.accounts.userId]);
				textfield005b.setText(LogIn.accounts.accountsArray[5][LogIn.accounts.userId]);
				textfield005c.setText(LogIn.accounts.accountsArray[6][LogIn.accounts.userId]);
				textfield006.setText(LogIn.accounts.accountsArray[7][LogIn.accounts.userId]);
				textfield007.setText(LogIn.accounts.accountsArray[8][LogIn.accounts.userId]);
                                                  
				                                                             
		frame001.add(panel001);

		
		
		
		
		
		frame001.setBounds(0, 0, 1300, 800);
		frame001.setLayout(null);
		//frame001.setVisible(true);
		
		panel002.setOpaque(false);
		
		button001.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(LogIn.accounts.isThereDuplicateInEmails(textfield003.getText())&&(LogIn.accounts.userId==LogIn.accounts.TheIdOfTheEmail(textfield003.getText()))) {
				LogIn.accounts.accountsArray[0][LogIn.accounts.userId]=textfield001.getText();
				LogIn.accounts.accountsArray[1][LogIn.accounts.userId]=textfield002.getText();
				LogIn.accounts.accountsArray[2][LogIn.accounts.userId]=textfield003.getText();
				LogIn.accounts.accountsArray[3][LogIn.accounts.userId]=textfield004.getText();
				LogIn.accounts.accountsArray[4][LogIn.accounts.userId]=textfield005a.getText();
				LogIn.accounts.accountsArray[5][LogIn.accounts.userId]=textfield005b.getText();
				LogIn.accounts.accountsArray[6][LogIn.accounts.userId]=textfield005c.getText();
				LogIn.accounts.accountsArray[7][LogIn.accounts.userId]=textfield006.getText();
				LogIn.accounts.accountsArray[8][LogIn.accounts.userId]=textfield007.getText();
				
				textfield001.setText(LogIn.accounts.accountsArray[0][LogIn.accounts.userId]);
				textfield002.setText(LogIn.accounts.accountsArray[1][LogIn.accounts.userId]);
				textfield003.setText(LogIn.accounts.accountsArray[2][LogIn.accounts.userId]);
				textfield004.setText(LogIn.accounts.accountsArray[3][LogIn.accounts.userId]);
				textfield005a.setText(LogIn.accounts.accountsArray[4][LogIn.accounts.userId]);
				textfield005b.setText(LogIn.accounts.accountsArray[5][LogIn.accounts.userId]);
				textfield005c.setText(LogIn.accounts.accountsArray[6][LogIn.accounts.userId]);
				textfield006.setText(LogIn.accounts.accountsArray[7][LogIn.accounts.userId]);
				textfield007.setText(LogIn.accounts.accountsArray[8][LogIn.accounts.userId]);
				JOptionPane.showMessageDialog(null, "تم");

				}
				
				else if(LogIn.accounts.isThereDuplicateInEmails(textfield003.getText())==false) {
					LogIn.accounts.accountsArray[0][LogIn.accounts.userId]=textfield001.getText();
					LogIn.accounts.accountsArray[1][LogIn.accounts.userId]=textfield002.getText();
					LogIn.accounts.accountsArray[2][LogIn.accounts.userId]=textfield003.getText();
					LogIn.accounts.accountsArray[3][LogIn.accounts.userId]=textfield004.getText();
					LogIn.accounts.accountsArray[4][LogIn.accounts.userId]=textfield005a.getText();
					LogIn.accounts.accountsArray[5][LogIn.accounts.userId]=textfield005b.getText();
					LogIn.accounts.accountsArray[6][LogIn.accounts.userId]=textfield005c.getText();
					LogIn.accounts.accountsArray[7][LogIn.accounts.userId]=textfield006.getText();
					LogIn.accounts.accountsArray[8][LogIn.accounts.userId]=textfield007.getText();
					
					textfield001.setText(LogIn.accounts.accountsArray[0][LogIn.accounts.userId]);
					textfield002.setText(LogIn.accounts.accountsArray[1][LogIn.accounts.userId]);
					textfield003.setText(LogIn.accounts.accountsArray[2][LogIn.accounts.userId]);
					textfield004.setText(LogIn.accounts.accountsArray[3][LogIn.accounts.userId]);
					textfield005a.setText(LogIn.accounts.accountsArray[4][LogIn.accounts.userId]);
					textfield005b.setText(LogIn.accounts.accountsArray[5][LogIn.accounts.userId]);
					textfield005c.setText(LogIn.accounts.accountsArray[6][LogIn.accounts.userId]);
					textfield006.setText(LogIn.accounts.accountsArray[7][LogIn.accounts.userId]);
					textfield007.setText(LogIn.accounts.accountsArray[8][LogIn.accounts.userId]);
					JOptionPane.showMessageDialog(null, "تم");

					}
				else {JOptionPane.showMessageDialog(null," هذا الايميل مستخدم من قبل ");}
				
				LogIn.cv= new CV();
				
				LogIn.label003 = new JLabel("اهلا وسهلا "+LogIn.accounts.accountsArray[0][LogIn.accounts.userId]+" "+LogIn.accounts.accountsArray[1][LogIn.accounts.userId]);
					
				
			}});
		
		
	}
	

}
