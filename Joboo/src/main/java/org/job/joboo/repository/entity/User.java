package org.job.joboo.repository.entity;

import org.job.joboo.model.dto.UserDTO;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "fName", nullable = false)
	private String fName ;
	@Column(name = "uName", nullable = false)
	private String uName;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "lName", nullable = false)
	private String lName;
	@Column(name = "country", nullable = false)
	private String country ;
	@Column(name = "city", nullable = false)
	private String city ;
	@Column(name = "adress", nullable = false)
	private String adress;
	@Column(name = "birthDate", nullable = false)
	private String birthDate ;
	@Column(name = "password", nullable = false)
	private String password ;
	@Column(name = "joinDate", nullable = false)
	private Date   joinDate ;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "users_authority", joinColumns = {@JoinColumn(name = "id_user", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "id_authority", table = "authority", referencedColumnName = "id")})
	private Set<Authority> authorities = new HashSet<Authority>();

	public User(UserDTO userdto) {
		System.out.println("userna" + userdto.getuName());
		this.id = userdto.getUserId();
		this.uName = userdto.getuName();
		this.email = userdto.getEmail();
		this.adress = userdto.getAdress();
		this.birthDate = userdto.getBirthDate();
		this.city = userdto.getCity();
		this.country = userdto.getCountry();
		this.fName = userdto.getfName();
		this.joinDate = userdto.getJoinDate();
		this.lName = userdto.getlName();
		this.password = userdto.getPassword();

	}

	public User(String fName, String uName, String email, String lName, String country, String city, String adress, String birthDate, String password, Date joinDate, Set<Authority> authorities) {
		this.fName = fName;
		this.uName = uName;
		this.email = email;
		this.lName = lName;
		this.country = country;
		this.city = city;
		this.adress = adress;
		this.birthDate = birthDate;
		this.password = password;
		this.joinDate = joinDate;
		this.authorities = authorities;
	}

	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", fName='" + fName + '\'' +
				", uName='" + uName + '\'' +
				", email='" + email + '\'' +
				", lName='" + lName + '\'' +
				", country='" + country + '\'' +
				", city='" + city + '\'' +
				", adress='" + adress + '\'' +
				", birthDate='" + birthDate + '\'' +
				", password='" + password + '\'' +
				", joinDate=" + joinDate +
				", authorities=" + authorities +
				'}';
	}
}
