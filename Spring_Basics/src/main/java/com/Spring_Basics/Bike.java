package com.Spring_Basics;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	public void drive()
	{
		System.out.println("We can ride a bike...");
	}
}
