package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("hapyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Default constructor:tenniscoach");
	}
	
	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("inside seter method");
//		fortuneService = theFortuneService;
//	}

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		
//		fortuneService=theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
