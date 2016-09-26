package com.arduino.communication;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arduino.utils.ArduinoComProvider;

@Component
public class NoteReaderImpl implements NoteReader {

	@Autowired
	private ArduinoComProvider provider;

	@PostConstruct
	public void test() {
		start();
		while (provider.isRunning()) {
			read();
		}
	}

	@Override
	public void start() {
		provider.setRunning(true);

	}

	@Override
	public void read() {
		
			if (provider.getCurrentLine() != null) {
				System.out.println("Start method");
				int note = Integer.parseInt(provider.getCurrentLine().trim());
				System.out.println(note);
			}

		
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
