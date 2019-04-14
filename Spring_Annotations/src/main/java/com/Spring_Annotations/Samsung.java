package com.Spring_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // Non qualified and De capitalized default name ("samsung")
public class Samsung 
{
	
	@Autowired
	@Qualifier("mediaTech")
	MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config()
	{
		System.out.println("Octa Core,4 gb Ram,12mp camera");
		cpu.process();
	}
}
