package com.ty.annotation;

import org.springframework.stereotype.Component;

@Component
public class Animal {
	public void eat() {
		System.out.println("Animal eats grass and  chicken");
	}
}
