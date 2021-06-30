/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

 
public class room  {
 
    public Icon back ,ad ,left ,xxx[]; 
    public JLabel BACK  , fname,lname,REG,users[] ,state[]; 
    public JTextField  jBACK  ;
    public JPanel panel ; 
    public Icon reg ; 
    public Font tr,tc;
    public JButton AD,bleft ,bxxx[] ; 
    public JFrame c =new JFrame();
    public int count =0 ; 
    public String g ="fsfssfs";
     public static String setroom="000";
    public room () throws FileNotFoundException, IOException {
        
       
        
             tr = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 28);
                          tc = new Font("serif", Font.BOLD+Font.ITALIC, 28);

        back = new ImageIcon("img/5.jpg");
        BACK = new JLabel(back);
        BACK.setBounds(0, 0, 1400, 800);
      
        
        
        
          left = new ImageIcon("img/left.png");
  bleft = new JButton(left);
          c.add(bleft);
    bleft.setBounds(10, -10, 200, 200);
  	bleft.setBorderPainted(false);
		bleft.setBorder(null);

		bleft.setContentAreaFilled(false);
        
    ad = new ImageIcon("img/ad.png");
    AD = new JButton(ad);
    
        reg = new ImageIcon ("img/saa.png");
        REG = new JLabel(reg);
        fname = new JLabel("Course");
        lname = new JLabel("Time");
       
        
       
            
        panel = new JPanel() ; 
        panel.setLayout(null);
        panel.setBounds(300,0,800,1000);

         panel.setBackground(new Color (0,0,255,46));
         panel.add(REG);
          REG.setBounds(70,-160,700,500);
          
          
         panel.add(lname);
         panel.add(fname);
         lname.setBounds(480, 160,200,30);
         fname.setBounds(200, 160,200,30);
         fname.setFont(tr);
         fname.setForeground(new Color(0,0,255,220));
           lname.setForeground(new Color(0,0,255,220));
            lname.setFont(tr);
         
        
        mutaz zz = new mutaz();
        AD.addActionListener(zz);
                 bleft.addActionListener(zz);

                 
                 users = new JLabel[30];
                 state = new JLabel[30];
                   xxx = new ImageIcon[30];
        
        
        bxxx=new JButton[30];
        
        
                 int i =0 ; 
                 int j =0 ; 
                 String mu ; 

         
                     File fc = new File("files/users.txt");
                BufferedReader sc = new BufferedReader (new FileReader(fc));
                     
                     
                          while((mu=sc.readLine() )!=null){
                     
                     
                     
                     File f = new File("files/"+mu+"courses.txt");
                     sc.readLine();
                BufferedReader s = new BufferedReader (new FileReader(f));
                 while((g=s.readLine() )!=null){
                     
                   
                    if(g.equals(setroom)){
                     users[i]=new JLabel(s.readLine());
                     state[i]= new JLabel(s.readLine()); 

                     panel.add(users[i]);
                     users[i].setBounds(200,250+j, 200, 30);
                     
                         users[i].setFont(tc);
                users[i].setForeground(new Color(0,255,0,220));
               
                panel.add(state[i]);
                state[i].setBounds(500, 250+j, 200, 30);
                
                    state[i].setFont(tc);
                state[i].setForeground(new Color(255,0,0,220));
                
                
                i++;
                  j+=60;
                    }
                
                    
                 }
                 }
                 
              
                     
       
                     
        c.add(panel);
        
                  bleft.setFocusPainted(false);
    
        
     c.add(BACK);    
     c.setVisible(true);
     c.setSize(1400,800);
     c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    

    
    
    
    class mutaz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {



 if(ae.getSource()==bleft){
            
           
            c.setVisible(false);
          
          showmap.frame.setVisible(true);
        }


        }
        
    }
}
