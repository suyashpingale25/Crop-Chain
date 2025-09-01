package com.copdeal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

/*
 * This is an Entity Class For Crop,
 *
 * The id field is the Mongodb id and refers to MonogoId .
 *
 * The Farmer id Represents the id of the Farmer That Published The Crop,
 *
 * Name is the Name of the Crop ,
 *
 * Cost is Cost per for the 1% of Quantity of Type of the Crop
 *
 * Quantity Represents the  Total  Available Crop in the Terms Of Crop
 *
 * Type Represents the Type or Units Of the Crop . (Ex:Kg,number of available pieces for the)
 *
 * SEQUENCE_Name is sequence name that the Class SequenceGenerator Uses to Get Sequence .
 */
@Document(collection = "Crop")
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Data
public class Crop {
    @Transient
    private static final String SEQUENCE_Name="Crops_Sequence";
    @MongoId
    private String id;
    @Indexed(name = "farmerid")
    private String farmerid;
    @Indexed(name = "name")
    private String name;
    private int cost;
    private int quantity;
    private String type;
    private Boolean Active ;
    
    
	public Crop(String id, String farmerid, String name, int cost, int quantity, String type, Boolean active) {
		super();
		this.id = id;
		this.farmerid = farmerid;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.type = type;
		Active = active;
	}
	
	
	public Crop() {
		super();
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFarmerid() {
		return farmerid;
	}
	public void setFarmerid(String farmerid) {
		this.farmerid = farmerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getActive() {
		return Active;
	}
	public void setActive(Boolean active) {
		Active = active;
	}
    
    

}
