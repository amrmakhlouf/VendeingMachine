package project;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class whatever {
	
	
	 public JLabel l,label,label2 ;
	 public JLabel drs , MUTAZ, PRO ,IN;
	 public JButton LOGIN,b,c,d,e,u,i,p,j ,ADD;
	  public  Font font;
	
        public static  JFrame frame;
        public static int count=0 ; 
        
      
	 
	 
     Icon m,o ,x,login,exit,w,h,uu,ii,pp,jj,ss , DRS ,mutaz , pro ,in ,add,t;
     
	
	public whatever() {
		m =new ImageIcon("img/engff.jpg");
		l = new JLabel(m);
		ss=new ImageIcon("img/sss.png");
		label2= new JLabel(ss);
		add = new ImageIcon("img/add.png");
		o = new ImageIcon("img/q.jpg");
		x= new ImageIcon("img/help3.png");
		login= new ImageIcon("img/login.png");
		exit= new ImageIcon("img/who.png");
		w= new ImageIcon("img/exi.png");
		h= new ImageIcon("img/qq.png");
		uu= new ImageIcon("img/k.jpg");
		ii= new ImageIcon("img/k.jpg");
        pp= new ImageIcon("img/k.jpg");
		jj= new ImageIcon("img/k.jpg");
  in= new ImageIcon("img/in.png");
                pro = new ImageIcon("img/pro.png");
               
                
                
             
              drs=new JLabel (DRS); 
            
            ADD = new JButton(add);
		LOGIN = new JButton(login);
		b = new JButton(x);
		c= new JButton(exit);
		d= new JButton(w);
		   MUTAZ = new JLabel(mutaz);
		e= new JButton(h);
		u= new JButton(uu);

		i= new JButton(ii);

		p= new JButton(pp);

		j= new JButton(jj);


		label = new JLabel(o);
		
			PRO= new JLabel(pro);	
		
	 IN =new JLabel(in);
		
	frame= new JFrame(" first");
		
		l.setBounds(0, 0, 1400, 800);
		label.setBounds(580,230,300,300);
		LOGIN.setBounds(420,210,170,170);
		b.setBounds(850,210,170,170);
		c.setBounds(850,395,170,170);
		d.setBounds(440,395,170,170);
		e.setBounds(640,90,170,170);
                
                ADD.setBounds(640,500,170,179);
                IN.setBounds(-130, 150, 700, 290);
                 drs.setBounds(-140, 300,700, 290);
		MUTAZ.setBounds(870 , 300,700,290);
                PRO.setBounds(820, 150, 700, 290);
		label2.setBounds(370,30,700,100);
		frame.setLayout(null);
		
		
		LOGIN.setBorderPainted(false);
		LOGIN.setBorder(null);
LOGIN.setFocusPainted(false);
		LOGIN.setContentAreaFilled(false);
                
                
                
		ADD.setBorderPainted(false);
		ADD.setBorder(null);
ADD.setFocusPainted(false);
		ADD.setContentAreaFilled(false);
		
		b.setBorderPainted(false);
		b.setBorder(null);
b.setFocusPainted(false);
		b.setContentAreaFilled(false);
		
		c.setBorderPainted(false);
		c.setBorder(null);
c.setFocusPainted(false);
		c.setContentAreaFilled(false);
		
		d.setBorderPainted(false);
		d.setBorder(null);
d.setFocusPainted(false);
		d.setContentAreaFilled(false);
		
		e.setBorderPainted(false);
		e.setBorder(null);
e.setFocusPainted(false);
		e.setContentAreaFilled(false);
		
		u.setBorderPainted(false);
		u.setBorder(null);
u.setFocusPainted(false);
		u.setContentAreaFilled(false);
		
		i.setBorderPainted(false);
		i.setBorder(null);
i.setFocusPainted(false);
		i.setContentAreaFilled(false);
		
		p.setBorderPainted(false);
		p.setBorder(null);
p.setFocusPainted(false);
		p.setContentAreaFilled(false);
		
		j.setBorderPainted(false);
		j.setBorder(null);
j.setFocusPainted(false);
		j.setContentAreaFilled(false);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new WhoRwe();
			}});
		
		e.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Discreption();
			}});
		d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Help();
			}});
		
		
		
		
		
		
		frame.add(IN);
		
		
		frame.add(label2);
		
	
		
	frame.add(PRO);
		
		     frame.add(ADD);
	       
		frame.add(u);
		frame.add(i);
		frame.add(p);
		
		
		
		frame.add(j);
		
		frame.add(c);
		frame.add(d);
		frame.add(e);
		
		frame.add(drs);
                frame.add(MUTAZ);
		
		frame.add(b);
		
		 frame.add(LOGIN);
		frame.add(label);
		
	       frame.add(l);
                
               
               mutaz zz = new mutaz();
               
               b.addActionListener(zz);
               
               LOGIN.addActionListener(zz);
               ADD.addActionListener(zz);
	 c.addActionListener(zz);
			
	       frame.setSize(1400,800);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		frame.setVisible(true);
		
	}
	
	
	
	
	
	class mutaz implements ActionListener { 

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        
            
            if(ae.getSource() == LOGIN){
                
                if(count==0){
                 new LogIn();
                whatever.frame.setVisible(false);
                count++;
                }
                else 
                    LogIn.c.setVisible(true);
            }
            
            if(ae.getSource() ==  ADD){
                 new LogAdmin();
                   whatever.frame.setVisible(false);
                
            }
            
             if(ae.getSource() ==  c){
                try {
                    new current();
                } catch (IOException ex) {
                    Logger.getLogger(whatever.class.getName()).log(Level.SEVERE, null, ex);
                }
                   whatever.frame.setVisible(false);
                
            }


        }
            
        }
	
	
	
	
	
	public static void main(String[] args) {
		
		new whatever();
	
		
	}}
	


