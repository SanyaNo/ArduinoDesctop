package com.arduino.model;

import java.util.HashMap;
import java.util.Map;

public final class DurationType {

	public static final Map<String, Double> DURATION = new HashMap<String, Double>();

	static {

		DURATION.put("whole", 1d);
		DURATION.put("half", 0.5);
		DURATION.put("quarter", 0.25);
		DURATION.put("eighth", 0.125);
		DURATION.put("sixteenth", 0.0625);
		DURATION.put("thirty-second", 0.03125);

	}
}
