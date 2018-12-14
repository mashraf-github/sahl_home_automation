package sahl.home_automation.sahl_home_automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sahl.home_automation.sahl_home_automation.jpa.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	User findById(long id);
    User findByUsername(String username);
}