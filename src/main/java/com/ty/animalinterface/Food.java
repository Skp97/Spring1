package com.ty.animalinterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Food {
	@Autowired
	Lion lion;
	public void animalEat() {
		lion.eat();
		
	}
	
}
