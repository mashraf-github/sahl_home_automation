package sahl.home_automation.sahl_home_automation.jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "credentials")
@Audited
public class Credential extends AuditModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy="credentials")
	private Collection<Module> modules;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "connection_id", referencedColumnName = "id")
	private Connection connection;
	
	private String username;
	private String password;
	
	public Credential defaultObject() {
		// TODO Auto-generated constructor stub
		this.username = "xxxxx";
		
		return this;
	}
}
