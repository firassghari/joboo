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
	private String uName;
	private String email;
	private String country ;
	private String city ;
	private String adress;
	private String birthDate ;
	private Date   joinDate ;
	private String password;


	public UserDTO() {
	}

	public UserDTO(User user) {
		this.userId = user.getId();
		this.setuName(user.getuName());
		this.setEmail(user.getEmail());
		this.setAdress(user.getAdress());
		this.setBirthDate(user.getBirthDate());
		this.setCity(user.getCity());
		this.setCountry(user.getCountry());
		this.setfName(user.getfName());
		this.setJoinDate(user.getJoinDate());
		this.setlName(user.getlName());
		this.setPassword(user.getPassword());

	}

	public UserDTO(Long userId, String fName, String lName, String uName, String email, String country, String city, String adress, String birthDate, Date joinDate, String password) {
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.email = email;
		this.country = country;
		this.city = city;
		this.adress = adress;
		this.birthDate = birthDate;
		this.joinDate = joinDate;
		this.password = password;
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
	public String toString() {
		return "UserDTO{" +
				"userId=" + userId +
				", fName='" + fName + '\'' +
				", lName='" + lName + '\'' +
				", uName='" + uName + '\'' +
				", email='" + email + '\'' +
				", country='" + country + '\'' +
				", city='" + city + '\'' +
				", adress='" + adress + '\'' +
				", birthDate='" + birthDate + '\'' +
				", joinDate=" + joinDate +
				", password='" + password + '\'' +
				'}';
	}
}
