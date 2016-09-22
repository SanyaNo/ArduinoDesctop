package com.arduino.service;

import com.arduino.model.Note;

public interface NoteService {
	
	Note save(Note note);
	
	Note findOne(Long id);
	
	Iterable<Note> findAll();
	
	Long count();
	
	void delete(Long id);
	
	boolean exists(Long id);
	
}
