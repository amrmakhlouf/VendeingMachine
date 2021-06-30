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

 
public class current   {
 
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
    public current () throws FileNotFoundException, IOException {
        
       
        
             tr = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 28);
                          tc = new Font("serif", Font.BOLD+Font.ITALIC, 28);

        back = new ImageIcon("img/current.jpg");
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
    
        reg = new ImageIcon ("img/cu.png");
        REG = new JLabel(reg);
        fname = new JLabel("USERS");
        lname = new JLabel("STATE");
       
        
       
            
        panel = new JPanel() ; 
        panel.setLayout(null);
        panel.setBounds(300,0,800,1000);

         panel.setBackground(new Color (0,0,0,200));
         panel.add(REG);
          REG.setBounds(150,-160,500,500);
          
          
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
        
        
        
        
        
        
        
        
        
        
        
                    
                       xxx[0] = new ImageIcon("img/k.png");
        
        
                        bxxx[0]=new JButton(xxx[0]);
                        bxxx[0].setBackground(new Color(0,0,0,200));
                      c.add(bxxx[0]);
                      bxxx[0].setFocusPainted(false);
                       bxxx[0].setBounds(920, 250, 200, 50);
                       	bxxx[0].setBorderPainted(false);
		bxxx[0].setBorder(null);

		bxxx[0].setContentAreaFilled(false);
        bxxx[0].addActionListener(zz);
                    
                     users[0]=new JLabel("Admin");
                     panel.add(users[0]);
                     users[0].setBounds(200,250, 200, 30);
                     
                         users[0].setFont(tc);
                users[0].setForeground(new Color(0,255,0,220));
             
                    state[0]= new JLabel("admin.");
                    bxxx[0].setVisible(false);
                
                
                          bleft.setFocusPainted(false);

              
                panel.add(state[0]);
                state[0].setBounds(500, 250, 200, 30);
                
                    state[0].setFont(tc);
                state[0].setForeground(new Color(255,0,0,220));
                
                
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                 int i =1 ; 
                 int j =60 ; 
          File f = new File("files/users.txt");
                BufferedReader s = new BufferedReader (new FileReader(f));
                 while((g=s.readLine() )!=null){
                     
                       xxx[i] = new ImageIcon("img/k.png");
        
        
                        bxxx[i]=new JButton(xxx[i]);
                        bxxx[i].setBackground(new Color(0,0,0,200));
                        bxxx[i].setFocusPainted(false);
                       c.add(bxxx[i]);
                       
                       bxxx[i].setBounds(920, 250+j, 200, 50);
                       	bxxx[i].setBorderPainted(false);
		bxxx[i].setBorder(null);

		bxxx[i].setContentAreaFilled(false);
        bxxx[i].addActionListener(zz);
                    
                     users[i]=new JLabel(g);
                     panel.add(users[i]);
                     users[i].setBounds(200,250+j, 200, 30);
                     
                         users[i].setFont(tc);
                users[i].setForeground(new Color(0,255,0,220));
             
                 
                   state[i]= new JLabel("Dr."); 
              
                panel.add(state[i]);
                state[i].setBounds(500, 250+j, 200, 30);
                
                    state[i].setFont(tc);
                state[i].setForeground(new Color(255,0,0,220));
                
                
                
                
                
                     s.readLine();
                    i++;
                     j+=60;
                     count++;
                 }
                 
              
                     
