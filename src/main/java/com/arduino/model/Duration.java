package com.arduino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "duration")
public class Duration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DURATION_ID")
	private Long id;

	@Column(name = "NAME", unique=true, nullable = false)
	private String name;

	@Column(name = "BAR_PORTION", unique=true, nullable = false)
	private Long barPortion;

	Duration() {
	}

	public Duration(String name, Long barPortion) {
		this.name = name;
		this.barPortion = barPortion;
	}

	// end constructor

	public Long getBarPortion() {
		return barPortion;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	//end setters
	public void setBarPortion(Long barPortion) {
		this.barPortion = barPortion;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
