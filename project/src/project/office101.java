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


/**
 *
 * @author MutazZuhairy
 */
public class office101 {
    
    public JFrame  frame ; 
    public Icon office  , of , uni , name , pp ,cn , oh , notes , llleft,add,xxx,pic ,xx; 
    public static JLabel username ;
    public JLabel OFFICE , OF,lxx  , luni , lname , lpp,lcn,loh ,lnotes ,students[] ,prp[],num[] ,cr[],room[] ,off[] , hour[] ,area, area2, lpic,time[] ;
    public JPanel ptitel ,right,left,center,down ,rright,lleft,ccenter,ddown, lg ,downr,ddownr ; 
    public Font trbi  ,tr; 
    public static JButton edit ;
    public static String fn , ln , un , mo , em ,pa, ro , da;
    public static int count = 0 ; 
    public static JButton  bleft;
    public static JButton bladd , bradd,bcadd,bdadd ,bdradd, bxxx[],bxxy[],bxxo[]; 
    public  static int countx =0 , county=0,counto=0 ; 
    
    
    public office101 () throws FileNotFoundException, IOException  { 
        frame = new JFrame() ; 
        
        frame.setLayout(null);
       add = new ImageIcon("img/addd.png");
       bradd = new JButton(add);
         bladd = new JButton(add);
           bcadd = new JButton(add);
             bdadd = new JButton(add);
             bdradd = new JButton(add);
             pic = new ImageIcon("img/"+LogIn.userfield.getText()+".jpg");
             lpic = new JLabel(pic);
             frame.add(lpic);
             lpic.setBounds(300, 05 , 130, 140);
             edit = new JButton("Edit Profile");
            
                          edit.setBounds(1230,90 , 120, 50);
                          edit.setBackground(new Color(0,0,255,150));

             xx = new ImageIcon("img/xx.png");
             lxx = new JLabel(xx);
             
             bradd.setBorderPainted(false);
		bradd.setBorder(null);
 bradd.setFocusPainted(false);
		bradd.setContentAreaFilled(false);
                
                bcadd.setBorderPainted(false);
		bcadd.setBorder(null);
 bcadd.setFocusPainted(false);
		bcadd.setContentAreaFilled(false);
                
                bladd.setBorderPainted(false);
		bladd.setBorder(null);
             bladd.setFocusPainted(false);
		bladd.setContentAreaFilled(false);
                
                bdadd.setBorderPainted(false);
		bdadd.setBorder(null);
 bdadd.setFocusPainted(false);
		bdadd.setContentAreaFilled(false);
                
                
                
                bdradd.setBorderPainted(false);
		bdradd.setBorder(null);
 bdradd.setFocusPainted(false);
		bdradd.setContentAreaFilled(false);
       area2 = new JLabel();
                
                         trbi = new Font("serif", Font.BOLD+Font.ITALIC, 32 );
                                                  tr = new Font("serif", Font.BOLD+Font.ITALIC, 20 );
                                                Font  trr = new Font("serif", Font.BOLD+Font.ITALIC, 17 );

                          edit.setFont(trr);

                
                students =new JLabel[30];
                prp = new JLabel[30];
                num = new JLabel[30];
                String g; 
                int j=0 ;
                int i =0 ;
                
             
                
                
                
                
                
                
                
                
                
                
                
                
                
                
       
       
       
                
          llleft = new ImageIcon("img/exit21.png");
  bleft = new JButton(llleft);
  if(LogIn.userfield.getText().equals("admin")){
      Icon dd = new ImageIcon("img/left.png");
      bleft.setIcon(dd);
  }
  frame.add(bleft);
    bleft.setBounds(-25, -40, 200, 200);
  	bleft.setBorderPainted(false);
		bleft.setBorder(null);
                lg = new JPanel();
                 frame.add(lg);
                 
                 
                 if(LogIn.userfield.getText().equals("admin")) {
                         username = new JLabel("Welcome Admin"); }
                 else{
        username = new JLabel("Welcome"+" Dr: "+LogIn.userfield.getText()); }
                 
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
        frame.add(edit);
            
            
   
       
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
 

          
        
        
             bxxx=new JButton[30];
             
                     
                       xxx = new ImageIcon("img/k.png");
        
         
        mutaz zz = new mutaz () ; 
        bleft.addActionListener(zz);
         bcadd.addActionListener(zz);
        bradd.addActionListener(zz);
        edit.addActionListener(zz);
       if(LogIn.userfield.getText().endsWith("admin")){
             
     edit.setVisible(false);
       }
                
              File f = new File("files/"+LogIn.userfield.getText()+"student.txt");
                BufferedReader s = new BufferedReader (new FileReader(f));
                 while((g=s.readLine() )!=null){
                    
                
                      
                        countx++;
                        bxxx[i]=new JButton(xxx);
                        bxxx[i].setBackground(new Color(0,0,0,200));
                       frame.add(bxxx[i]);
                       
                       bxxx[i].setBounds(270,210+j, 50, 60);
                       	bxxx[i].setBorderPainted(false);
		bxxx[i].setBorder(null);

		bxxx[i].setContentAreaFilled(false);
        bxxx[i].addActionListener(zz);
              
                     
                          students[i]=new JLabel(g);
                     center.add(students[i]);
                     students[i].setBounds(715,70+j, 200, 30);
                     
                         students[i].setFont(trbi);
                students[i].setForeground(new Color(255,255,155,255));
                     
                     
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
               bxxo=new JButton[30];
                 
                  File office = new File("files/"+LogIn.userfield.getText()+"officeour.txt");

        
                BufferedReader offf = new BufferedReader (new FileReader(office));
                
                String hh ; 
                 while((hh=offf.readLine() )!=null){
                    
                
                     
        counto++;
                        bxxo[kmu]=new JButton(xxx);
                        bxxo[kmu].setBackground(new Color(0,0,0,200));
                       frame.add( bxxo[kmu]);
                       
                        bxxo[kmu].setBounds(0,200+ccc, 50, 60);
                       	 bxxo[kmu].setBorderPainted(false);
		 bxxo[kmu].setBorder(null);

		 bxxo[kmu].setContentAreaFilled(false);
         bxxo[kmu].addActionListener(zz);
               
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

                                      bxxy = new JButton[30];
                                      time = new JLabel[30];
  
          int ii=0;
              File ff = new File("files/"+LogIn.userfield.getText()+"courses.txt");
                BufferedReader ss = new BufferedReader (new FileReader(ff));
                 while((g=ss.readLine() )!=null){
                  
                      
                    county++;
                        bxxy[ii]=new JButton(xxx);
                        bxxy[ii].setBackground(new Color(0,0,0,200));
                       frame.add(bxxy[ii]);
                       
                       bxxy[ii].setBounds(1290,180+jjj, 100, 100);
                       	bxxy[ii].setBorderPainted(false);
		bxxy[ii].setBorder(null);

		bxxy[ii].setContentAreaFilled(false);
        bxxy[ii].addActionListener(zz);
              
                     
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
         
         
             
          
         bladd.setBounds(-40, 450, 150, 150);
         
         
         
       
   
         
         
         bdadd.addActionListener(zz);
         
                  bdradd.addActionListener(zz);

         
         

        bladd.addActionListener(zz);
        
                
        frame.add(bcadd);
         bcadd.setBounds(160,424,200,200);
         
          frame.add(bradd);
         bradd.setBounds(1090,450,150,150);
         
         
          frame.add(bdadd);
          frame.add(bdradd);
         bdadd.setBounds(-40,610,150,150);
        
         
          if(LogIn.userfield.equals("admin")){
           edit.setVisible(false);
        }
       
         frame.add(right);
          
           frame.add(center);
            frame.add(down);
        frame.add(downr);
                frame.add(ddownr);


        
        frame.add(bladd);
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
           if(map.xx==1  && showmap.zero==1) {
            showmap.frame.setVisible(true);
countx=0;
county=0;
counto=0;
            showmap.zero=0;
           }
          else if(LogIn.userfield.getText().equals("admin")){
               map.frame.setVisible(true);
               map.xx=0;
                
            }
            
            else {
          
          LogIn.c.setVisible(true);
            }
          
        }     
        
        
        
      
        
        
        
        
        
        
        
         if(ae.getSource()== bcadd){
            
            
      JTextField xField = new JTextField(15);
      JTextField yField = new JTextField(15);
    JTextField zField = new JTextField(15);
      JPanel myPanel = new JPanel();
myPanel.setLayout(new GridLayout(3,2));
     xField.setBounds(10,10,10,10);
      
      
      myPanel.add(new JLabel("Student Name :"));
      myPanel.add(xField);
      myPanel.add(new JLabel("# Of Srudent :"));
      myPanel.add(yField);
            myPanel.add(new JLabel("Issue of Student :"));

         myPanel.add(zField);


      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
   
      
   }
      
      
      
      
      
      
      if(xField.getText().equals("") || yField.getText().equals("") ||zField.getText().equals("")){
          JOptionPane.showMessageDialog(null, "not inserted! please fill all information!");
      }
      

      else {
            BufferedWriter writer = null;
                        
          try {
              writer = new BufferedWriter(new FileWriter("files/"+LogIn.userfield.getText()+"student.txt", true));
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
           
          try {
              writer.append(xField.getText());
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.newLine();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.append(yField.getText());
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.newLine();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }

          try {
              writer.append(zField.getText());
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.newLine();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }

          try {
              writer.close();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          JOptionPane.showMessageDialog(null, "Sucessfull!");
          frame.setVisible(false);
          try {
              new office101();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }

      
      }
      
      
      
      
      
      
      
      
      
            
            
        }
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        
        
         
          
        
        
         if(ae.getSource()== bradd){
            
            
      JTextField xField = new JTextField(15);
      JTextField yField = new JTextField(15);
            JTextField zField = new JTextField(15);

 
      JPanel myPanel = new JPanel();
myPanel.setLayout(new GridLayout(3,2));
     xField.setBounds(10,10,10,10);
      
      
      myPanel.add(new JLabel("Course Name:"));
      myPanel.add(xField);
      myPanel.add(new JLabel("Time of Coutrse:"));
      myPanel.add(yField);
       myPanel.add(new JLabel("# Of Room :"));
      myPanel.add(zField);
     


      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Please Insert Information !", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
   
      
   }
      
      
      
      
      
      
      if(xField.getText().equals("") || yField.getText().equals("")  ){
          JOptionPane.showMessageDialog(null, "not inserted! please fill all information!");
      }
      

      else {
            BufferedWriter writer = null;
                        BufferedWriter cour = null;

                        
          try {
              writer = new BufferedWriter(new FileWriter("files/"+LogIn.userfield.getText()+"courses.txt", true));
                            cour = new BufferedWriter(new FileWriter("files/courses.txt", true));

          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
           
          try {
               writer.append(xField.getText());
                 writer.newLine();
              writer.append(zField.getText());
              
                    cour.append(LogIn.userfield.getText());
                          cour.newLine();
              
                           cour.append(zField.getText());

          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.newLine();
                   cour.newLine();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
                           

              writer.append(xField.getText());
                cour.append(xField.getText());
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.newLine();
                 cour.newLine();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.append(yField.getText());
               cour.append(yField.getText());
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.newLine();
                            cour.newLine();

          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }

         

          try {
              writer.close();
                            cour.close();

          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          JOptionPane.showMessageDialog(null, "Sucessfull!");
          frame.setVisible(false);
          try {
         
              new office101();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }

      
      }
      
      
      
      
      
      
      
      
      
            
            
        }
        
         
         if(ae.getSource() ==bdadd){
             
             
             JTextField xField = new JTextField(15);
 
 
      JPanel myPanel = new JPanel();
myPanel.setLayout(new GridLayout(1,1));
      
      
      myPanel.add(new JLabel("Your Note:"));
      myPanel.add(xField);
   
     
            BufferedReader rv = null;
        try {
            rv = new BufferedReader(new FileReader("files/"+LogIn.userfield.getText()+"notes.txt"));
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
              File  e = new File("files/"+LogIn.userfield.getText()+"notes.txt");
              PrintWriter writer = new PrintWriter(e);
             writer.print("");
               writer.close();

              writerr = new BufferedWriter(new FileWriter("files/"+LogIn.userfield.getText()+"notes.txt", true));
              writerr.write(xField.getText());
                  writerr.close();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
           
         
         
        
     

         

          frame.setVisible(false);
          try {
         
              new office101();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }

      
      
      
         }
             
             
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
      
         
         if(ae.getSource()== bladd){
            
            
      JTextField xField = new JTextField(15);
      JTextField yField = new JTextField(15);
 
      JPanel myPanel = new JPanel();
myPanel.setLayout(new GridLayout(3,2));
     xField.setBounds(10,10,10,10);
      
      
      myPanel.add(new JLabel("Day:"));
      myPanel.add(xField);
      myPanel.add(new JLabel("Time :"));
      myPanel.add(yField);
     


      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Please insert Day and Time of office hour!", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
   
      
   }
      
      
      
      
      
      
      if(xField.getText().equals("") || yField.getText().equals("")  ){
          JOptionPane.showMessageDialog(null, "not inserted! please fill all information!");
      }
      

      else {
            BufferedWriter writer = null;
                        
          try {
              writer = new BufferedWriter(new FileWriter("files/"+LogIn.userfield.getText()+"officeour.txt", true));
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
           
          try {
              writer.append(xField.getText());
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.newLine();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.append(yField.getText());
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              writer.newLine();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }

         

          try {
              writer.close();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }
          JOptionPane.showMessageDialog(null, "Sucessfull!");
          frame.setVisible(false);
          try {
         
              new office101();
          } catch (IOException ex) {
              Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
          }

      
      }
      
         }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
          
                 for (int ii =0 ; ii<students.length ; ii++){
                     
     
     if (ae.getSource()==bxxx[ii]){
         
      File inputFile = new File("files/"+LogIn.userfield.getText()+"student.txt");
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


String lineToRemove =students[ii].getText();
String currentLine;

                     try {
                         while((currentLine = reader.readLine()) != null) {
                             // trim newline when comparing with lineToRemove
                             String trimmedLine = currentLine.trim();
                             if(trimmedLine.equals(lineToRemove)){
                             
                                 reader.readLine();
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
      File temp   = new File("files/"+LogIn.userfield.getText()+"student.txt");

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

frame.setVisible(false);

new office101(); 
     } catch (FileNotFoundException ex) {
     }
     catch (IOException ex) {
     }
     
 
 
 
 
 
 
 
 
 
 
 
 
                 }
     
                 }
                 
                 
                  
                 for (int ii =0 ; ii<bxxy.length ; ii++){
                     
  
     
     if (ae.getSource()==bxxy[ii]){
       
      File inputFile = new File("files/"+LogIn.userfield.getText()+"courses.txt");
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

String lineToRemove =time[ii].getText();
String currentLine;

                     try {
                         while((currentLine = reader.readLine()) != null) {
                             // trim newline when comparing with lineToRemove
                             String trimmedLine = currentLine.trim();
                             if(trimmedLine.equals(lineToRemove)){
                             
                            reader.readLine();
                            reader.readLine();
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
      File temp   = new File("files/"+LogIn.userfield.getText()+"courses.txt");

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

frame.setVisible(false);

new office101(); 
     } catch (FileNotFoundException ex) {
     }
     catch (IOException ex) {
     }
     
 
 
 
 
 
 
 
 
 
 
 
 
                 }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
                 }
     
        
                 
                 
                 
                     
                 for (int ii =0 ; ii<off.length ; ii++){
                     
  
     
     if (ae.getSource()==bxxo[ii]){
         
      File inputFile = new File("files/"+LogIn.userfield.getText()+"officeour.txt");
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

String lineToRemove =off[ii].getText();
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
      File temp   = new File("files/"+LogIn.userfield.getText()+"officeour.txt");

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

frame.setVisible(false);

new office101(); 
     } catch (FileNotFoundException ex) {
     }
     catch (IOException ex) {
     }
     
 
 
 
 
 
 
 
 
 
 
 
 
                 }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
                 }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
 
 
 
 
        
        
        
        
        if(ae.getSource()==edit){
            
          
         
         
                  
        String ggg; 
            File f = new File("files/info.txt");
                BufferedReader s = null;
        try {
            s = new BufferedReader (new FileReader(f));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while((ggg=s.readLine() )!=null){
                
                if(LogIn.userfield.getText().equals(ggg)){
                    
      
                    ro = s.readLine();
                    un = s.readLine();
                    
                    fn =s.readLine();
                    ln = s.readLine();
                    em =s.readLine(); 
                    mo =s.readLine();
                    da =s.readLine();
                  
                    pa = s.readLine();
       
                   
                    
                    
                    
                    
                    
                    break;
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }

      
      
      
      
   
         
         
         
         
         
         
         
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


String lineToRemove =LogIn.userfield.getText();
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
                         }   
                         writer.close();
                         reader.close();
                         
 
 
      String g="5";
     int tt =0 ;
      File input  = new File("files/myTempFile.txt");
      File temp   = new File("files/users.txt");
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

                     
                     

String Remove =LogIn.userfield.getText();
String  Line;
String rr ="User Name: "+LogIn.userfield.getText();

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

                     
                     

String Removee =LogIn.userfield.getText();
String  Linee;
String rre ="User Name: "+LogIn.userfield.getText();

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










































































//.................................



         
         
         
         
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


String lineToRemovek =LogIn.userfield.getText();
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


















                         
                         
                     /*    
                         
                         while((currentLine = re2.readLine()) != null) {
                             
                             // trim newline when comparing with lineToRemove
                             String trimmedLine = currentLine.trim();
                             if(trimmedLine.equals(lineToRemove)){
                                 
                             
                                 reader.readLine();
                                   reader.readLine();
                                     reader.readLine();
                                       reader.readLine();
                                         reader.readLine();
                                           reader.readLine();
                                             reader.readLine();
                                 
                                 
                                 continue;
                                 
                                 
                             }
                             
                             writer.write(currentLine + System.getProperty("line.separator"));
                         }  
                     
                     
                           
                         while((currentLine = re1.readLine()) != null) {
                             
                             // trim newline when comparing with lineToRemove
                             String trimmedLine = currentLine.trim();
                             if(trimmedLine.equals(rr)){
                                 
                             
                                 reader.readLine();
                                   reader.readLine();
                                     reader.readLine();
                                       reader.readLine();
                                         reader.readLine();
                                           reader.readLine();
                                             reader.readLine();
                                 
                                 
                                 continue;
                                 
                                 
                             }
                             
                             writer.write(currentLine + System.getProperty("line.separator"));
                         }  
                     
                     
                     
                     
                     
                     
                     
                     } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }

 
                     try { 
                         writer.close();
                         wr1.close();
                         wr2.close();
                     } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     try { 
                         reader.close();
                         re1.close();
                         re2.close();
                     } catch (IOException ex) {
                         Logger.getLogger(current.class.getName()).log(Level.SEVERE, null, ex);
                     }
 tempFile.renameTo(inputFile);
     
 
 
 
 
 
 
 
 
 
 
      String g="5";
     int tt =0 ;
      File input  = new File("myTempFile.txt");
      File temp   = new File("users.txt");
      
          File t1= new File("information users.txt");
File i1= new File("my1.txt");


   
      File t2 = new File("info.txt");
File i2= new File("my2.txt");

     try {
         BufferedReader re  = new BufferedReader(new FileReader(  input ));
         BufferedWriter  wr  = new BufferedWriter(new FileWriter(temp ));
         
         
          BufferedReader re11  = new BufferedReader(new FileReader(  i1 ));
         BufferedWriter  wr11 = new BufferedWriter(new FileWriter(t1 ));
         
            BufferedReader re22  = new BufferedReader(new FileReader(  i2 ));
         BufferedWriter  wr22 = new BufferedWriter(new FileWriter(t2 ));
        
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








String h ;

       int ccc=0;
         while((h=re11 .readLine())!=null){
      if(ccc==0){
          
          wr11.write(h);
          wr11.newLine();
          
          
          ccc=1;
      }
      
      else {
            wr11.append(h);
                  wr11.newLine();
      }
        
         }
ccc=0;
re11.close();
wr11.close();


String s;
       int dd=0;
         while((s=re22 .readLine())!=null){
      if(dd==0){
          
          wr22.write(s);
          wr22.newLine();
          
          
          tt=1;
      }
      
      else {
            wr22.append(s);
                  wr22.newLine();
      }
        
         }
dd=0;
re22.close();
wr22.close();











     } catch (FileNotFoundException ex) {
     }
     catch (IOException ex) {
     }
     
 
 
 
 
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            */
            
            
        try {
            new editt();
            
        } catch (IOException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }
            /*
        } catch (IOException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        
        
        
        } catch (IOException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }    catch (IOException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (IOException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }}                   catch (IOException ex) { 
                                 Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
                             } 
        
        
        } catch (IOException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }} catch (IOException ex) {
            Logger.getLogger(office101.class.getName()).log(Level.SEVERE, null, ex);
        }        }        }}}
