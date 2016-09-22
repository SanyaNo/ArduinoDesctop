package com.arduino.service;

import java.util.List;

import com.arduino.model.Note;
import com.arduino.model.Sheet;

public interface SheetService {

	Sheet save(Sheet sheet);

	Sheet findOne(Long id);

	Iterable<Sheet> findAll();

	Long count();

	void delete(Long id);

	boolean exists(Long id);

	List<Note> getScore(String title);

}
