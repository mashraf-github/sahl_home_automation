package sahl.home_automation.sahl_home_automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sahl.home_automation.sahl_home_automation.jpa.Location;

@Repository("locationRepository")
public interface LocationRepository extends JpaRepository<Location, Long> {
	Location findById(long id);

}
