package PipePlatform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn {
	
	//The frame of this class
	JFrame frame001 = new JFrame("PipeChatting");
	
	// works exactly like frame001 (just alter holder)	
	JPanel panel001 = new JPanel(); 
	
	 // the log in panel which goes in the center of panel001
	JPanel panel002 = new JPanel();
	
	// the whole frame001 background	
	JLabel image001 = new JLabel(new ImageIcon("logIn001.jpg")); 
	// university's logo which goes in the left lower corner
	JLabel image004 = new JLabel(new ImageIcon("logIn004.png")); 

	
	//Log in Fields and labels like username & password and the login & signup buttons
	static JTextField textfield001  = new JTextField(200);
	JPasswordField textfield002  = new JPasswordField(200);
	JLabel label001 = new JLabel("اسم المستخدم");
	JLabel label002 = new JLabel("كلمة المرور");
	JButton button001 = new JButton("دخول");
	JButton button002 = new JButton("الا تمتلك حسابا؟ اضغظ هنا للتسجيل");
	JLabel image002 = new JLabel(new ImageIcon("logIn002.png")); //panel's background
	JLabel image003 = new JLabel(new ImageIcon("logIn003.png")); //panel's logo
	
	JLabel error001 = new JLabel("خطأ في اسم المستخدم أو كلمة المرور");
	
	static JLabel label003 ;

	static Accounts accounts = new Accounts();
	static PipeMain pipeMain = new PipeMain();
	static CV cv = new CV();
	static MyAccount myAccount = new MyAccount();
	//to see what user deployed jobs 
	static JButton buttons [][]= new JButton[100][100];
	static int buttonsCounter[] = new int[100];
	
	static MyInformations myInformations = new MyInformations();
	//static CurrentAccount currentAccount = new CurrentAccount();
 
	LogIn(){
		
		
		
		
		
		
		//adding components to panel002
		panel002.add(textfield001);
		panel002.add(textfield002);
		panel002.add(label001);
		panel002.add(label002);
		panel002.add(button001);
		panel002.add(button002);
		panel002.add(image003);	
		panel002.add(image002);
	
		//panel002 components Bounding
		textfield001.setBounds(30, 300, 260, 40);
		textfield002.setBounds(30, 370, 260, 40);
		label001.setBounds(300, 300, 100, 40);
		label002.setBounds(300, 370, 100, 40);
		error001.setBounds(50, 410, 300, 40);
		button001.setBounds(130, 460, 100, 40);
		button002.setBounds(35, 560, 300, 40);
		image002.setBounds(0, 0, 400, 600);
		image003.setBounds(37, 0, 300, 300);
		//changing labels & button color
		label001.setForeground(Color.white);
		label002.setForeground(Color.white);
		error001.setForeground(Color.red);
		//changing buttons style 
		button001.setOpaque(false);
		button001.setForeground(Color.yellow);
		button001.setBackground(Color.yellow);
		button001.setBorder(BorderFactory.createLineBorder(Color.white)); 
		button002.setOpaque(false);//
		button002.setForeground(Color.white);
		button002.setBackground(Color.white);		
		button002.setBorderPainted(false); 

		//panel002 settings
		panel002.setLayout(null);
		panel002.setOpaque(false); //tansperant 

		
		
		
		
		//adding components to panel001
		panel001.add(panel002);
		//panel001.add(image004); our uni logo
		panel001.add(image001);	

		//panel001 components Bounding
		image001.setBounds(0, 0, 1300, 800);
		image004.setBounds(0, 630, 130, 130);
		panel002.setBounds(460, 50, 400, 600);		
		//panel001 settings
		panel001.setLayout(null);
		panel001.setBounds(0, 0, 1300, 800);
		//frame001 and panel001 relations
		frame001.add(panel001);
		
		
		
		//log in button
		button001.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				
				if(accounts.getUserPassword(textfield001.getText(), textfield002.getText())){
					pipeMain.pipeMainPanel.littlePanel.removeAll();
					pipeMain.pipeMainPanel.panel001.panel001.removeAll();
					cv = new CV();
					myAccount = new MyAccount();

					///////////*************MyAccount***************\\\\\\\\\\\\\\\\\\\
					frame001.setVisible(false);
					label003 = new JLabel("اهلا وسهلا "+LogIn.accounts.accountsArray[0][LogIn.accounts.userId]+" "+LogIn.accounts.accountsArray[1][LogIn.accounts.userId]);
					label003.setBounds(20, 30, 400, 30);
					label003.setForeground(Color.green);
					pipeMain.pipeMainPanel.addHelloUser(pipeMain.panel001);
					pipeMain.panel001.revalidate();
					pipeMain.panel001.repaint();
					pipeMain.setVisibel(true);

				}
				else{
					//textfield001.setText(null);
					textfield002.setText(null);
					panel002.add(error001);
					panel002.add(image002);
					panel002.revalidate();
					panel002.repaint();
				}
				
			}});
		
		//signup a new account button
		button002.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				frame001.setVisible(false);
				new SignUp();
				
			}});
		
		
		
		//all frame001 main settings
		frame001.setSize(1300, 800);
		frame001.setVisible(true);
		frame001.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame001.setLayout(null);
	}
}
