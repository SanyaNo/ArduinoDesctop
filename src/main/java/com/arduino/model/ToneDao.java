package com.arduino.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ToneDao extends CrudRepository<Tone, Long> {

}
