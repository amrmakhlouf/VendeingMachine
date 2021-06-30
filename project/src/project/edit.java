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
import static project.LogIn.userfield;

 
public class edit {
 
    public Icon back ,ad ,left; 
    public JLabel BACK  , fname,lname,username,password , date , mobile, email  ,REG ,numroom; 
    public JTextField  jBACK  , jfname,jlname,jusername,jpassword , jdate , jmobile, jemail ,jnumroom;
    public JPanel panel ; 
    public Icon reg ; 
    public Font tr;
    public JButton AD,bleft ; 
    public JFrame c =new JFrame();
    public    int mutaz = 0 ;
    public edit() {
        
       
        
             tr = new Font("serif", Font.BOLD+Font.ITALIC, 18);
        back = new ImageIcon("ENG.jpg");
        BACK = new JLabel(back);
        BACK.setBounds(0, 0, 1400, 800);
        
          left = new ImageIcon("left.png");
  bleft = new JButton(left);
          c.add(bleft);
    bleft.setBounds(10, -10, 200, 200);
  	bleft.setBorderPainted(false);
		bleft.setBorder(null);

		bleft.setContentAreaFilled(false);
        
    ad = new ImageIcon("ad.png");
    AD = new JButton(ad);
    
        reg = new ImageIcon ("reg.png");
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
         panel.add(lname);
         jlname.setBounds(380, 220,200,30);
         lname.setBounds(200, 220,200,30);
         lname.setFont(tr);
         lname.setForeground(new Color(0,0,255,220));
         
         
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
         
         
         
         
          panel.add(password);
         panel.add(jpassword);
         jpassword.setBounds(380, 580,200,30);
         password.setBounds(200, 580,200,30);
        password.setFont(tr);
         password.setForeground(new Color(0,0,255,220));
         
         AD.setBounds(300,650,200,50);
        panel.add(AD);
        
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

                        
                             String gGG ;
               
           try {
                  
                 File f = new File("users.txt");
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
          System.out.println(mutaz);

           try {
               
               if(mutaz !=100){
                  if(!jfname.getText().equals("") &&!jlname.getText().equals("")&&!jemail.getText().equals("") &&!jdate.getText().equals("") &&!jpassword.getText().equals("") && !jusername.getText().equals("") && !jmobile.getText().equals("")  )      {          
           
                      
                      
                                     writerroom = new BufferedWriter(new FileWriter("room.txt", true));

               writer = new BufferedWriter(new FileWriter("information users.txt", true));
                              users = new BufferedWriter(new FileWriter("users.txt", true));

                users.append( jusername.getText());
                              users.newLine();
                              users.append( jpassword.getText());
                              users.newLine();
                              
                               writerroom.append( jusername.getText());
                              writerroom.newLine();
                              writerroom.append( jnumroom.getText());
                              writerroom.newLine();
                              
               writer.append(fname.getText()+": "+jfname.getText()+"\n");
                              writer.newLine();
         
               writer.append(lname.getText()+": "+jlname.getText()+"\n");
                                             writer.newLine();


               writer.append(username.getText()+": "+jusername.getText()+"\n");
                              writer.newLine();

               writer.append(email.getText()+": "+jemail.getText()+"\n");
                              writer.newLine();

               writer.append(mobile.getText()+": "+jmobile.getText()+"\n");
                                             writer.newLine();

                writer.append(date.getText()+": "+jdate.getText()+"\n");
                                              writer.newLine();
                                              
             writer.append(numroom.getText()+": "+jnumroom.getText()+"\n");
                                              writer.newLine();

               writer.append(password.getText()+": "+jpassword.getText());
               
               writer.newLine();
               writer.newLine();
               writer.newLine();

                              writer.append("............................................................................................................................................................");
   writer.newLine();
               writer.newLine();
               writer.newLine();

                           
                                      PrintWriter writerrrrrr = new PrintWriter(jusername.getText()+"notes.txt", "UTF-8");
                                                  PrintWriter writerr = new PrintWriter(jusername.getText()+"courses.txt", "UTF-8");
                                                  PrintWriter writerrr = new PrintWriter(jusername.getText()+"student.txt", "UTF-8");
                                                  PrintWriter writerrrr = new PrintWriter(jusername.getText()+"officeour.txt", "UTF-8");


                         JOptionPane.showMessageDialog(null,"Add successfull !");
                         jusername.setText("");
                         jfname.setText("");
                         jlname.setText("");
                         jemail.setText("");
                         jmobile.setText("");
                         jpassword.setText("");
                         jdate.setText("");
                         
                         
                         
                         
                         
             
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                users.close();
                writer.close();
                  
                                  writerroom.close();

                  }
               
               else {
                                      JOptionPane.showMessageDialog(null,"please fill all information !");
                                  }
               
               }
                        
               
               else {
                                      JOptionPane.showMessageDialog(null,"Sorry ! thiss Yousernmae us already exist !");
                                      mutaz=0;
                                  }
               
               
               
           } catch (IOException ex) {
               Logger.getLogger(ADD.class.getName()).log(Level.SEVERE, null, ex);
           }
    

       }
if(ae.getSource()==bleft){
           
            c.setVisible(false);
           
            whatever.frame.setVisible(true);
           
            
        }





        }
        
    }
    
    public  static void main ( String []arg){
new edit();    }
}
