package sahl.home_automation.sahl_home_automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sahl.home_automation.sahl_home_automation.jpa.GeoLocation;

@Repository("geoLocationRepository")
public interface GeoLocationRepository extends JpaRepository<GeoLocation, Long> {
	GeoLocation findById(long id);

}
