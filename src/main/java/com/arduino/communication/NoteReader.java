package com.arduino.communication;



public interface NoteReader {
	
	void start();
	Integer read();
	void stop();
	void closePort(); 
	
}
