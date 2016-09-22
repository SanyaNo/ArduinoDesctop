package com.arduino.dispatcher;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.arduino.model.Sheet;
import com.arduino.model.Tone;
import com.arduino.service.NoteService;
import com.arduino.service.SheetService;
import com.arduino.service.ToneService;

@Controller
public class Dispatcher {
	
	@Autowired 
	private NoteService noteService;
	
	@Autowired 
	private SheetService sheetService;
	
	@Autowired 
	private ToneService toneService;
	
	@PostConstruct
	private void populateDB(){
		
	}

	public List<Tone> getScore(String title) {
		
		return sheetService.getScore(title);
	}

	public List<Sheet> findAll() {
		// TODO Auto-generated method stub
		return (List<Sheet>)sheetService.findAll();
	}

}
