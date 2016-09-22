package com.arduino.service;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arduino.model.Tone;
import com.arduino.model.ToneDao;
@Service
@Transactional
public class ToneServiceImpl implements ToneService {
	
	@Autowired
	private ToneDao toneDao;

	@Override
	public Tone save(Tone tone) {

		return toneDao.save(tone);
	}

	@Override
	public Tone findOne(Long id) {

		return toneDao.findOne(id);
	}

	@Override
	public Iterable<Tone> findAll() {

		return toneDao.findAll();
	}

	@Override
	public Long count() {

		return toneDao.count();
	}

	@Override
	public void delete(Long id) {
		toneDao.delete(id);

	}

	@Override
	public boolean exists(Long id) {

		return toneDao.exists(id);
	}

}
