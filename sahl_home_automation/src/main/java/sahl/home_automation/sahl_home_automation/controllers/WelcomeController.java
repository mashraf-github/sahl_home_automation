package sahl.home_automation.sahl_home_automation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class WelcomeController {

	@GetMapping("/welcome")
	@ResponseBody
	private String welcomeMessage(@RequestParam String name) {
		return "Welcome " + name;
	}
}
