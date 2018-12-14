package sahl.home_automation.sahl_home_automation.controllers.database;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sahl.home_automation.sahl_home_automation.configuration.PasswordEncoderUtil;
import sahl.home_automation.sahl_home_automation.jpa.User;
import sahl.home_automation.sahl_home_automation.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private PasswordEncoderUtil encoder;

	@Autowired
	@Qualifier(value="userValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(value={"/retrieve-users"})
	public String navigateToUsersTable(ModelMap model){
		// fetch all users to be rendered on the users table
		model.put("users", userService.retriveAllUsers());
		return "Users/UsersAdvancedTablePage";
	}

	@GetMapping(value={"/retrieve-users-list"})
	@ResponseBody
	public List<User> retrieveCarsColorsToRequestedPage(){
		// fetch all cars colors to be rendered on specific page requester
		return userService.retriveAllUsers();
	}

	@GetMapping(value={"/add-user"})
	@ResponseBody 
	public User navigateToAddNewUser(){
		return new User().defaultObject();
	}

	@PostMapping(value={"/add-user"})
	public String addUser(ModelMap model, @Valid User newUser, BindingResult result) {

		if (result.hasErrors())
			return "Users/UserPage";

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User loggedUser = userService.retriveUserByUsername(authentication.getName());
		newUser.setCreationUser(loggedUser);
		newUser.setPassword(encoder.getEncryptedPassword("12345"));
		userService.insertUser(newUser);
		return "redirect:/retrieve-users";
	}

	@GetMapping(value = "/update-user")
	@ResponseBody
	public User navigateToUpdateUser( @RequestParam long id) {
		User user = userService.retrieveUser(id);
		return user;
	}

	@PostMapping(value = "/update-user")
	public String updateUser(ModelMap model, @Valid User updatedUser, BindingResult result) {
		if (result.hasErrors())
			return "Users/UserPage";

//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		User loggedUser = userService.retriveUserByUsername(authentication.getName());
		//    	updatedUser.setUpdateUser(loggedUser);

		userService.updateUser(updatedUser);
		return "redirect:/retrieve-users";
	}

	@GetMapping(value = "/update-userpassword")
	@ResponseBody
	public User navigateToUpdateUserpwd( @RequestParam long id) {
		User user = userService.retrieveUser(id);
		return user;
	}

	@PostMapping(value = "/update-userpassword")
	public String updateUserpwd(ModelMap model, @Valid User updatedUser, BindingResult result) {
		if (result.hasErrors())
			return "Users/UserPage";

		User usertochangepwdto =userService.retrieveUser(updatedUser.getId());
		usertochangepwdto.setPassword(encoder.getEncryptedPassword(updatedUser.getPassword()));
		userService.updateUser(usertochangepwdto);
		return "redirect:/retrieve-users";
	}

	@GetMapping(value = "/delete-user")
	public String deleteUser(ModelMap model, @RequestParam long id) {
		userService.deleteUser(id);
		return "redirect:/retrieve-users";
	}
}
