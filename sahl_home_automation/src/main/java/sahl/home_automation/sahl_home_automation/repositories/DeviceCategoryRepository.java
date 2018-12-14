package sahl.home_automation.sahl_home_automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sahl.home_automation.sahl_home_automation.jpa.DeviceCategory;

@Repository("deviceCategoryRepository")
public interface DeviceCategoryRepository extends JpaRepository<DeviceCategory, Long> {
	DeviceCategory findById(long id);

}
