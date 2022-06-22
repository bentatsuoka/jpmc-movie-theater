package com.jpmc.theater.json;

import java.util.List;

public class JsonSchedule {

	private String date;
	private List<Row> showingsToday;
	
	public JsonSchedule(String date, List<Row> showingsToday) {
		super();
		this.date = date;
		this.showingsToday = showingsToday;
	}

	public String getDate() {
		return date;
	}

	public List<Row> getShowingsToday() {
		return showingsToday;
	}
}
