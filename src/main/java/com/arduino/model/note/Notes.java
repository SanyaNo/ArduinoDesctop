package com.arduino.model.note;

import java.util.HashMap;
import java.util.Map;
/**
 * Simulates variable variable
 * 
 * @author Sanya
 *
 */
public final class Notes {
	
	public static final Map<Integer, Map<String, Integer>> notes = new HashMap<Integer, Map<String, Integer>>();
	
	private static Map<String, Integer> C4 = new HashMap<String, Integer>();
	private static Map<String, Integer> D4 = new HashMap<String, Integer>();
	private static Map<String, Integer> E4 = new HashMap<String, Integer>();
	private static Map<String, Integer> F4 = new HashMap<String, Integer>();
	private static Map<String, Integer> G4 = new HashMap<String, Integer>();
	private static Map<String, Integer>	A4 = new HashMap<String, Integer>();
	private static Map<String, Integer> B4 = new HashMap<String, Integer>();
	private static Map<String, Integer> C5 = new HashMap<String, Integer>();
	
	static {
		
		C4.put("C4", (Integer) NoteType.C4);
		D4.put("D4", (Integer) NoteType.D4);
		E4.put("E4", (Integer) NoteType.E4);
		F4.put("F4", (Integer) NoteType.F4);
		G4.put("G4", (Integer) NoteType.G4);
		A4.put("A4", (Integer) NoteType.A4);
		B4.put("B4", (Integer) NoteType.B4);
		C5.put("C5", (Integer) NoteType.C5);
		
		notes.put(1, C4);
		notes.put(2, D4);
		notes.put(3, E4);
		notes.put(4, F4);
		notes.put(5, G4);
		notes.put(6, A4);
		notes.put(7, B4);
		notes.put(8, C5);
		
	}
	
}
