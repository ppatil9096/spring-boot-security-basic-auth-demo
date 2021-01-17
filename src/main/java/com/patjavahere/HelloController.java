package com.patjavahere;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String helloBoot() {
		return "Hello SB";
	}

	@GetMapping("/user")
	public User getUser() {
		final var user = new User();
		user.setAge(15);
		user.setName("ppp");
		return user;
	}

}
