package com.cropdeal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


@Document(collection = "Payments")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentCropDeal{
    @Transient
    private static final String SEQUENCE_Name="Payment_Sequence";
    @MongoId
    private String id;
    private String customerId;
    private String transactionAmount;
    private String transactionId;
    private String CropId;
    private String Status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getCropId() {
		return CropId;
	}
	public void setCropId(String cropId) {
		CropId = cropId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
    
    

}
