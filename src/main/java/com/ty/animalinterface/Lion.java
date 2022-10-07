package com.ty.animalinterface;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{

	public void eat() {
		System.out.println("Eats Chicken");
		
	}

}
