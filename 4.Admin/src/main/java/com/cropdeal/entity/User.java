package com.cropdeal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String id;
    private String password;
    private String Role;
    
	public User(String id, String password, String role) {
		super();
		this.id = id;
		this.password = password;
		Role = role;
	}
    
    
}
