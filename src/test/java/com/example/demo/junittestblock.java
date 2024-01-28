package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.controller.calccontroller;


@SpringBootTest
public class junittestblock {
	
	private calccontroller cc= new calccontroller();
	
	
	@Test
	public void addtest() {
	 int result= cc.add(10,10);
	 assertEquals(20, result);
	}
	@Test
	public void subtest() {
		int result=cc.sub(10, 5);
		assertEquals(5, result);
	}
	
	

}
