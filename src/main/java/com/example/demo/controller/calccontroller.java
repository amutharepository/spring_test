package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class calccontroller {
 
	
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}
