package com.Spring_Basics;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
	public void drive()
	{
		System.out.println("We can drive a car...");
	}
}
