package com.arduino.dispatcher;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.arduino.model.Note;
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

	public List<Note> getScore(String title) {
		
		return sheetService.getScore(title);
	}

}
