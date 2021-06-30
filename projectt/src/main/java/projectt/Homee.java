/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Homee {
     public static  JFrame frame3;
    public JLabel ba3;
    public JButton add,delete,search,update,who,back,v2,AAA,BBB,CCC;
    
    
    Icon a,d,s,u,w,y,b3,v,bk,AA,BB,CC;
    
    Homee(){
        
        frame3= new JFrame("home");
        b3 = new ImageIcon("Back7.jpg");
        a= new ImageIcon("add.png");
        bk= new ImageIcon("previous.png");
        v= new ImageIcon("view.png");
                u= new ImageIcon("upp.png");
                                y= new ImageIcon("info.png");
                                
                                AA= new ImageIcon("A.png");
                                          BB= new ImageIcon("B.png");

                                      CC= new ImageIcon("C.png");

                                


        back = new JButton(bk);
        AAA= new JButton(AA);
               BBB= new JButton(BB);

                        CCC= new JButton(CC);

        d = new ImageIcon("delete.png");
        s = new ImageIcon("search.png");
        ba3 = new JLabel(b3);
        delete= new JButton(d);
        add= new JButton(a);
          search= new JButton(s);
            update= new JButton(u);
             who= new JButton(y);  
                back= new JButton(bk);
                v2= new JButton(v);
        
                   		add.setBorderPainted(false);
		add.setBorder(null);
add.setFocusPainted(false);
		add.setContentAreaFilled(false);
                                		 

                
                                   		delete.setBorderPainted(false);
		delete.setBorder(null);
delete.setFocusPainted(false);
		delete.setContentAreaFilled(false);
                
                                                 		search.setBorderPainted(false);
		search.setBorder(null);
search.setFocusPainted(false);
		search.setContentAreaFilled(false);
                                                             		update.setBorderPainted(false);
		update.setBorder(null);
update.setFocusPainted(false);
		update.setContentAreaFilled(false);
                
                                		back.setBorderPainted(false);
		back.setBorder(null);
back.setFocusPainted(false);
		back.setContentAreaFilled(false);
                
                                          		v2.setBorderPainted(false);
		v2.setBorder(null);
v2.setFocusPainted(false);
		v2.setContentAreaFilled(false);
                
                add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
                                				
                                new AddEmployee();

				
			}});
                
                     
                               
                                     
                                       
 
		
                        
                             search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
                                				
                                new search();


				
			}});
                                   delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
                                				
                                new delete();


				
			}});
                                back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
                                				
                                new Login();


				
			}});
                      
                                                    update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
                                
                                new update();

				
			}});
                  
                    
                                 update.setBounds(980,350,80,80);
v2.setBounds(1120,350,70,70);
who.setBounds(1270,600,70,70);
                
                delete.setBounds(580,340,90,90);
                 search.setBounds(780,350,80,80);

        add.setBounds(380,340,90,90);
        
             

        
                back.setBounds(110,700,70,70);
       
        
     

       
        frame3.add(back);
        frame3.add(update);
        frame3.add(search);
        frame3.add(delete);
        frame3.add(add);
        frame3.add(ba3);
        
          frame3.setSize(1400,900);
	       frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		frame3.setVisible(true);
        
    }
    
}
