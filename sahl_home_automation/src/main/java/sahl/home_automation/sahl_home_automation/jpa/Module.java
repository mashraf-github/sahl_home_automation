package sahl.home_automation.sahl_home_automation.jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "modules")
@Audited
public class Module extends AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String imei;
	private String macAddress;
	private String serialNumber;
	private String modelNumber;
	private boolean loggingNode;
	private boolean deleted;
	private boolean functional;
	private String firmware;
	private int codeVersionNumber;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "modules_credentials", joinColumns = { @JoinColumn(name = "module_id") }, inverseJoinColumns = {
			@JoinColumn(name = "credential_id") })
	private Collection<Credential> credentials;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id", referencedColumnName = "id")
	private Module module;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "location_id", referencedColumnName = "id")
	private Location location;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "geo_location_id", referencedColumnName = "id")
	private GeoLocation geoLocation;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	public Module defaultObject() {
		// TODO Auto-generated constructor stub

		return this;
	}
}
