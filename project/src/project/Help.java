package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help {
	JFrame frame1 =new JFrame();
	JButton i;
	Icon p,t,v,DS,WR,LD,L,U,dd;
	JLabel f,s,x,z,n,m,g,ddd;
	
	
	
	Help(){
		t= new ImageIcon("img/ssssss.png");
		p = new ImageIcon("img/left.png");
		v = new ImageIcon("img/ce.png");
		DS = new ImageIcon("img/qq.png");

		WR = new ImageIcon("img/help3.png");

		LD = new ImageIcon("img/add.png");

		L = new ImageIcon("img/login.png");

		U = new ImageIcon("img/who.png");
		dd= new ImageIcon("img/w.png");

		
		x = new JLabel(DS);
		z = new JLabel(WR);
		n = new JLabel(LD);
		m = new JLabel(L);
		g = new JLabel(U);


		f = new JLabel(v);
		s = new JLabel(t);
		ddd= new JLabel(dd);
		i= new JButton(p);
		i.setBounds(10, -10, 100, 120);
		s.setBounds(0, 0, 1400, 720);
		
		f.setBounds(450,30, 500, 100);
		
		x.setBounds(250, 150, 100, 120);
		z.setBounds(250, 300, 100, 120);
		n.setBounds(250, 450, 120, 120);
		m.setBounds(750, 150, 130, 120);
		g.setBounds(770, 300, 100, 120);
		ddd.setBounds(770, 450, 100, 120);



		
i.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				frame1.setVisible(false);
				new whatever();
			}});
		i.setBorderPainted(false);
		i.setBorder(null);

		i.setContentAreaFilled(false);
		frame1.add(i);
		
	       frame1.add(s);
		frame1.setLayout(null);
		
		
		 frame1.setSize(1400,800);
	       frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
	}

}
