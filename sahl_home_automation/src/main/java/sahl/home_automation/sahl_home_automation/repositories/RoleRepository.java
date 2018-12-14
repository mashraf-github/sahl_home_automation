package sahl.home_automation.sahl_home_automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sahl.home_automation.sahl_home_automation.jpa.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findById(long id);

}
