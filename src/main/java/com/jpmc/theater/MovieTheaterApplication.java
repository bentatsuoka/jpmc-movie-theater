package com.jpmc.theater;

import com.jpmc.theater.model.Theater;

public class MovieTheaterApplication {

	public static void main(String[] args) {
		Theater theater = new Theater();
        theater.printScheduleDefaultMode();
        theater.printScheduleJsonMode();
	}

}
