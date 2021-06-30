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
public class showmap {
    public  static JFrame  frame ; 
    public Icon iback ,imap , llleft; 
    public JLabel lback , lmap ,username , lser ,luser,lroom ,mutaz,zuhairi,help; 
    public JPanel jmap  ,lg ,ser1,ser2,ser3; 
    public JButton bleft;
    public JButton  r1 , r2 , r3 ,r4 ,r5 ,r6 ,r7 ,r8 ,r9 ,r10 ,r11 ,r12 ,r13 ,r14 ,r101,r102,r103  ,l0 ,l1,l2,l3,l4,l5; 
    public Font trbi , tr; 
    public static int zero =0 ; 
    public static String user=null;
    public JTextField   jser;
    
    public showmap () throws FileNotFoundException, IOException{
        frame = new JFrame(); 
        frame.setLayout(null);
        
        iback = new ImageIcon("img/mapp.png");
        lback = new JLabel(iback);
            lback.setBounds(0, 0, 1400, 800);
        
        imap = new ImageIcon("img/cm.png");
        lmap = new JLabel(imap);
        
        lg = new JPanel();
               trbi = new Font("serif", Font.BOLD+Font.ITALIC, 32 );
                              tr  = new Font("serif", Font.BOLD+Font.ITALIC, 25 );
                          Font    trr  = new Font("serif", Font.BOLD+Font.ITALIC, 16 );

                              help = new JLabel("UN or RM# search ");
                              frame.add(help);
                              
                              help.setBounds(180, 133, 200, 100);
                              help.setForeground(new Color(255,255,0));
                              help.setFont(trr);
                              
                              
                          lser = new JLabel("Search");
                          jser = new JTextField(20);
                          
                          
                         lser.setBounds(40 ,100, 100, 100);
                         lser.setFont(trbi);
                         lser.setForeground(new Color(0,0,255));
                         frame.add(lser);
                              
                              
                                  
                         jser.setBounds(150 ,135, 210, 30);
                         frame.add(jser);
                              
                          ser1= new JPanel();
                              ser2= new JPanel();

                              ser3= new JPanel();

                         luser= new JLabel("username    ");
                                luser.setFont(tr);
                         luser.setForeground(new Color(255,255,255));
                        frame.add(luser);
                         lroom=new JLabel("room#");
                              
                                   lroom.setFont(tr);
                           lroom.setForeground(new Color(255,255,255));
                         frame.add(  lroom);  
                         
                         ser1.setLayout(new FlowLayout());
                              
                              frame.add(ser1);
                              ser1.setBackground(new Color(255,0,255,80));
                              ser1.setBounds(1080, 140, 270, 40);
                              frame.add(ser2);
                               ser2.setBounds(1080, 180, 270, 40);
                               ser2.setBackground(new Color(255,255,255,50));
                              
                              luser.setBounds(1090, 140, 270, 40);
                               lroom.setBounds(1250, 140, 270, 40);
                               
                               mutaz = new JLabel("");
                               zuhairi=new JLabel("");
                               frame.add(mutaz);
                               frame.add(zuhairi);
                               
                                 mutaz.setBounds(1090, 180, 270, 40);
                                  zuhairi.setBounds(1250, 180, 270, 40);
                                  
                                    mutaz.setFont(tr);
                         mutaz.setForeground(new Color(0,255,255));
                         
                           zuhairi.setFont(tr);
                         zuhairi.setForeground(new Color(0,255,255));
                         
                                  
                                    
                         
                         
                         
                         
                         
        
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
        username = new JLabel("Welcome Admin"); 
         username.setFont(trbi);
         username.setForeground(new Color(0,0,255));
        lg.add(username);
        lg.setBackground(new Color(255,255,255,200));
        lg.setBounds(1100,  20, 230, 50);
        frame.add(lg);
        
       r1 = new JButton ("1"); 
       r2 = new JButton("2");
       r3 = new JButton ("3"); 
       r4 = new JButton("4"); 
              r5 = new JButton("5"); 
                 r6 = new JButton ("6"); 
       r7 = new JButton("7");
       r8 = new JButton ("8"); 
       r9 = new JButton("9"); 
              r10 = new JButton("10"); 
                 r11 = new JButton ("11"); 
       r12 = new JButton("12");
       r13 = new JButton ("13"); 
       r14 = new JButton("14"); 
       
         r101 = new JButton("101");
       r102 = new JButton ("102"); 
       r103 = new JButton("103"); 
       
         l0 = new JButton("Lab 1");
       l1= new JButton ("Lab 2"); 
       l2 = new JButton("Lab 3"); 
       
       
        l3 = new JButton("Lab 4");
       l4 = new JButton ("Lab 5"); 
  
       
       
       
       
       
       
       
       
       
           l0.setBounds(640, 470, 70, 120);
           
           
         
frame.add(l0);

  	l0.setBorderPainted(false);
		l0.setBorder(null);
                		l0.setContentAreaFilled(false);
                                
                              
                               
       
           l1.setBounds(720, 470, 80, 110);
           
           
         
frame.add(l1);

  	l1.setBorderPainted(false);
		l1.setBorder(null);
                		l1.setContentAreaFilled(false);
                                
                           
                               
        l2.setBounds(850, 450, 70, 140);
           
           
       
                
frame.add(l2);

  	l2.setBorderPainted(false);
		l2.setBorder(null);
                		l2.setContentAreaFilled(false);
                             
                           
            l3.setBounds(923, 450, 70, 140);
                
frame.add(l3);

  	l3.setBorderPainted(false);
		l3.setBorder(null);
                		l3.setContentAreaFilled(false);
                             
                          
       
       
       
             l4.setBounds(393, 170, 90, 90);
                
frame.add(l4);

  	l4.setBorderPainted(false);
		l4.setBorder(null);
                		l4.setContentAreaFilled(false);
  
       
       
       
       
       
       
       
           r101.setBounds(240, 350, 100, 110);
           
           
         
frame.add(r101);
  
  	r101.setBorderPainted(false);
		r101.setBorder(null);
                		r101.setContentAreaFilled(false);
                                
                                
                                
                                
           r102.setBounds(320, 420, 80, 110);
           
           
         
frame.add(r102);

  	r102.setBorderPainted(false);
		r102.setBorder(null);
                		r102.setContentAreaFilled(false);
                       
                      
                                
                                
                                
                                
                                
                                
                                                    
           r103.setBounds(370, 500, 80, 110);
           
           
         
frame.add(r103);

  	r103.setBorderPainted(false);
		r103.setBorder(null);
                		r103.setContentAreaFilled(false);
                       
                            
                                
                                
                                
                                
                                
                                
                                
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
             
              r1.setBounds(600, 220, 30, 60);
frame.add(r1);

  	r1.setBorderPainted(false);
		r1.setBorder(null);
                		r1.setContentAreaFilled(false);
                                
                                
                                r2.setBounds(644, 220, 30, 60);
frame.add(r2);

  	r2.setBorderPainted(false);
		r2.setBorder(null);
                		r2.setContentAreaFilled(false);
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                 
                                r3.setBounds(688, 227, 30, 60);
frame.add(r3);


  	r3.setBorderPainted(false);
		r3.setBorder(null);
                		r3.setContentAreaFilled(false);
                                
                                
                               
                                
                                                             
                                 
                                r4.setBounds(730, 230, 30, 55);
frame.add(r4);

  	r4.setBorderPainted(false);
		r4.setBorder(null);
                		r4.setContentAreaFilled(false);
                                
                    
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                                        
                                r5.setBounds(870, 220, 40, 55);
frame.add(r5);

  	r5.setBorderPainted(false);
		r5.setBorder(null);
                		r5.setContentAreaFilled(false);
                                
                             
                                
                                                                                   
                                r6.setBounds(920, 210, 30, 55);
                                
                                
frame.add(r6);

  	r6.setBorderPainted(false);
		r6.setBorder(null);
                		r6.setContentAreaFilled(false);
                                
                             
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                             r7.setBounds(957, 200, 35, 55);
                                
                                
frame.add(r7);

  	r7.setBorderPainted(false);
		r7.setBorder(null);
                		r7.setContentAreaFilled(false);
                              
                             
                                
                                
                                
                                                    r8.setBounds(594, 310, 30, 55);
                                
                                
frame.add(r8);

  	r8.setBorderPainted(false);
		r8.setBorder(null);
                		r8.setContentAreaFilled(false);
                           
                                
                                
                                
                                
                                
                                
                                   
                                                    r9.setBounds(633, 310, 33, 55);
                                
                                
frame.add(r9);

  	r9.setBorderPainted(false);
		r9.setBorder(null);
                		r9.setContentAreaFilled(false);
                           
                           
                                
                                
                                
                                                r10.setBounds(678, 310, 33, 55);
                                
                                
frame.add(r10);
	r10.setBorderPainted(false);
		r10.setBorder(null);
                		r10.setContentAreaFilled(false);
                           
                       
                              
                                
                                
                                
                             
                                     r11.setBounds(718, 315, 36, 55);
                                
                                
frame.add(r11);


	r11.setBorderPainted(false);
		r11.setBorder(null);
                		r11.setContentAreaFilled(false);
                          
                       
                              
                                
                                         
                                
                                
                                
       
                                     r12.setBounds(890, 300, 36, 55);
                                
                                
frame.add(r12);


	r12.setBorderPainted(false);
		r12.setBorder(null);
                		r12.setContentAreaFilled(false);
                          
                                                 
                                
                                
                                
                                
                                
                              r13.setBounds(937, 290, 36, 55);
                                
                                
frame.add(r13);


	r13.setBorderPainted(false);
		r13.setBorder(null);
                		r13.setContentAreaFilled(false);
                                              
                                 
                                
                                
                                
                                
                                
                                
                                
                                
                                            r14.setBounds(975, 274, 33, 55);
                                
                                
frame.add(r14);


	r14.setBorderPainted(false);
		r14.setBorder(null);
                		r14.setContentAreaFilled(false);
                                       
                     
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                             
          llleft = new ImageIcon("img/left.png");
  bleft = new JButton(llleft);
  frame.add(bleft);
    bleft.setBounds(-25, -40, 200, 200);
  	bleft.setBorderPainted(false);
		bleft.setBorder(null);
                		bleft.setContentAreaFilled(false);

                                
                                mutaz zz = new mutaz(); 
                                
                                bleft.addActionListener(zz);
                                
                                   l4.addActionListener(zz);
                                l4.setFont(tr);
                                l4.setForeground(new Color(255,255,255));
                                
                                
                                      l3.addActionListener(zz);
                                l3.setFont(tr);
                                l3.setForeground(new Color(255,255,255));
                                
                                jser.addActionListener(zz);
                                
                                
                                      l2.addActionListener(zz);
                                l2.setFont(tr);
                                l2.setForeground(new Color(255,255,255));
                                
                                
                                          
                                l0.addActionListener(zz);
                                l0.setFont(tr);
                                l0.setForeground(new Color(255,255,255));
                                          
                                l1.addActionListener(zz);
                                l1.setFont(tr);
                                l1.setForeground(new Color(255,255,255));
                                
                                
                                   
                                r103.addActionListener(zz);
                                r103.setFont(tr);
                                r103.setForeground(new Color(255,255,255));
                                
                                
                                   
                                r102.addActionListener(zz);
                                r102.setFont(tr);
                                r102.setForeground(new Color(255,255,255));
                                
                                
                                   
                                r101.addActionListener(zz);
                                r101.setFont(tr);
                                r101.setForeground(new Color(255,255,255));
                                
                                
                                
                                r1.addActionListener(zz);
                                r1.setFont(trbi);
                                r1.setForeground(new Color(255,255,255));
                                
                                  r2.addActionListener(zz);
                                r2.setFont(trbi);
                                r2.setForeground(new Color(255,255,255));
                                
                                  r3.addActionListener(zz);
                                r3.setFont(trbi);
                                r3.setForeground(new Color(255,255,255));
                                
                                
                                  r4.addActionListener(zz);
                                r4.setFont(trbi);
                                r4.setForeground(new Color(255,255,255));
                                
                                
                                  r5.addActionListener(zz);
                                r5.setFont(trbi);
                                r5.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                
                                
                                
                                
                                      r6.addActionListener(zz);
                                r6.setFont(trbi);
                                r6.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                      r7.addActionListener(zz);
                                r7.setFont(trbi);
                                r7.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                
                                
                                
                                
                                      r8.addActionListener(zz);
                                r8.setFont(trbi);
                                r8.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                      r9.addActionListener(zz);
                                r9.setFont(trbi);
                                r9.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                
                                
                                      r10.addActionListener(zz);
                                r10.setFont(trbi);
                                r10.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                
                                      r11.addActionListener(zz);
                                r11.setFont(trbi);
                                r11.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                
                                      r12.addActionListener(zz);
                                r12.setFont(trbi);
                                r12.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                      r13.addActionListener(zz);
                                r13.setFont(trbi);
                                r13.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                      r14.addActionListener(zz);
                                r14.setFont(trbi);
                                r14.setForeground(new Color(255,255,255));
                                
                                
                                
                                
                                
                                
                                
                                         bleft.setFocusPainted(false);

                                
                                
                                
                                
                                
         
        frame.add(lmap);
        lmap.setBounds(330, -340, 800, 800);
    
        frame.add(lback);
        
        frame.setVisible(true);
        frame.setSize(1400,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   

    
    class mutaz implements ActionListener { 

        @Override
        public void actionPerformed(ActionEvent ae) {

            
            
            
            
            
            if(ae.getSource()==jser){
                
                
                
                
                
                
                
                             
                
                        
                String mu ; 
                         
                      int   count1=0 ;
                         int count2=0;
                         try {
                            
                           int i =Integer.parseInt( jser.getText());
                           
                           if(i<=14 && i>=1) {
                           
                           //................
                           String mh ; 

                           File fq = new File("files/info.txt");
                         BufferedReader sq = new BufferedReader (new FileReader(fq));
                         
                         while((mu=sq.readLine() )!=null){
                             if(mu.equals(jser.getText())){
                                 zuhairi.setText(""+i);
                                 mutaz.setText(sq.readLine());
                                  new showmap();
                                 frame.setVisible(false);
                                count1=1;
                                break;
                             }
                
                             }
                         
                         if(count1==0){
                             JOptionPane.showMessageDialog(null,"sorry thiss room not has a Doctor !");
                         }
                         
                         
                         
                           }
                           
                           else 
                               
                           {
     JOptionPane.showMessageDialog(null,"Please insert room between 1-14 only !");

                           }
                         //..............
                         }
                         
                         catch(Exception e){
                             
                             String g = jser.getText();
                             
                             
                                   
                                   
                         File fqqq = new File("files/info.txt");
                         BufferedReader sqqq = null;
                    try {
                        sqqq = new BufferedReader (new FileReader(fqqq));
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
                    }
                         
                    try {
                        while((mu=sqqq.readLine() )!=null){
                            if(mu.equals(g)){
                                mutaz.setText(g);
                               
                                zuhairi.setText(sqqq.readLine());
                                        new showmap();
                                frame.setVisible(false);
                                count2=1;
                               break;
                            }
                            
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
                    }
                         
                         if(count2==0){
                             JOptionPane.showMessageDialog(null,"sorry thiss Youser Name not exist !");
                         }
                             
                         }
                         
                
                
                
                
                
                
                
                
                
                
                
                
                
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
 if (ae.getSource()==r1)
 {
      
     String g ; 
     
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("1")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
             
                 

            
             office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
            
                
        
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
 }
 
 
 
 if (ae.getSource()==r2)
 {
 
     
     String g ; 
 
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("2")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
              
             
   
             
             office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
             
                
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
      }
 
 
 
 if (ae.getSource()==r3)
 {





 
     
     String g ; 
   
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("3")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
           
             office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
                
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     

















 }
 
 
 if (ae.getSource()==r4)
 {






 
     
     String g ; 
    
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("4")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
            
          
             office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
                 
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     


















 }
 
 
 if (ae.getSource()==r5)
 {


 
     
     String g ; 
  
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("5")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
            
             office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
              
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
 if (ae.getSource()==r6)
 {


 
     
     String g ; 
   
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("6")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
              office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
 if (ae.getSource()==r7)
 {


 
     
     String g ; 

     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("7")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
                office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
    
 
 
 
 
  
 if (ae.getSource()==r8)
 {


 
     
     String g ; 
  
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("8")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
                office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
    
 
 
 
    
 
 
 
 
 
 
 
  
 if (ae.getSource()==r9)
 {


 
     
     String g ; 
  
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("9")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
           
             office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
    
 
 
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
 if (ae.getSource()==r10)
 {


 
     
     String g ; 
    
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("10")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
              office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
    
 
 
 
 
 
 
    
 if (ae.getSource()==r11)
 {


 
     
     String g ; 
 
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("11")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
                office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
         
        
        
        
 
 
 
 
 
 
 
 
 
  
 if (ae.getSource()==r12)
 {


 
     
     String g ; 
  
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("12")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
           
             office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
 if (ae.getSource()==r13)
 {


 
     
     String g ; 
     
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("13")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
                
             office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
 if (ae.getSource()==r14)
 {


 
     
     String g ; 
   
     
     int count =0 ; 
          File f = new File("files/info.txt");
                BufferedReader s = null;
     try {
         s = new BufferedReader (new FileReader(f));
         
              while((g=s.readLine() )!=null){
                     
                    if(g.equals("14")){
                        
                        
                        user =s.readLine();
                        count=1 ; 
                       
                    }
                     
             }
     
     } 
     catch (FileNotFoundException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     
     
     
     
     
     if(count ==1){
         LogIn.userfield.setText(user);
      
         try {
            frame.setVisible(false);
             zero=1; 
             new office100();
             office100.bleft.setIcon(llleft );
                office100.username.setText(user+"  Office");
               
         } catch (IOException ex) {
             Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     else {
         JOptionPane.showMessageDialog(null, "there's no  Dr in this office !!!");
     }
     
     
     
     
     
     
     
     
     









 }
    
 
 
 
 
 
 
 
 
        
        if(ae.getSource()==bleft){
            frame.setVisible(false);
            map.frame.setVisible(true);
            
        }
        
        
        
        if(ae.getSource()==r101){
            room.setroom ="101";
     try {
            frame.setVisible(false);
         new room();
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        
        
        
        
        
        if(ae.getSource()==r102){
            room.setroom ="102";
     try {
            frame.setVisible(false);
         new room();
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        
        
        
        
        
        
        
        
        
        
        if(ae.getSource()==r103){
            room.setroom ="103";
     try {
            frame.setVisible(false);
         new room();
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        
        
        
        
        
        
        
        
          
        if(ae.getSource()==l0){
            
            room.setroom ="lab1";
     try {
           frame.setVisible(false);
         new room();
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        
        
        
        
        
        
        
               
        
        
          
        if(ae.getSource()==l1){
            
            room.setroom ="lab2";
     try {
           frame.setVisible(false);
         new room();
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        
        
        
        
        
          if(ae.getSource()==l2){
              
            room.setroom ="lab3";
     try {
           frame.setVisible(false);
         new room();
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        
        
          
          if(ae.getSource()==l3){
             
            room.setroom ="lab4";
     try {
            frame.setVisible(false);
         new room();
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        
          
          
                  
          
          if(ae.getSource()==l4){
            
            room.setroom ="lab5";
     try {
           frame.setVisible(false);
         new room();
     } catch (IOException ex) {
         Logger.getLogger(showmap.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
    }
}
