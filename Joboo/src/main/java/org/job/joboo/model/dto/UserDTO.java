package org.job.joboo.model.dto;

import org.job.joboo.repository.entity.User;

import java.io.Serializable;
import java.util.Date;



public class UserDTO implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long userId;
	private String fName ;
	private String lName;
	private String country ;
	private String city ;
	private String adress;
	private String birthDate ;
	private Date   joinDate ;
	private String password;

	public UserDTO(String password, Long userId, String fName, String lName, String country, String city, String adress, String birthDate, Date joinDate) {
		this.password = password;
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.country = country;
		this.city = city;
		this.adress = adress;
		this.birthDate = birthDate;
		this.joinDate = joinDate;
	}

	public UserDTO() {
	}

	public UserDTO(User user) {

		this.setAdress(user.getAdress());
		this.setBirthDate(user.getBirthDate());
		this.setCity(user.getCity());
		this.setCountry(user.getCountry());
		this.setfName(user.getfName());
		this.setJoinDate(user.getJoinDate());
		this.setlName(user.getlName());
		this.setPassword(user.getPassword());

	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
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

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UserDTO userDTO = (UserDTO) o;

		if (userId != null ? !userId.equals(userDTO.userId) : userDTO.userId != null) return false;
		if (fName != null ? !fName.equals(userDTO.fName) : userDTO.fName != null) return false;
		if (lName != null ? !lName.equals(userDTO.lName) : userDTO.lName != null) return false;
		if (country != null ? !country.equals(userDTO.country) : userDTO.country != null) return false;
		if (city != null ? !city.equals(userDTO.city) : userDTO.city != null) return false;
		if (adress != null ? !adress.equals(userDTO.adress) : userDTO.adress != null) return false;
		if (birthDate != null ? !birthDate.equals(userDTO.birthDate) : userDTO.birthDate != null) return false;
		if (joinDate != null ? !joinDate.equals(userDTO.joinDate) : userDTO.joinDate != null) return false;
		return password != null ? password.equals(userDTO.password) : userDTO.password == null;

	}

	@Override
	public int hashCode() {
		int result = userId != null ? userId.hashCode() : 0;
		result = 31 * result + (fName != null ? fName.hashCode() : 0);
		result = 31 * result + (lName != null ? lName.hashCode() : 0);
		result = 31 * result + (country != null ? country.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (adress != null ? adress.hashCode() : 0);
		result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
		result = 31 * result + (joinDate != null ? joinDate.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "UserDTO{" +
				"userId=" + userId +
				", fName='" + fName + '\'' +
				", lName='" + lName + '\'' +
				", country='" + country + '\'' +
				", city='" + city + '\'' +
				", adress='" + adress + '\'' +
				", birthDate='" + birthDate + '\'' +
				", joinDate=" + joinDate +
				", password='" + password + '\'' +
				'}';
	}
}
