package com.arduino.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arduino.model.Note;
import com.arduino.model.NoteDao;

@Service
@Transactional
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteDao noteDao;

	@Override
	public Note save(Note note) {

		return noteDao.save(note);
	}

	@Override
	public Note findOne(Long id) {

		return noteDao.findOne(id);
	}

	@Override
	public Iterable<Note> findAll() {

		return noteDao.findAll();
	}

	@Override
	public Long count() {

		return noteDao.count();
	}

	@Override
	public void delete(Long id) {
		noteDao.delete(id);
	}

	@Override
	public boolean exists(Long id) {

		return noteDao.exists(id);
	}

}
