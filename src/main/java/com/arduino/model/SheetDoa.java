package com.arduino.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SheetDoa extends CrudRepository<Sheet, Long>{
	public List<Tone> getScore(String title);
}
