package com.arduino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NOTE")
public class Note {

	@Id
	@Column(name = "NOTE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NAME", unique=true, nullable = false)
	private String name;

	@Column(name = "PITCH", unique=true, nullable = false)
	private int pitch;

	Note() {
	}

	public Note(String name, int pitch) {

		this.name = name;
		this.pitch = pitch;

	}

	// end constructor

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPitch() {
		return pitch;
	}

	// end getters

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPitch(int pitch) {
		this.pitch = pitch;
	}

	// end setter
}
