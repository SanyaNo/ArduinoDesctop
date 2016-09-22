package com.arduino.service;

import com.arduino.model.Tone;

public interface ToneService {
	
	Tone save(Tone tone);

	Tone findOne(Long id);

	Iterable<Tone> findAll();

	Long count();

	void delete(Long id);

	boolean exists(Long id);

}
