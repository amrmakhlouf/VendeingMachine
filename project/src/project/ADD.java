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
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

 
public class ADD   {
 
    public Icon back ,ad ,left; 
    public JLabel BACK  , fname,lname,username,password , date , mobile, email  ,REG ,numroom; 
    public JTextField  jBACK  , jfname,jlname,jusername,jpassword , jdate , jmobile, jemail ,jnumroom;
    public JPanel panel ; 
    public Icon reg ; 
    public Font tr;
    public JButton AD,bleft ; 
    public JFrame c =new JFrame();
    public    int mutaz = 0 ,zuhairi =0;
    public ADD () {
        
       
        
             tr = new Font("serif", Font.BOLD+Font.ITALIC, 18);
        back = new ImageIcon("img/col.jpg");
        BACK = new JLabel(back);
        BACK.setBounds(0, 0, 1400, 800);
        
          left = new ImageIcon("img/left.png");
  bleft = new JButton(left);
          c.add(bleft);
    bleft.setBounds(10, -10, 200, 200);
  	bleft.setBorderPainted(false);
		bleft.setBorder(null);

		bleft.setContentAreaFilled(false);
        
    ad = new ImageIcon("img/adddd.png");
    AD = new JButton(ad);
    AD.setBorderPainted(false);
		AD.setBorder(null);
AD.setFocusPainted(false);
		AD.setContentAreaFilled(false);
		
		
		
    
        reg = new ImageIcon ("img/reg.png");
        REG = new JLabel(reg);
        fname = new JLabel("First Name");
        lname = new JLabel("Last Name");
        email = new JLabel("Email");
        mobile = new JLabel("Mobile Number");
        date = new JLabel("Date of Birth");
        password = new JLabel("Password");
        username = new JLabel("User Name");
        numroom = new JLabel("Office Number");
        
        jfname = new JTextField();
        jlname = new JTextField();
        jemail = new JTextField();
        jmobile = new JTextField();
        jdate = new JTextField();
        jpassword = new JTextField();
        jusername = new JTextField();
        
        
               jnumroom = new JTextField();

            
        panel = new JPanel() ; 
        panel.setLayout(null);
        panel.setBounds(300,0,800,1000);

         panel.setBackground(new Color (0,0,0,200));
         panel.add(REG);
          REG.setBounds(150,-160,500,500);
          
          
         panel.add(jfname);
         panel.add(fname);
         jfname.setBounds(380, 160,200,30);
         fname.setBounds(200, 160,200,30);
         fname.setFont(tr);
         fname.setForeground(new Color(0,0,255,220));
         
         panel.add(jlname);
         
         
         
         panel.add(username);
         panel.add(jusername);
         jusername.setBounds(380, 280,200,30);
         username.setBounds(200, 280,200,30);
        username.setFont(tr);
         username.setForeground(new Color(0,0,255,220));
         
         
          panel.add(email);
         panel.add(jemail);
         jemail.setBounds(380, 340,200,30);
         email.setBounds(200, 340,200,30);
        email.setFont(tr);
         email.setForeground(new Color(0,0,255,220));
         
         
         
         
          panel.add(mobile);
         panel.add(jmobile);
         jmobile.setBounds(380, 400,200,30);
         mobile.setBounds(200, 400,200,30);
        mobile.setFont(tr);
         mobile.setForeground(new Color(0,0,255,220));
         
         
         
          panel.add(date);
         panel.add(jdate);
         jdate.setBounds(380, 460,200,30);
         date.setBounds(200, 460,200,30);
        date.setFont(tr);
         date.setForeground(new Color(0,0,255,220));
         
         
             panel.add(numroom);
         panel.add(jnumroom);
         jnumroom.setBounds(380, 520,200,30);
         numroom.setBounds(200, 520,200,30);
        numroom.setFont(tr);
         numroom.setForeground(new Color(0,0,255,220));
         
         
         bleft.setFocusPainted(false);
         
          panel.add(password);
         panel.add(jpassword);
         jpassword.setBounds(380, 580,200,30);
         password.setBounds(200, 580,200,30);
        password.setFont(tr);
         password.setForeground(new Color(0,0,255,220));
         
         AD.setBounds(600,610,200,100);
        c.add(AD);
        
        c.add(panel);
        
        mutaz zz = new mutaz();
        AD.addActionListener(zz);
                 bleft.addActionListener(zz);

        
        
     c.add(BACK);    
     c.setVisible(true);
     c.setSize(1400,800);
     c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    
    
    class mutaz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {


       if (ae.getSource()==AD){
            BufferedWriter writer;
                        BufferedWriter users;
                                    BufferedWriter writerroom;
                                                                        BufferedWriter writere;


                        
                             String gGG ;
               
           try {
                  
                 File f = new File("files/users.txt");
                BufferedReader s ;
          
               s = new BufferedReader (new FileReader(f));
               
                  while((gGG=s.readLine() )!=null){
                   
                   if(jusername.getText().equals(gGG)){
                       
                       mutaz=100;
                       
                   }
                   
               }
           } catch (FileNotFoundException ex) {
               Logger.getLogger(ADD.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(ADD.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
           
           
           
           
          
           
           
           
                             String gq ;
               
           try {
                  
                 File wq = new File("files/info.txt");
                BufferedReader sq ;
          
               sq = new BufferedReader (new FileReader(wq));
               
                  while((gq=sq.readLine() )!=null){
                   
                   if(jnumroom.getText().equals(gq)){
                       
                       zuhairi=100;
                       
                   }
                   
               }
           } catch (FileNotFoundException ex) {
               Logger.getLogger(ADD.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(ADD.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
           
           
           
           
           
           
           
            
           
           
           
           
           
           
           
           
           
     

           try {
               
               if(jnumroom.getText().equals("1") || jnumroom.getText().equals("2") || jnumroom.getText().equals("3") || jnumroom.getText().equals("4") || jnumroom.getText().equals("5") || jnumroom.getText().equals("6") || jnumroom.getText().equals("7") || jnumroom.getText().equals("8") || jnumroom.getText().equals("9") || jnumroom.getText().equals("10") || jnumroom.getText().equals("11") || jnumroom.getText().equals("12") || jnumroom.getText().equals("13")|| jnumroom.getText().equals("14"))
               {
               if(zuhairi !=100){
               //...............
               if(mutaz !=100){
                  if(!jfname.getText().equals("") &&!jlname.getText().equals("")&&!jemail.getText().equals("") &&!jdate.getText().equals("") &&!jpassword.getText().equals("") && !jusername.getText().equals("") && !jmobile.getText().equals("") && !jnumroom.getText().equals("")  )      {          
           
                      
                      
                                     writerroom = new BufferedWriter(new FileWriter("files/room.txt", true));

               writer = new BufferedWriter(new FileWriter("files/information users.txt", true));
                              users = new BufferedWriter(new FileWriter("files/users.txt", true));
                                                                           writere = new BufferedWriter(new FileWriter("files/info.txt", true));


                users.append( jusername.getText());
                              users.newLine();
                              users.append( jpassword.getText());
                              users.newLine();
                              
                           writerroom.append( jnumroom.getText());
                              writerroom.newLine();
                               writerroom.append( jusername.getText());
                              writerroom.newLine();
                         
                                writere.append(jusername.getText());
                              writere.newLine();         
                              
                              writere.append(jnumroom.getText());
                              writere.newLine();
   
                              
                   
               writer.append(username.getText()+": "+jusername.getText());
                              writere.append(jusername.getText());
                              writere.newLine();           

                              writer.newLine();           
               writer.append(fname.getText()+": "+jfname.getText());
                                             writere.append(jfname.getText());
                              writere.newLine();

                              writer.newLine();
         
               writer.append(lname.getText()+": "+jlname.getText());
                                             writer.newLine();
                                                  writere.append(jlname.getText());
                              writere.newLine();




               writer.append(email.getText()+": "+jemail.getText());
                              writer.newLine();
                                   writere.append(jemail.getText());
                              writere.newLine();


               writer.append(mobile.getText()+": "+jmobile.getText());
                                             writer.newLine();
     writere.append(jmobile.getText());
                              writere.newLine();

                writer.append(date.getText()+": "+jdate.getText());
                                              writer.newLine();
                                              
                                                   writere.append(jdate.getText());
                              writere.newLine();

                                              
             writer.append(numroom.getText()+": "+jnumroom.getText());
                                              writer.newLine();
                                                

               writer.append(password.getText()+": "+jpassword.getText());
               
               writer.newLine();
               writer.newLine();
               writer.newLine();

                              writer.append("............................................................................................................................................................");
   writer.newLine();
               writer.newLine();
               writer.newLine();
               
               
                   writere.append(jpassword.getText());
                   
               
               
               writere.newLine();
               writer.newLine();
               writer.newLine();

                              writere.append("............................................................................................................................................................");
   writere.newLine();
               writere.newLine();
               writere.newLine();

                           
                                      PrintWriter writerrrrrr = new PrintWriter("files/"+jusername.getText()+"notes.txt", "UTF-8");
                                                  PrintWriter writerr = new PrintWriter("files/"+jusername.getText()+"courses.txt", "UTF-8");
                                                  PrintWriter writerrr = new PrintWriter("files/"+jusername.getText()+"student.txt", "UTF-8");
                                                  PrintWriter writerrrr = new PrintWriter("files/"+jusername.getText()+"officeour.txt", "UTF-8");
                                      PrintWriter writerrrrrrtr = new PrintWriter("files/"+jusername.getText()+"adminnotes.txt", "UTF-8");


                         JOptionPane.showMessageDialog(null,"Add successfull !");
                         jusername.setText("");
                         jfname.setText("");
                         jlname.setText("");
                         jemail.setText("");
                         jmobile.setText("");
                         jpassword.setText("");
                         jdate.setText("");
                          jnumroom.setText("");
                         
                         
                         
                         
                         
             
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                users.close();
                writer.close();
                                writere.close();

                  
                                  writerroom.close();
                                  
                                  
           c.setVisible(false);
           new  ADD();

                  }
               
               else {
                                      JOptionPane.showMessageDialog(null,"please fill all information !");
                                  }
               
               }
                        
               
               else {
                                      JOptionPane.showMessageDialog(null,"Sorry ! thiss Yousernmae us already exist !");
                                      mutaz=0;
                                  }
               }
               else {
                     JOptionPane.showMessageDialog(null,"Sorry ! thiss room is  already Reserved!");
                                      zuhairi=0;
               }
               }
               

               else 
               {
                                        JOptionPane.showMessageDialog(null,"Please insert office number betwwen 1-14 only !!");

               }
//..........
           } catch (IOException ex) {
               Logger.getLogger(ADD.class.getName()).log(Level.SEVERE, null, ex);
           }
    

           
           
           
       }
if(ae.getSource()==bleft){
           
            c.setVisible(false);
           
          new whatever();
            
        }





        }
        
    }
}
