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
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Audited
public class User extends AuditModel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nameAr;
	private String nameEn;
	private String nationalId;
	private String emailAdress;
	private String adress;
	private String mobileNumber;
	private boolean premium;
	private boolean enabled;
	private boolean company;
	private String username;
	private String password;
	private boolean tokenExpired;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( 
        name = "users_roles", 
        joinColumns = {@JoinColumn(
          name = "user_id", referencedColumnName = "id")}, 
        inverseJoinColumns = {@JoinColumn(
          name = "role_id", referencedColumnName = "id")})
    private Collection<Role> roles;
	
	public User defaultObject() {
		// TODO Auto-generated method stub
		
		this.nameAr = "xxxxx";
		this.nameEn = "xxxxx";
		this.nationalId = "xxxxxxxxxxxxxx";
		this.emailAdress = "xxxxx";
		this.adress = "xxxxx";
		this.mobileNumber = "xxxxx";
		this.premium = false;
		this.enabled = false;
		this.company = false;
		this.tokenExpired = false;
		this.username = "xxxxx";
		
		return this;
	}
}
