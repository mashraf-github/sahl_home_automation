package sahl.home_automation.sahl_home_automation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sahl.home_automation.sahl_home_automation.jpa.User;
import sahl.home_automation.sahl_home_automation.repositories.UserRepository;

@Service("userService")
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> retriveAllUsers() {
		List<User> users = userRepository.findAll();

		return users;
	}

	public User retrieveUser(long id) {
		User user = userRepository.findById(id);

		return user;
	}

	public User retriveUserByUsername(String username) {
		User user = userRepository.findByUsername(username);

		return user;
	}

	public boolean checkUserDuplicationByUsername(User receivedUser) {

		// here we receive a user from the page and we don't know weather it needs an
		// insert or an update
		// so we will do the following check
		if (receivedUser.getId() == 0) {
			// in this case this is an insert request now we will just check if the
			// duplication of the username exists
			User user = userRepository.findByUsername(receivedUser.getUsername());
			if (user == null) {
				return true;
			} else {
				return false;
			}
		} else {
			// in this case this is an update request so we will check if there is a user
			// with the same username or not
			User user = userRepository.findByUsername(receivedUser.getUsername());
			if (user != null && user.getId() == receivedUser.getId()) {
				// we are updating the user name for the existing user
				return true;
			} else if (user == null) {
				// here their is no user with the same username so we can proceed with the
				// update request
				return true;
			} else {
				return false;
			}
		}
	}

	public long getUsersCount() {
		return userRepository.count();
	}

	public void insertUser(User user) {
		userRepository.save(user);
	}

//	@Transactional
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

}