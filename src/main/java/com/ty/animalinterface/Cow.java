package com.ty.animalinterface;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cow implements Animal{

	public void eat() {
		System.out.println("Eats Grass");
		
	}

}
