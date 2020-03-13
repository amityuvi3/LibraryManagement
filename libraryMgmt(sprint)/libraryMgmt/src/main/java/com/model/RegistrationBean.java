
package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
public class RegistrationBean {

	@Id
	@NotEmpty(message = "User Id can't empty")
	private String userId;

	@NotEmpty(message = "firstName can't empty")
	private String firstName;
	@NotEmpty(message = "lastName can't empty")
	private String lastName;
	private Date dOB;

	private String gender;
	@NotNull(message = "Mobile number require")
	private Double contactNumber;
	private String category;
	@NotEmpty(message =  "password can't empty")
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getdOB() {
		return dOB;
	}
	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Double contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
