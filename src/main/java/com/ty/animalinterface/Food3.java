package com.ty.animalinterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Food3 {
	@Autowired
	@Qualifier("lion")
	Animal animal;
	public void animalEat() {
		animal.eat();
	}
}
