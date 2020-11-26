package com.my2020app.springdemo;

import com.my2020app.controller.FortuneService;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
