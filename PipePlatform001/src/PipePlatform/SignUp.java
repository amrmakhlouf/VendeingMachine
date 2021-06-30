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

public class SignUp {
	JFrame frame001 = new JFrame("تسجيل الاشتراك");
	
	JPanel panel001 = new JPanel();
	JPanel panel002 = new JPanel();
	JPanel panel003 = new JPanel();
	
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
	JButton button001 = new JButton("تسجيل");
	JLabel image002 = new JLabel(new ImageIcon("logIn002.png")); //panel's background
	
	//panel003 components
	JLabel label008 = new JLabel(" من نحن ؟");
	JLabel label009 = new JLabel("نحن بايب  بلاتفورم عدي زغب ومعتز زهيري ");
	JLabel label010 = new JLabel("قمنا ببرمجة هذا التطبيق باستخدام لغة جافا");
	JLabel label011 = new JLabel(" والهدف منه هو مساعدة المطورين والمبرمجين والمهندسين من التواصل مع بعضهم البعض ");
	JLabel label012 = new JLabel("وايضا للعثور على مهام ووظائف حيث يتيح هذا البرنامج السهولة الكبيرة للتواصل بينهم");
	JLabel image003 = new JLabel(new ImageIcon("logIn002.png")); //panel's background
	JLabel image004 = new JLabel(new ImageIcon("logIn003.png")); //panel's logo
	
	JLabel image005 = new JLabel(new ImageIcon("signUp001.jpg")); //frame background

	
	
	SignUp(){
		
		
		
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
		
		
		//panel003 settings
		panel003.setLayout(null);
		panel003.setBackground(Color.gray);
		panel003.setOpaque(false); //tansperant 
		//adding components to panel003
		panel003.add(label008);
		panel003.add(label009);
		panel003.add(label010);
		panel003.add(label011);
		panel003.add(label012);
		panel003.add(image004);	
		panel003.add(image003);
		//bounding components of panel003
		label008.setBounds(300, 40, 400, 50);
		label009.setBounds(190, 300, 300, 50);
		label010.setBounds(210, 350, 500, 50);
		label011.setBounds(75, 400, 700, 50);
		label012.setBounds(90, 450, 700, 50);
		image003.setBounds(0, 0, 650, 700);
		image004.setBounds(180, 50, 300, 300);
		//panel003 componentssettings
		label008.setForeground(Color.white);
		label009.setForeground(Color.white);
		label010.setForeground(Color.white);
		label011.setForeground(Color.white);
		label012.setForeground(Color.white);

		//panel001 settings
		panel001.setLayout(null);
		panel001.setBounds(0, 0, 1300, 800);
		//adding components to panel001
		panel001.add(panel002);
		panel001.add(panel003);
		panel001.add(image005);
		//panel001 components Bounding
		panel002.setBounds(750, 50, 500, 700);
		panel003.setBounds(50, 50, 650, 700);
		image005.setBounds(0, 0, 1300, 800);
	
	
		
		
		frame001.add(panel001);
		
		button001.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				if(textfield001.getText().equals("")||textfield002.getText().equals("")||textfield003.getText().equals("")||textfield004.getText().equals("")||textfield005a.getText().equals("")||textfield005b.getText().equals("")||textfield005c.getText().equals("")||textfield006.getText().equals("")||textfield007.getText().equals("")){
					panel002.add(error001);
					panel002.add(image002);
					panel002.revalidate();
					panel002.repaint();

					}
	
				else if(LogIn.accounts.isThereDuplicateInEmails(textfield003.getText())){
					panel002.add(error002);
					panel002.add(image002);
					panel002.revalidate();
					panel002.repaint();

					}
		
			else{
				LogIn.accounts.addToAccountsArray( textfield001.getText(),textfield002.getText(),textfield003.getText(),textfield004.getText(),textfield005a.getText(),textfield005b.getText(),textfield005c.getText(),textfield006.getText(),textfield007.getText());
				frame001.setVisible(false);
				new LogIn();
				JOptionPane.showMessageDialog(null, "تهانينا لقد قمت بانشاء حساب لك الان");
				LogIn.textfield001.setText(textfield003.getText());
			}

				
			}});
		
		frame001.setSize(1300, 800);
		frame001.setVisible(true);
		frame001.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame001.setLayout(null);
		
	}
	
	

}
