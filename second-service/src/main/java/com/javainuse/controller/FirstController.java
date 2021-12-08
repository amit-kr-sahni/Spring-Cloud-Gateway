package com.javainuse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class FirstController {

	@GetMapping("/message")
	public String test() {
		return "Hey there!, This is second Micro-Service";
	}
}