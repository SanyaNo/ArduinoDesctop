package com.arduino.dispatcher;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.arduino.model.Note;
import com.arduino.model.Sheet;
import com.arduino.model.Tone;
import com.arduino.model.note.Notes;
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
	
	/**
	 * Populate the DB while it is still in create-drop mode
	 */
	@PostConstruct
	private void populateDB(){
		
		//Populate the Note table
//		for( Map.Entry<Integer,Map<String,Integer>> map: Notes.NOTES.entrySet()){
//			for(Map.Entry<String, Integer>noteEntry: map.getValue().entrySet()){
//				
//				Note note = new Note();
//				note.setName(noteEntry.getKey());
//				note.setPitch(noteEntry.getValue());
//				noteService.save(note);				
//				
//			}
//		}
		
		//Populate the Duration table
	}

	public List<Tone> getScore(String title) {
		
		return sheetService.getScore(title);
	}

	public List<Sheet> findAll() {
		// TODO Auto-generated method stub
		return (List<Sheet>)sheetService.findAll();
	}

}
