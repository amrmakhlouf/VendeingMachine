/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;import java.util.Scanner;
;

public class delete {
     public JFrame frame;
    public JButton f,f2;
    public JLabel l;
    public JTextField j;
    
    Icon FF,vv,sad;
    delete(){
        FF = new ImageIcon("deletee.png");
                vv = new ImageIcon("k.png");
j = new JTextField();

        l = new JLabel(FF);
         f = new JButton(sad);
                  f2= new JButton(vv);
                  
                  frame = new JFrame("delete");  
                  
                         f.setBounds(40,40,60,60);

                         j.setBounds(320, 440, 300, 40);
                                                  f2.setBounds(660, 390, 120, 120);
                                                  
                                                  
                                                  		              		f2.setBorderPainted(false);
		f2.setBorder(null);
f2.setFocusPainted(false);
		f2.setContentAreaFilled(false);
                
           

f.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
                                				new Homee();

				
			}});
f.setBorderPainted(false);
		f.setBorder(null);
f.setFocusPainted(false);
		f.setContentAreaFilled(false);


f2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
                            String old = "E:/test.txt";
                            String temp = "E:/temp.txt";
 File nfile = new File (temp);
  File ofile = new File (old);
  String id=""; String firstname=""; String lastname=""; String phone="";
			 try{ 
                               FileWriter fw= new FileWriter(temp,true);   
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
       Scanner x =  new Scanner(new File(old));
       x.useDelimiter("[,\n]");
                               while(x.hasNext()){
           id =x.next();
           firstname =x.next();
           lastname =x.next();
           phone =x.next();
           if(!id.equals(j.getText())){
               pw.println(id+","+firstname+","+lastname+","+phone);
           }
           
       }
       x.close();
       pw.flush();
       pw.close();
       ofile.delete();
       File dump = new File(old);
       nfile.renameTo(dump);
       
                         JOptionPane.showMessageDialog(null,"user has been deleted");
                         j.setText("");
                         
                         }catch(Exception e) { JOptionPane.showMessageDialog(null,"Its not working");}
                        
			}});

         frame.add(j);
                          frame.add(f2);
                                                    frame.add(f);


                                           frame.add(l);

         frame.setSize(1400,900);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		frame.setVisible(true);
        
        
    }
    
}
