
package project;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class LogAdmin  {
    
    
    public JLabel background , username ,password  ,p,CAT ,CAT2 ,LOCK ,CE; 
    public Icon back  , cat ,cat2 , lock  ,ce ,left; 
    public JPasswordField pass;
    public Font trbi ,tr ;
    public JPanel backPanel ;
    public JTextField   userfield; 
    public JButton b1 , b2,e ,bleft; ; 
    public int count =0 ; 
    public int ss =0;
    public static JFrame c ;
    
   
    public LogAdmin() {
     c = new JFrame();
        c.setLayout(null);
        
        back = new ImageIcon("img/login.jpg");
     ce = new ImageIcon("img/are.png");
        
         background = new JLabel (back) ;
         
         e = new JButton("Forgot your password ?");
         e.setContentAreaFilled(false);
		
		e.setBorderPainted(false);
		e.setBorder(null);
                e.setFocusPainted(false);
  left = new ImageIcon("img/left.png");
  bleft = new JButton(left);
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

b1 = new JButton(); 
b2 = new JButton(); 

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
      
         trbi = new Font("serif", Font.BOLD+Font.ITALIC, 32 );
         tr = new Font("serif", Font.BOLD+Font.ITALIC, 18);
         background.setBounds(0,0,1400,800 );
         backPanel .setBounds(460 ,20 ,500 ,650);
         backPanel.setBackground(new Color(0,102,204,200));
             c.add(e);
        
         c.add(backPanel);
         
         
        
         backPanel.setLayout(null);
         
         username.setBounds(100,220,300,30);
       
                    e.setBounds(550,400,300,30);
                
         username.setFont(trbi);
         password.setBounds(100,310,300,30);
         password.setFont(trbi);
         
         userfield.setBounds(100, 270, 300, 30);
          b2.setBounds(100, 270, 300, 30);
         
            userfield.setFont(tr);
            username.setForeground(new Color(255,0,0,240));
                      password.setForeground(new Color(255,0,0,240));
           b1 .setBounds(100, 350, 300, 30);  
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
    
         
         mutaz zz = new mutaz(); 
         pass.addActionListener(zz);
          userfield.addActionListener(zz);
         b1.addActionListener(zz);
         b2.addActionListener(zz);
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
                 bleft.setFocusPainted(false);

        c.add(background);
        c.setSize(1400,800);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    class mutaz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()==pass) {
            
            if(userfield.getText().equals("") || pass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all information !");
        }
else {
            
                 
                if(userfield.getText().equals("admin")){
                                                  
                        if(pass.getText().equals("admin")){
                    new ADD();
                   LogAdmin.c.setVisible(false);

                        }
               else
             JOptionPane.showMessageDialog(null,"sorry ,Password is incorrect");                        
                                              }
       
                else 
                     JOptionPane.showMessageDialog(null," Sorry , You are not Admin!");
        
                 }
        }
        if(ae.getSource()==userfield) {
            
            if(userfield.getText().equals("") || pass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all information !");
        }
else {
            
                 
                if(userfield.getText().equals("admin")){
                                                  
                        if(pass.getText().equals("admin")){
                    new ADD();
                   LogAdmin.c.setVisible(false);

                        }
               else
             JOptionPane.showMessageDialog(null,"sorry ,Password is incorrect");                        
                                              }
       
                else 
                     JOptionPane.showMessageDialog(null," Sorry , You are not Admin!");
        
                 }
           
          
        }
           
            
            
        
        
        if(ae.getSource()==bleft){
            
           
            c.setVisible(false);
          
      new whatever();
        }}
            
            
           }
        
    }
    
    
    
