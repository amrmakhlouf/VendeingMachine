/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login {
    public   JFrame frame,frame2;
	public JLabel Ba,tittle,Ba2,t,v;
	public JButton GetStarted,E,login1,Registration,Login;
        public static JPasswordField pass;
        public static JTextField   username; 
        int c=0;
	 String userName = "rjoub";
    String password = "133";
	Icon B,S,B2,login,e,Background1;
	public static JFrame r;
    
    Login(){
        Background1= new ImageIcon("backg1.jpg");
         e= new ImageIcon("ll.jpg");
            t = new JLabel(e);
		B =new ImageIcon("back9.jpg");
                		B2=new ImageIcon("Back44.jpg");
                                login= new ImageIcon("login.png");
v = new JLabel(Background1);
                 S = new ImageIcon("tt.png");
		Ba = new JLabel(B);
                		Ba2 = new JLabel(B2);
                                login1=new JButton(login);
                                Registration= new JButton();
                                Login= new JButton();
		GetStarted= new JButton(S);
	E = new JButton("Employee");
		frame= new JFrame(" first");
		r= new JFrame("Welcome");
		
                		frame2= new JFrame(" loGIN");

		
                         pass =new JPasswordField(30);
                                  username = new JTextField(30);
  pass.setText("133");
     username.setText("rjoub");

                		GetStarted.setBorderPainted(false);
		GetStarted.setBorder(null);
GetStarted.setFocusPainted(false);
		GetStarted.setContentAreaFilled(false);
		              		login1.setBorderPainted(false);
		login1.setBorder(null);
login1.setFocusPainted(false);
		login1.setContentAreaFilled(false);
		
		GetStarted.setBounds(600,300,150,150);
                login1.setBounds(950,210,200,200);
		E.setBounds(1000,300,200,200);
                username.setBounds(600, 270, 300, 30);
                 pass.setBounds(600, 350, 300, 30);
		Registration.setBounds(400,350,200,50);
		Login.setBounds(850,350,200,50);
		frame= new JFrame(" first");
      
		login1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                
                if(username.getText().equalsIgnoreCase(userName)){
                
                    if(pass.getText().equals(password)){
                    
                        frame2.setVisible(false);
                        new Homee();
                        
                    
                    }
                    
                    else{JOptionPane.showMessageDialog(null, "Please Try again");}
                }
                                    else{JOptionPane.showMessageDialog(null, "Please Try again");}

            }
        });

Login.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                
                        frame2.setVisible(true);

            }
        });
                frame2.add(t);
		frame.add(GetStarted);
		frame.add(Ba);
                frame2.add(login1);
                frame2.add(username);
                frame2.add(pass);
                frame2.add(Ba2);
                
                
		frame.setVisible(false);
              frame2.setVisible(false);
		  frame.setSize(2000,1000);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
           
                    frame2.setSize(1300,800);
	       frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	       
     r.add(Registration);
     r.add(Login);
        r.add(v);
	       r.setVisible(true);
	       
           r.setSize(1300,800);

    }
    
    public static void main(String[] args) {
		
		new  Login();
	
		
	}
    
}
