package com.docker.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/docker")
public class control {
	
	@GetMapping("/home")
	public String Dockerhome() {
		return "welcome back everybody";
	}
	
	

}
