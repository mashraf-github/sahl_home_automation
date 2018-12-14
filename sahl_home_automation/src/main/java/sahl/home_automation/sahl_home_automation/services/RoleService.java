package sahl.home_automation.sahl_home_automation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sahl.home_automation.sahl_home_automation.jpa.Role;
import sahl.home_automation.sahl_home_automation.repositories.RoleRepository;

@Service
public class RoleService {

	@Autowired
	RoleRepository roleRepository;

	public List<Role> RetrieveAllRoles() {
		return roleRepository.findAll();
	}

	public long getNumberOfRoles() {
		return roleRepository.count();
	}
	public Role insertNewRole(Role newRole)
	{
		return roleRepository.save(newRole);
	}
	
	public void DeleteRole(Role role)
	{
		roleRepository.delete(role);
	}

	public Role retrieveRole(long id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id);
	}

}
