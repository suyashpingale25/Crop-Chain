package com.cropdeal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import java.util.Date;


/*
* This is an Entity Class For Farmer,
*
* The id filed is the Mongodb Id and the Farmer Id,
*
* the firstname , lastname , password , dob , email , address ,  MobileNumber, PaymentInfo are the attributes of the farmer class,
*
* Status Represents the Status of the Farmer as Active Or Inactive ,
*
* SEQUENCE_Name is sequence name that the Class SequenceGenerator Uses to Get Sequence .
*/
@Document(collection = "Farmer")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Farmer {
    @Transient
    private static final String SEQUENCE_Name="Farmer_Sequence";
    @MongoId
    private String id;
    private String firstName;
    private String lastName;
    private String password;
    private Date dob;
    private String email;
    private String address;
    private Long MobileNumber;
    private String PaymentInfo;
    private Boolean Status;
    
    public Farmer(String id, String firstName, String lastName, String password, Date dob, String email, String address,
			Long mobileNumber, String paymentInfo, Boolean status) {
    	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.address = address;
		MobileNumber = mobileNumber;
		PaymentInfo = paymentInfo;
		Status = status;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getPaymentInfo() {
		return PaymentInfo;
	}
	public void setPaymentInfo(String paymentInfo) {
		PaymentInfo = paymentInfo;
	}
	public Boolean getStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}
    
    

}
