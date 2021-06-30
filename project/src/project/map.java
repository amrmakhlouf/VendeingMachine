
 


package project;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class map {
    
    public static JFrame frame ; 
    public Icon  back ,what,off, mapp ,mmmap , ooofice ,sleft; 
    public JLabel  lback,lwhat ,lmmmap , looofice ,username; 
    public JButton office , map ,bleft ; 
    public JPanel  right , left  , ldown,rdown ,lg; 
    public static int xx= 0;
    
    public Font trbi ; 
    
    public map () { 
        frame = new JFrame();
       frame.setLayout(null);
       
          sleft = new ImageIcon("img/exit21.png");
         bleft = new JButton(sleft);
          frame.add(bleft);
    bleft.setBounds(10, -10, 200, 200);
  	bleft.setBorderPainted(false);
		bleft.setBorder(null);

		bleft.setContentAreaFilled(false);
                
                
                       lg = new JPanel();
                 frame.add(lg);
        username = new JLabel("Welcome Admin"); 
         trbi = new Font("serif", Font.BOLD+Font.ITALIC, 32 );
         username.setFont(trbi);
         username.setForeground(new Color(0,0,255));
        lg.add(username);
        lg.setBackground(new Color(0,0,0,200));
        lg.setBounds(1020,  20, 330, 60);
        
        
       back = new ImageIcon("img/adminback.jpg"); 
       lback = new JLabel(back);
       mapp = new ImageIcon("img/mac.png");
         off = new ImageIcon("img/off.png");
       
       right = new JPanel(); 
       left = new JPanel();
       ldown = new JPanel();
       rdown = new JPanel();
       
       mmmap =  new ImageIcon ("img/map.png"); 
       ooofice = new ImageIcon("img/office.png");
       lmmmap = new JLabel(mmmap);
      looofice = new JLabel(ooofice);
       
       right.setBackground(new Color(0,0,0,100));
              left.setBackground(new Color(0,0,0,100));
                     rdown.setBackground(new Color(0,0,0,100));
              ldown.setBackground(new Color(0,0,0,100));


             ldown.add(looofice);
              rdown.add(lmmmap);
       
        
              
             
              
       what= new ImageIcon("img/what.png"); 
       lwhat = new JLabel(what);
       
       office = new JButton (mapp) ; 
       
       map = new JButton(off); 
       office.setFocusPainted(false);
              map.setFocusPainted(false);

       
       office.setBorderPainted(false);
		office.setBorder(null);

		office.setContentAreaFilled(false);
                
                    map.setBorderPainted(false);
		map.setBorder(null);

		map.setContentAreaFilled(false);
        
             
    
            right.setBounds(250, 250, 300, 250);
            left.setBounds(850, 250, 300, 250);
            
               ldown.setBounds(250, 500, 300, 100);
            rdown.setBounds(850, 500, 300, 100);
       
   
map.setBounds(250, 250, 300, 250);
office.setBounds(850, 250, 300, 250);
           frame.add(lwhat); 
       lback.setBounds(0, 0, 1400, 800);
        lwhat.setBounds(-30, -300, 1400, 800);
        
        
        mutaz zz = new mutaz();
        bleft.addActionListener(zz);
     
        map.addActionListener(zz);
        office.addActionListener(zz);
        
        
        
        
        
         frame.add(ldown);
       frame.add(rdown);
        
        
        
        
        
        
        
                   frame.add(office);
       frame.add(map);
      
        
                 frame.add(right);
              frame.add(left);
       
        
        

                 bleft.setFocusPainted(false);

        
         frame.add(lback); 
        frame.setSize(1400,800);
        frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   public class mutaz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==bleft){
            
           
            frame.setVisible(false);
          LogIn.pass.setText("");
           LogIn.c.setVisible(true);
                     LogIn.userfield.setText("");
     showmap.zero=0;
        xx=0;
          
        }    
        
        
            
           
            if(ae.getSource()==map){
            
           LogIn.userfield.setText("admin");
            frame.setVisible(false);
          
        try {
            new office101();
        } catch (IOException ex) {
            Logger.getLogger(map.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        }   
            
            
                   if(ae.getSource()==office){
            
           
            frame.setVisible(false);
          xx=1;
        try {
            new showmap();
        } catch (IOException ex) {
            Logger.getLogger(map.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        }   
        
        
        
        
        
        
        
        
        }
       
   }
    
}
