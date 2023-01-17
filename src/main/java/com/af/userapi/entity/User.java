package com.af.userapi.entity;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
public class User {		

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_generator")
	@SequenceGenerator(name = "user_id_generator", allocationSize = 1)
	private Long id;

	@Column(name = "username")
	private String userName;

	@Column(name = "birthdate")
	private LocalDate birthDate;

	@Column(name = "country_residence")
	private String country;

	// optional
	@Column(name = "phone_number")
	private String phoneNumber;

	//optional
	@Column(name = "gender")
	private String gender;
	
	public User() { super();}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getBirthdate() {
		return birthDate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthDate = birthDate;
	}

	public String getCountryResidence() {
		return country;
	}

	public void setCountryResidence(String countryResidence) {
		this.country = countryResidence;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + this.id + ",username=" + this.userName	+ " ,birthdate=" + this.birthDate + " ,country="+ this.country
				+ " ,phone number=" + this.phoneNumber + ", gender=" + this.gender + '}' ;
	}


}
