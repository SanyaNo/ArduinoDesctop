package com.arduino.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arduino.model.Note;
import com.arduino.model.Sheet;
import com.arduino.model.SheetDoa;

@Service
@Transactional
public class SheetServiceImpl implements SheetService {

	@Autowired
	private SheetDoa sheetDao;

	@Override
	public Sheet save(Sheet sheet) {

		return sheetDao.save(sheet);
	}

	@Override
	public Sheet findOne(Long id) {

		return sheetDao.findOne(id);
	}

	@Override
	public Iterable<Sheet> findAll() {

		return sheetDao.findAll();
	}

	@Override
	public Long count() {

		return sheetDao.count();
	}

	@Override
	public void delete(Long id) {
		sheetDao.delete(id);
	}

	@Override
	public boolean exists(Long id) {

		return sheetDao.exists(id);
	}

	@Override
	public List<Note> getScore(String title) {
		// TODO Auto-generated method stub
		return sheetDao.getScore(String title);
	}
	


}
