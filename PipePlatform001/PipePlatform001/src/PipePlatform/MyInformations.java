package PipePlatform;


import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyInformations {
	
	static String array[][] = new String [100] [10];
	static String array2[][] = new String [100] [10];

	
	
	MyInformations(){
	}
		
		

	
		

public static void insertTheCV(JTextField[] textfield) {
		
		for(int i = 1 ; i < 7 ; i++) {
			array[0][LogIn.accounts.userId]=LogIn.accounts.accountsArray[2][LogIn.accounts.userId]+" "+LogIn.accounts.accountsArray[3][LogIn.accounts.userId];
			array[i][LogIn.accounts.userId]=textfield[i].getText();
			
		}
		
		
	} 
public static void outputTheCV(JTextField[] textfield) {
	
	for(int i = 1 ; i < 7 ; i++) {
		textfield[0].setText(array[0][LogIn.accounts.userId]);

		textfield[i].setText(array[i][LogIn.accounts.userId]);
		
	}
	
	
} 

public static void insertTheAccountInfo(JTextField[] textfield) {
	
	for(int i = 1 ; i < 7 ; i++) {
		array2[0][LogIn.accounts.userId]=LogIn.accounts.accountsArray[2][LogIn.accounts.userId]+" "+LogIn.accounts.accountsArray[3][LogIn.accounts.userId];
		array2[i][LogIn.accounts.userId]=textfield[i].getText();
		
	}
	
	
} 
public static void outputTheAccountInfo(JTextField[] textfield) {

for(int i = 1 ; i < 7 ; i++) {
	textfield[0].setText(array2[0][LogIn.accounts.userId]);

	textfield[i].setText(array2[i][LogIn.accounts.userId]);
	
}


} 



void insert(JTextField textfield001, JTextField textfield002, JTextField textfield003, JTextField textfield004, JTextField textfield005a, JTextField textfield005b, JTextField textfield005c, JTextField textfield006, JPasswordField textfield007) {
	

	textfield001.setText(LogIn.accounts.accountsArray[0][LogIn.accounts.userId]);
	textfield002.setText(LogIn.accounts.accountsArray[1][LogIn.accounts.userId]);
	textfield003.setText(LogIn.accounts.accountsArray[2][LogIn.accounts.userId]);
	textfield004.setText(LogIn.accounts.accountsArray[3][LogIn.accounts.userId]);
	textfield005a.setText(LogIn.accounts.accountsArray[4][LogIn.accounts.userId]);
	textfield005b.setText(LogIn.accounts.accountsArray[5][LogIn.accounts.userId]);
	textfield005c.setText(LogIn.accounts.accountsArray[6][LogIn.accounts.userId]);
	textfield006.setText(LogIn.accounts.accountsArray[7][LogIn.accounts.userId]);
	textfield007.setText(LogIn.accounts.accountsArray[8][LogIn.accounts.userId]);
	         
	
}
void output(JTextField textfield001, JTextField textfield002, JTextField textfield003, JTextField textfield004, JTextField textfield005a, JTextField textfield005b, JTextField textfield005c, JTextField textfield006, JPasswordField textfield007) {
	
	LogIn.accounts.accountsArray[0][LogIn.accounts.userId]=textfield001.getText();
	LogIn.accounts.accountsArray[1][LogIn.accounts.userId]=textfield002.getText();
	LogIn.accounts.accountsArray[2][LogIn.accounts.userId]=textfield003.getText();
	LogIn.accounts.accountsArray[3][LogIn.accounts.userId]=textfield004.getText();
	LogIn.accounts.accountsArray[4][LogIn.accounts.userId]=textfield005a.getText();
	LogIn.accounts.accountsArray[5][LogIn.accounts.userId]=textfield005b.getText();
	LogIn.accounts.accountsArray[6][LogIn.accounts.userId]=textfield005c.getText();
	LogIn.accounts.accountsArray[7][LogIn.accounts.userId]=textfield006.getText();
	LogIn.accounts.accountsArray[8][LogIn.accounts.userId]=textfield007.getText();
	
}

}
