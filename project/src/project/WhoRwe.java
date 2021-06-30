package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhoRwe {
	
	
	
	JFrame frame001 = new JFrame();
	JLabel p,tt,yy;
	JPanel q,e;
	
	
	
	JButton button001 ;
	Icon k,i,t,r;
	
	WhoRwe(){
		i =new ImageIcon("img/13.png");
	k= new ImageIcon("img/left.png");
	t =new ImageIcon("img/y.png");
	r= new ImageIcon("img/11122.jpg");
	p =new JLabel(i);
	tt= new JLabel(t);
	yy= new JLabel(r);
	q =new JPanel();
	e =new JPanel();
	
	q .setBounds(800 ,20 ,400 ,650);
    q.setBackground(new Color(200,200,200,150));

    q.setLayout(null);
	e .setBounds(200 ,20 ,400 ,650);
    e.setBackground(new Color(200,200,200,150));

    e.setLayout(null);
	
		button001= new JButton(k);
		button001.setBorderPainted(false);
		button001.setBorder(null);
		button001.setFocusPainted(false);
		button001.setContentAreaFilled(false);
		
		
		
		
		frame001.add(button001);
		
		frame001.add(p);
		
		

		
		button001.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				frame001.setVisible(false);
				new whatever();
			}});
		
		
		frame001.setLayout(null);
		
		
		
		button001.setBounds(10, -10, 100, 120);
		p.setBounds(0, 0, 1400, 800);
		tt.setBounds(400,19, 200,200);
		yy.setBounds(1000,19, 200, 200);
		
		 frame001.setSize(1400,760);
	       frame001.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame001.setVisible(true);
	}
	
	
}