                     /*
                     File inputFile = new File("users.txt");
File tempFile = new File("myTempFile.txt");

BufferedReader reader = new BufferedReader(new FileReader(inputFile));
BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

String lineToRemove =users[i].getText();
String currentLine;

while((currentLine = reader.readLine()) != null) {
    // trim newline when comparing with lineToRemove
    String trimmedLine = currentLine.trim();
    if(trimmedLine.equals(lineToRemove)){ 
        users[i].setText("");
        state[i].setText("");
         bxxx[i].setVisible(false);
        
        
        
        continue;
    
    
    }
    
    writer.write(currentLine + System.getProperty("line.separator"));
}
writer.close(); 
reader.close(); 
boolean successful = tempFile.renameTo(inputFile);

              */       
                 
                 
                 
                     
        c.add(panel);
        
             
        
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
          
           
            whatever.frame.setVisible(true);
        }
 
 
 else {
     
     
                 for (int ii =0 ; ii<state.length ; ii++){
                     
     
     if (ae.getSource()==bxxx[ii]){
         
         
         
                 
      JTextField xField = new JTextField(15);
     
            JTextField zField = new JTextField(15);
      JPasswordField yField =new JPasswordField();
      yField.setEchoChar('*');

 
      JPanel myPanel = new JPanel();
myPanel.setLayout(new GridLayout(3,2));
     xField.setBounds(10,10,10,10);
      
      
      myPanel.add(new JLabel("UserName"));
      myPanel.add(xField);
      
      myPanel.add(new JLabel("Password:"));
      myPanel.add(yField);
     


      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Please Insert Information !", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
   
      
   }
      
      
      
      
      
      
      if(xField.getText().equals("") || yField.getText().equals("")  ){
          JOptionPane.showMessageDialog(null, "Are You Admin!");
      }
      

         
         
         
         
         
         
         
         
         
         if(xField.getText().equals("admin") && yField.getText().equals("admin")){
         
         
         
         
      File inputFile = new File("files/users.txt");
File tempFile = new File("files/myTempFile.txt");
BufferedReader reader = null;
BufferedWriter writer = null ;
                     try {
                         reader = new BufferedReader(new FileReader(inputFile));
                           writer = new BufferedWriter(new FileWriter(tempFile));
                     } catch (FileNotFoundException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }


String lineToRemove =users[ii].getText();
String currentLine;

                     try {
                         while((currentLine = reader.readLine()) != null) {
                             // trim newline when comparing with lineToRemove
                             String trimmedLine = currentLine.trim();
                             if(trimmedLine.equals(lineToRemove)){
                             
                                 reader.readLine();
                                 
                                 
                                 continue;
                                 
                                 
                             }
                             
                             writer.write(currentLine + System.getProperty("line.separator"));
                         }                    } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     try { 
                         writer.close();
                     } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     try { 
                         reader.close();
                     } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }
 tempFile.renameTo(inputFile);
     
 
 
 
 
 
 
 
 
 
 
      String g="5";
     int tt =0 ;
      File input  = new File("files/myTempFile.txt");
      File temp   = new File("files/users.txt");

     try {
         BufferedReader re  = new BufferedReader(new FileReader(  input ));
         BufferedWriter  wr  = new BufferedWriter(new FileWriter(temp ));
        
         while((g=re .readLine())!=null){
      if(tt==0){
          
          wr.write(g);
          wr.newLine();
          
          
          tt=1;
      }
      
      else {
            wr.append(g);
                  wr.newLine();
      }
        
         }
tt=0;
re.close();
wr.close();

c.setVisible(false);

new current(); 
     } catch (FileNotFoundException ex) {
     }
     catch (IOException ex) {
     }
     
 
     
     










                         File inputFilee = new File("files/information users.txt");
                         File tempFilee = new File("files/myTempFile.txt");

   
                  

 
BufferedReader readere = null;
BufferedWriter writere = null ;

                     try {
                         readere = new BufferedReader(new FileReader(inputFilee));
                           writere = new BufferedWriter(new FileWriter(tempFilee));
                           
                     } catch (FileNotFoundException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }

                     
                     

String Remove =users[ii].getText();
String  Line;
String rr ="User Name: "+users[ii].getText();

                     try {
                         while(( Line = readere.readLine()) != null) {
                             
                             // trim newline when comparing with lineToRemove
                             String trimmedLine = Line.trim();
                             if(trimmedLine.equals(rr)){
                                 
                             
                                 readere.readLine();
                                  readere.readLine();
                                   readere.readLine();
                                    readere.readLine();
                                     readere.readLine();
                                      readere.readLine();
                                       readere.readLine();
                                       
                                 
                                 
                                 continue;
                                 
                                 
                             }
                             
                             writere.write( Line + System.getProperty("line.separator"));
                         }   
                         writere.close();
                         readere.close();
                         
 
 
      String ge="5";
     int tte =0 ;
      File inpute  = new File("files/myTempFile.txt");
      File tempe   = new File("files/information users.txt");
     

     try {
         BufferedReader ree  = new BufferedReader(new FileReader(  inpute ));
         BufferedWriter  wre  = new BufferedWriter(new FileWriter(tempe ));
         
       
        
         while((ge=ree .readLine())!=null){
      if(tte==0){
          
          wre.write(ge);
          wre.newLine();
          
          
          tte=1;
      }
      
      else {
            wre.append(ge);
                  wre.newLine();
      }
        
         }
tte=0;
ree.close();
wre.close();


     

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
 
 
 
 
 
 
 
 
 
 
 
                 }
     catch (Exception ex) {
              Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
          }
         } catch (IOException ex) { 
              Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
          } 
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     


                         File inputFileee = new File("files/info.txt");
                         File tempFileee = new File("files/myTempFile.txt");

   
                  

 
BufferedReader readeree = null;
BufferedWriter writeree = null ;

                     try {
                         readeree = new BufferedReader(new FileReader(inputFileee));
                           writeree = new BufferedWriter(new FileWriter(tempFileee));
                           
                     } catch (FileNotFoundException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }

                     
                     

String Removee =users[ii].getText();
String  Linee;
String rre ="User Name: "+users[ii].getText();

                     try {
                         while(( Linee = readeree.readLine()) != null) {
                             
                             // trim newline when comparing with lineToRemove
                             String trimmedLine = Linee.trim();
                             if(trimmedLine.equals(Removee)){
                                 
                             
                                 readeree.readLine();
                                  readeree.readLine();
                                   readeree.readLine();
                                    readeree.readLine();
                                     readeree.readLine();
                                      readeree.readLine();
                                       readeree.readLine();
                                       
                                 
                                 
                                 continue;
                                 
                                 
                             }
                             
                             writeree.write( Linee + System.getProperty("line.separator"));
                         }   
                         writeree.close();
                         readeree.close();
                         
 
 
      String gee="5";
     int ttee =0 ;
      File inputee  = new File("files/myTempFile.txt");
      File tempee   = new File("files/info.txt");
     

     try {
         BufferedReader reee  = new BufferedReader(new FileReader(  inputee ));
         BufferedWriter  wree  = new BufferedWriter(new FileWriter(tempee ));
         
       
        
         while((gee=reee .readLine())!=null){
      if(ttee==0){
          
          wree.write(gee);
          wree.newLine();
          
          
          ttee=1;
      }
      
      else {
            wree.append(gee);
                  wree.newLine();
      }
        
         }
ttee=0;
reee.close();
wree.close();


                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
         }
         
         
         
         catch (IOException ex) {
              Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
          }
         
         
         
         
         
         
                     } catch (IOException ex) {
              Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
          }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
                     
                     
                     
                     
                     
                     
         
         
         
         
                         File inputFilek = new File("files/room.txt");
                         File tempFilek = new File("files/myTempFile.txt");

   
                  

 
BufferedReader readerk = null;
BufferedWriter writerk = null ;

                     try {
                         readerk = new BufferedReader(new FileReader(inputFilek));
                           writerk = new BufferedWriter(new FileWriter(tempFilek));
                           
                     } catch (FileNotFoundException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }


String lineToRemovek =users[ii].getText();
String currentLinek;
 

                     try {
                         while((currentLinek = readerk.readLine()) != null) {
                             
                             // trim newline when comparing with lineToRemove
                             String trimmedLine = currentLinek.trim();
                             if(trimmedLine.equals(lineToRemovek)){
                                 
                             
                                 readerk.readLine();
                                 
                                 
                                 continue;
                                 
                                 
                             }
                             
                             writerk.write(currentLinek + System.getProperty("line.separator"));
                         }   
                         writerk.close();
                         readerk.close();
                         
 
 
      String gk="5";
     int ttk =0 ;
      File inputk  = new File("files/myTempFile.txt");
      File tempk   = new File("files/room.txt");
       BufferedReader rek  = new BufferedReader(new FileReader(  inputk ));
         BufferedWriter  wrk  = new BufferedWriter(new FileWriter(tempk ));
         

  
        
         while((gk=rek .readLine())!=null){
      if(ttk==0){
          
          wrk.write(gk);
          wrk.newLine();
          
          
          ttk=1;
      }
      
      else {
            wrk.append(gk);
                  wrk.newLine();
      }
        
         }
ttk=0;
rek.close();
wrk.close();









                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
         
         
                     } catch (IOException ex) {
              Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
          }
         
         
         }
         
     
                 else {
             JOptionPane.showMessageDialog(null,"Sorry you can't Delet youser ! You not Admin!");
                      
                         }
     
     
                 } 
     
                 }
     
     
     
     
    
     
     
     
     
     
     
     
     
 }


        }
        
    }
}
