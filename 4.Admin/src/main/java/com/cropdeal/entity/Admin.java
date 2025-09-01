package com.cropdeal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

/*
 * This is an Entity Class For Farmer,
 *
 * @Param : Id - The id field is the Mongodb id and refers to AdminId .
 *
 * @Param : name - is the Name of the Admin ,
 *
 * @Param :  password - is the password of the admin,
 *
 * @Param : email - is the password of the admin
 */

@Document(collection = "Admin")
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Data

public class Admin {
    @MongoId
    private String id;
    private String name;
    private String password;
    private String email;
    
    
    
	public Admin(String id,String name, String password, String email) {
		super();
		this.id =id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    

}
