/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.Toolkit;
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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static project.showmap.user;


/**
 *
 * @author MutazZuhairy
 */
public class office100 {
    
    public JFrame  frame ; 
    public Icon office  , of , uni , name , pp ,cn , oh , notes , llleft,add,xxx,pic ,xx; 
    public static JLabel username ;
    public JLabel OFFICE ,area2, OF ,lxx , luni , lname , lpp,lcn,loh ,lnotes ,students[] ,prp[],num[] ,cr[],room[] ,off[] , hour[] ,area , lpic,time[] ;
    public JPanel ptitel,downr,ddownr ,right,left,center,down ,rright,lleft,ccenter,ddown, lg ; 
    public Font trbi  ,tr; 
 
    public static String fn , ln , un , mo , em ,pa, ro , da;
    public static int count = 0 ; 
    public static JButton  bleft , bdradd;
 
    public  static int countx =0 , county=0,counto=0 ; 
    
    
    public office100 () throws FileNotFoundException, IOException  { 
        
        
            frame = new JFrame() ; 
        
        frame.setLayout(null);
       add = new ImageIcon("img/addd.png");
       
             bdradd = new JButton(add);
             pic = new ImageIcon("img/"+LogIn.userfield.getText()+".jpg");
             lpic = new JLabel(pic);
             frame.add(lpic);
             lpic.setBounds(300, 05 , 130, 140);
            
             xx = new ImageIcon("img/xx.png");
             lxx = new JLabel(xx);
             
                
              
                
                
                bdradd.setBorderPainted(false);
		bdradd.setBorder(null);
 bdradd.setFocusPainted(false);
		bdradd.setContentAreaFilled(false);
       area2 = new JLabel();
                
                         trbi = new Font("serif", Font.BOLD+Font.ITALIC, 32 );
                                                  tr = new Font("serif", Font.BOLD+Font.ITALIC, 20 );
                                                Font  trr = new Font("serif", Font.BOLD+Font.ITALIC, 17 );
 
                students =new JLabel[30];
                prp = new JLabel[30];
                num = new JLabel[30];
                String g; 
                int j=0 ;
                int i =0 ;
                
             
                
                
                
                
                
                
                
                
                
                
                
                
                
                
       
       
       
         
      Icon dd = new ImageIcon("img/left.png");
  bleft = new JButton(dd);
  
  frame.add(bleft);
    bleft.setBounds(-25, -40, 200, 200);
  	bleft.setBorderPainted(false);
		bleft.setBorder(null);
                lg = new JPanel();
                 frame.add(lg);
                 
                 
                         username = new JLabel(""); 
                
         username.setFont(trbi);
         username.setForeground(new Color(0,0,255));
        lg.add(username);
        lg.setBackground(new Color(0,0,0,200));
        lg.setBounds(1020,  20, 330, 60);
		bleft.setContentAreaFilled(false);
        office = new ImageIcon("img/office.jpg");
        of = new ImageIcon("img/OF.png");
        notes = new ImageIcon("img/notes.png");
        oh = new ImageIcon("img/oh.png");
        
         uni = new ImageIcon("img/#.png");
           name = new ImageIcon("img/stu.png");
            pp = new ImageIcon("img/is.png");
            cn = new ImageIcon("img/cn.png");
            
            luni = new JLabel(uni);
           lname = new JLabel(name);
            lpp= new JLabel(pp);
            
            lcn = new JLabel(cn);
            
            loh = new JLabel(oh);
            lnotes =new JLabel(notes);
        
        
        
        OFFICE = new JLabel(office); 
        OF = new JLabel(of);
         ptitel   = new JPanel(); 
         right   = new JPanel(); 
         rright = new JPanel();
                      left   = new JPanel(); 
                      lleft = new JPanel();

                                 center   = new JPanel();
                                 ccenter =new JPanel(); 
    down  = new JPanel(); 
    ddown = new JPanel(); 
    
    
       
         
         
         
         
         
         
        OFFICE.setBounds(0,0,1400,800);
        
        
        
        
        OF.setBounds(500, -100, 340, 340);
          right.setBounds(1135, 150, 220, 400);
        right.setBackground(new Color(255,0,0,100));
        
        left.setBounds(5, 150, 220, 400);
        left.setBackground(new Color(255,0,0,100));
    
        center.setBounds(230, 150, 900, 400);
        center.setBackground(new Color(0,0,255,130));
        
        
        ddownr = new JPanel();
                downr = new JPanel();

                downr.setBackground(new Color(0,0,0,100));
                ddownr.setBackground(new Color(0,0,0,255));
                
                downr.setBounds(660, 555, 695, 175);
                ddownr.setBounds(660, 555, 695, 40);

        down.setBounds(5, 555, 650, 175);
        down.setBackground(new Color(0,0,0,100));
        
        
             rright.setBounds(1135, 160, 220, 50);
        rright.setBackground(new Color(0,0,0,255));
        
                lleft.setBounds(5, 160, 220, 50);
        lleft.setBackground(new Color(0,0,0,255));
    
        ccenter.setBounds(230, 160, 900, 50);
        ccenter.setBackground(new Color(0,0,0,255));
        
        
       ddown.setBounds(5, 555, 650, 40);
       ddown.setBackground(new Color(0,0,0,255));
        
        
        
        
        
        
        
        
    lxx.setBounds(770, 370, 500, 400);
        frame.add(OF);
            
       frame.add(lxx);
          frame.add(loh);
           frame.add(lnotes);
          frame.add(lpp);
          frame.add(lcn);
          frame.add(luni);
          frame.add(lname);
           frame.add(ccenter);
            frame.add(ddown);
           frame.add(lleft);
                 frame.add(rright); 
        
       
        center.setLayout(null);
          left.setLayout(null);
         
     
         
          lname.setBounds(750, -70, 500, 500);
            luni.setBounds(490, -65, 500, 500);
                  lpp.setBounds(200, -69, 500, 500);
                 
                  loh.setBounds(15, 32, 200, 300);
                   lcn.setBounds(1145, 32, 200, 300);

          right.setLayout(null);
        
        ptitel.setBounds(500, 10 ,340, 90);
        ptitel.setBackground(new Color (0,0,0,100));
        frame.add(ptitel );
      
        
        down.setLayout(null);
       
        lnotes.setBounds( 250, 423, 200, 300);
        
         area= new JLabel();
   
         down.add(area);
         area.setBounds(100,-120,1400,400);
         area.setFont(trbi);
         area.setForeground(new Color (255,255,255));
         
         
         
         
        downr.setLayout(null);
        
         downr.add(area2);
         area2.setBounds(100,-120,1400,400);
         area2.setFont(trbi);
         area2.setForeground(new Color (0,255,255));
               

               

         
               File fq = new File("files/"+LogIn.userfield.getText()+"notes.txt");
                BufferedReader sq = new BufferedReader (new FileReader(fq));
                
                area.setText(sq.readLine());
 
File fqqq= new File("files/"+LogIn.userfield.getText()+"adminnotes.txt");
                BufferedReader sqq = new BufferedReader (new FileReader(fqqq));
                
                area2.setText(sqq.readLine());
 

          
        
         
                     
                       xxx = new ImageIcon("img/k.png");
        
         
        mutaz zz = new mutaz () ; 
        bleft.addActionListener(zz);
          
    
                
              File f = new File("files/"+LogIn.userfield.getText()+"student.txt");
                BufferedReader s = new BufferedReader (new FileReader(f));
                 while((g=s.readLine() )!=null){
                    
                
                      
                        countx++;
                       
                   
              
                     
                          students[i]=new JLabel(g);
                     center.add(students[i]);
                     students[i].setBounds(715,70+j, 200, 30);
                     
                         students[i].setFont(trbi);
                students[i].setForeground(new Color(255,255,255,255));
                     
                     
                            num[i]=new JLabel(s.readLine());
                     center.add(num[i]);
                    num[i].setBounds(450,74+j, 200, 30);
                     
                         num[i].setFont(trbi);
                num[i].setForeground(new Color(255,255,255,255));
                
                
                
                           prp[i]=new JLabel(s.readLine());
                     center.add(prp[i]);
                     prp[i].setBounds(190,60+j, 200, 40);
                     
                        prp[i].setFont(trbi);
                prp[i].setForeground(new Color(255,255,255,255));
         
                
                
                
                     
                    i++;
                     j+=60;
                    
                 }
                 
                 int kmu =0 ; 
                 int ccc=0;
                 
                 off = new JLabel[30];
                 hour = new JLabel[30];
              
                  File office = new File("files/"+LogIn.userfield.getText()+"officeour.txt");

        
                BufferedReader offf = new BufferedReader (new FileReader(office));
                
                String hh ; 
                 while((hh=offf.readLine() )!=null){
                    
                
                     
        counto++; 
               
                     left.setLayout(null);
                          off[kmu]=new JLabel(hh);
                     left.add(off[kmu]);
                     off[kmu].setBounds(75,60+ccc, 200, 30);
                     
                         off[kmu].setFont(tr);
                off[kmu].setForeground(new Color(0,0,0,255));
                     
                     
                            hour[kmu]=new JLabel(offf.readLine());
                     left.add(hour[kmu]);
                   hour[kmu].setBounds(145,60+ccc, 200, 30);
                     
                         hour[kmu].setFont(tr);
                hour[kmu].setForeground(new Color(0,0,0,255));
                
                
                
                
                     
                    kmu++;
                     ccc+=60;
                    
                 }
         
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
         int jjj =0 ; 
                 
                   room = new JLabel[30];
                                      cr = new JLabel[30];

                                      
                                      time = new JLabel[30];
  
          int ii=0;
              File ff = new File("files/"+LogIn.userfield.getText()+"courses.txt");
                BufferedReader ss = new BufferedReader (new FileReader(ff));
                 while((g=ss.readLine() )!=null){
                  
                      
                    county++;
                        
                         
                     
                          cr[ii]=new JLabel(ss.readLine());
                     right.add(cr[ii]);
                    cr[ii].setBounds(140,-70+jjj, 300, 300);
                     
                        cr[ii].setFont(tr);
                 cr[ii].setForeground(new Color(0,255,0,255));
                 
                 
                     time[ii]=new JLabel(ss.readLine());
                    right.add(time[ii]);
                    time[ii].setBounds(10,-70+jjj, 300, 300);
                     
                         time[ii].setFont(tr);
               time[ii].setForeground(new Color(0,0,0,255));
                
                     
                     
                            room[ii]=new JLabel(ss.readLine());
                     right.add(room[ii]);
                    room[ii].setBounds(70,-70+jjj, 300, 300);
                     
                         room[ii].setFont(tr);
               room[ii].setForeground(new Color(0,0,255,255));
                
                
                
                    
                     
                    i++;
                     jjj+=60;
                    
                 }
         
         
             
          
        
         
                  bdradd.addActionListener(zz);

         
         

         
          frame.add(bdradd);
         
         bdradd.setBounds(613,610,150,150);
         
          
       
         frame.add(right);
          
           frame.add(center);
            frame.add(down);
        frame.add(downr);
                frame.add(ddownr);


        
       
         frame.add(left);
              
            frame.add(OFFICE);
            
           
                    bleft.setFocusPainted(false);
 
        frame.setVisible(true);
        frame.setSize(1400,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   public class mutaz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
 
            
            
 
            
            
            
            
            
    if(ae.getSource()==bleft){
              frame.setVisible(false);
               showmap.frame.setVisible(true);
       
     
            
          
        }     
        
        
           
            if(ae.getSource() ==bdradd){
             
             
             JTextField xField = new JTextField(15);
 
 
      JPanel myPanel = new JPanel();
myPanel.setLayout(new GridLayout(1,1));
      
      
      myPanel.add(new JLabel("Admin Note:"));
      myPanel.add(xField);
   
     
            BufferedReader rv = null;
        try {
            rv = new BufferedReader(new FileReader("files/"+showmap.user+"adminnotes.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            xField.setText(rv.readLine());
        } catch (IOException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }


      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Please Enter Your Note", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
   
      
   }
      
      
      
      
      
      
            BufferedWriter writerr = null;
                        
          try {
              File  e = new File("files/"+showmap.user+"adminnotes.txt");
              PrintWriter writer = new PrintWriter(e);
             writer.print("");
               writer.close();

              writerr = new BufferedWriter(new FileWriter("files/"+showmap.user+"adminnotes.txt", true));
              writerr.write(xField.getText());
                  writerr.close();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
           
         
         
        
     

         

          frame.setVisible(false);
          try {
         
             office100  eee = new office100();
             eee. username.setText(showmap.user+"  Office");
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }

      
      
      
         }
             
             
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
      
        
        
        
        
        
            }}}
