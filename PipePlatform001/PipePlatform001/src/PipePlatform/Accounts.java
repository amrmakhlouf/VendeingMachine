package PipePlatform;

import javax.swing.JButton;

public class Accounts{
	
	static String accountsArray[][] = new String [10][100];
	
					int userId = 0;


	public Accounts(){




		
		
		// Admins Acounts	
		accountsArray[0][0]="عدي";
		accountsArray[1][0]="زغب";
		accountsArray[2][0]="udayzaghab@gmail.com";
		accountsArray[3][0]="0592859341";
		accountsArray[4][0]="6";
		accountsArray[5][0]="11";
		accountsArray[6][0]="1996";
		accountsArray[7][0]="برمجة";
		accountsArray[8][0]="uday123";
		
		
		LogIn.myInformations.array[0][0]="عدي زغب";
		LogIn.myInformations.array[1][0]="21";
		LogIn.myInformations.array[2][0]="هندسة حاسوب";
		LogIn.myInformations.array[3][0]="0";
		LogIn.myInformations.array[4][0]="سكيول جافا سي اتشتيمل";
		LogIn.myInformations.array[5][0]="";
	}
	
	
	
	// The purpose of this method is to add a new account to the database
	public  void addToAccountsArray(String firstName,String SecondName,String email,String cellNumber,String date1,String date2,String date3,String Domain,String password){
		for(int i = 0 ; i < 100 ; i ++){
		
			if( accountsArray[0][i]==null){
				accountsArray[0][i]=firstName;
				accountsArray[1][i]=SecondName;
				accountsArray[2][i]=email;
				accountsArray[3][i]=cellNumber;
				accountsArray[4][i]=date1;
				accountsArray[5][i]=date2;
				accountsArray[6][i]=date3;
				accountsArray[7][i]=Domain;
				accountsArray[8][i]=password;
		
				
	
				
				break;}
				
			}}
			
	
	//this method will compare between the enterd password with the stored password then return boolean
	boolean getUserPassword(String username,String password){
		
	boolean temp=false;
	
	for(int i = 0 ;i<100;i++ ){
		
		if(accountsArray[0][i]!=null){
			if(accountsArray[2][i].equalsIgnoreCase(username)&&accountsArray[8][i].equals(password)){
		
				userId=i;
				
				temp=true;
				break;
				}
			}
		
		}
	
	return temp;
	}
	
	//This methods tells if there is an allready a similler existing email or not
	public boolean isThereDuplicateInEmails(String email){
		boolean what=false;
		for(int i = 0 ; i < 100 ; i++){
			if(email.equalsIgnoreCase(accountsArray[2][i])){
				what=true;
				break;
			}
			else what= false;
		}
		 return what;
	}


 static int TheIdOfTheEmail(String emaila) {
	 int z = -1;
	 for(int i = 0 ; i < 100 ; i++) {
			if(emaila.equalsIgnoreCase(accountsArray[2][i])){
				z=i;
			}
	 }			return z;

 }

	
}
		
	
	

