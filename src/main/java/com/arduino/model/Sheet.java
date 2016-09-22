package com.arduino.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SHEET")
@NamedQueries({
    @NamedQuery(name=Sheet.GET_SCORE,
                query="SELECT s FROM Sheet")
}) 
public class Sheet {
	
	public static final String GET_SCORE = "Sheet.getScore";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SHEET_ID")
	private Long id;
	
	@Column(name = "TITLE", unique=true, nullable = false)
	private String name;

	@Column(name = "SHEET_KEY")
	private String key;
	
	@Column(name = "TIME_SIGNATURE")
	private String timeSignature; //TODO integrate CRUD in the UI

	@Column(name = "TEMPO")
	private int tempo;
	
	@Column(name = "SHEET_LEVEL")
	private int level; //TODO integrate CRUD in the UI
	
	@OneToMany(mappedBy = ("sheet"))
	private List<Tone> score;

	public Sheet() {
	}

	// end constructor
	public Long getId() {
		return id;
	}

	public String getKey() {
		return key;
	}

	public String getName() {
		return name;
	}


	public int getTempo() {
		return tempo;
	}

	public String getTimeSignature() {
		return timeSignature;
	}
	
	public int getLevel(){
		return level;
	}
	
	public List<Tone> getScore(){
		return score;
	}
	
	
	// end getters

	public void setId(Long id) {
		this.id = id;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public void setTimeSignature(String timeSignature) {
		this.timeSignature = timeSignature;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	
	public void setScore(List<Tone> score){
		this.score = score;
	}
	
	//end setters
}
