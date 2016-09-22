package com.arduino;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import gnu.io.SerialPortEventListener;

@SpringBootApplication
public class ArduinoDesktopApplication {

	@Autowired
	private SerialPortEventListener provider;

	@Autowired
	private JFrame myWindow;

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArduinoDesktopApplication.class);
		builder.headless(false).run(args);


	}

}
