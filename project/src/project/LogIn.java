
package project;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class LogIn  {
    
    
    public JLabel background , username ,password  ,p,CAT ,CAT2 ,LOCK ,CE; 
    public Icon back  , cat ,cat2 , lock  ,ce ,left; 
    public static JPasswordField pass;
    public Font trbi ,tr ;
    public JPanel backPanel ;
    public static JTextField   userfield; 
    public JButton e ,bleft; ; 
    public int count =0 ; 
    public int ss =0;
    public static JFrame c =new JFrame();
    public String goals ; 
    
   
    public LogIn() {
     
        c.setLayout(null);
        
        back = new ImageIcon("img/6.jpg");
     ce = new ImageIcon("img/ce.png");
        
         background = new JLabel (back) ;
         
         
         
         
         e = new JButton("Forgot your password ?");
         e.setContentAreaFilled(false);
		
		e.setBorderPainted(false);
		e.setBorder(null);
                e.setFocusPainted(false);
                
                
                  e.setBackground(new Color(0,102,204,200));
                
                    e.setBounds(550,400,300,30);
                
                
                
  left = new ImageIcon("img/left.png");
  bleft = new JButton(left);
           bleft.setFocusPainted(false);

  c.add(bleft);
    bleft.setBounds(10, -10, 200, 200);
  	bleft.setBorderPainted(false);
		bleft.setBorder(null);

		bleft.setContentAreaFilled(false);
         p = new JLabel("Enter your Password");
         backPanel = new JPanel();
         username = new JLabel("UserName: ");
         password = new JLabel("Password: ");
            cat = new ImageIcon("img/1.png");
                        cat2 = new ImageIcon("img/2.png");
                                                lock= new ImageIcon("img/lock.png");
 

CE = new JLabel(ce);

         CAT = new JLabel(cat);
                  CAT2 = new JLabel(cat2);
                           LOCK = new JLabel(lock);
                           CAT.setOpaque(false);
                            CAT2.setOpaque(false);
                            LOCK.setOpaque(false);
 CAT.setVisible(false);
CAT2.setVisible(false);

         pass =new JPasswordField(30);
         userfield = new JTextField(30);
      pass.setText("");
      userfield.setText("");
         trbi = new Font("serif", Font.BOLD+Font.ITALIC, 32 );
         tr = new Font("serif", Font.BOLD+Font.ITALIC, 18);
         background.setBounds(0,0,1400,800 );
         backPanel .setBounds(460 ,20 ,500 ,650);
         backPanel.setBackground(new Color(0,102,204,200));
          
         
         
         c.add(e);
         c.add(backPanel);
         
         
        
         backPanel.setLayout(null);
         
         username.setBounds(100,220,300,30);
     
         
         username.setFont(trbi);
         password.setBounds(100,310,300,30);
         password.setFont(trbi);
         
         userfield.setBounds(100, 270, 300, 30);
        
         
            userfield.setFont(tr);
            username.setForeground(new Color(255,0,0,240));
                      password.setForeground(new Color(255,0,0,240));
         pass .setBounds(100, 350, 300, 30);
      CE.setBounds(75,-80,400,400);
         
            pass.setFont(tr);
      pass.setEchoChar('*');
       
      CAT.setBounds(150,400,200,200);
            CAT2.setBounds(150,400,200,200);

                  LOCK.setBounds(150,400,200,200);

       backPanel.add(CAT);
       backPanel.add(CAT2);
       backPanel.add(LOCK);
         backPanel.add(password);
         backPanel.add(username);
         backPanel.add(userfield);
         backPanel.add(pass );

         backPanel.add(CE);
    
        
         backPanel.setBackground(new Color(0,102,204,200));
      
        backPanel.setBackground(new Color(0,102,204,200));
         mutaz zz = new mutaz(); 
         pass.addActionListener(zz);
          userfield.addActionListener(zz);

         bleft.addActionListener(zz);

         
  
             /*
            if(pass.is){
                CAT2.setVisible(false);
                CAT.setVisible(false);
                LOCK.setVisible(false);
            }
            
             else if(userfield.isCursorSet()){
                CAT.setVisible(true);
                CAT2.setVisible(false);
                LOCK.setVisible(false);
            }
            
              else 
              {
                     CAT.setVisible(false);
                CAT2.setVisible(false);
                LOCK.setVisible(true);
                  
              }
        */
        
        c.add(background);
        c.setSize(1400,800);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    class mutaz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
 String g;
 String pas = "dsdsdsfdsfsfwrefqedfvdsvdsdsfdsfdsfdsgfskdfjs";
 
    if(ae.getSource()==userfield) {
        
        if(userfield.getText().equals("") ||pass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all information !");
        }
            
        else {
            try {
                File f = new File("files/users.txt");
                BufferedReader s = new BufferedReader (new FileReader(f));
                 while((g=s.readLine() )!=null){
                     
                    if(userfield.getText().equals(g) || userfield.getText().equals("admin")  ){
                        count=1;
                        if(userfield.getText().equals("admin")){
                             pas="admin";
                        break;
                        }
                        pas=s.readLine();
                        break;
                    }
                     
             }
                 
                 if(count==1){
                                           
                                              if(pass.getText().equals(pas)){
                                     

                                                  
                                                  if(userfield.getText().equals("admin")){
                                                      
                                                       new map();
                                                  c.setVisible(false);
                                                  }
                                                  else {
                                                   
                                                  new office101();
                                                  c.setVisible(false);
                                                  }
                                              }
                                              else
                                                                                                   JOptionPane.showMessageDialog(null,"sorry ,Password is incorrect");   
 
  count =0 ;
                 }
                 else if(count==0)
                     JOptionPane.showMessageDialog(null," Sorry , User Nmae is not exist !");
        
            } 
            
            catch (FileNotFoundException ex) {
            } catch (IOException ex) {
         Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
     }
           
            
            
        }}
        if(ae.getSource()==pass) {
            if(userfield.getText().equals("") || pass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all information !");
        }
            
            else {
            try {
                File f = new File("files/users.txt");
                BufferedReader s = new BufferedReader (new FileReader(f));
                 while((g=s.readLine() )!=null){
                     
                     if(userfield.getText().equals(g) || userfield.getText().equals("admin")  ){
                        count=1;
                        if(userfield.getText().equals("admin")){
                             pas="admin";
                        break;
                        }
                        pas=s.readLine();
                        break;
                    }
                     
             }
                 
                 if(count==1){
                                           
                                              if(pass.getText().equals(pas)){
                                                  
                                           

                                                  
                                                     if(userfield.getText().equals("admin")){
                                                      
                                                       new map();
                                                  c.setVisible(false);
                                                  }
                                                  else {
                                                   
                                                  new office101();
                                                  c.setVisible(false);
                                                  pass.setText("");
                                                   
                                                  }
                                              }
                                              else
                                                                                                   JOptionPane.showMessageDialog(null,"sorry ,Password is incorrect");   
 
  count =0 ;
                 }
                 else if(count==0)
                     JOptionPane.showMessageDialog(null," Sorry , User Nmae is not exist !");
        
            } 
            
            catch (FileNotFoundException ex) {
            } catch (IOException ex) {
         Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
     }
           
            
            
        }}
        
        if(ae.getSource()==bleft){
            
           
           c.dispose();
            c.setVisible(false);
          
           new whatever();
        }
            
            
           }
        
    }
    
    
    
}
