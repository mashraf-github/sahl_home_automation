package sahl.home_automation.sahl_home_automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sahl.home_automation.sahl_home_automation.jpa.Connection;

@Repository("connectionRepository")
public interface ConnectionRepository extends JpaRepository<Connection, Long> {
	Connection findById(long id);

}
