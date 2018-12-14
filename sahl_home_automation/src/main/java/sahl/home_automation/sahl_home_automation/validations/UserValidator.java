package sahl.home_automation.sahl_home_automation.validations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import sahl.home_automation.sahl_home_automation.jpa.User;
import sahl.home_automation.sahl_home_automation.services.UserService;

@Component("userValidator")
public class UserValidator implements Validator {
	
	@Autowired
	private UserService userService;
	
	@Override
    public boolean supports(Class<?> paramClass) {
        return User.class.equals(paramClass);
    }
    
	@Override
    public void validate(Object obj, Errors errors) {
    	User user = (User) obj;
    	
		if(!userService.checkUserDuplicationByUsername(user)) {
			errors.rejectValue("userName", "username.error.duplicate");
		}
    }
}