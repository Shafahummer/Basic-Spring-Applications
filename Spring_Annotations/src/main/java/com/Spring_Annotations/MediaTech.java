package com.Spring_Annotations;

import org.springframework.stereotype.Component;

@Component
public class MediaTech implements MobileProcessor {

	public void process() {
		System.out.println("2nd Best CPU");

	}

}
