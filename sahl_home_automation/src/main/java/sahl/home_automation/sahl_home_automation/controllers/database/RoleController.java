package sahl.home_automation.sahl_home_automation.controllers.database;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sahl.home_automation.sahl_home_automation.jpa.Role;
import sahl.home_automation.sahl_home_automation.jpa.User;
import sahl.home_automation.sahl_home_automation.services.RoleService;
import sahl.home_automation.sahl_home_automation.services.UserService;

@Controller
public class RoleController {
	@Autowired
	RoleService roleService;
	@Autowired 
	UserService userService;

	@RequestMapping(value="/retrieve-roles")
	private String NavigateToRolePage(ModelMap model)
	{
		model.addAttribute("roles",roleService.RetrieveAllRoles());
		return "Roles/RoleAdvancedTablePage";
	}

	@GetMapping(value={"/retrieve-roles-list"})
	@ResponseBody
	public List<Role> retrieveUserRolesToRequestedPage(){
		// fetch all cars colors to be rendered on specific page requester
		return roleService.RetrieveAllRoles();
	}


	@GetMapping(value = { "/add-role" })
	@ResponseBody
	public Role navigateToAddNewRole(){
		return new Role().defaultObject();
	}

	
	@PostMapping("/add-role")
	public String addRole(ModelMap model, Role newRole, BindingResult result) {

 		if (result.hasErrors())
			return "redirect:/retrieve-roles";

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User loggedUser = userService.retriveUserByUsername(authentication.getName());
		newRole.setCreationUser(loggedUser);
		newRole.setUpdateUser(loggedUser);
		roleService.insertNewRole(newRole);
		return "redirect:/retrieve-roles";
	}
	
	@GetMapping(value = "/delete-role")
	public String deleteCar(ModelMap model, @RequestParam long id) {
		
		Role role = roleService.retrieveRole(id);
		roleService.DeleteRole(role);
		return "redirect:/retrieve-roles";
	}
	
	@GetMapping(value = "/update-role")
	@ResponseBody
	public Role navigateToUpdateRole(@RequestParam long id) {
		return roleService.retrieveRole(id);
	}

	@PostMapping(value = "/update-role")
	public String updateCarColor(ModelMap model, @Valid Role updatedrole, BindingResult result) {
		if (result.hasErrors())
			return "redirect:/retrieve-roles";

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User loggedUser = userService.retriveUserByUsername(authentication.getName());
		updatedrole.setUpdateUser(loggedUser);
		roleService.insertNewRole(updatedrole);
		return "redirect:/retrieve-roles";
	}
	
}
