package com.arduino;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;

import com.arduino.communication.NoteReader;

public class App {
	


	@Autowired
	private JFrame myWindow;
	
	@Autowired
	private NoteReader reader;

}
