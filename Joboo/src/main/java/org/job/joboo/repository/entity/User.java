package org.job.joboo.repository.entity;

import java.util.Date;

import javax.persistence.*;

import javax.persistence.Table;
import org.job.joboo.model.dto.UserDTO;
@Entity
@Table(name="Juser" )
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId", unique = true, nullable = false)
	private Long userId;
	@Column(name = "fName", nullable = false)
	private String fName ;
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((joinDate == null) ? 0 : joinDate.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (joinDate == null) {
			if (other.joinDate != null)
				return false;
		} else if (!joinDate.equals(other.joinDate))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}


	public User() {
		super();
	}


	public User(Long userId, String fName, String lName, String country, String city, String adress, String birthDate,
			String password, Date joinDate) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.country = country;
		this.city = city;
		this.adress = adress;
		this.birthDate = birthDate;
		this.password = password;
		this.joinDate = joinDate;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
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


	public User (UserDTO userdto)
	{
		UserDTO convertedUser = new UserDTO();
		convertedUser.setAdress(userdto.getAdress());
		convertedUser.setBirthDate(userdto.getBirthDate());
		convertedUser.setCity(userdto.getCity());
		convertedUser.setCountry(userdto.getCountry());
		convertedUser.setfName(userdto.getfName());
		convertedUser.setJoinDate(userdto.getJoinDate());
		convertedUser.setlName(userdto.getlName());
		
	}

	
}
