package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Discreption {
	JFrame frame11 = new JFrame();
	JButton n;
	Icon g,w,h; 
	JLabel z,q;	
	Discreption(){
		g= new ImageIcon("img/left.png");
		n= new JButton(g);
		w= new ImageIcon("img/bk.png");
		h= new ImageIcon("img/ce.png");
		z= new JLabel(w);
		q= new JLabel(h);
		frame11.add(n);

		frame11.add(z);

		n.setBorderPainted(false);
		n.setBorder(null);
		n.setContentAreaFilled(false);

		
		
		
		
		
		
		n.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				frame11.setVisible(false);
				new whatever();
			}});
		
		n.setBounds(10, -10, 100, 120);
		z.setBounds(0, 0, 1350, 700);
		q.setBounds(450,80 , 500, 100);

		
		frame11.setLayout(null);
		
		
		 frame11.setSize(1400,800);
	       frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame11.setVisible(true);
	}
	
	

}
