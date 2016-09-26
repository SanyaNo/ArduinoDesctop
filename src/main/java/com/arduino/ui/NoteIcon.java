package com.arduino.ui;


import javax.swing.ImageIcon;

import org.springframework.stereotype.Component;

public class NoteIcon extends ImageIcon {
	
	private String path;
	
	public NoteIcon(){}
	
	public NoteIcon(String path){
		super(path);
		
		this.path = path;

	}
	
	public ImageIcon getSmaller(){
		return new ImageIcon((this.getImage()).getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
	}
	
}