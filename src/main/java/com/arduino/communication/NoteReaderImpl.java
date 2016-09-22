package com.arduino.communication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arduino.utils.ArduinoComProvider;
@Component
public class NoteReaderImpl implements NoteReader {
	
	@Autowired
	private ArduinoComProvider provider;

	@Override
	public void start() {
		provider.setRunning(true);
		
	}

	@Override
	public Integer read() {
		System.out.println("Start method");

		while (provider.isRunning()) {

			int note = provider.getCurrentLine();
			System.out.println(note);
		}
		return null;
	}

	@Override
	public void stop() {
		provider.setRunning(false);
		
	}

	@Override
	public void closePort() {
		provider.close();
	}


}
