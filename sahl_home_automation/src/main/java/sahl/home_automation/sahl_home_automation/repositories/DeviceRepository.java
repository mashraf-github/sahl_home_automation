package sahl.home_automation.sahl_home_automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sahl.home_automation.sahl_home_automation.jpa.Device;

@Repository("deviceRepository")
public interface DeviceRepository extends JpaRepository<Device, Long> {
	Device findById(long id);

}
