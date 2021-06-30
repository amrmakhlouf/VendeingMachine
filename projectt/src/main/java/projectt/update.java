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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class update {
     public JFrame frame;
    public JButton f1,f2,f3,f4,f5;
    public JLabel l;
    public JTextField j1,j2,j3,j4,j5;
    public JTextArea area;
    public JLabel e;
    Icon FF,vv,sad;
   
    update(){
        
    FF = new ImageIcon("backup.png");
        vv = new ImageIcon("ll.jpg");
                frame = new JFrame("update");
e = new JLabel(FF);
        j1 = new JTextField();
                j2 = new JTextField();

                        j3 = new JTextField();

                                j4 = new JTextField();
                                        j5 = new JTextField();

                                f1= new JButton();
                                f2= new JButton(vv);
                                f1.setBounds(40, 70, 70, 70);
                                                                f2.setBounds(700,540, 120, 30);

                                j1.setBounds(340, 400, 150, 30);
                                                                j2.setBounds(540, 400, 150, 30);

                                                                                                j3.setBounds(740, 400, 150, 30);

                                                                                                                                j4.setBounds(940, 400, 150, 30);

                                j5.setBounds(340, 300, 150, 30);
                                
                                                                f1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
                                
                                new Homee();

				
			}});
                                                                          		f1.setBorderPainted(false);
		f1.setBorder(null);
f1.setFocusPainted(false);
		f1.setContentAreaFilled(false);
                      
                                                                f2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
			
                            String oldf = "E:/test.txt";
                            String newf="E:/teemp.txt";
                            String ido= j5.getText();
                                                        String idn= j1.getText();
                                                        String namen= j2.getText();
                       String lnamen= j3.getText();
                       String phonee= j4.getText();
                       
                       File nfile = new File (newf);
  File ofile = new File (oldf);
  String id=""; String firstname=""; String lastname=""; String phone="";
   try{
   
       FileWriter fw= new FileWriter(newf,true);
       BufferedWriter bw = new BufferedWriter(fw);
       PrintWriter pw = new PrintWriter(bw);
       Scanner x =  new Scanner(new File(oldf));
       x.useDelimiter("[,\n]");
        while(x.hasNext()){
            id=x.next();
            firstname=x.next();
            lastname=x.next();
            phone=x.next();
            if(id.equals(ido)){
                
                pw.println(idn+","+namen+","+lnamen+","+phonee);
            }
            else{
               pw.println(id+","+firstname+","+lastname+","+phone); 
            }
        }
        
         x.close();
       pw.flush();
       pw.close();
       ofile.delete();
       File dump = new File(oldf);
       nfile.renameTo(dump);
       JOptionPane.showMessageDialog(null,"user has been edited");
       j1.setText("");
       j2.setText("");
       j3.setText("");
       j4.setText("");
       j5.setText("");
       
   }catch(Exception e) { JOptionPane.showMessageDialog(null,"Its not working");}
                            
			}});

                frame.add(f1);
                frame.add(f2);
                frame.add(j1);
frame.add(j2);
frame.add(j3);
frame.add(j4);
frame.add(j5);
        frame.add(e);
                frame.setVisible(true);
              
		  frame.setSize(1400,900);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
    }
    
}
