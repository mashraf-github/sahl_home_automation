package sahl.home_automation.sahl_home_automation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import sahl.home_automation.sahl_home_automation.services.RoleService;
import sahl.home_automation.sahl_home_automation.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	@GetMapping(value= {"/","/home"})
	public String  navigateToHomePage(ModelMap model)
	{
		// navigate to home page with getting counters of the tables to the cards
		model.put("numberOfUsers", userService.getUsersCount());
		model.put("numberOfRoles", roleService.getNumberOfRoles());
		
		return "HomePanel";
	}

}
