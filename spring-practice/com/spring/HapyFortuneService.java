package com.spring;

import org.springframework.stereotype.Component;

@Component
public class HapyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is my lucky day";
	}

}
