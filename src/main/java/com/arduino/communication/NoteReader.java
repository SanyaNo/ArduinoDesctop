package com.arduino.communication;

public interface NoteReader {
	
	void start();
	void read();
	void stop();
	void closePort(); 
	
}
