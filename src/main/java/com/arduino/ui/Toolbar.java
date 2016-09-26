package com.arduino.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Toolbar extends JMenuBar implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenu file;
	
	private MyButton start;
	
	private MyButton stop;
	
	public Toolbar(){
		
		setBorder(BorderFactory.createEtchedBorder());
		
		file = new JMenu("File");
		start = new MyButton("Start");
		stop = new MyButton("Stop");
		
		setLayout(new FlowLayout(FlowLayout.LEADING));
		
		add(file);
		
		add(start);
		
		add(stop);
		
	}//end constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}