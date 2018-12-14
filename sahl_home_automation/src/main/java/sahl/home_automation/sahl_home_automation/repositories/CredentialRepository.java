package sahl.home_automation.sahl_home_automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sahl.home_automation.sahl_home_automation.jpa.Credential;

@Repository("credentialRepository")
public interface CredentialRepository extends JpaRepository<Credential, Long> {
	Credential findById(long id);

}
