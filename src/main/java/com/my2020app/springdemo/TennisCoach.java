package com.my2020app.springdemo;

import org.springframework.stereotype.Component;

import com.my2020app.controller.Coach;

@Component
public class TennisCoach implements Coach{

	
	@Override
	public String getDailyWorkOut() {		
		return "TennisCoach : 10 hr";
	}

}
