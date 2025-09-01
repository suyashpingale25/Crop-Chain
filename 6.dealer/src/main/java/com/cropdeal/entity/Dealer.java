package com.cropdeal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * This is an Entity Class For Dealer,
 *
 * The id filed is the Mongodb Id and the Dealer Id,
 *
 * the firstname , lastname , password , dob , email , address ,  MobileNumber, PaymentInfo are the attributes of the Dealer class,
 *
 * Status Represents the Status of the Dealer as Active Or Inactive ,
 *
 * SEQUENCE_Name is sequence name that the Class SequenceGenerator Uses to Get Sequence .
 */
@Document(collection = "Dealer")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dealer {
    @Transient
    private static final String SEQUENCE_Name="Dealer_Sequence";
    @MongoId
    private String id;
    private String firstName;
    private String lastName;
    private String password;
    private Date dob;
    private String email;
    private String address;
    private Long mobileNumber;
    private String paymentInfo;
    private Boolean status;
    private  String[] addons;
    
    
	public Dealer(String id, String firstName, String lastName, String password, Date dob, String email, String address,
			Long mobileNumber, String paymentInfo, Boolean status, String[] addons) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.paymentInfo = paymentInfo;
		this.status = status;
		this.addons = addons;
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
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String[] getAddons() {
		return addons;
	}
	public void setAddons(String[] addons) {
		this.addons = addons;
	}
    
    

}
