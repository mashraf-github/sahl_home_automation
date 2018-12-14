package sahl.home_automation.sahl_home_automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("sahl.home_automation")
public class SahlHomeAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SahlHomeAutomationApplication.class, args);
	}
}
