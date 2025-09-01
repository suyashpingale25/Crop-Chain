package com.cropdeal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "sequence")
public class sequence {
    @Id
    //sequence id
    private String id;
    //Sequence number
    
    private int seq_No;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSeq_No() {
		return seq_No;
	}
	public void setSeq_No(int seq_No) {
		this.seq_No = seq_No;
	}
    
    
}
