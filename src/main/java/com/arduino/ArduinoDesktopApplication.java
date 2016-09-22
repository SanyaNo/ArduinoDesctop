package com.arduino;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ArduinoDesktopApplication {
	
	
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArduinoDesktopApplication.class);
		builder.headless(false).run(args);
		
		App app = new App();
		
	}
	
}
