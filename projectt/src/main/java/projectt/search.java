/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;import java.util.Scanner;
import java.util.logging.Formatter;
;
public class search {
      public JFrame frame;
    public JButton f,f2,f3,clear;
    public JLabel l;
    public JTextField j;
    public JTextArea area,area1;
    Icon FF,vv,sad,c,cc;
   public Scanner x;     
   
   String ss;
   public String n;
   public int u;
    search(){
        c=new ImageIcon("clear.jpg");
        cc=new ImageIcon("Back6.jpg");
           FF = new ImageIcon("SEA.png");
                vv = new ImageIcon("blueee.jpg");
j = new JTextField();

area= new JTextArea();
area1= new JTextArea();

        l = new JLabel(vv);
         f = new JButton(FF);
                  f2= new JButton();
                    f3= new JButton(cc);
                    clear= new JButton(c);
                  frame = new JFrame("search"); 
                  
                          j.setBounds(800, 370, 150, 30);
                                                    f.setBounds(300, 330, 120, 30);
                                             f2.setBounds(90, 70, 70, 70);
 f3.setBounds(800, 330, 120, 30);
 
  clear.setBounds(680, 650, 120, 30);
                		f2.setBorderPainted(false);
		f2.setBorder(null);
f2.setFocusPainted(false);
		f2.setContentAreaFilled(false);
                                                f2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
                                
                                new Homee();
                                
                           				

			}});
                                                        clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
                            
                            area1.setText("");
                           		                            area.setText("");
		j.setText("");
                
                                                 JOptionPane.showMessageDialog(null,"Cleared!!");                   
                                                                    

			}});          
                         f.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
			 try{  x = new Scanner(new File("E:/test.txt"));
                         x.useDelimiter("[,\n ]");
                         while(x.hasNext()){
                             String a=x.next();
                                                          String b=x.next();
                             String c=x.next();
                             String z=x.next();
                             area.append(a+","+b+","+c+","+z+"\n");

                            }x.close();
                         
                         }catch(Exception e) { JOptionPane.showMessageDialog(null,e+"notFound");}
                           	
                         

			}});
                         
                           f3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
			 try{  
                           
              String h=j.getText();
                             String old = "E:/test.txt";
                             boolean r =false;
                             String id=""; String firstname=""; String lastname=""; String phone="";
                             Scanner x =  new Scanner(new File(old));
       x.useDelimiter("[,\n]");
                               while(x.hasNext()&& !r){
           id =x.next();
           firstname =x.next();
           lastname =x.next();
           phone =x.next();
           
                   if(id.equals(h))  {
                       r=true;
                   }
                   
                   if(r){
                       area1.append(id+","+firstname+","+lastname+","+phone+"\n");
                       
                       
                   }
                 
                   
                            }  x.close();
                       
                         }catch(Exception e) { JOptionPane.showMessageDialog(null,"there is no person with this number");}
                         	
                         
			}});
                           
           area.setBounds(300, 420, 400, 200);
           area1.setBounds(800, 420, 400, 200);
    
    frame.add(f2);
     frame.add(f3);
    frame.add(area);
     frame.add(clear);


frame.add(area1);
frame.add(f);
frame.add(j);
                  frame.add(l);
                  frame.setVisible(true);
              
		  frame.setSize(1400,900);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
