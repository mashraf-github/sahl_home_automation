package sahl.home_automation.sahl_home_automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sahl.home_automation.sahl_home_automation.jpa.Module;

@Repository("moduleRepository")
public interface ModuleRepository extends JpaRepository<Module, Long> {
    Module findById(long id);

}
