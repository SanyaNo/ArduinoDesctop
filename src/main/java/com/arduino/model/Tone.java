package com.arduino.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TONE")
public class Tone {
	
	@Id
	@Column(name = "TONE_ID")
	private Long id;
	
	@Column(name = "POSITION", nullable = false)
	private int position;
	
	@JoinColumn(name = "NOTE_ID")
	@ManyToOne(cascade=CascadeType.ALL)
	private Note note;
	
	@JoinColumn(name = "DURATION_ID")
	@ManyToOne(cascade=CascadeType.ALL)
	private Duration duration;
	
	@JoinColumn(name = "SHEET_ID")
	@ManyToOne(cascade=CascadeType.ALL)
	private Sheet sheet;
	
	
	Tone(){}
	//end constructor
	
	public Long getId(){
		return id;
	}
	
	public Sheet getSheet(){
		return sheet;
	}

	public Duration getDuration() {
		return duration;
	}

	public int getposition() {
		return position;
	}

	public Note getNote() {
		return note;
	}
	//end getters
	
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public void setId(int position) {
		this.position = position;
	}

	public void setNote(Note note) {
		this.note = note;
	}
	
	public void setSheet(Sheet sheet){
		this.sheet = sheet;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	//end setters
}
