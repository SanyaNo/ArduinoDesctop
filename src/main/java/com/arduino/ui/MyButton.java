package com.arduino.ui;


import java.awt.Dimension;

import javax.swing.JButton;

import org.springframework.stereotype.Component;


public class MyButton extends JButton {
	

	public MyButton(String name){
		
		super(name);
		Dimension dm = new Dimension(70, 25);
		setPreferredSize(dm);
		
	}
}