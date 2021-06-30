/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddEmployee {
    public static  JFrame frame4;
    public static JTextField u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11 ;
    public static JButton add,back3,add1,add2;
    public static FileWriter fw;
    
    public static JLabel k;
    
    Icon g,l,n,o;
    
    AddEmployee(){
         g = new ImageIcon("blackk.jpg");

        l = new ImageIcon("adde.png");
                o = new ImageIcon("SEAaa.png");

                n = new ImageIcon("tap.png");
add1= new JButton(n);

add2= new JButton(o);

        k=new JLabel(g);
        u1= new JTextField(20);
         u2= new JTextField(20);
          u3= new JTextField(20);
           u4= new JTextField(20);
            u5= new JTextField(20);
             u6= new JTextField(20);
              u7= new JTextField(20);
               u8= new JTextField(20);
                 u9= new JTextField(20);
              u10= new JTextField(20);
                             u11= new JTextField(20);

               add = new JButton(l);
                              back3 = new JButton();

                
        frame4 = new JFrame();
        
        
        u1.setText("");
        u2.setText("");
        u3.setText("");
        u4.setText("");
        u5.setText("");
        u6.setText("");
        u7.setText("");
        u8.setText("");
       

                       		back3.setBorderPainted(false);
		back3.setBorder(null);
back3.setFocusPainted(false);
		back3.setContentAreaFilled(false);

  
    
                
                
                back3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame4.setVisible(false);
                                
                                new Homee();
                                
                           				

			}});
                
                	add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
           
  try
  {
	  fw= new FileWriter("E:/test.txt",true);
	  fw.write(u1.getText()+","+u2.getText()+","+u3.getText()+","+u4.getText()+"\n");
	  fw.close();
	  JOptionPane.showMessageDialog(null,"done!");
	  
	    u1.setText("");
            u2.setText("");
            u3.setText("");
            u4.setText("");
  }catch(Exception e) { JOptionPane.showMessageDialog(null,e+"مزابط");}
	  
                               }
                               	
                                 });
     
                        
                add.setBounds(780, 500, 120, 30);
                                add2.setBounds(730, 630, 120, 30);

                                back3.setBounds(40, 70, 70, 70);


        u1.setBounds(500, 180, 150, 30);
        
        u2.setBounds(500, 250, 150, 30);
        u3.setBounds(500, 310, 150, 30);
        
        u4.setBounds(500, 360, 150, 30);
        
        u5.setBounds(500, 410, 150, 30);
        
        u6.setBounds(300, 460, 150, 30);
                   u7.setBounds(300, 560, 150, 30);

                        u8.setBounds(300, 510, 150, 30);

        
           u9.setBounds(850, 180, 150, 30);

        u10.setBounds(850, 250, 150, 30);
        

        frame4.add(back3);
        frame4.add(add);
                               

                       

        
        frame4.add(u1);
        frame4.add(u2);
        frame4.add(u3);
        frame4.add(u4);
       
      
    
                              

        frame4.add(k);
        
          frame4.setSize(1300,800);
	       frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		frame4.setVisible(true);

        
    }
    
}
