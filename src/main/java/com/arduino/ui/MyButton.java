package com.arduino.ui;


import java.awt.Dimension;

import javax.swing.JButton;


public class MyButton extends JButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3235609526808176809L;

	public MyButton(String name){
		
		super(name);
		Dimension dm = new Dimension(70, 25);
		setPreferredSize(dm);
		
	}
}